import aspectlib

@aspectlib.Aspect
def retry_on_error(*args, **kwargs):
    attempts = 0
    while attempts < 3:
        try:
            yield aspectlib.Proceed(*args, **kwargs)
            break
        except Exception as e:
            attempts += 1
            print(f"Error occurred: {e}. Retrying...")
    else:
        print("Max retries exceeded.")
        yield aspectlib.Return(None)

@retry_on_error
def download_file(url):
    if url == "https://example.com/file.pdf":
        raise Exception("Download error")
    else:
        print(f"Downloading file from {url}")
        return "Download successful"

print(download_file("https://example.com/file.pdf"))
print(download_file("https://example.com/file2.pdf"))
