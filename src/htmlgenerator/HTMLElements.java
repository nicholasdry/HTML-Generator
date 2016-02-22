package htmlgenerator;

class HTMLElements {

	private String title;
	private String header;
	private String paragraph;
	private String footer;
        private String css;
        private String javascript;

        public String getCSS() {
		return css;
	}
        
        public void setCSS(String css) {
		this.css = css;
	}
        
        public String getJavaScript() {
		return javascript;
	}
        
        public void setJavaScript(String javascript) {
		this.javascript = javascript;
	}
        
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getParagraph() {
		return paragraph;
	}

	public void setParagraph(String paragraph) {
		this.paragraph = paragraph;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public HTMLElements() {
		title = null;
		header = null;
		paragraph = null;
		footer = null;
	}

}