package ml.karmaconfigs.playerbth;

import ml.karmaconfigs.api.common.Logger;
import ml.karmaconfigs.api.common.utils.StringUtils;
import org.bukkit.plugin.java.JavaPlugin;

/*
GNU LESSER GENERAL PUBLIC LICENSE
                       Version 2.1, February 1999
 Copyright (C) 1991, 1999 Free Software Foundation, Inc.
 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.
[This is the first released version of the Lesser GPL.  It also counts
 as the successor of the GNU Library Public License, version 2, hence
 the version number 2.1.]
 */

public interface PlayerBTH {

    Main plugin = (Main) JavaPlugin.getProvidingPlugin(Main.class);
    String name = StringUtils.toColor("&f[ &cGSA &f] &bPlayerBTH");
    String version = StringUtils.toColor("&c" + plugin.getDescription().getVersion());

    Logger logger = new Logger(plugin);

    static boolean hasNoteBlock() {
        return plugin.getServer().getPluginManager().isPluginEnabled("NoteBlockAPI");
    }

    static boolean hasPlaceholderAPI() {
        return plugin.getServer().getPluginManager().isPluginEnabled("PlaceholderAPI");
    }

    static String getJarName() {
        return new java.io.File(Main.class.getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .getPath())
                .getName();
    }
}
