package net.minecraft.server;

import com.mojang.authlib.GameProfile;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class CommandWhitelist extends CommandAbstract {

    public CommandWhitelist() {
    }

    public String getCommand() {
        return null;
    }

    public int a() {
        return 0;
    }

    public String getUsage(ICommandListener icommandlistener) {
        return null;
    }

    public void execute(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring) throws CommandException {
    }

    public List<String> tabComplete(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring, @Nullable BlockPosition blockposition) {
        return null;
    }
}