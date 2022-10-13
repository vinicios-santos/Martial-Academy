package config;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/*public class Backup {

	public static void BackupDb(String caminho) throws IOException, InterruptedException {
	    Runtime rt = Runtime.getRuntime();
	    Process p;
	    ProcessBuilder pb;
	    rt = Runtime.getRuntime();
	    pb = new ProcessBuilder(
	            "C:\\Program Files\\PostgreSQL\\14\\bin\\pg_dump.exe",
	            "--host=localhost",
	            "--port=5432",
	            "--username=postgres",
	            "--password=postgres",
	            "--format=custom",
	            "--blobs",
	            "--verbose", "--file", caminho, "service_station");
	    try {
	        final Map<String, String> env = pb.environment();
	        env.put("PGPASSWORD", "admin");
	        p = pb.start();
	        final BufferedReader r = new BufferedReader(
	                new InputStreamReader(p.getErrorStream()));
	        String line = r.readLine();
	        while (line != null) {
	            System.err.println(line);
	            line = r.readLine();
	        }
	        r.close();
	        p.waitFor();
	        System.out.println(p.exitValue());

	    } catch (IOException | InterruptedException e) {
	        System.out.println(e.getMessage());
	    }
	}	
} */

public class Backup {
	public static void fazBackup(String arquivo, String diretorio){
		File arq = new File(arquivo);
		if (arq.exists()){
			if (arq.length() > 0)
				arq.delete();
		}
		try {
			Process p = null;
			String linha = "";
			ProcessBuilder pb = new ProcessBuilder(diretorio+"pg_dump.exe", "-i", "-h", "ip da máquina", "-U", "base de dados", "-F", "c", "-b", "-v", "-f", arquivo, "usuario");
			pb.environment().put("PGPASSWORD", "senha");
			pb.redirectErrorStream(true);
			p = pb.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((linha = reader.readLine()) != null){
				System.out.println(linha);
			}
		}catch (Exception e) {
			System.out.println("Não foi possível efetuar o backup");
		}
	}

}

