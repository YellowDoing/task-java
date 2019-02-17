package cn.hg.task.aop;

import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;


/**
 * 控制器校验
 */
@Aspect
@Component
public class ControllerAspect {

    @Pointcut("execution(* cn.hg.demo2.*..*.*(..))")
    public void pointCut() {
    }

    @Around("pointCut()")
    public Object validateErrors(ProceedingJoinPoint jp) throws Throwable {
        Object[] objects = jp.getArgs();
        for (Object o : objects ){
            /*
             * 参数校验,如果包含错误，抛出一个参数校验异常
             */
            if (o instanceof BeanPropertyBindingResult){
                BeanPropertyBindingResult beanPropertyBindingResult = (BeanPropertyBindingResult)o;
                if (beanPropertyBindingResult.hasErrors()){
                    throw new ValidateException(beanPropertyBindingResult.getAllErrors().get(0));
                }
            }
        }
        return jp.proceed();
    }
}



