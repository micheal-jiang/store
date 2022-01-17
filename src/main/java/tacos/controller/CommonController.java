/*
package tacos.controller;

import cn.com.jxlife.esale.policyserver.common.dto.ResponseDTO;
import cn.com.jxlife.esale.policyserver.db.entity.slmp.CodeFk;
import cn.com.jxlife.esale.policyserver.service.base.code.ICodeService;
import cn.com.jxlife.esale.policyserver.service.base.mobileMsg.dto.MobileMsgDTO;
import cn.com.jxlife.esale.policyserver.service.base.mobileMsg.service.MobileMsgServiceImpl;
import cn.com.jxlife.esale.policyserver.service.business.common.domain.UserDomain;
import cn.com.jxlife.esale.policyserver.service.business.common.domain.dto.PackageListDTO;
import cn.com.jxlife.framework.demeter.controller.AbstractController;
import cn.com.jxlife.framework.demeter.exception.business.GlobalBusinessException;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tacos.annotation.ApiOperation;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@RestController
public class CommonController{


    Logger logger = LoggerFactory.getLogger(CommonController.class);


    @Autowired @Qualifier("ICodeServiceImplWrapper")
    ICodeService codeService;


    @RequestMapping(value = "/common/getCodeList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ApiOperation(value = "获取多个枚举,用逗号分割", notes = "获取多个枚举,用逗号分割")
    public ResponseDTO getCodeList(HttpServletRequest request) throws GlobalBusinessException {
        ResponseDTO res = null;
        try {
            String data = IOUtils.toString(request.getInputStream());
            PackageListDTO packageListDTO = JSON.parseObject(data, PackageListDTO.class);
            logger.info(packageListDTO.getPackageList().getPackages().getData());

            String decryptData = packageListDTO.getData(packageListDTO.isIfSM4(), String.class);
            List<CodeFk> codeTypeList = codeService.getByCodeTypeList(Arrays.asList(StringUtils.split(decryptData, ",")));
            return ResponseDTO.succData(codeTypeList).encode(packageListDTO.isIfSM4());
        } catch (Exception e) {
            e.printStackTrace();
            res = ResponseDTO.failMsg(e.getMessage());
            logger.error(e.getMessage());
        }
        return res;
    }


    @RequestMapping(value = "/common/getAllCode", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ApiOperation(value = "获取所有枚举", notes = "获取所有枚举")
    public ResponseDTO getAllCode(HttpServletRequest request) throws GlobalBusinessException {
        ResponseDTO res = null;
        try {
            String data = IOUtils.toString(request.getInputStream());
            PackageListDTO packageListDTO = JSON.parseObject(data, PackageListDTO.class);
            logger.info(packageListDTO.getPackageList().getPackages().getData());

            List<CodeFk> codeTypeList = codeService.getAll();
            return ResponseDTO.succData(codeTypeList).encode(packageListDTO.isIfSM4());
        } catch (Exception e) {
            e.printStackTrace();
            res = ResponseDTO.failMsg(e.getMessage());
            logger.error(e.getMessage());
        }
        return res;
    }
}
*/
