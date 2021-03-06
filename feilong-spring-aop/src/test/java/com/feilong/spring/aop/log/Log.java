/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.spring.aop.log;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.apache.log4j.Level;

// 表示产生文档,比如通过javadoc产生文档, 将此注解包含在 javadoc 中, 这个Annotation可以被写入javadoc
/**
 * The Interface LOGGER.
 * 
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @since 1.0.7
 */
@Documented
// 在jvm加载class时候有效, VM将在运行期也保留注释,因此可以通过反射机制读取注解的信息
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Inherited
// , ElementType.TYPE
public @interface Log{

    /**
     * log级别 {@link Level#toLevel(String, Level)}.
     * 
     * @return the string
     * @see org.apache.log4j.Level
     * @see ch.qos.logback.classic.Level
     * @see org.slf4j.event.Level
     */
    String level() default "debug";

}
