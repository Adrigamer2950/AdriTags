package me.adrigamer2950.premiumtags;

import me.adrigamer2950.adriapi.api.APIPlugin;

public class PTPlugin extends APIPlugin {

    @Override
    public void onPreLoad() {
        getApiLogger().info("&6Loading...");
    }

    @Override
    public void onPostLoad() {
        getApiLogger().info("&aEnabled!");
    }

    @Override
    public void onUnload() {
        getApiLogger().info("&cDisabled!");
    }
}
