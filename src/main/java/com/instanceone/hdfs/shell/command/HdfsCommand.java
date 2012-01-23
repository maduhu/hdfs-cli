// Copyright (c) 2011 Health Market Science, Inc.

package com.instanceone.hdfs.shell.command;

import org.apache.hadoop.fs.FileSystem;

import com.instanceone.hdfs.shell.AbstractCommand;

public abstract class HdfsCommand extends AbstractCommand {
    public static final String HDFS_URL = "hdfs.url";
    
    protected static FileSystem hdfs;
    protected static FileSystem localfs;

    public HdfsCommand(String name) {
        super(name);
    }

}
