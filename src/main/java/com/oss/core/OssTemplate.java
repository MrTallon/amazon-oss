package com.oss.core;

import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectSummary;

import java.io.InputStream;
import java.util.List;

/**
 * OSS 操作模板
 */
public interface OssTemplate {

    /**
     * 创建bucket
     * @param bucketName bucket名称
     */
    void createBucket(String bucketName);

    /**
     * 获取所有的bucket
     * @return bucket
     */
    List<Bucket> getAllBuckets();

    /**
     * 通过bucket名称删除bucket
     * @param bucketName name
     */
    void removeBucket(String bucketName);

    /**
     * 上传文件
     * @param bucketName bucket名称
     * @param objectName 文件名称
     * @param stream 文件流
     * @param contextType 文件类型
     * @throws Exception exception
     */
    void putObject(String bucketName, String objectName, InputStream stream, String contextType) throws Exception;

    /**
     * 上传文件
     * @param bucketName bucket名称
     * @param objectName 文件名称
     * @param stream 文件流
     * @throws Exception exception
     */
    void putObject(String bucketName, String objectName, InputStream stream) throws Exception;

    /**
     * 获取文件
     * @param bucketName bucket名称
     * @param objectName 文件名称
     * @return S3Object
     */
    S3Object getObject(String bucketName, String objectName);

    /**
     * 获取对象的url
     * @param bucketName name
     * @param objectName name
     * @param expires expires
     * @return 对象URL
     */
    String getObjectURL(String bucketName, String objectName, Integer expires);

    /**
     * 通过bucketName和objectName删除对象
     * @param bucketName name
     * @param objectName name
     * @throws Exception exception
     */
    void removeObject(String bucketName, String objectName) throws Exception;

    /**
     * 根据文件前置查询文件
     * @param bucketName bucket名称
     * @param prefix 前缀
     * @param recursive 是否递归查询
     * @return S3ObjectSummary 列表
     */
    List<S3ObjectSummary> getAllObjectsByPrefix(String bucketName, String prefix, boolean recursive);
}
