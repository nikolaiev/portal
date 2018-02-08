package com.school.interceptors.validator;

import com.school.exceptions.InvalidParamException;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

import static java.lang.String.format;

@Component
public class PageSizeNumberParamsValidator extends HandlerInterceptorAdapter {
    private static final String INVALID_ATTRIBUTE = "Invalid Attribute";
    private static final String POSITIVE_NUMBER_REGEX = "^\\d+$";
    //TODO replace these to some cosntant classgi
    private static final String PAGE_SIZE_PARAM = "page_size";
    private static final String PAGE_NUMB_PARAM = "page_numb";

    /*private static @Log4j
    Logger logger;*/

    private String getErrorMessage(String invalidParameter) {
        return format("Invalid parameter %s. Parameter %s should be a positive number.",
                invalidParameter, invalidParameter);
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

    /*_limit param validation*/
        Optional<Object> limitOptional =
                Optional.ofNullable(request.getParameter(PAGE_NUMB_PARAM));

        limitOptional.ifPresent(limit -> {
            if (!limit.toString().matches(POSITIVE_NUMBER_REGEX)) {
                //logger.error(getErrorMessage(Mappings.LIMIT_PARAM));

                throw InvalidParamException.builder().detail(getErrorMessage(PAGE_NUMB_PARAM))
                        .pointer(request.getServletPath()).title(INVALID_ATTRIBUTE).build();
            }
        });

    /*_start param validation*/

        Optional<Object> startOptional =
                Optional.ofNullable(request.getParameter(PAGE_SIZE_PARAM));

        startOptional.ifPresent(limit -> {
            if (!limit.toString().matches(POSITIVE_NUMBER_REGEX)) {
                //logger.error(getErrorMessage(Mappings.START_PARAM));

                throw InvalidParamException.builder().detail(getErrorMessage(PAGE_SIZE_PARAM))
                        .pointer(request.getServletPath()).title(INVALID_ATTRIBUTE).build();
            }
        });

        return super.preHandle(request, response, handler);
    }
}
