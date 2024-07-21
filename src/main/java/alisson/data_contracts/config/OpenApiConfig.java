package alisson.data_contracts.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("br.com.experian")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                // TODO Informar o nome e descrição do openapi doc da sua aplicação com a descrição. EX. de nome. EITS-BUZZ-ALDRIN-API
                .info(new Info().title("@@OPENAPI_DOC_NAME@@").description(
                        "@@OPENAPI_DOC_DESCRIPTION@@"));
    }
}