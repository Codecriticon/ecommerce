package com.codecriticon.ecommerce;

import com.codecriticon.ecommerce.config.AsyncSyncConfiguration;
import com.codecriticon.ecommerce.config.EmbeddedCouchbase;
import com.codecriticon.ecommerce.config.EmbeddedKafka;
import com.codecriticon.ecommerce.config.JacksonConfiguration;
import com.codecriticon.ecommerce.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import tech.jhipster.config.JHipsterConstants;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { EcommerceApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedCouchbase
@ActiveProfiles(JHipsterConstants.SPRING_PROFILE_TEST)
@EmbeddedKafka
public @interface IntegrationTest {
}
