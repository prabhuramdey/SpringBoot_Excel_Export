package in.prd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.prd.service.ReportService;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ReportRestController {

	@Autowired
	private ReportService service;
	
	@GetMapping("/excel")
	public void generateExcelReport(HttpServletResponse response) throws Exception {
		
		response.setContentType("applicaion/octet-stream");
		
		String headerKey="Content-Disposition";
		String headerValue="attachment;filename=books.xls";
		
		response.setHeader(headerKey, headerValue);
		
		service.generateExcel(response);
	}
}
