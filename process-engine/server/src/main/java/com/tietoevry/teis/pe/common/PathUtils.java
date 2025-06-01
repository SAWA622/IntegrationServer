package com.tietoevry.teis.pe.common;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public final class PathUtils {

	private PathUtils() {
		// TODO Auto-generated constructor stub
	}

	public static String getTeisHome() {
		return Optional.ofNullable(System.getenv("TEIS_HOME"))
				.orElseThrow(() -> new IllegalArgumentException("Please defined TEIS_HOME environment variable."));
	}

	public static String getClientCertificate() {
		Path path = Paths.get(getTeisHome(), "JBoss", "certificates", "se", "se1", "client.keystore.p12");
		return path.toFile().getAbsolutePath();
	}

	public static String getTrustStore() {
		Path path = Paths.get(getTeisHome(), "JBoss", "certificates", "cacerts.p12");
		return path.toFile().getAbsolutePath();
	}

	public static String getTemplateScriptPath(String fileName) {
		Path filePath = Paths.get(getTeisHome(), "Data", "ConfigSet", "Deploy", "Template", fileName);
		return filePath.toFile().getAbsolutePath();
	}

	public static String getUserScriptPath(String fileName, String wsId) {
		Path filePath = Paths.get(getTeisHome(), "Data", "ConfigSet", "Deploy", wsId, "UserScripts", fileName);
		return filePath.toFile().getAbsolutePath();
	}
}
