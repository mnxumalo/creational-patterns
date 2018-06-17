package com.pluralsight.factory;

public class WebsiteFactory {

	public static Website getWebSite(WebsiteType siteType) {
		switch (siteType) {
		case BLOG:{
			return new Blog();
		}
		case SHOP:{
			return new Shop();
		}
		default:
			return null;
		}
	}
}