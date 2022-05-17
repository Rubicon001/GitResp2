package com.mj.jk.pojo.query;

import lombok.Data;

@Data
public class PageQuery {
    private long page;
    private long size;
    private static final int DEFAULT_SIZE = 1;

    public long getPage() {
        return page < 1 ? 1 : page;
    }

    public long getSize() {
        return Math.max(DEFAULT_SIZE, size);
    }
}
