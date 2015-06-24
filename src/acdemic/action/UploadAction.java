package acdemic.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class UploadAction extends BaseAction implements Action{

	private File uploadFile;
	
	private String uploadFileContentType;
	
	private String uploadFileFileName;
	
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	
	public String upload() throws IOException{
//		String RealPath=ServletActionContext.getServletContext().getRealPath("/post");
		
		String RealPath="E:/xmc_Code/JavaEE/Assigment8WebSSH/WebContent/post";
		
		File file=new File(RealPath);
		
		if(!file.exists()){
			file.mkdirs();
		}
		
		FileUtils.copyFile(uploadFile, new File(file,uploadFileFileName));
		String path=RealPath+"/"+uploadFileFileName;
		
		System.out.println(path);
		
		session.put("path", path);
		
		return SUCCESS;
	}


	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileContentType() {
		return uploadFileContentType;
	}

	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}
	
	

}
