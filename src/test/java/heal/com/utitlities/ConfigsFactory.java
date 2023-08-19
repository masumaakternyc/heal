package heal.com.utitlities;

import org.aeonbits.owner.ConfigFactory;

public final class ConfigsFactory {

    private ConfigsFactory() {
    }

    public static FrameworkConfig getConfig() {
        return ConfigFactory.create(FrameworkConfig.class);
    }
}
