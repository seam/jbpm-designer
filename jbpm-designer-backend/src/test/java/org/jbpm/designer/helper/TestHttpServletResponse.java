/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.jbpm.designer.helper;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class TestHttpServletResponse  implements HttpServletResponse {

    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    private PrintWriter printWriter;
    private ServletOutputStream servletOutputStream;

    public TestHttpServletResponse() {
        this.printWriter = new PrintWriter(outputStream);
        this.servletOutputStream = new ServletOutputStream() {
            @Override
            public void write(int i) throws IOException {
                outputStream.write(i);
            }
        };
    }

    public byte[] getContent() {
        this.printWriter.flush();
        try {
            this.servletOutputStream.flush();
        } catch (IOException e) {

        }
        return this.outputStream.toByteArray();
    }

    public void addCookie(Cookie cookie) {
        
    }

    public boolean containsHeader(String name) {
        return false;  
    }

    public String encodeURL(String url) {
        return null;  
    }

    public String encodeRedirectURL(String url) {
        return null;  
    }

    public String encodeUrl(String url) {
        return null;  
    }

    public String encodeRedirectUrl(String url) {
        return null;  
    }

    public void sendError(int sc, String msg) throws IOException {
        
    }

    public void sendError(int sc) throws IOException {
        
    }

    public void sendRedirect(String location) throws IOException {
        
    }

    public void setDateHeader(String name, long date) {
        
    }

    public void addDateHeader(String name, long date) {
        
    }

    public void setHeader(String name, String value) {
        
    }

    public void addHeader(String name, String value) {
        
    }

    public void setIntHeader(String name, int value) {
        
    }

    public void addIntHeader(String name, int value) {
        
    }

    public void setStatus(int sc) {
        
    }

    public void setStatus(int sc, String sm) {
        
    }

    @Override
    public int getStatus() {
        return 0;
    }

    @Override
    public String getHeader( String name ) {
        return null;
    }

    @Override
    public Collection<String> getHeaders( String name ) {
        return null;
    }

    @Override
    public Collection<String> getHeaderNames() {
        return null;
    }

    public String getCharacterEncoding() {
        return null;  
    }

    public String getContentType() {
        return null;  
    }

    public ServletOutputStream getOutputStream() throws IOException {
        return this.servletOutputStream;
    }

    public PrintWriter getWriter() throws IOException {
        return this.printWriter;
    }

    public void setCharacterEncoding(String charset) {
        
    }

    public void setContentLength(int len) {

    }

    public void setContentType(String type) {
        
    }

    public void setBufferSize(int size) {
        
    }

    public int getBufferSize() {
        return 0;  
    }

    public void flushBuffer() throws IOException {
        
    }

    public void resetBuffer() {
        
    }

    public boolean isCommitted() {
        return false;  
    }

    public void reset() {
        
    }

    public void setLocale(Locale loc) {
        
    }

    public Locale getLocale() {
        return null;  
    }
}
