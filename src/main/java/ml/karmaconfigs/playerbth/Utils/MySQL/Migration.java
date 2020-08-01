package ml.karmaconfigs.playerbth.Utils.MySQL;

import ml.karmaconfigs.playerbth.Utils.User;
import org.bukkit.OfflinePlayer;

public final class Migration {

    public final void migrateFromSQLToYaml() {
        for (OfflinePlayer player : Utils.getPlayers()) {
            User user = new User(player);

            user.setBirthdayFile(user.getBirthday());
            user.setNotificationsFile(user.hasNotifications());
        }
    }

    public final void migrateFromYamlToMysql(OfflinePlayer player) {
        User user = new User(player);

        if (!user.hasBirthday() && user.hasBirthdayFile()) {
            user.setBirthday(user.getFileBirthday());
            user.setNotifications(user.hasNotificationsFile());
        }
    }
}