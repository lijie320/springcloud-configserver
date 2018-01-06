package cn.et;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
//启用了分布式配置中心，远程读取git仓库获取配置
/**
 * 所有spring配置中心的的配置文件都有以下格式组成
 * 1.配置文件属于哪个应用（application）
 * 2.配置文件属于哪个阶段（profile）开发阶段 测试阶段 产品阶段
 * 3.在git仓库中哪个分支下（label）
 * @author Administrator
 *
 */
@EnableConfigServer
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

	}

}
