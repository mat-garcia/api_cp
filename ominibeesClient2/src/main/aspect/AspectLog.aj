


import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.aspectj.lang.*;

public aspect AspectLog {

    Logger _logger = Logger.getLogger("AspectLog");

    AspectLog() {

        _logger.setLevel(Level.ALL);

    }

    /*pointcut traceMethods()

        : (execution(* *.*(..))

          || execution(*.new(..))) && !within(AspectLog);

    before() : traceMethods() {

        if (_logger.isEnabledFor(Level.INFO)) {

            Signature sig = thisJoinPointStaticPart.getSignature();

            _logger.log(Level.INFO,

            "Entrando ["

            + sig.getDeclaringType().getName() + "."

            + sig.getName() + "]");

        }

    }
*/
    pointcut tratamentoExcecao(): handler(Exception+); //&& !within(AspectLog);

    before() : tratamentoExcecao(){


        _logger.log(Level.ERROR, "Log da Exceção sendo tratada");

    }

  //point cut que captura qualquer exceção na execução do programa, o within no final da linha especifica pacotes em que o pointcut � //ignorado   
    pointcut printStackTrace(): execution(* *.*(..)) /*&& !within(teste)*/;   
      
    //advice que pega a Exception no retorno da chamada do método printStackTrace dessa Exception   
        after(Exception e) returning: call(* *.printStackTrace(..)) && target(e){         
            _logger.log(Level.ERROR, "Log da Exceção sendo tratada");
            System.out.println("imprimi depois de dar o erro");   
        }   

}