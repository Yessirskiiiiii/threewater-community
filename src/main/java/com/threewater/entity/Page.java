package com.threewater.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Yessirskiii
 * @Date: 2022/03/31/20:01
 * @Description: 封装分页相关的信息
 */
public class Page {

    // 记录当前页码
    private int current = 1;

    // 一页的上限
    private int limit = 10;

    // 数据总数(用于计算总页数)
    private int rows;

    // 查询路径(用于复用分页链接)
    private String path;

    public Page() {
    }

    @Override
    public String toString() {
        return "Page{" +
                "current=" + current +
                ", limit=" + limit +
                ", rows=" + rows +
                ", path='" + path + '\'' +
                '}';
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current >= 1) {
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit >= 1 && limit <= 100) {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if (rows >= 0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Page(int current, int limit, int rows, String path) {
        this.current = current;
        this.limit = limit;
        this.rows = rows;
        this.path = path;
    }

    // 获取当前页的起始行
    public int getOffset() {
        // current * limit - limit
        return (current - 1) * limit;
    }

    // 获取总页数
    public int getTotal() {
        // rows / limit
        if (rows % limit == 0) {
            return rows / limit;
        } else {
            return rows / limit + 1;
        }
    }

    // 获取起始页
    public int getFrom() {
        int from = current - 2;
        return Math.max(from, 1);
    }

    // 获取结束页
    public int getTo() {
        int to = current + 2;
        int total = getTotal();
        return Math.min(to, total);
    }
}
