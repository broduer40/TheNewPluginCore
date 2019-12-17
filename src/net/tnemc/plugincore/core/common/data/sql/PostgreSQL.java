package net.tnemc.plugincore.core.common.data.sql;

import net.tnemc.plugincore.core.common.data.SQLDatabase;
import net.tnemc.plugincore.core.managers.DataManager;

/**
 * Created by creatorfromhell.
 *
 * The New Chat Minecraft Server Plugin
 *
 * This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivatives 4.0
 * International License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/
 * or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */
public class PostgreSQL extends SQLDatabase {
  public PostgreSQL(DataManager manager) {
    super(manager);
  }

  @Override
  public String getDriver() {
    return "org.postgresql.Driver";
  }

  @Override
  public Boolean dataSource() {
    return true;
  }

  @Override
  public String dataSourceURL() {
    return "org.postgresql.ds.PGSimpleDataSource";
  }

  @Override
  public String getURL(String file, String host, int port, String database) {
    return "jdbc:postgresql://" + host + ":" + port + "/" + database;
  }
}