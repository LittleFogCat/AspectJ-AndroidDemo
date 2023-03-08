package tech.xiaoniu.aspect

import org.aspectj.lang.annotation.Aspect
import tech.xiaoniu.aspect.MyAspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.JoinPoint
import tech.xiaoniu.aspect.DebugLog
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * @author jiangjingyi
 * @email jiangjingyi@cleartv.cn
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class DebugLog 