package alisson.data_contracts.config;

//import io.harness.cf.client.api.BaseConfig;
//import io.harness.cf.client.api.CfClient;
//import io.harness.cf.client.connector.HarnessConfig;
//import io.harness.cf.client.connector.HarnessConnector;
//import io.harness.cf.client.dto.Target;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;

//@Configuration
public class SerasaFeatureFlag {

//    HarnessConfig connectorConfig = HarnessConfig.builder()
//            .configUrl("https://config.ff.harness.io/api/1.0")
//            .eventUrl("https://events.ff.harness.io/api/1.0")
//            .build();
//
//    BaseConfig options = BaseConfig.builder()
//            .pollIntervalInSeconds(60)
//            .streamEnabled(true)
//            .globalTargetEnabled(true)
//            .analyticsEnabled(true)
//            .build();
//    @Value("${feature.flag.apikey}")
//    private String featureFlagApiKey;
//
//
//
//    private CfClient getCfClient(){
//        return new CfClient(new HarnessConnector(featureFlagApiKey, connectorConfig), options);
//    }
//
//    public boolean getValueFFTypeBoolean(String ffName, Target ffTarget, boolean defaultValue){
//        return getCfClient().boolVariation(ffName, ffTarget , defaultValue);
//    }
//
//
//    public String getValueFFTypeMultiVariavel(String ffName, Target ffTarget, String defaultValue){
//        return getCfClient().stringVariation(ffName, ffTarget , defaultValue);
//    }

}
