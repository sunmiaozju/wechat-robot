package org.androidtest.robotp;

import java.io.File;

import org.androidtest.robotp.publicutils.FileOperatorUtil;

/**
 * 配置类
 *
 * @author Vince蔡培培
 */
public class Config {
	public static final String SUPERADMIN = "Coulson";
	public static File dir_home = FileOperatorUtil.mkdirs(System.getProperty("user.dir"));
	public static File dir_groups = FileOperatorUtil
			.mkdirs(dir_home.getAbsolutePath() + File.separator + "groups_conf");
}
