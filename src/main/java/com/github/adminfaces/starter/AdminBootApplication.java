/*
 * Copyright 2016-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.adminfaces.starter;

import com.github.adminfaces.starter.model.Car;
import com.github.adminfaces.starter.util.Utils;
import com.github.adminfaces.template.config.AdminConfig;
import com.github.adminfaces.template.session.AdminSession;

import java.util.List;
import javax.inject.Inject;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author rmpestano
 */
@SpringBootApplication
//@ComponentScan("com.github.adminfaces.starter") //This will scan for the Beans in the Admin Faces lib.
//@ServletComponentScan("com.github.adminfaces.starter") // This will start the filter and servlets.
public class AdminBootApplication {
	@Inject
	private Utils utils;
	
//	@Bean
//	public AdminConfig adminConfig() {
//		return new AdminConfig();
//	}
//	
//	@Bean
//	public AdminSession adminSession() {
//		return new AdminSession();
//	}
	
    @Bean
    public List<Car> getCars() {
        return utils.getCars();
    }
	
}
