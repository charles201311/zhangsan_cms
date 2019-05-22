package com.zhangsan.cms.domain;

public class CmsFrendlylink {
    private Integer id;

    private String name;

    private String url;

    private Integer sorted;

    public CmsFrendlylink() {
		super();
	}

	public CmsFrendlylink(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getSorted() {
        return sorted;
    }

    public void setSorted(Integer sorted) {
        this.sorted = sorted;
    }
}