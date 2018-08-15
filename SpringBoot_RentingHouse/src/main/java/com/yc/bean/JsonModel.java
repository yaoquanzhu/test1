package com.yc.bean;

import java.io.Serializable;
import java.util.List;

public class JsonModel<T> implements Serializable {
	
	private static final long serialVersionUID = 7634199311745580110L;
		private Integer code;
		private String msg;
		private Object obj;
		
		private Integer total;//总记录数
		private Integer pages;// 当前为第几页
		private Integer pageSize;// 当前有几条
		private List<T> rows;//记录集合
		
		public Integer getCode() {
			return code;
		}
		public void setCode(Integer code) {
			this.code = code;
		}
		
		public JsonModel(Integer code, String msg, Object obj) {
			super();
			this.code = code;
			this.msg = msg;
			this.obj = obj;
		}
		public JsonModel() {
			super();
		}
		public Object getObj() {
			return obj;
		}
		public void setObj(Object obj) {
			this.obj = obj;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		@Override
		public String toString() {
			return "JsonModel [code=" + code + ", msg=" + msg + ", obj=" + obj
					+ ", total=" + total + ", pages=" + pages + ", pageSize="
					+ pageSize + ", rows=" + rows + "]";
		}
		public Integer getTotal() {
			return total;
		}
		public void setTotal(Integer total) {
			this.total = total;
		}
		public Integer getPages() {
			return pages;
		}
		public void setPages(Integer pages) {
			this.pages = pages;
		}
		public Integer getPageSize() {
			return pageSize;
		}
		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}
		public List<T> getRows() {
			return rows;
		}
		public void setRows(List<T> rows) {
			this.rows = rows;
		}
		
}
