package org.dromara.neutrinoproxy.server.controller.res.proxy;

import lombok.Data;
import org.dromara.neutrinoproxy.server.constant.EnableStatusEnum;
import org.dromara.neutrinoproxy.server.constant.OnlineStatusEnum;
import org.dromara.neutrinoproxy.server.service.bo.FullDomainNameBO;

import java.util.Date;
import java.util.List;

/**
 * 端口映射列表响应
 * @author: aoshiguchen
 * @date: 2022/8/8
 */
@Data
public class PortMappingListRes {
	private Integer id;
	/**
	 * licenseId
	 */
	private Integer licenseId;
	/**
	 * 协议
	 */
	private String protocal;
    /**
     * 完整域名映射
     */
    private List<FullDomainNameBO> fullDomainMappings;
	/**
	 * license名称
	 */
	private String licenseName;
	/**
	 * 用户ID
	 */
	private Integer userId;
	/**
	 * 用户姓名
	 */
	private String userName;
	/**
	 * 服务端端口
	 */
	private Integer serverPort;
	/**
	 * 客户端ip
	 */
	private String clientIp;
	/**
	 * 客户端端口
	 */
	private Integer clientPort;
    /**
     * 上传限速
     */
    private String upLimitRate;
    /**
     * 下载限速
     */
    private String downLimitRate;
	/**
	 * 客户端端口
	 */
	private Integer port;
	/**
	 * 是否在线
	 * {@link OnlineStatusEnum}
	 */
	private Integer isOnline;
	/**
	 * 启用状态
	 * {@link EnableStatusEnum}
	 */
	private Integer enable;
	/**
	 * 代理响应数量（响应数据包数量，如果没有拆包则等于数据条数）
	 */
	private Integer proxyResponses;
	/**
	 * 代理超时时间
	 */
	private Long proxyTimeoutMs;
	/**
	 * 描述
	 */
	private String description;

    /**
     * 安全组Id
     */
    private Integer securityGroupId;

	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
}
