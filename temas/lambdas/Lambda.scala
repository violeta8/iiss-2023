object HighSchoolMusical {
  case class Character(name: String, role: String)

  def getNames(characters: List[Character]): List[String] = {
    characters.map(c => c.name)
  }

  def getDramaClubMembers(characters: List[Character]): List[Character] = {
    characters.filter(c => c.role == "Drama club president" || c.role == "Sharpay's twin brother")
  }

  def hasBasketballCaptain(characters: List[Character]): Boolean = {
    characters.exists(c => c.role == "Basketball captain")
  }

  def getNameAndRole(characters: List[Character]): List[String] = {
    characters.map(c => s"${c.name} - ${c.role}")
  }

  def main(args: Array[String]): Unit = {
    val characters = List(
      Character("Troy Bolton", "Basketball captain"),
      Character("Gabriella Montez", "New student"),
      Character("Sharpay Evans", "Drama club president"),
      Character("Ryan Evans", "Sharpay's twin brother")
    )

    val namesOnly = getNames(characters)
    println(s"Names: $namesOnly")

    val dramaClubMembers = getDramaClubMembers(characters)
    println(s"Drama Club Members: $dramaClubMembers")

    val hasBasketball = hasBasketballCaptain(characters)
    println(s"There's a character which is basketball captain $hasBasketball")

    val nameAndRole = getNameAndRole(characters)
    println(s"Name and Role: $nameAndRole")
  }
}
