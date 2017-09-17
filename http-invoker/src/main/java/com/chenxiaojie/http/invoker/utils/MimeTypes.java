package com.chenxiaojie.http.invoker.utils;

import com.google.common.collect.Maps;
import org.apache.http.annotation.NotThreadSafe;

import java.util.Map;

/**
 * Created by chenxiaojie on 2017/9/10.
 */
@NotThreadSafe
public abstract class MimeTypes {

    public static final Map<String, String> MimeType = Maps.newHashMap();

    static {
        MimeType.put(".323", "text/h323");
        MimeType.put(".3g2", "video/3gpp2");
        MimeType.put(".3gp", "video/3gpp");
        MimeType.put(".3gp2", "video/3gpp2");
        MimeType.put(".3gpp", "video/3gpp");
        MimeType.put(".7z", "application/x-7z-compressed");
        MimeType.put(".aa", "audio/audible");
        MimeType.put(".AAC", "audio/aac");
        MimeType.put(".aaf", "application/octet-stream");
        MimeType.put(".aax", "audio/vnd.audible.aax");
        MimeType.put(".ac3", "audio/ac3");
        MimeType.put(".aca", "application/octet-stream");
        MimeType.put(".accda", "application/msaccess.addin");
        MimeType.put(".accdb", "application/msaccess");
        MimeType.put(".accdc", "application/msaccess.cab");
        MimeType.put(".accde", "application/msaccess");
        MimeType.put(".accdr", "application/msaccess.runtime");
        MimeType.put(".accdt", "application/msaccess");
        MimeType.put(".accdw", "application/msaccess.webapplication");
        MimeType.put(".accft", "application/msaccess.ftemplate");
        MimeType.put(".acx", "application/internet-property-stream");
        MimeType.put(".AddIn", "text/xml");
        MimeType.put(".ade", "application/msaccess");
        MimeType.put(".adobebridge", "application/x-bridge-url");
        MimeType.put(".adp", "application/msaccess");
        MimeType.put(".ADT", "audio/vnd.dlna.adts");
        MimeType.put(".ADTS", "audio/aac");
        MimeType.put(".afm", "application/octet-stream");
        MimeType.put(".ai", "application/postscript");
        MimeType.put(".aif", "audio/x-aiff");
        MimeType.put(".aifc", "audio/aiff");
        MimeType.put(".aiff", "audio/aiff");
        MimeType.put(".air", "application/vnd.adobe.air-application-installer-package+zip");
        MimeType.put(".amc", "application/x-mpeg");
        MimeType.put(".application", "application/x-ms-application");
        MimeType.put(".art", "image/x-jg");
        MimeType.put(".asa", "application/xml");
        MimeType.put(".asax", "application/xml");
        MimeType.put(".ascx", "application/xml");
        MimeType.put(".asd", "application/octet-stream");
        MimeType.put(".asf", "video/x-ms-asf");
        MimeType.put(".ashx", "application/xml");
        MimeType.put(".asi", "application/octet-stream");
        MimeType.put(".asm", "text/plain");
        MimeType.put(".asmx", "application/xml");
        MimeType.put(".aspx", "application/xml");
        MimeType.put(".asr", "video/x-ms-asf");
        MimeType.put(".asx", "video/x-ms-asf");
        MimeType.put(".atom", "application/atom+xml");
        MimeType.put(".au", "audio/basic");
        MimeType.put(".avi", "video/x-msvideo");
        MimeType.put(".axs", "application/olescript");
        MimeType.put(".bas", "text/plain");
        MimeType.put(".bcpio", "application/x-bcpio");
        MimeType.put(".bin", "application/octet-stream");
        MimeType.put(".bmp", "image/bmp");
        MimeType.put(".c", "text/plain");
        MimeType.put(".cab", "application/octet-stream");
        MimeType.put(".caf", "audio/x-caf");
        MimeType.put(".calx", "application/vnd.ms-office.calx");
        MimeType.put(".cat", "application/vnd.ms-pki.seccat");
        MimeType.put(".cc", "text/plain");
        MimeType.put(".cd", "text/plain");
        MimeType.put(".cdda", "audio/aiff");
        MimeType.put(".cdf", "application/x-cdf");
        MimeType.put(".cer", "application/x-x509-ca-cert");
        MimeType.put(".chm", "application/octet-stream");
        MimeType.put(".class", "application/x-java-applet");
        MimeType.put(".clp", "application/x-msclip");
        MimeType.put(".cmx", "image/x-cmx");
        MimeType.put(".cnf", "text/plain");
        MimeType.put(".cod", "image/cis-cod");
        MimeType.put(".config", "application/xml");
        MimeType.put(".contact", "text/x-ms-contact");
        MimeType.put(".coverage", "application/xml");
        MimeType.put(".cpio", "application/x-cpio");
        MimeType.put(".cpp", "text/plain");
        MimeType.put(".crd", "application/x-mscardfile");
        MimeType.put(".crl", "application/pkix-crl");
        MimeType.put(".crt", "application/x-x509-ca-cert");
        MimeType.put(".cs", "text/plain");
        MimeType.put(".csdproj", "text/plain");
        MimeType.put(".csh", "application/x-csh");
        MimeType.put(".csproj", "text/plain");
        MimeType.put(".css", "text/css");
        MimeType.put(".csv", "text/csv");
        MimeType.put(".cur", "application/octet-stream");
        MimeType.put(".cxx", "text/plain");
        MimeType.put(".dat", "application/octet-stream");
        MimeType.put(".datasource", "application/xml");
        MimeType.put(".dbproj", "text/plain");
        MimeType.put(".dcr", "application/x-director");
        MimeType.put(".def", "text/plain");
        MimeType.put(".deploy", "application/octet-stream");
        MimeType.put(".der", "application/x-x509-ca-cert");
        MimeType.put(".dgml", "application/xml");
        MimeType.put(".dib", "image/bmp");
        MimeType.put(".dif", "video/x-dv");
        MimeType.put(".dir", "application/x-director");
        MimeType.put(".disco", "text/xml");
        MimeType.put(".dll", "application/x-msdownload");
        MimeType.put(".dll.config", "text/xml");
        MimeType.put(".dlm", "text/dlm");
        MimeType.put(".doc", "application/msword");
        MimeType.put(".docm", "application/vnd.ms-word.document.macroEnabled.12");
        MimeType.put(".docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        MimeType.put(".dot", "application/msword");
        MimeType.put(".dotm", "application/vnd.ms-word.template.macroEnabled.12");
        MimeType.put(".dotx", "application/vnd.openxmlformats-officedocument.wordprocessingml.template");
        MimeType.put(".dsp", "application/octet-stream");
        MimeType.put(".dsw", "text/plain");
        MimeType.put(".dtd", "text/xml");
        MimeType.put(".dtsConfig", "text/xml");
        MimeType.put(".dv", "video/x-dv");
        MimeType.put(".dvi", "application/x-dvi");
        MimeType.put(".dwf", "drawing/x-dwf");
        MimeType.put(".dwp", "application/octet-stream");
        MimeType.put(".dxr", "application/x-director");
        MimeType.put(".eml", "message/rfc822");
        MimeType.put(".emz", "application/octet-stream");
        MimeType.put(".eot", "application/octet-stream");
        MimeType.put(".eps", "application/postscript");
        MimeType.put(".etl", "application/etl");
        MimeType.put(".etx", "text/x-setext");
        MimeType.put(".evy", "application/envoy");
        MimeType.put(".exe", "application/octet-stream");
        MimeType.put(".exe.config", "text/xml");
        MimeType.put(".fdf", "application/vnd.fdf");
        MimeType.put(".fif", "application/fractals");
        MimeType.put(".filters", "Application/xml");
        MimeType.put(".fla", "application/octet-stream");
        MimeType.put(".flr", "x-world/x-vrml");
        MimeType.put(".flv", "video/x-flv");
        MimeType.put(".fsscript", "application/fsharp-script");
        MimeType.put(".fsx", "application/fsharp-script");
        MimeType.put(".generictest", "application/xml");
        MimeType.put(".gif", "image/gif");
        MimeType.put(".group", "text/x-ms-group");
        MimeType.put(".gsm", "audio/x-gsm");
        MimeType.put(".gtar", "application/x-gtar");
        MimeType.put(".gz", "application/x-gzip");
        MimeType.put(".h", "text/plain");
        MimeType.put(".hdf", "application/x-hdf");
        MimeType.put(".hdml", "text/x-hdml");
        MimeType.put(".hhc", "application/x-oleobject");
        MimeType.put(".hhk", "application/octet-stream");
        MimeType.put(".hhp", "application/octet-stream");
        MimeType.put(".hlp", "application/winhlp");
        MimeType.put(".hpp", "text/plain");
        MimeType.put(".hqx", "application/mac-binhex40");
        MimeType.put(".hta", "application/hta");
        MimeType.put(".htc", "text/x-component");
        MimeType.put(".htm", "text/html");
        MimeType.put(".html", "text/html");
        MimeType.put(".htt", "text/webviewhtml");
        MimeType.put(".hxa", "application/xml");
        MimeType.put(".hxc", "application/xml");
        MimeType.put(".hxd", "application/octet-stream");
        MimeType.put(".hxe", "application/xml");
        MimeType.put(".hxf", "application/xml");
        MimeType.put(".hxh", "application/octet-stream");
        MimeType.put(".hxi", "application/octet-stream");
        MimeType.put(".hxk", "application/xml");
        MimeType.put(".hxq", "application/octet-stream");
        MimeType.put(".hxr", "application/octet-stream");
        MimeType.put(".hxs", "application/octet-stream");
        MimeType.put(".hxt", "text/html");
        MimeType.put(".hxv", "application/xml");
        MimeType.put(".hxw", "application/octet-stream");
        MimeType.put(".hxx", "text/plain");
        MimeType.put(".i", "text/plain");
        MimeType.put(".ico", "image/x-icon");
        MimeType.put(".ics", "application/octet-stream");
        MimeType.put(".idl", "text/plain");
        MimeType.put(".ief", "image/ief");
        MimeType.put(".iii", "application/x-iphone");
        MimeType.put(".inc", "text/plain");
        MimeType.put(".inf", "application/octet-stream");
        MimeType.put(".inl", "text/plain");
        MimeType.put(".ins", "application/x-internet-signup");
        MimeType.put(".ipa", "application/x-itunes-ipa");
        MimeType.put(".ipg", "application/x-itunes-ipg");
        MimeType.put(".ipproj", "text/plain");
        MimeType.put(".ipsw", "application/x-itunes-ipsw");
        MimeType.put(".iqy", "text/x-ms-iqy");
        MimeType.put(".isp", "application/x-internet-signup");
        MimeType.put(".ite", "application/x-itunes-ite");
        MimeType.put(".itlp", "application/x-itunes-itlp");
        MimeType.put(".itms", "application/x-itunes-itms");
        MimeType.put(".itpc", "application/x-itunes-itpc");
        MimeType.put(".IVF", "video/x-ivf");
        MimeType.put(".jar", "application/java-archive");
        MimeType.put(".java", "application/octet-stream");
        MimeType.put(".jck", "application/liquidmotion");
        MimeType.put(".jcz", "application/liquidmotion");
        MimeType.put(".jfif", "image/pjpeg");
        MimeType.put(".jnlp", "application/x-java-jnlp-file");
        MimeType.put(".jpb", "application/octet-stream");
        MimeType.put(".jpe", "image/jpeg");
        MimeType.put(".jpeg", "image/jpeg");
        MimeType.put(".jpg", "image/jpeg");
        MimeType.put(".js", "application/x-javascript");
        MimeType.put(".jsx", "text/jscript");
        MimeType.put(".jsxbin", "text/plain");
        MimeType.put(".latex", "application/x-latex");
        MimeType.put(".library-ms", "application/windows-library+xml");
        MimeType.put(".lit", "application/x-ms-reader");
        MimeType.put(".loadtest", "application/xml");
        MimeType.put(".lpk", "application/octet-stream");
        MimeType.put(".lsf", "video/x-la-asf");
        MimeType.put(".lst", "text/plain");
        MimeType.put(".lsx", "video/x-la-asf");
        MimeType.put(".lzh", "application/octet-stream");
        MimeType.put(".m13", "application/x-msmediaview");
        MimeType.put(".m14", "application/x-msmediaview");
        MimeType.put(".m1v", "video/mpeg");
        MimeType.put(".m2t", "video/vnd.dlna.mpeg-tts");
        MimeType.put(".m2ts", "video/vnd.dlna.mpeg-tts");
        MimeType.put(".m2v", "video/mpeg");
        MimeType.put(".m3u", "audio/x-mpegurl");
        MimeType.put(".m3u8", "audio/x-mpegurl");
        MimeType.put(".m4a", "audio/m4a");
        MimeType.put(".m4b", "audio/m4b");
        MimeType.put(".m4p", "audio/m4p");
        MimeType.put(".m4r", "audio/x-m4r");
        MimeType.put(".m4v", "video/x-m4v");
        MimeType.put(".mac", "image/x-macpaint");
        MimeType.put(".mak", "text/plain");
        MimeType.put(".man", "application/x-troff-man");
        MimeType.put(".manifest", "application/x-ms-manifest");
        MimeType.put(".map", "text/plain");
        MimeType.put(".master", "application/xml");
        MimeType.put(".mda", "application/msaccess");
        MimeType.put(".mdb", "application/x-msaccess");
        MimeType.put(".mde", "application/msaccess");
        MimeType.put(".mdp", "application/octet-stream");
        MimeType.put(".me", "application/x-troff-me");
        MimeType.put(".mfp", "application/x-shockwave-flash");
        MimeType.put(".mht", "message/rfc822");
        MimeType.put(".mhtml", "message/rfc822");
        MimeType.put(".mid", "audio/mid");
        MimeType.put(".midi", "audio/mid");
        MimeType.put(".mix", "application/octet-stream");
        MimeType.put(".mk", "text/plain");
        MimeType.put(".mmf", "application/x-smaf");
        MimeType.put(".mno", "text/xml");
        MimeType.put(".mny", "application/x-msmoney");
        MimeType.put(".mod", "video/mpeg");
        MimeType.put(".mov", "video/quicktime");
        MimeType.put(".movie", "video/x-sgi-movie");
        MimeType.put(".mp2", "video/mpeg");
        MimeType.put(".mp2v", "video/mpeg");
        MimeType.put(".mp3", "audio/mpeg");
        MimeType.put(".mp4", "video/mp4");
        MimeType.put(".mp4v", "video/mp4");
        MimeType.put(".mpa", "video/mpeg");
        MimeType.put(".mpe", "video/mpeg");
        MimeType.put(".mpeg", "video/mpeg");
        MimeType.put(".mpf", "application/vnd.ms-mediapackage");
        MimeType.put(".mpg", "video/mpeg");
        MimeType.put(".mpp", "application/vnd.ms-project");
        MimeType.put(".mpv2", "video/mpeg");
        MimeType.put(".mqv", "video/quicktime");
        MimeType.put(".ms", "application/x-troff-ms");
        MimeType.put(".msi", "application/octet-stream");
        MimeType.put(".mso", "application/octet-stream");
        MimeType.put(".mts", "video/vnd.dlna.mpeg-tts");
        MimeType.put(".mtx", "application/xml");
        MimeType.put(".mvb", "application/x-msmediaview");
        MimeType.put(".mvc", "application/x-miva-compiled");
        MimeType.put(".mxp", "application/x-mmxp");
        MimeType.put(".nc", "application/x-netcdf");
        MimeType.put(".nsc", "video/x-ms-asf");
        MimeType.put(".nws", "message/rfc822");
        MimeType.put(".ocx", "application/octet-stream");
        MimeType.put(".oda", "application/oda");
        MimeType.put(".odc", "text/x-ms-odc");
        MimeType.put(".odh", "text/plain");
        MimeType.put(".odl", "text/plain");
        MimeType.put(".odp", "application/vnd.oasis.opendocument.presentation");
        MimeType.put(".ods", "application/oleobject");
        MimeType.put(".odt", "application/vnd.oasis.opendocument.text");
        MimeType.put(".one", "application/onenote");
        MimeType.put(".onea", "application/onenote");
        MimeType.put(".onepkg", "application/onenote");
        MimeType.put(".onetmp", "application/onenote");
        MimeType.put(".onetoc", "application/onenote");
        MimeType.put(".onetoc2", "application/onenote");
        MimeType.put(".orderedtest", "application/xml");
        MimeType.put(".osdx", "application/opensearchdescription+xml");
        MimeType.put(".p10", "application/pkcs10");
        MimeType.put(".p12", "application/x-pkcs12");
        MimeType.put(".p7b", "application/x-pkcs7-certificates");
        MimeType.put(".p7c", "application/pkcs7-mime");
        MimeType.put(".p7m", "application/pkcs7-mime");
        MimeType.put(".p7r", "application/x-pkcs7-certreqresp");
        MimeType.put(".p7s", "application/pkcs7-signature");
        MimeType.put(".pbm", "image/x-portable-bitmap");
        MimeType.put(".pcast", "application/x-podcast");
        MimeType.put(".pct", "image/pict");
        MimeType.put(".pcx", "application/octet-stream");
        MimeType.put(".pcz", "application/octet-stream");
        MimeType.put(".pdf", "application/pdf");
        MimeType.put(".pfb", "application/octet-stream");
        MimeType.put(".pfm", "application/octet-stream");
        MimeType.put(".pfx", "application/x-pkcs12");
        MimeType.put(".pgm", "image/x-portable-graymap");
        MimeType.put(".pic", "image/pict");
        MimeType.put(".pict", "image/pict");
        MimeType.put(".pkgdef", "text/plain");
        MimeType.put(".pkgundef", "text/plain");
        MimeType.put(".pko", "application/vnd.ms-pki.pko");
        MimeType.put(".pls", "audio/scpls");
        MimeType.put(".pma", "application/x-perfmon");
        MimeType.put(".pmc", "application/x-perfmon");
        MimeType.put(".pml", "application/x-perfmon");
        MimeType.put(".pmr", "application/x-perfmon");
        MimeType.put(".pmw", "application/x-perfmon");
        MimeType.put(".png", "image/png");
        MimeType.put(".pnm", "image/x-portable-anymap");
        MimeType.put(".pnt", "image/x-macpaint");
        MimeType.put(".pntg", "image/x-macpaint");
        MimeType.put(".pnz", "image/png");
        MimeType.put(".pot", "application/vnd.ms-powerpoint");
        MimeType.put(".potm", "application/vnd.ms-powerpoint.template.macroEnabled.12");
        MimeType.put(".potx", "application/vnd.openxmlformats-officedocument.presentationml.template");
        MimeType.put(".ppa", "application/vnd.ms-powerpoint");
        MimeType.put(".ppam", "application/vnd.ms-powerpoint.addin.macroEnabled.12");
        MimeType.put(".ppm", "image/x-portable-pixmap");
        MimeType.put(".pps", "application/vnd.ms-powerpoint");
        MimeType.put(".ppsm", "application/vnd.ms-powerpoint.slideshow.macroEnabled.12");
        MimeType.put(".ppsx", "application/vnd.openxmlformats-officedocument.presentationml.slideshow");
        MimeType.put(".ppt", "application/vnd.ms-powerpoint");
        MimeType.put(".pptm", "application/vnd.ms-powerpoint.presentation.macroEnabled.12");
        MimeType.put(".pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation");
        MimeType.put(".prf", "application/pics-rules");
        MimeType.put(".prm", "application/octet-stream");
        MimeType.put(".prx", "application/octet-stream");
        MimeType.put(".ps", "application/postscript");
        MimeType.put(".psc1", "application/PowerShell");
        MimeType.put(".psd", "application/octet-stream");
        MimeType.put(".psess", "application/xml");
        MimeType.put(".psm", "application/octet-stream");
        MimeType.put(".psp", "application/octet-stream");
        MimeType.put(".pub", "application/x-mspublisher");
        MimeType.put(".pwz", "application/vnd.ms-powerpoint");
        MimeType.put(".qht", "text/x-html-insertion");
        MimeType.put(".qhtm", "text/x-html-insertion");
        MimeType.put(".qt", "video/quicktime");
        MimeType.put(".qti", "image/x-quicktime");
        MimeType.put(".qtif", "image/x-quicktime");
        MimeType.put(".qtl", "application/x-quicktimeplayer");
        MimeType.put(".qxd", "application/octet-stream");
        MimeType.put(".ra", "audio/x-pn-realaudio");
        MimeType.put(".ram", "audio/x-pn-realaudio");
        MimeType.put(".rar", "application/octet-stream");
        MimeType.put(".ras", "image/x-cmu-raster");
        MimeType.put(".rat", "application/rat-file");
        MimeType.put(".rc", "text/plain");
        MimeType.put(".rc2", "text/plain");
        MimeType.put(".rct", "text/plain");
        MimeType.put(".rdlc", "application/xml");
        MimeType.put(".resx", "application/xml");
        MimeType.put(".rf", "image/vnd.rn-realflash");
        MimeType.put(".rgb", "image/x-rgb");
        MimeType.put(".rgs", "text/plain");
        MimeType.put(".rm", "application/vnd.rn-realmedia");
        MimeType.put(".rmi", "audio/mid");
        MimeType.put(".rmp", "application/vnd.rn-rn_music_package");
        MimeType.put(".roff", "application/x-troff");
        MimeType.put(".rpm", "audio/x-pn-realaudio-plugin");
        MimeType.put(".rqy", "text/x-ms-rqy");
        MimeType.put(".rtf", "application/rtf");
        MimeType.put(".rtx", "text/richtext");
        MimeType.put(".ruleset", "application/xml");
        MimeType.put(".s", "text/plain");
        MimeType.put(".safariextz", "application/x-safari-safariextz");
        MimeType.put(".scd", "application/x-msschedule");
        MimeType.put(".sct", "text/scriptlet");
        MimeType.put(".sd2", "audio/x-sd2");
        MimeType.put(".sdp", "application/sdp");
        MimeType.put(".sea", "application/octet-stream");
        MimeType.put(".searchConnector-ms", "application/windows-search-connector+xml");
        MimeType.put(".setpay", "application/set-payment-initiation");
        MimeType.put(".setreg", "application/set-registration-initiation");
        MimeType.put(".settings", "application/xml");
        MimeType.put(".sgimb", "application/x-sgimb");
        MimeType.put(".sgml", "text/sgml");
        MimeType.put(".sh", "application/x-sh");
        MimeType.put(".shar", "application/x-shar");
        MimeType.put(".shtml", "text/html");
        MimeType.put(".sit", "application/x-stuffit");
        MimeType.put(".sitemap", "application/xml");
        MimeType.put(".skin", "application/xml");
        MimeType.put(".sldm", "application/vnd.ms-powerpoint.slide.macroEnabled.12");
        MimeType.put(".sldx", "application/vnd.openxmlformats-officedocument.presentationml.slide");
        MimeType.put(".slk", "application/vnd.ms-excel");
        MimeType.put(".sln", "text/plain");
        MimeType.put(".slupkg-ms", "application/x-ms-license");
        MimeType.put(".smd", "audio/x-smd");
        MimeType.put(".smi", "application/octet-stream");
        MimeType.put(".smx", "audio/x-smd");
        MimeType.put(".smz", "audio/x-smd");
        MimeType.put(".snd", "audio/basic");
        MimeType.put(".snippet", "application/xml");
        MimeType.put(".snp", "application/octet-stream");
        MimeType.put(".sol", "text/plain");
        MimeType.put(".sor", "text/plain");
        MimeType.put(".spc", "application/x-pkcs7-certificates");
        MimeType.put(".spl", "application/futuresplash");
        MimeType.put(".src", "application/x-wais-source");
        MimeType.put(".srf", "text/plain");
        MimeType.put(".SSISDeploymentManifest", "text/xml");
        MimeType.put(".ssm", "application/streamingmedia");
        MimeType.put(".sst", "application/vnd.ms-pki.certstore");
        MimeType.put(".stl", "application/vnd.ms-pki.stl");
        MimeType.put(".sv4cpio", "application/x-sv4cpio");
        MimeType.put(".sv4crc", "application/x-sv4crc");
        MimeType.put(".svc", "application/xml");
        MimeType.put(".swf", "application/x-shockwave-flash");
        MimeType.put(".t", "application/x-troff");
        MimeType.put(".tar", "application/x-tar");
        MimeType.put(".tcl", "application/x-tcl");
        MimeType.put(".testrunconfig", "application/xml");
        MimeType.put(".testsettings", "application/xml");
        MimeType.put(".tex", "application/x-tex");
        MimeType.put(".texi", "application/x-texinfo");
        MimeType.put(".texinfo", "application/x-texinfo");
        MimeType.put(".tgz", "application/x-compressed");
        MimeType.put(".thmx", "application/vnd.ms-officetheme");
        MimeType.put(".thn", "application/octet-stream");
        MimeType.put(".tif", "image/tiff");
        MimeType.put(".tiff", "image/tiff");
        MimeType.put(".tlh", "text/plain");
        MimeType.put(".tli", "text/plain");
        MimeType.put(".toc", "application/octet-stream");
        MimeType.put(".tr", "application/x-troff");
        MimeType.put(".trm", "application/x-msterminal");
        MimeType.put(".trx", "application/xml");
        MimeType.put(".ts", "video/vnd.dlna.mpeg-tts");
        MimeType.put(".tsv", "text/tab-separated-values");
        MimeType.put(".ttf", "application/octet-stream");
        MimeType.put(".tts", "video/vnd.dlna.mpeg-tts");
        MimeType.put(".txt", "text/plain");
        MimeType.put(".u32", "application/octet-stream");
        MimeType.put(".uls", "text/iuls");
        MimeType.put(".user", "text/plain");
        MimeType.put(".ustar", "application/x-ustar");
        MimeType.put(".vb", "text/plain");
        MimeType.put(".vbdproj", "text/plain");
        MimeType.put(".vbk", "video/mpeg");
        MimeType.put(".vbproj", "text/plain");
        MimeType.put(".vbs", "text/vbscript");
        MimeType.put(".vcf", "text/x-vcard");
        MimeType.put(".vcproj", "Application/xml");
        MimeType.put(".vcs", "text/plain");
        MimeType.put(".vcxproj", "Application/xml");
        MimeType.put(".vddproj", "text/plain");
        MimeType.put(".vdp", "text/plain");
        MimeType.put(".vdproj", "text/plain");
        MimeType.put(".vdx", "application/vnd.ms-visio.viewer");
        MimeType.put(".vml", "text/xml");
        MimeType.put(".vscontent", "application/xml");
        MimeType.put(".vsct", "text/xml");
        MimeType.put(".vsd", "application/vnd.visio");
        MimeType.put(".vsi", "application/ms-vsi");
        MimeType.put(".vsix", "application/vsix");
        MimeType.put(".vsixlangpack", "text/xml");
        MimeType.put(".vsixmanifest", "text/xml");
        MimeType.put(".vsmdi", "application/xml");
        MimeType.put(".vspscc", "text/plain");
        MimeType.put(".vss", "application/vnd.visio");
        MimeType.put(".vsscc", "text/plain");
        MimeType.put(".vssettings", "text/xml");
        MimeType.put(".vssscc", "text/plain");
        MimeType.put(".vst", "application/vnd.visio");
        MimeType.put(".vstemplate", "text/xml");
        MimeType.put(".vsto", "application/x-ms-vsto");
        MimeType.put(".vsw", "application/vnd.visio");
        MimeType.put(".vsx", "application/vnd.visio");
        MimeType.put(".vtx", "application/vnd.visio");
        MimeType.put(".wav", "audio/wav");
        MimeType.put(".wave", "audio/wav");
        MimeType.put(".wax", "audio/x-ms-wax");
        MimeType.put(".wbk", "application/msword");
        MimeType.put(".wbmp", "image/vnd.wap.wbmp");
        MimeType.put(".wcm", "application/vnd.ms-works");
        MimeType.put(".wdb", "application/vnd.ms-works");
        MimeType.put(".wdp", "image/vnd.ms-photo");
        MimeType.put(".webarchive", "application/x-safari-webarchive");
        MimeType.put(".webtest", "application/xml");
        MimeType.put(".wiq", "application/xml");
        MimeType.put(".wiz", "application/msword");
        MimeType.put(".wks", "application/vnd.ms-works");
        MimeType.put(".WLMP", "application/wlmoviemaker");
        MimeType.put(".wlpginstall", "application/x-wlpg-detect");
        MimeType.put(".wlpginstall3", "application/x-wlpg3-detect");
        MimeType.put(".wm", "video/x-ms-wm");
        MimeType.put(".wma", "audio/x-ms-wma");
        MimeType.put(".wmd", "application/x-ms-wmd");
        MimeType.put(".wmf", "application/x-msmetafile");
        MimeType.put(".wml", "text/vnd.wap.wml");
        MimeType.put(".wmlc", "application/vnd.wap.wmlc");
        MimeType.put(".wmls", "text/vnd.wap.wmlscript");
        MimeType.put(".wmlsc", "application/vnd.wap.wmlscriptc");
        MimeType.put(".wmp", "video/x-ms-wmp");
        MimeType.put(".wmv", "video/x-ms-wmv");
        MimeType.put(".wmx", "video/x-ms-wmx");
        MimeType.put(".wmz", "application/x-ms-wmz");
        MimeType.put(".wpl", "application/vnd.ms-wpl");
        MimeType.put(".wps", "application/vnd.ms-works");
        MimeType.put(".wri", "application/x-mswrite");
        MimeType.put(".wrl", "x-world/x-vrml");
        MimeType.put(".wrz", "x-world/x-vrml");
        MimeType.put(".wsc", "text/scriptlet");
        MimeType.put(".wsdl", "text/xml");
        MimeType.put(".wvx", "video/x-ms-wvx");
        MimeType.put(".x", "application/directx");
        MimeType.put(".xaf", "x-world/x-vrml");
        MimeType.put(".xaml", "application/xaml+xml");
        MimeType.put(".xap", "application/x-silverlight-app");
        MimeType.put(".xbap", "application/x-ms-xbap");
        MimeType.put(".xbm", "image/x-xbitmap");
        MimeType.put(".xdr", "text/plain");
        MimeType.put(".xht", "application/xhtml+xml");
        MimeType.put(".xhtml", "application/xhtml+xml");
        MimeType.put(".xla", "application/vnd.ms-excel");
        MimeType.put(".xlam", "application/vnd.ms-excel.addin.macroEnabled.12");
        MimeType.put(".xlc", "application/vnd.ms-excel");
        MimeType.put(".xld", "application/vnd.ms-excel");
        MimeType.put(".xlk", "application/vnd.ms-excel");
        MimeType.put(".xll", "application/vnd.ms-excel");
        MimeType.put(".xlm", "application/vnd.ms-excel");
        MimeType.put(".xls", "application/vnd.ms-excel");
        MimeType.put(".xlsb", "application/vnd.ms-excel.sheet.binary.macroEnabled.12");
        MimeType.put(".xlsm", "application/vnd.ms-excel.sheet.macroEnabled.12");
        MimeType.put(".xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        MimeType.put(".xlt", "application/vnd.ms-excel");
        MimeType.put(".xltm", "application/vnd.ms-excel.template.macroEnabled.12");
        MimeType.put(".xltx", "application/vnd.openxmlformats-officedocument.spreadsheetml.template");
        MimeType.put(".xlw", "application/vnd.ms-excel");
        MimeType.put(".xml", "text/xml");
        MimeType.put(".xmta", "application/xml");
        MimeType.put(".xof", "x-world/x-vrml");
        MimeType.put(".XOML", "text/plain");
        MimeType.put(".xpm", "image/x-xpixmap");
        MimeType.put(".xps", "application/vnd.ms-xpsdocument");
        MimeType.put(".xrm-ms", "text/xml");
        MimeType.put(".xsc", "application/xml");
        MimeType.put(".xsd", "text/xml");
        MimeType.put(".xsf", "text/xml");
        MimeType.put(".xsl", "text/xml");
        MimeType.put(".xslt", "text/xml");
        MimeType.put(".xsn", "application/octet-stream");
        MimeType.put(".xss", "application/xml");
        MimeType.put(".xtp", "application/octet-stream");
        MimeType.put(".xwd", "image/x-xwindowdump");
        MimeType.put(".z", "application/x-compress");
        MimeType.put(".zip", "application/x-zip-compressed");
    }
}
