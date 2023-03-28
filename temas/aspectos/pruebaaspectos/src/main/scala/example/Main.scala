object Main {
  def main(args: Array[String]): Unit = {
    val editor = new FiguraEditor()
    val aspect = new FiguraEditorAspect()
    val proxy = AspectJProxyFactory.getProxy(editor, aspect)
    proxy.agregarFigura(new Circulo(0, 0, 10))
    proxy.eliminarFigura(new Cuadrado(0, 0, 20))
  }
}