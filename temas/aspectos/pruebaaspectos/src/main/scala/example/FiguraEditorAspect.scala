import org.aspectj.lang.annotation.{Aspect, Before, Pointcut}
import org.aspectj.lang.JoinPoint

@Aspect
class FiguraEditorAspect {
  
  @Pointcut("execution(* FiguraEditor.*(..))")
  def figuraEditorMethods()= {}

  @Before("figuraEditorMethods()")
  def logMethodCall(joinPoint: JoinPoint): Unit = {
    println("Método llamado: " + joinPoint.getSignature.getName)
  }
  
}
