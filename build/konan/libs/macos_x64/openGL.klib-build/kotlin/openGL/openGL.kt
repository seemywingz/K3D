@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package openGL

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import cnames.structs.GLUnurbs
import cnames.structs.GLUquadric
import cnames.structs.GLUtesselator
import cnames.structs._CGLContextObject
import cnames.structs._CGLPBufferObject
import cnames.structs._CGLPixelFormatObject
import cnames.structs.__GLsync
import platform.OpenGLCommon.CGLContextEnable
import platform.OpenGLCommon.CGLContextObj
import platform.OpenGLCommon.CGLContextObjVar
import platform.OpenGLCommon.CGLContextParameter
import platform.OpenGLCommon.CGLError
import platform.OpenGLCommon.CGLGlobalOption
import platform.OpenGLCommon.CGLPBufferObj
import platform.OpenGLCommon.CGLPBufferObjVar
import platform.OpenGLCommon.CGLPixelFormatAttribute
import platform.OpenGLCommon.CGLPixelFormatAttributeVar
import platform.OpenGLCommon.CGLPixelFormatObj
import platform.OpenGLCommon.CGLPixelFormatObjVar
import platform.OpenGLCommon.CGLRendererInfoObj
import platform.OpenGLCommon.CGLRendererInfoObjVar
import platform.OpenGLCommon.CGLRendererProperty
import platform.OpenGLCommon.GLbitfield
import platform.OpenGLCommon.GLboolean
import platform.OpenGLCommon.GLbooleanVar
import platform.OpenGLCommon.GLbyteVar
import platform.OpenGLCommon.GLcharVar
import platform.OpenGLCommon.GLclampd
import platform.OpenGLCommon.GLclampdVar
import platform.OpenGLCommon.GLclampf
import platform.OpenGLCommon.GLdouble
import platform.OpenGLCommon.GLdoubleVar
import platform.OpenGLCommon.GLenum
import platform.OpenGLCommon.GLenumVar
import platform.OpenGLCommon.GLfloat
import platform.OpenGLCommon.GLfloatVar
import platform.OpenGLCommon.GLint
import platform.OpenGLCommon.GLint64Var
import platform.OpenGLCommon.GLintVar
import platform.OpenGLCommon.GLintptr
import platform.OpenGLCommon.GLshort
import platform.OpenGLCommon.GLshortVar
import platform.OpenGLCommon.GLsizei
import platform.OpenGLCommon.GLsizeiVar
import platform.OpenGLCommon.GLsizeiptr
import platform.OpenGLCommon.GLsync
import platform.OpenGLCommon.GLubyte
import platform.OpenGLCommon.GLubyteVar
import platform.OpenGLCommon.GLuint
import platform.OpenGLCommon.GLuint64
import platform.OpenGLCommon.GLuint64Var
import platform.OpenGLCommon.GLuintVar
import platform.OpenGLCommon.GLushortVar

// NOTE THIS FILE IS AUTO-GENERATED

fun CGLChoosePixelFormat(attribs: CValuesRef<CGLPixelFormatAttributeVar>?, pix: CValuesRef<CGLPixelFormatObjVar>?, npix: CValuesRef<GLintVar>?): CGLError {
    memScoped {
        return kniBridge0(attribs?.getPointer(memScope).rawValue, pix?.getPointer(memScope).rawValue, npix?.getPointer(memScope).rawValue)
    }
}

fun CGLDestroyPixelFormat(pix: CGLPixelFormatObj?): CGLError {
    return kniBridge1(pix.rawValue)
}

fun CGLDescribePixelFormat(pix: CGLPixelFormatObj?, pix_num: GLint, attrib: CGLPixelFormatAttribute, value: CValuesRef<GLintVar>?): CGLError {
    memScoped {
        return kniBridge2(pix.rawValue, pix_num, attrib, value?.getPointer(memScope).rawValue)
    }
}

fun CGLReleasePixelFormat(pix: CGLPixelFormatObj?): Unit {
    return kniBridge3(pix.rawValue)
}

fun CGLRetainPixelFormat(pix: CGLPixelFormatObj?): CGLPixelFormatObj? {
    return interpretCPointer<_CGLPixelFormatObject>(kniBridge4(pix.rawValue))
}

fun CGLGetPixelFormatRetainCount(pix: CGLPixelFormatObj?): GLuint {
    return kniBridge5(pix.rawValue)
}

fun CGLQueryRendererInfo(display_mask: GLuint, rend: CValuesRef<CGLRendererInfoObjVar>?, nrend: CValuesRef<GLintVar>?): CGLError {
    memScoped {
        return kniBridge6(display_mask, rend?.getPointer(memScope).rawValue, nrend?.getPointer(memScope).rawValue)
    }
}

fun CGLDestroyRendererInfo(rend: CGLRendererInfoObj?): CGLError {
    return kniBridge7(rend.rawValue)
}

fun CGLDescribeRenderer(rend: CGLRendererInfoObj?, rend_num: GLint, prop: CGLRendererProperty, value: CValuesRef<GLintVar>?): CGLError {
    memScoped {
        return kniBridge8(rend.rawValue, rend_num, prop, value?.getPointer(memScope).rawValue)
    }
}

fun CGLCreateContext(pix: CGLPixelFormatObj?, share: CGLContextObj?, ctx: CValuesRef<CGLContextObjVar>?): CGLError {
    memScoped {
        return kniBridge9(pix.rawValue, share.rawValue, ctx?.getPointer(memScope).rawValue)
    }
}

fun CGLDestroyContext(ctx: CGLContextObj?): CGLError {
    return kniBridge10(ctx.rawValue)
}

fun CGLCopyContext(src: CGLContextObj?, dst: CGLContextObj?, mask: GLbitfield): CGLError {
    return kniBridge11(src.rawValue, dst.rawValue, mask)
}

fun CGLRetainContext(ctx: CGLContextObj?): CGLContextObj? {
    return interpretCPointer<_CGLContextObject>(kniBridge12(ctx.rawValue))
}

fun CGLReleaseContext(ctx: CGLContextObj?): Unit {
    return kniBridge13(ctx.rawValue)
}

fun CGLGetContextRetainCount(ctx: CGLContextObj?): GLuint {
    return kniBridge14(ctx.rawValue)
}

fun CGLGetPixelFormat(ctx: CGLContextObj?): CGLPixelFormatObj? {
    return interpretCPointer<_CGLPixelFormatObject>(kniBridge15(ctx.rawValue))
}

fun CGLCreatePBuffer(width: GLsizei, height: GLsizei, target: GLenum, internalFormat: GLenum, max_level: GLint, pbuffer: CValuesRef<CGLPBufferObjVar>?): CGLError {
    memScoped {
        return kniBridge16(width, height, target, internalFormat, max_level, pbuffer?.getPointer(memScope).rawValue)
    }
}

fun CGLDestroyPBuffer(pbuffer: CGLPBufferObj?): CGLError {
    return kniBridge17(pbuffer.rawValue)
}

fun CGLDescribePBuffer(obj: CGLPBufferObj?, width: CValuesRef<GLsizeiVar>?, height: CValuesRef<GLsizeiVar>?, target: CValuesRef<GLenumVar>?, internalFormat: CValuesRef<GLenumVar>?, mipmap: CValuesRef<GLintVar>?): CGLError {
    memScoped {
        return kniBridge18(obj.rawValue, width?.getPointer(memScope).rawValue, height?.getPointer(memScope).rawValue, target?.getPointer(memScope).rawValue, internalFormat?.getPointer(memScope).rawValue, mipmap?.getPointer(memScope).rawValue)
    }
}

fun CGLTexImagePBuffer(ctx: CGLContextObj?, pbuffer: CGLPBufferObj?, source: GLenum): CGLError {
    return kniBridge19(ctx.rawValue, pbuffer.rawValue, source)
}

fun CGLRetainPBuffer(pbuffer: CGLPBufferObj?): CGLPBufferObj? {
    return interpretCPointer<_CGLPBufferObject>(kniBridge20(pbuffer.rawValue))
}

fun CGLReleasePBuffer(pbuffer: CGLPBufferObj?): Unit {
    return kniBridge21(pbuffer.rawValue)
}

fun CGLGetPBufferRetainCount(pbuffer: CGLPBufferObj?): GLuint {
    return kniBridge22(pbuffer.rawValue)
}

fun CGLSetOffScreen(ctx: CGLContextObj?, width: GLsizei, height: GLsizei, rowbytes: GLint, baseaddr: CValuesRef<*>?): CGLError {
    memScoped {
        return kniBridge23(ctx.rawValue, width, height, rowbytes, baseaddr?.getPointer(memScope).rawValue)
    }
}

fun CGLGetOffScreen(ctx: CGLContextObj?, width: CValuesRef<GLsizeiVar>?, height: CValuesRef<GLsizeiVar>?, rowbytes: CValuesRef<GLintVar>?, baseaddr: CValuesRef<COpaquePointerVar>?): CGLError {
    memScoped {
        return kniBridge24(ctx.rawValue, width?.getPointer(memScope).rawValue, height?.getPointer(memScope).rawValue, rowbytes?.getPointer(memScope).rawValue, baseaddr?.getPointer(memScope).rawValue)
    }
}

fun CGLSetFullScreen(ctx: CGLContextObj?): CGLError {
    return kniBridge25(ctx.rawValue)
}

fun CGLSetFullScreenOnDisplay(ctx: CGLContextObj?, display_mask: GLuint): CGLError {
    return kniBridge26(ctx.rawValue, display_mask)
}

fun CGLSetPBuffer(ctx: CGLContextObj?, pbuffer: CGLPBufferObj?, face: GLenum, level: GLint, screen: GLint): CGLError {
    return kniBridge27(ctx.rawValue, pbuffer.rawValue, face, level, screen)
}

fun CGLGetPBuffer(ctx: CGLContextObj?, pbuffer: CValuesRef<CGLPBufferObjVar>?, face: CValuesRef<GLenumVar>?, level: CValuesRef<GLintVar>?, screen: CValuesRef<GLintVar>?): CGLError {
    memScoped {
        return kniBridge28(ctx.rawValue, pbuffer?.getPointer(memScope).rawValue, face?.getPointer(memScope).rawValue, level?.getPointer(memScope).rawValue, screen?.getPointer(memScope).rawValue)
    }
}

fun CGLClearDrawable(ctx: CGLContextObj?): CGLError {
    return kniBridge29(ctx.rawValue)
}

fun CGLFlushDrawable(ctx: CGLContextObj?): CGLError {
    return kniBridge30(ctx.rawValue)
}

fun CGLEnable(ctx: CGLContextObj?, pname: CGLContextEnable): CGLError {
    return kniBridge31(ctx.rawValue, pname)
}

fun CGLDisable(ctx: CGLContextObj?, pname: CGLContextEnable): CGLError {
    return kniBridge32(ctx.rawValue, pname)
}

fun CGLIsEnabled(ctx: CGLContextObj?, pname: CGLContextEnable, enable: CValuesRef<GLintVar>?): CGLError {
    memScoped {
        return kniBridge33(ctx.rawValue, pname, enable?.getPointer(memScope).rawValue)
    }
}

fun CGLSetParameter(ctx: CGLContextObj?, pname: CGLContextParameter, params: CValuesRef<GLintVar>?): CGLError {
    memScoped {
        return kniBridge34(ctx.rawValue, pname, params?.getPointer(memScope).rawValue)
    }
}

fun CGLGetParameter(ctx: CGLContextObj?, pname: CGLContextParameter, params: CValuesRef<GLintVar>?): CGLError {
    memScoped {
        return kniBridge35(ctx.rawValue, pname, params?.getPointer(memScope).rawValue)
    }
}

fun CGLSetVirtualScreen(ctx: CGLContextObj?, screen: GLint): CGLError {
    return kniBridge36(ctx.rawValue, screen)
}

fun CGLGetVirtualScreen(ctx: CGLContextObj?, screen: CValuesRef<GLintVar>?): CGLError {
    memScoped {
        return kniBridge37(ctx.rawValue, screen?.getPointer(memScope).rawValue)
    }
}

fun CGLUpdateContext(ctx: CGLContextObj?): CGLError {
    return kniBridge38(ctx.rawValue)
}

fun CGLSetGlobalOption(pname: CGLGlobalOption, params: CValuesRef<GLintVar>?): CGLError {
    memScoped {
        return kniBridge39(pname, params?.getPointer(memScope).rawValue)
    }
}

fun CGLGetGlobalOption(pname: CGLGlobalOption, params: CValuesRef<GLintVar>?): CGLError {
    memScoped {
        return kniBridge40(pname, params?.getPointer(memScope).rawValue)
    }
}

fun CGLSetOption(pname: CGLGlobalOption, param: GLint): CGLError {
    return kniBridge41(pname, param)
}

fun CGLGetOption(pname: CGLGlobalOption, param: CValuesRef<GLintVar>?): CGLError {
    memScoped {
        return kniBridge42(pname, param?.getPointer(memScope).rawValue)
    }
}

fun CGLLockContext(ctx: CGLContextObj?): CGLError {
    return kniBridge43(ctx.rawValue)
}

fun CGLUnlockContext(ctx: CGLContextObj?): CGLError {
    return kniBridge44(ctx.rawValue)
}

fun CGLGetVersion(majorvers: CValuesRef<GLintVar>?, minorvers: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge45(majorvers?.getPointer(memScope).rawValue, minorvers?.getPointer(memScope).rawValue)
    }
}

fun CGLErrorString(error: CGLError): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge46(error))
}

fun glCullFace(mode: GLenum): Unit {
    return kniBridge47(mode)
}

fun glFrontFace(mode: GLenum): Unit {
    return kniBridge48(mode)
}

fun glHint(target: GLenum, mode: GLenum): Unit {
    return kniBridge49(target, mode)
}

fun glLineWidth(width: GLfloat): Unit {
    return kniBridge50(width)
}

fun glPointSize(size: GLfloat): Unit {
    return kniBridge51(size)
}

fun glPolygonMode(face: GLenum, mode: GLenum): Unit {
    return kniBridge52(face, mode)
}

fun glScissor(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit {
    return kniBridge53(x, y, width, height)
}

fun glTexParameterf(target: GLenum, pname: GLenum, param: GLfloat): Unit {
    return kniBridge54(target, pname, param)
}

fun glTexParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge55(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glTexParameteri(target: GLenum, pname: GLenum, param: GLint): Unit {
    return kniBridge56(target, pname, param)
}

fun glTexParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge57(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glTexImage1D(target: GLenum, level: GLint, internalformat: GLint, width: GLsizei, border: GLint, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge58(target, level, internalformat, width, border, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glTexImage2D(target: GLenum, level: GLint, internalformat: GLint, width: GLsizei, height: GLsizei, border: GLint, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge59(target, level, internalformat, width, height, border, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glDrawBuffer(mode: GLenum): Unit {
    return kniBridge60(mode)
}

fun glClear(mask: GLbitfield): Unit {
    return kniBridge61(mask)
}

fun glClearColor(red: GLfloat, green: GLfloat, blue: GLfloat, alpha: GLfloat): Unit {
    return kniBridge62(red, green, blue, alpha)
}

fun glClearStencil(s: GLint): Unit {
    return kniBridge63(s)
}

fun glClearDepth(depth: GLclampd): Unit {
    return kniBridge64(depth)
}

fun glStencilMask(mask: GLuint): Unit {
    return kniBridge65(mask)
}

fun glColorMask(red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean): Unit {
    return kniBridge66(red, green, blue, alpha)
}

fun glDepthMask(flag: GLboolean): Unit {
    return kniBridge67(flag)
}

fun glDisable(cap: GLenum): Unit {
    return kniBridge68(cap)
}

fun glEnable(cap: GLenum): Unit {
    return kniBridge69(cap)
}

fun glFinish(): Unit {
    return kniBridge70()
}

fun glFlush(): Unit {
    return kniBridge71()
}

fun glBlendFunc(sfactor: GLenum, dfactor: GLenum): Unit {
    return kniBridge72(sfactor, dfactor)
}

fun glLogicOp(opcode: GLenum): Unit {
    return kniBridge73(opcode)
}

fun glStencilFunc(func: GLenum, ref: GLint, mask: GLuint): Unit {
    return kniBridge74(func, ref, mask)
}

fun glStencilOp(fail: GLenum, zfail: GLenum, zpass: GLenum): Unit {
    return kniBridge75(fail, zfail, zpass)
}

fun glDepthFunc(func: GLenum): Unit {
    return kniBridge76(func)
}

fun glPixelStoref(pname: GLenum, param: GLfloat): Unit {
    return kniBridge77(pname, param)
}

fun glPixelStorei(pname: GLenum, param: GLint): Unit {
    return kniBridge78(pname, param)
}

fun glReadBuffer(mode: GLenum): Unit {
    return kniBridge79(mode)
}

fun glReadPixels(x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge80(x, y, width, height, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glGetBooleanv(pname: GLenum, params: CValuesRef<GLbooleanVar>?): Unit {
    memScoped {
        return kniBridge81(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetDoublev(pname: GLenum, params: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge82(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetError(): GLenum {
    return kniBridge83()
}

fun glGetFloatv(pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge84(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetIntegerv(pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge85(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetString(name: GLenum): CPointer<GLubyteVar>? {
    return interpretCPointer<GLubyteVar>(kniBridge86(name))
}

fun glGetTexImage(target: GLenum, level: GLint, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge87(target, level, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glGetTexParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge88(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetTexParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge89(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetTexLevelParameterfv(target: GLenum, level: GLint, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge90(target, level, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetTexLevelParameteriv(target: GLenum, level: GLint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge91(target, level, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glIsEnabled(cap: GLenum): GLboolean {
    return kniBridge92(cap)
}

fun glDepthRange(near: GLclampd, far: GLclampd): Unit {
    return kniBridge93(near, far)
}

fun glViewport(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit {
    return kniBridge94(x, y, width, height)
}

fun glDrawArrays(mode: GLenum, first: GLint, count: GLsizei): Unit {
    return kniBridge95(mode, first, count)
}

fun glDrawElements(mode: GLenum, count: GLsizei, type: GLenum, indices: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge96(mode, count, type, indices?.getPointer(memScope).rawValue)
    }
}

fun glPolygonOffset(factor: GLfloat, units: GLfloat): Unit {
    return kniBridge97(factor, units)
}

fun glCopyTexImage1D(target: GLenum, level: GLint, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei, border: GLint): Unit {
    return kniBridge98(target, level, internalformat, x, y, width, border)
}

fun glCopyTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei, height: GLsizei, border: GLint): Unit {
    return kniBridge99(target, level, internalformat, x, y, width, height, border)
}

fun glCopyTexSubImage1D(target: GLenum, level: GLint, xoffset: GLint, x: GLint, y: GLint, width: GLsizei): Unit {
    return kniBridge100(target, level, xoffset, x, y, width)
}

fun glCopyTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit {
    return kniBridge101(target, level, xoffset, yoffset, x, y, width, height)
}

fun glTexSubImage1D(target: GLenum, level: GLint, xoffset: GLint, width: GLsizei, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge102(target, level, xoffset, width, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge103(target, level, xoffset, yoffset, width, height, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glBindTexture(target: GLenum, texture: GLuint): Unit {
    return kniBridge104(target, texture)
}

fun glDeleteTextures(n: GLsizei, textures: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge105(n, textures?.getPointer(memScope).rawValue)
    }
}

fun glGenTextures(n: GLsizei, textures: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge106(n, textures?.getPointer(memScope).rawValue)
    }
}

fun glIsTexture(texture: GLuint): GLboolean {
    return kniBridge107(texture)
}

fun glBlendColor(red: GLfloat, green: GLfloat, blue: GLfloat, alpha: GLfloat): Unit {
    return kniBridge108(red, green, blue, alpha)
}

fun glBlendEquation(mode: GLenum): Unit {
    return kniBridge109(mode)
}

fun glDrawRangeElements(mode: GLenum, start: GLuint, end: GLuint, count: GLsizei, type: GLenum, indices: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge110(mode, start, end, count, type, indices?.getPointer(memScope).rawValue)
    }
}

fun glTexImage3D(target: GLenum, level: GLint, internalformat: GLint, width: GLsizei, height: GLsizei, depth: GLsizei, border: GLint, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge111(target, level, internalformat, width, height, depth, border, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glTexSubImage3D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, zoffset: GLint, width: GLsizei, height: GLsizei, depth: GLsizei, format: GLenum, type: GLenum, pixels: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge112(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels?.getPointer(memScope).rawValue)
    }
}

fun glCopyTexSubImage3D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, zoffset: GLint, x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit {
    return kniBridge113(target, level, xoffset, yoffset, zoffset, x, y, width, height)
}

fun glActiveTexture(texture: GLenum): Unit {
    return kniBridge114(texture)
}

fun glSampleCoverage(value: GLclampf, invert: GLboolean): Unit {
    return kniBridge115(value, invert)
}

fun glCompressedTexImage3D(target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei, height: GLsizei, depth: GLsizei, border: GLint, imageSize: GLsizei, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge116(target, level, internalformat, width, height, depth, border, imageSize, data?.getPointer(memScope).rawValue)
    }
}

fun glCompressedTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei, height: GLsizei, border: GLint, imageSize: GLsizei, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge117(target, level, internalformat, width, height, border, imageSize, data?.getPointer(memScope).rawValue)
    }
}

fun glCompressedTexImage1D(target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei, border: GLint, imageSize: GLsizei, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge118(target, level, internalformat, width, border, imageSize, data?.getPointer(memScope).rawValue)
    }
}

fun glCompressedTexSubImage3D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, zoffset: GLint, width: GLsizei, height: GLsizei, depth: GLsizei, format: GLenum, imageSize: GLsizei, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge119(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data?.getPointer(memScope).rawValue)
    }
}

fun glCompressedTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, width: GLsizei, height: GLsizei, format: GLenum, imageSize: GLsizei, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge120(target, level, xoffset, yoffset, width, height, format, imageSize, data?.getPointer(memScope).rawValue)
    }
}

fun glCompressedTexSubImage1D(target: GLenum, level: GLint, xoffset: GLint, width: GLsizei, format: GLenum, imageSize: GLsizei, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge121(target, level, xoffset, width, format, imageSize, data?.getPointer(memScope).rawValue)
    }
}

fun glGetCompressedTexImage(target: GLenum, level: GLint, img: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge122(target, level, img?.getPointer(memScope).rawValue)
    }
}

fun glBlendFuncSeparate(sfactorRGB: GLenum, dfactorRGB: GLenum, sfactorAlpha: GLenum, dfactorAlpha: GLenum): Unit {
    return kniBridge123(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha)
}

fun glMultiDrawArrays(mode: GLenum, first: CValuesRef<GLintVar>?, count: CValuesRef<GLsizeiVar>?, drawcount: GLsizei): Unit {
    memScoped {
        return kniBridge124(mode, first?.getPointer(memScope).rawValue, count?.getPointer(memScope).rawValue, drawcount)
    }
}

fun glMultiDrawElements(mode: GLenum, count: CValuesRef<GLsizeiVar>?, type: GLenum, indices: CValuesRef<COpaquePointerVar>?, drawcount: GLsizei): Unit {
    memScoped {
        return kniBridge125(mode, count?.getPointer(memScope).rawValue, type, indices?.getPointer(memScope).rawValue, drawcount)
    }
}

fun glPointParameterf(pname: GLenum, param: GLfloat): Unit {
    return kniBridge126(pname, param)
}

fun glPointParameterfv(pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge127(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glPointParameteri(pname: GLenum, param: GLint): Unit {
    return kniBridge128(pname, param)
}

fun glPointParameteriv(pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge129(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGenQueries(n: GLsizei, ids: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge130(n, ids?.getPointer(memScope).rawValue)
    }
}

fun glDeleteQueries(n: GLsizei, ids: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge131(n, ids?.getPointer(memScope).rawValue)
    }
}

fun glIsQuery(id: GLuint): GLboolean {
    return kniBridge132(id)
}

fun glBeginQuery(target: GLenum, id: GLuint): Unit {
    return kniBridge133(target, id)
}

fun glEndQuery(target: GLenum): Unit {
    return kniBridge134(target)
}

fun glGetQueryiv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge135(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetQueryObjectiv(id: GLuint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge136(id, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetQueryObjectuiv(id: GLuint, pname: GLenum, params: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge137(id, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glBindBuffer(target: GLenum, buffer: GLuint): Unit {
    return kniBridge138(target, buffer)
}

fun glDeleteBuffers(n: GLsizei, buffers: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge139(n, buffers?.getPointer(memScope).rawValue)
    }
}

fun glGenBuffers(n: GLsizei, buffers: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge140(n, buffers?.getPointer(memScope).rawValue)
    }
}

fun glIsBuffer(buffer: GLuint): GLboolean {
    return kniBridge141(buffer)
}

fun glBufferData(target: GLenum, size: GLsizeiptr, data: CValuesRef<*>?, usage: GLenum): Unit {
    memScoped {
        return kniBridge142(target, size, data?.getPointer(memScope).rawValue, usage)
    }
}

fun glBufferSubData(target: GLenum, offset: GLintptr, size: GLsizeiptr, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge143(target, offset, size, data?.getPointer(memScope).rawValue)
    }
}

fun glGetBufferSubData(target: GLenum, offset: GLintptr, size: GLsizeiptr, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge144(target, offset, size, data?.getPointer(memScope).rawValue)
    }
}

fun glMapBuffer(target: GLenum, access: GLenum): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge145(target, access))
}

fun glUnmapBuffer(target: GLenum): GLboolean {
    return kniBridge146(target)
}

fun glGetBufferParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge147(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetBufferPointerv(target: GLenum, pname: GLenum, params: CValuesRef<COpaquePointerVar>?): Unit {
    memScoped {
        return kniBridge148(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glBlendEquationSeparate(modeRGB: GLenum, modeAlpha: GLenum): Unit {
    return kniBridge149(modeRGB, modeAlpha)
}

fun glDrawBuffers(n: GLsizei, bufs: CValuesRef<GLenumVar>?): Unit {
    memScoped {
        return kniBridge150(n, bufs?.getPointer(memScope).rawValue)
    }
}

fun glStencilOpSeparate(face: GLenum, sfail: GLenum, dpfail: GLenum, dppass: GLenum): Unit {
    return kniBridge151(face, sfail, dpfail, dppass)
}

fun glStencilFuncSeparate(face: GLenum, func: GLenum, ref: GLint, mask: GLuint): Unit {
    return kniBridge152(face, func, ref, mask)
}

fun glStencilMaskSeparate(face: GLenum, mask: GLuint): Unit {
    return kniBridge153(face, mask)
}

fun glAttachShader(program: GLuint, shader: GLuint): Unit {
    return kniBridge154(program, shader)
}

fun glBindAttribLocation(program: GLuint, index: GLuint, name: String?): Unit {
    memScoped {
        return kniBridge155(program, index, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glCompileShader(shader: GLuint): Unit {
    return kniBridge156(shader)
}

fun glCreateProgram(): GLuint {
    return kniBridge157()
}

fun glCreateShader(type: GLenum): GLuint {
    return kniBridge158(type)
}

fun glDeleteProgram(program: GLuint): Unit {
    return kniBridge159(program)
}

fun glDeleteShader(shader: GLuint): Unit {
    return kniBridge160(shader)
}

fun glDetachShader(program: GLuint, shader: GLuint): Unit {
    return kniBridge161(program, shader)
}

fun glDisableVertexAttribArray(index: GLuint): Unit {
    return kniBridge162(index)
}

fun glEnableVertexAttribArray(index: GLuint): Unit {
    return kniBridge163(index)
}

fun glGetActiveAttrib(program: GLuint, index: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, size: CValuesRef<GLintVar>?, type: CValuesRef<GLenumVar>?, name: CValuesRef<GLcharVar>?): Unit {
    memScoped {
        return kniBridge164(program, index, bufSize, length?.getPointer(memScope).rawValue, size?.getPointer(memScope).rawValue, type?.getPointer(memScope).rawValue, name?.getPointer(memScope).rawValue)
    }
}

fun glGetActiveUniform(program: GLuint, index: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, size: CValuesRef<GLintVar>?, type: CValuesRef<GLenumVar>?, name: CValuesRef<GLcharVar>?): Unit {
    memScoped {
        return kniBridge165(program, index, bufSize, length?.getPointer(memScope).rawValue, size?.getPointer(memScope).rawValue, type?.getPointer(memScope).rawValue, name?.getPointer(memScope).rawValue)
    }
}

fun glGetAttachedShaders(program: GLuint, maxCount: GLsizei, count: CValuesRef<GLsizeiVar>?, shaders: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge166(program, maxCount, count?.getPointer(memScope).rawValue, shaders?.getPointer(memScope).rawValue)
    }
}

fun glGetAttribLocation(program: GLuint, name: String?): GLint {
    memScoped {
        return kniBridge167(program, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glGetProgramiv(program: GLuint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge168(program, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetProgramInfoLog(program: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, infoLog: CValuesRef<GLcharVar>?): Unit {
    memScoped {
        return kniBridge169(program, bufSize, length?.getPointer(memScope).rawValue, infoLog?.getPointer(memScope).rawValue)
    }
}

fun glGetShaderiv(shader: GLuint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge170(shader, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetShaderInfoLog(shader: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, infoLog: CValuesRef<GLcharVar>?): Unit {
    memScoped {
        return kniBridge171(shader, bufSize, length?.getPointer(memScope).rawValue, infoLog?.getPointer(memScope).rawValue)
    }
}

fun glGetShaderSource(shader: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, source: CValuesRef<GLcharVar>?): Unit {
    memScoped {
        return kniBridge172(shader, bufSize, length?.getPointer(memScope).rawValue, source?.getPointer(memScope).rawValue)
    }
}

fun glGetUniformLocation(program: GLuint, name: String?): GLint {
    memScoped {
        return kniBridge173(program, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glGetUniformfv(program: GLuint, location: GLint, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge174(program, location, params?.getPointer(memScope).rawValue)
    }
}

fun glGetUniformiv(program: GLuint, location: GLint, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge175(program, location, params?.getPointer(memScope).rawValue)
    }
}

fun glGetVertexAttribdv(index: GLuint, pname: GLenum, params: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge176(index, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetVertexAttribfv(index: GLuint, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge177(index, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetVertexAttribiv(index: GLuint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge178(index, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetVertexAttribPointerv(index: GLuint, pname: GLenum, pointer: CValuesRef<COpaquePointerVar>?): Unit {
    memScoped {
        return kniBridge179(index, pname, pointer?.getPointer(memScope).rawValue)
    }
}

fun glIsProgram(program: GLuint): GLboolean {
    return kniBridge180(program)
}

fun glIsShader(shader: GLuint): GLboolean {
    return kniBridge181(shader)
}

fun glLinkProgram(program: GLuint): Unit {
    return kniBridge182(program)
}

fun glShaderSource(shader: GLuint, count: GLsizei, string: CValuesRef<CPointerVar<GLcharVar>>?, length: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge183(shader, count, string?.getPointer(memScope).rawValue, length?.getPointer(memScope).rawValue)
    }
}

fun glUseProgram(program: GLuint): Unit {
    return kniBridge184(program)
}

fun glUniform1f(location: GLint, v0: GLfloat): Unit {
    return kniBridge185(location, v0)
}

fun glUniform2f(location: GLint, v0: GLfloat, v1: GLfloat): Unit {
    return kniBridge186(location, v0, v1)
}

fun glUniform3f(location: GLint, v0: GLfloat, v1: GLfloat, v2: GLfloat): Unit {
    return kniBridge187(location, v0, v1, v2)
}

fun glUniform4f(location: GLint, v0: GLfloat, v1: GLfloat, v2: GLfloat, v3: GLfloat): Unit {
    return kniBridge188(location, v0, v1, v2, v3)
}

fun glUniform1i(location: GLint, v0: GLint): Unit {
    return kniBridge189(location, v0)
}

fun glUniform2i(location: GLint, v0: GLint, v1: GLint): Unit {
    return kniBridge190(location, v0, v1)
}

fun glUniform3i(location: GLint, v0: GLint, v1: GLint, v2: GLint): Unit {
    return kniBridge191(location, v0, v1, v2)
}

fun glUniform4i(location: GLint, v0: GLint, v1: GLint, v2: GLint, v3: GLint): Unit {
    return kniBridge192(location, v0, v1, v2, v3)
}

fun glUniform1fv(location: GLint, count: GLsizei, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge193(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glUniform2fv(location: GLint, count: GLsizei, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge194(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glUniform3fv(location: GLint, count: GLsizei, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge195(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glUniform4fv(location: GLint, count: GLsizei, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge196(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glUniform1iv(location: GLint, count: GLsizei, value: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge197(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glUniform2iv(location: GLint, count: GLsizei, value: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge198(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glUniform3iv(location: GLint, count: GLsizei, value: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge199(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glUniform4iv(location: GLint, count: GLsizei, value: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge200(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix2fv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge201(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix3fv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge202(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix4fv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge203(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glValidateProgram(program: GLuint): Unit {
    return kniBridge204(program)
}

fun glVertexAttrib1d(index: GLuint, x: GLdouble): Unit {
    return kniBridge205(index, x)
}

fun glVertexAttrib1dv(index: GLuint, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge206(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib1f(index: GLuint, x: GLfloat): Unit {
    return kniBridge207(index, x)
}

fun glVertexAttrib1fv(index: GLuint, v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge208(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib1s(index: GLuint, x: GLshort): Unit {
    return kniBridge209(index, x)
}

fun glVertexAttrib1sv(index: GLuint, v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge210(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib2d(index: GLuint, x: GLdouble, y: GLdouble): Unit {
    return kniBridge211(index, x, y)
}

fun glVertexAttrib2dv(index: GLuint, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge212(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib2f(index: GLuint, x: GLfloat, y: GLfloat): Unit {
    return kniBridge213(index, x, y)
}

fun glVertexAttrib2fv(index: GLuint, v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge214(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib2s(index: GLuint, x: GLshort, y: GLshort): Unit {
    return kniBridge215(index, x, y)
}

fun glVertexAttrib2sv(index: GLuint, v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge216(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib3d(index: GLuint, x: GLdouble, y: GLdouble, z: GLdouble): Unit {
    return kniBridge217(index, x, y, z)
}

fun glVertexAttrib3dv(index: GLuint, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge218(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib3f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat): Unit {
    return kniBridge219(index, x, y, z)
}

fun glVertexAttrib3fv(index: GLuint, v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge220(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib3s(index: GLuint, x: GLshort, y: GLshort, z: GLshort): Unit {
    return kniBridge221(index, x, y, z)
}

fun glVertexAttrib3sv(index: GLuint, v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge222(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib4Nbv(index: GLuint, v: CValuesRef<GLbyteVar>?): Unit {
    memScoped {
        return kniBridge223(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib4Niv(index: GLuint, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge224(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib4Nsv(index: GLuint, v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge225(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib4Nub(index: GLuint, x: GLubyte, y: GLubyte, z: GLubyte, w: GLubyte): Unit {
    return kniBridge226(index, x, y, z, w)
}

fun glVertexAttrib4Nubv(index: GLuint, v: CValuesRef<GLubyteVar>?): Unit {
    memScoped {
        return kniBridge227(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib4Nuiv(index: GLuint, v: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge228(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib4Nusv(index: GLuint, v: CValuesRef<GLushortVar>?): Unit {
    memScoped {
        return kniBridge229(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib4bv(index: GLuint, v: CValuesRef<GLbyteVar>?): Unit {
    memScoped {
        return kniBridge230(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib4d(index: GLuint, x: GLdouble, y: GLdouble, z: GLdouble, w: GLdouble): Unit {
    return kniBridge231(index, x, y, z, w)
}

fun glVertexAttrib4dv(index: GLuint, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge232(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib4f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit {
    return kniBridge233(index, x, y, z, w)
}

fun glVertexAttrib4fv(index: GLuint, v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge234(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib4iv(index: GLuint, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge235(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib4s(index: GLuint, x: GLshort, y: GLshort, z: GLshort, w: GLshort): Unit {
    return kniBridge236(index, x, y, z, w)
}

fun glVertexAttrib4sv(index: GLuint, v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge237(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib4ubv(index: GLuint, v: CValuesRef<GLubyteVar>?): Unit {
    memScoped {
        return kniBridge238(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib4uiv(index: GLuint, v: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge239(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttrib4usv(index: GLuint, v: CValuesRef<GLushortVar>?): Unit {
    memScoped {
        return kniBridge240(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribPointer(index: GLuint, size: GLint, type: GLenum, normalized: GLboolean, stride: GLsizei, pointer: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge241(index, size, type, normalized, stride, pointer?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix2x3fv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge242(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix3x2fv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge243(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix2x4fv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge244(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix4x2fv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge245(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix3x4fv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge246(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix4x3fv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge247(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glColorMaski(index: GLuint, r: GLboolean, g: GLboolean, b: GLboolean, a: GLboolean): Unit {
    return kniBridge248(index, r, g, b, a)
}

fun glGetBooleani_v(target: GLenum, index: GLuint, data: CValuesRef<GLbooleanVar>?): Unit {
    memScoped {
        return kniBridge249(target, index, data?.getPointer(memScope).rawValue)
    }
}

fun glGetIntegeri_v(target: GLenum, index: GLuint, data: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge250(target, index, data?.getPointer(memScope).rawValue)
    }
}

fun glEnablei(target: GLenum, index: GLuint): Unit {
    return kniBridge251(target, index)
}

fun glDisablei(target: GLenum, index: GLuint): Unit {
    return kniBridge252(target, index)
}

fun glIsEnabledi(target: GLenum, index: GLuint): GLboolean {
    return kniBridge253(target, index)
}

fun glBeginTransformFeedback(primitiveMode: GLenum): Unit {
    return kniBridge254(primitiveMode)
}

fun glEndTransformFeedback(): Unit {
    return kniBridge255()
}

fun glBindBufferRange(target: GLenum, index: GLuint, buffer: GLuint, offset: GLintptr, size: GLsizeiptr): Unit {
    return kniBridge256(target, index, buffer, offset, size)
}

fun glBindBufferBase(target: GLenum, index: GLuint, buffer: GLuint): Unit {
    return kniBridge257(target, index, buffer)
}

fun glTransformFeedbackVaryings(program: GLuint, count: GLsizei, varyings: CValuesRef<CPointerVar<GLcharVar>>?, bufferMode: GLenum): Unit {
    memScoped {
        return kniBridge258(program, count, varyings?.getPointer(memScope).rawValue, bufferMode)
    }
}

fun glGetTransformFeedbackVarying(program: GLuint, index: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, size: CValuesRef<GLsizeiVar>?, type: CValuesRef<GLenumVar>?, name: CValuesRef<GLcharVar>?): Unit {
    memScoped {
        return kniBridge259(program, index, bufSize, length?.getPointer(memScope).rawValue, size?.getPointer(memScope).rawValue, type?.getPointer(memScope).rawValue, name?.getPointer(memScope).rawValue)
    }
}

fun glClampColor(target: GLenum, clamp: GLenum): Unit {
    return kniBridge260(target, clamp)
}

fun glBeginConditionalRender(id: GLuint, mode: GLenum): Unit {
    return kniBridge261(id, mode)
}

fun glEndConditionalRender(): Unit {
    return kniBridge262()
}

fun glVertexAttribIPointer(index: GLuint, size: GLint, type: GLenum, stride: GLsizei, pointer: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge263(index, size, type, stride, pointer?.getPointer(memScope).rawValue)
    }
}

fun glGetVertexAttribIiv(index: GLuint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge264(index, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetVertexAttribIuiv(index: GLuint, pname: GLenum, params: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge265(index, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribI1i(index: GLuint, x: GLint): Unit {
    return kniBridge266(index, x)
}

fun glVertexAttribI2i(index: GLuint, x: GLint, y: GLint): Unit {
    return kniBridge267(index, x, y)
}

fun glVertexAttribI3i(index: GLuint, x: GLint, y: GLint, z: GLint): Unit {
    return kniBridge268(index, x, y, z)
}

fun glVertexAttribI4i(index: GLuint, x: GLint, y: GLint, z: GLint, w: GLint): Unit {
    return kniBridge269(index, x, y, z, w)
}

fun glVertexAttribI1ui(index: GLuint, x: GLuint): Unit {
    return kniBridge270(index, x)
}

fun glVertexAttribI2ui(index: GLuint, x: GLuint, y: GLuint): Unit {
    return kniBridge271(index, x, y)
}

fun glVertexAttribI3ui(index: GLuint, x: GLuint, y: GLuint, z: GLuint): Unit {
    return kniBridge272(index, x, y, z)
}

fun glVertexAttribI4ui(index: GLuint, x: GLuint, y: GLuint, z: GLuint, w: GLuint): Unit {
    return kniBridge273(index, x, y, z, w)
}

fun glVertexAttribI1iv(index: GLuint, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge274(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribI2iv(index: GLuint, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge275(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribI3iv(index: GLuint, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge276(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribI4iv(index: GLuint, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge277(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribI1uiv(index: GLuint, v: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge278(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribI2uiv(index: GLuint, v: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge279(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribI3uiv(index: GLuint, v: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge280(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribI4uiv(index: GLuint, v: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge281(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribI4bv(index: GLuint, v: CValuesRef<GLbyteVar>?): Unit {
    memScoped {
        return kniBridge282(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribI4sv(index: GLuint, v: CValuesRef<GLshortVar>?): Unit {
    memScoped {
        return kniBridge283(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribI4ubv(index: GLuint, v: CValuesRef<GLubyteVar>?): Unit {
    memScoped {
        return kniBridge284(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribI4usv(index: GLuint, v: CValuesRef<GLushortVar>?): Unit {
    memScoped {
        return kniBridge285(index, v?.getPointer(memScope).rawValue)
    }
}

fun glGetUniformuiv(program: GLuint, location: GLint, params: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge286(program, location, params?.getPointer(memScope).rawValue)
    }
}

fun glBindFragDataLocation(program: GLuint, color: GLuint, name: String?): Unit {
    memScoped {
        return kniBridge287(program, color, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glGetFragDataLocation(program: GLuint, name: String?): GLint {
    memScoped {
        return kniBridge288(program, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glUniform1ui(location: GLint, v0: GLuint): Unit {
    return kniBridge289(location, v0)
}

fun glUniform2ui(location: GLint, v0: GLuint, v1: GLuint): Unit {
    return kniBridge290(location, v0, v1)
}

fun glUniform3ui(location: GLint, v0: GLuint, v1: GLuint, v2: GLuint): Unit {
    return kniBridge291(location, v0, v1, v2)
}

fun glUniform4ui(location: GLint, v0: GLuint, v1: GLuint, v2: GLuint, v3: GLuint): Unit {
    return kniBridge292(location, v0, v1, v2, v3)
}

fun glUniform1uiv(location: GLint, count: GLsizei, value: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge293(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glUniform2uiv(location: GLint, count: GLsizei, value: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge294(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glUniform3uiv(location: GLint, count: GLsizei, value: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge295(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glUniform4uiv(location: GLint, count: GLsizei, value: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge296(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glTexParameterIiv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge297(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glTexParameterIuiv(target: GLenum, pname: GLenum, params: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge298(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetTexParameterIiv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge299(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetTexParameterIuiv(target: GLenum, pname: GLenum, params: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge300(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glClearBufferiv(buffer: GLenum, drawbuffer: GLint, value: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge301(buffer, drawbuffer, value?.getPointer(memScope).rawValue)
    }
}

fun glClearBufferuiv(buffer: GLenum, drawbuffer: GLint, value: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge302(buffer, drawbuffer, value?.getPointer(memScope).rawValue)
    }
}

fun glClearBufferfv(buffer: GLenum, drawbuffer: GLint, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge303(buffer, drawbuffer, value?.getPointer(memScope).rawValue)
    }
}

fun glClearBufferfi(buffer: GLenum, drawbuffer: GLint, depth: GLfloat, stencil: GLint): Unit {
    return kniBridge304(buffer, drawbuffer, depth, stencil)
}

fun glGetStringi(name: GLenum, index: GLuint): CPointer<GLubyteVar>? {
    return interpretCPointer<GLubyteVar>(kniBridge305(name, index))
}

fun glDrawArraysInstanced(mode: GLenum, first: GLint, count: GLsizei, instancecount: GLsizei): Unit {
    return kniBridge306(mode, first, count, instancecount)
}

fun glDrawElementsInstanced(mode: GLenum, count: GLsizei, type: GLenum, indices: CValuesRef<*>?, instancecount: GLsizei): Unit {
    memScoped {
        return kniBridge307(mode, count, type, indices?.getPointer(memScope).rawValue, instancecount)
    }
}

fun glTexBuffer(target: GLenum, internalformat: GLenum, buffer: GLuint): Unit {
    return kniBridge308(target, internalformat, buffer)
}

fun glPrimitiveRestartIndex(index: GLuint): Unit {
    return kniBridge309(index)
}

fun glGetInteger64i_v(target: GLenum, index: GLuint, data: CValuesRef<GLint64Var>?): Unit {
    memScoped {
        return kniBridge310(target, index, data?.getPointer(memScope).rawValue)
    }
}

fun glGetBufferParameteri64v(target: GLenum, pname: GLenum, params: CValuesRef<GLint64Var>?): Unit {
    memScoped {
        return kniBridge311(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glFramebufferTexture(target: GLenum, attachment: GLenum, texture: GLuint, level: GLint): Unit {
    return kniBridge312(target, attachment, texture, level)
}

fun glVertexAttribDivisor(index: GLuint, divisor: GLuint): Unit {
    return kniBridge313(index, divisor)
}

fun glMinSampleShading(value: GLfloat): Unit {
    return kniBridge314(value)
}

fun glBlendEquationi(buf: GLuint, mode: GLenum): Unit {
    return kniBridge315(buf, mode)
}

fun glBlendEquationSeparatei(buf: GLuint, modeRGB: GLenum, modeAlpha: GLenum): Unit {
    return kniBridge316(buf, modeRGB, modeAlpha)
}

fun glBlendFunci(buf: GLuint, src: GLenum, dst: GLenum): Unit {
    return kniBridge317(buf, src, dst)
}

fun glBlendFuncSeparatei(buf: GLuint, srcRGB: GLenum, dstRGB: GLenum, srcAlpha: GLenum, dstAlpha: GLenum): Unit {
    return kniBridge318(buf, srcRGB, dstRGB, srcAlpha, dstAlpha)
}

fun glIsRenderbuffer(renderbuffer: GLuint): GLboolean {
    return kniBridge319(renderbuffer)
}

fun glBindRenderbuffer(target: GLenum, renderbuffer: GLuint): Unit {
    return kniBridge320(target, renderbuffer)
}

fun glDeleteRenderbuffers(n: GLsizei, renderbuffers: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge321(n, renderbuffers?.getPointer(memScope).rawValue)
    }
}

fun glGenRenderbuffers(n: GLsizei, renderbuffers: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge322(n, renderbuffers?.getPointer(memScope).rawValue)
    }
}

fun glRenderbufferStorage(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei): Unit {
    return kniBridge323(target, internalformat, width, height)
}

fun glGetRenderbufferParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge324(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glIsFramebuffer(framebuffer: GLuint): GLboolean {
    return kniBridge325(framebuffer)
}

fun glBindFramebuffer(target: GLenum, framebuffer: GLuint): Unit {
    return kniBridge326(target, framebuffer)
}

fun glDeleteFramebuffers(n: GLsizei, framebuffers: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge327(n, framebuffers?.getPointer(memScope).rawValue)
    }
}

fun glGenFramebuffers(n: GLsizei, framebuffers: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge328(n, framebuffers?.getPointer(memScope).rawValue)
    }
}

fun glCheckFramebufferStatus(target: GLenum): GLenum {
    return kniBridge329(target)
}

fun glFramebufferTexture1D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: GLuint, level: GLint): Unit {
    return kniBridge330(target, attachment, textarget, texture, level)
}

fun glFramebufferTexture2D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: GLuint, level: GLint): Unit {
    return kniBridge331(target, attachment, textarget, texture, level)
}

fun glFramebufferTexture3D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: GLuint, level: GLint, zoffset: GLint): Unit {
    return kniBridge332(target, attachment, textarget, texture, level, zoffset)
}

fun glFramebufferRenderbuffer(target: GLenum, attachment: GLenum, renderbuffertarget: GLenum, renderbuffer: GLuint): Unit {
    return kniBridge333(target, attachment, renderbuffertarget, renderbuffer)
}

fun glGetFramebufferAttachmentParameteriv(target: GLenum, attachment: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge334(target, attachment, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGenerateMipmap(target: GLenum): Unit {
    return kniBridge335(target)
}

fun glBlitFramebuffer(srcX0: GLint, srcY0: GLint, srcX1: GLint, srcY1: GLint, dstX0: GLint, dstY0: GLint, dstX1: GLint, dstY1: GLint, mask: GLbitfield, filter: GLenum): Unit {
    return kniBridge336(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter)
}

fun glRenderbufferStorageMultisample(target: GLenum, samples: GLsizei, internalformat: GLenum, width: GLsizei, height: GLsizei): Unit {
    return kniBridge337(target, samples, internalformat, width, height)
}

fun glFramebufferTextureLayer(target: GLenum, attachment: GLenum, texture: GLuint, level: GLint, layer: GLint): Unit {
    return kniBridge338(target, attachment, texture, level, layer)
}

fun glMapBufferRange(target: GLenum, offset: GLintptr, length: GLsizeiptr, access: GLbitfield): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge339(target, offset, length, access))
}

fun glFlushMappedBufferRange(target: GLenum, offset: GLintptr, length: GLsizeiptr): Unit {
    return kniBridge340(target, offset, length)
}

fun glBindVertexArray(array: GLuint): Unit {
    return kniBridge341(array)
}

fun glDeleteVertexArrays(n: GLsizei, arrays: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge342(n, arrays?.getPointer(memScope).rawValue)
    }
}

fun glGenVertexArrays(n: GLsizei, arrays: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge343(n, arrays?.getPointer(memScope).rawValue)
    }
}

fun glIsVertexArray(array: GLuint): GLboolean {
    return kniBridge344(array)
}

fun glGetUniformIndices(program: GLuint, uniformCount: GLsizei, uniformNames: CValuesRef<CPointerVar<GLcharVar>>?, uniformIndices: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge345(program, uniformCount, uniformNames?.getPointer(memScope).rawValue, uniformIndices?.getPointer(memScope).rawValue)
    }
}

fun glGetActiveUniformsiv(program: GLuint, uniformCount: GLsizei, uniformIndices: CValuesRef<GLuintVar>?, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge346(program, uniformCount, uniformIndices?.getPointer(memScope).rawValue, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetActiveUniformName(program: GLuint, uniformIndex: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, uniformName: CValuesRef<GLcharVar>?): Unit {
    memScoped {
        return kniBridge347(program, uniformIndex, bufSize, length?.getPointer(memScope).rawValue, uniformName?.getPointer(memScope).rawValue)
    }
}

fun glGetUniformBlockIndex(program: GLuint, uniformBlockName: String?): GLuint {
    memScoped {
        return kniBridge348(program, uniformBlockName?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glGetActiveUniformBlockiv(program: GLuint, uniformBlockIndex: GLuint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge349(program, uniformBlockIndex, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetActiveUniformBlockName(program: GLuint, uniformBlockIndex: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, uniformBlockName: CValuesRef<GLcharVar>?): Unit {
    memScoped {
        return kniBridge350(program, uniformBlockIndex, bufSize, length?.getPointer(memScope).rawValue, uniformBlockName?.getPointer(memScope).rawValue)
    }
}

fun glUniformBlockBinding(program: GLuint, uniformBlockIndex: GLuint, uniformBlockBinding: GLuint): Unit {
    return kniBridge351(program, uniformBlockIndex, uniformBlockBinding)
}

fun glCopyBufferSubData(readTarget: GLenum, writeTarget: GLenum, readOffset: GLintptr, writeOffset: GLintptr, size: GLsizeiptr): Unit {
    return kniBridge352(readTarget, writeTarget, readOffset, writeOffset, size)
}

fun glDrawElementsBaseVertex(mode: GLenum, count: GLsizei, type: GLenum, indices: CValuesRef<*>?, basevertex: GLint): Unit {
    memScoped {
        return kniBridge353(mode, count, type, indices?.getPointer(memScope).rawValue, basevertex)
    }
}

fun glDrawRangeElementsBaseVertex(mode: GLenum, start: GLuint, end: GLuint, count: GLsizei, type: GLenum, indices: CValuesRef<*>?, basevertex: GLint): Unit {
    memScoped {
        return kniBridge354(mode, start, end, count, type, indices?.getPointer(memScope).rawValue, basevertex)
    }
}

fun glDrawElementsInstancedBaseVertex(mode: GLenum, count: GLsizei, type: GLenum, indices: CValuesRef<*>?, instancecount: GLsizei, basevertex: GLint): Unit {
    memScoped {
        return kniBridge355(mode, count, type, indices?.getPointer(memScope).rawValue, instancecount, basevertex)
    }
}

fun glMultiDrawElementsBaseVertex(mode: GLenum, count: CValuesRef<GLsizeiVar>?, type: GLenum, indices: CValuesRef<COpaquePointerVar>?, drawcount: GLsizei, basevertex: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge356(mode, count?.getPointer(memScope).rawValue, type, indices?.getPointer(memScope).rawValue, drawcount, basevertex?.getPointer(memScope).rawValue)
    }
}

fun glProvokingVertex(mode: GLenum): Unit {
    return kniBridge357(mode)
}

fun glFenceSync(condition: GLenum, flags: GLbitfield): GLsync? {
    return interpretCPointer<__GLsync>(kniBridge358(condition, flags))
}

fun glIsSync(sync: GLsync?): GLboolean {
    return kniBridge359(sync.rawValue)
}

fun glDeleteSync(sync: GLsync?): Unit {
    return kniBridge360(sync.rawValue)
}

fun glClientWaitSync(sync: GLsync?, flags: GLbitfield, timeout: GLuint64): GLenum {
    return kniBridge361(sync.rawValue, flags, timeout)
}

fun glWaitSync(sync: GLsync?, flags: GLbitfield, timeout: GLuint64): Unit {
    return kniBridge362(sync.rawValue, flags, timeout)
}

fun glGetInteger64v(pname: GLenum, params: CValuesRef<GLint64Var>?): Unit {
    memScoped {
        return kniBridge363(pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetSynciv(sync: GLsync?, pname: GLenum, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, values: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge364(sync.rawValue, pname, bufSize, length?.getPointer(memScope).rawValue, values?.getPointer(memScope).rawValue)
    }
}

fun glTexImage2DMultisample(target: GLenum, samples: GLsizei, internalformat: GLint, width: GLsizei, height: GLsizei, fixedsamplelocations: GLboolean): Unit {
    return kniBridge365(target, samples, internalformat, width, height, fixedsamplelocations)
}

fun glTexImage3DMultisample(target: GLenum, samples: GLsizei, internalformat: GLint, width: GLsizei, height: GLsizei, depth: GLsizei, fixedsamplelocations: GLboolean): Unit {
    return kniBridge366(target, samples, internalformat, width, height, depth, fixedsamplelocations)
}

fun glGetMultisamplefv(pname: GLenum, index: GLuint, `val`: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge367(pname, index, `val`?.getPointer(memScope).rawValue)
    }
}

fun glSampleMaski(index: GLuint, mask: GLbitfield): Unit {
    return kniBridge368(index, mask)
}

fun glBindFragDataLocationIndexed(program: GLuint, colorNumber: GLuint, index: GLuint, name: String?): Unit {
    memScoped {
        return kniBridge369(program, colorNumber, index, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glGetFragDataIndex(program: GLuint, name: String?): GLint {
    memScoped {
        return kniBridge370(program, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glGenSamplers(count: GLsizei, samplers: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge371(count, samplers?.getPointer(memScope).rawValue)
    }
}

fun glDeleteSamplers(count: GLsizei, samplers: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge372(count, samplers?.getPointer(memScope).rawValue)
    }
}

fun glIsSampler(sampler: GLuint): GLboolean {
    return kniBridge373(sampler)
}

fun glBindSampler(unit: GLuint, sampler: GLuint): Unit {
    return kniBridge374(unit, sampler)
}

fun glSamplerParameteri(sampler: GLuint, pname: GLenum, param: GLint): Unit {
    return kniBridge375(sampler, pname, param)
}

fun glSamplerParameteriv(sampler: GLuint, pname: GLenum, param: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge376(sampler, pname, param?.getPointer(memScope).rawValue)
    }
}

fun glSamplerParameterf(sampler: GLuint, pname: GLenum, param: GLfloat): Unit {
    return kniBridge377(sampler, pname, param)
}

fun glSamplerParameterfv(sampler: GLuint, pname: GLenum, param: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge378(sampler, pname, param?.getPointer(memScope).rawValue)
    }
}

fun glSamplerParameterIiv(sampler: GLuint, pname: GLenum, param: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge379(sampler, pname, param?.getPointer(memScope).rawValue)
    }
}

fun glSamplerParameterIuiv(sampler: GLuint, pname: GLenum, param: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge380(sampler, pname, param?.getPointer(memScope).rawValue)
    }
}

fun glGetSamplerParameteriv(sampler: GLuint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge381(sampler, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetSamplerParameterIiv(sampler: GLuint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge382(sampler, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetSamplerParameterfv(sampler: GLuint, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge383(sampler, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetSamplerParameterIuiv(sampler: GLuint, pname: GLenum, params: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge384(sampler, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glQueryCounter(id: GLuint, target: GLenum): Unit {
    return kniBridge385(id, target)
}

fun glGetQueryObjecti64v(id: GLuint, pname: GLenum, params: CValuesRef<GLint64Var>?): Unit {
    memScoped {
        return kniBridge386(id, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glGetQueryObjectui64v(id: GLuint, pname: GLenum, params: CValuesRef<GLuint64Var>?): Unit {
    memScoped {
        return kniBridge387(id, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribP1ui(index: GLuint, type: GLenum, normalized: GLboolean, value: GLuint): Unit {
    return kniBridge388(index, type, normalized, value)
}

fun glVertexAttribP1uiv(index: GLuint, type: GLenum, normalized: GLboolean, value: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge389(index, type, normalized, value?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribP2ui(index: GLuint, type: GLenum, normalized: GLboolean, value: GLuint): Unit {
    return kniBridge390(index, type, normalized, value)
}

fun glVertexAttribP2uiv(index: GLuint, type: GLenum, normalized: GLboolean, value: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge391(index, type, normalized, value?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribP3ui(index: GLuint, type: GLenum, normalized: GLboolean, value: GLuint): Unit {
    return kniBridge392(index, type, normalized, value)
}

fun glVertexAttribP3uiv(index: GLuint, type: GLenum, normalized: GLboolean, value: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge393(index, type, normalized, value?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribP4ui(index: GLuint, type: GLenum, normalized: GLboolean, value: GLuint): Unit {
    return kniBridge394(index, type, normalized, value)
}

fun glVertexAttribP4uiv(index: GLuint, type: GLenum, normalized: GLboolean, value: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge395(index, type, normalized, value?.getPointer(memScope).rawValue)
    }
}

fun glDrawArraysIndirect(mode: GLenum, indirect: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge396(mode, indirect?.getPointer(memScope).rawValue)
    }
}

fun glDrawElementsIndirect(mode: GLenum, type: GLenum, indirect: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge397(mode, type, indirect?.getPointer(memScope).rawValue)
    }
}

fun glUniform1d(location: GLint, x: GLdouble): Unit {
    return kniBridge398(location, x)
}

fun glUniform2d(location: GLint, x: GLdouble, y: GLdouble): Unit {
    return kniBridge399(location, x, y)
}

fun glUniform3d(location: GLint, x: GLdouble, y: GLdouble, z: GLdouble): Unit {
    return kniBridge400(location, x, y, z)
}

fun glUniform4d(location: GLint, x: GLdouble, y: GLdouble, z: GLdouble, w: GLdouble): Unit {
    return kniBridge401(location, x, y, z, w)
}

fun glUniform1dv(location: GLint, count: GLsizei, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge402(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glUniform2dv(location: GLint, count: GLsizei, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge403(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glUniform3dv(location: GLint, count: GLsizei, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge404(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glUniform4dv(location: GLint, count: GLsizei, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge405(location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix2dv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge406(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix3dv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge407(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix4dv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge408(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix2x3dv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge409(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix2x4dv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge410(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix3x2dv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge411(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix3x4dv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge412(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix4x2dv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge413(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glUniformMatrix4x3dv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge414(location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glGetUniformdv(program: GLuint, location: GLint, params: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge415(program, location, params?.getPointer(memScope).rawValue)
    }
}

fun glGetSubroutineUniformLocation(program: GLuint, shadertype: GLenum, name: String?): GLint {
    memScoped {
        return kniBridge416(program, shadertype, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glGetSubroutineIndex(program: GLuint, shadertype: GLenum, name: String?): GLuint {
    memScoped {
        return kniBridge417(program, shadertype, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glGetActiveSubroutineUniformiv(program: GLuint, shadertype: GLenum, index: GLuint, pname: GLenum, values: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge418(program, shadertype, index, pname, values?.getPointer(memScope).rawValue)
    }
}

fun glGetActiveSubroutineUniformName(program: GLuint, shadertype: GLenum, index: GLuint, bufsize: GLsizei, length: CValuesRef<GLsizeiVar>?, name: CValuesRef<GLcharVar>?): Unit {
    memScoped {
        return kniBridge419(program, shadertype, index, bufsize, length?.getPointer(memScope).rawValue, name?.getPointer(memScope).rawValue)
    }
}

fun glGetActiveSubroutineName(program: GLuint, shadertype: GLenum, index: GLuint, bufsize: GLsizei, length: CValuesRef<GLsizeiVar>?, name: CValuesRef<GLcharVar>?): Unit {
    memScoped {
        return kniBridge420(program, shadertype, index, bufsize, length?.getPointer(memScope).rawValue, name?.getPointer(memScope).rawValue)
    }
}

fun glUniformSubroutinesuiv(shadertype: GLenum, count: GLsizei, indices: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge421(shadertype, count, indices?.getPointer(memScope).rawValue)
    }
}

fun glGetUniformSubroutineuiv(shadertype: GLenum, location: GLint, params: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge422(shadertype, location, params?.getPointer(memScope).rawValue)
    }
}

fun glGetProgramStageiv(program: GLuint, shadertype: GLenum, pname: GLenum, values: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge423(program, shadertype, pname, values?.getPointer(memScope).rawValue)
    }
}

fun glPatchParameteri(pname: GLenum, value: GLint): Unit {
    return kniBridge424(pname, value)
}

fun glPatchParameterfv(pname: GLenum, values: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge425(pname, values?.getPointer(memScope).rawValue)
    }
}

fun glBindTransformFeedback(target: GLenum, id: GLuint): Unit {
    return kniBridge426(target, id)
}

fun glDeleteTransformFeedbacks(n: GLsizei, ids: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge427(n, ids?.getPointer(memScope).rawValue)
    }
}

fun glGenTransformFeedbacks(n: GLsizei, ids: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge428(n, ids?.getPointer(memScope).rawValue)
    }
}

fun glIsTransformFeedback(id: GLuint): GLboolean {
    return kniBridge429(id)
}

fun glPauseTransformFeedback(): Unit {
    return kniBridge430()
}

fun glResumeTransformFeedback(): Unit {
    return kniBridge431()
}

fun glDrawTransformFeedback(mode: GLenum, id: GLuint): Unit {
    return kniBridge432(mode, id)
}

fun glDrawTransformFeedbackStream(mode: GLenum, id: GLuint, stream: GLuint): Unit {
    return kniBridge433(mode, id, stream)
}

fun glBeginQueryIndexed(target: GLenum, index: GLuint, id: GLuint): Unit {
    return kniBridge434(target, index, id)
}

fun glEndQueryIndexed(target: GLenum, index: GLuint): Unit {
    return kniBridge435(target, index)
}

fun glGetQueryIndexediv(target: GLenum, index: GLuint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge436(target, index, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glReleaseShaderCompiler(): Unit {
    return kniBridge437()
}

fun glShaderBinary(count: GLsizei, shaders: CValuesRef<GLuintVar>?, binaryformat: GLenum, binary: CValuesRef<*>?, length: GLsizei): Unit {
    memScoped {
        return kniBridge438(count, shaders?.getPointer(memScope).rawValue, binaryformat, binary?.getPointer(memScope).rawValue, length)
    }
}

fun glGetShaderPrecisionFormat(shadertype: GLenum, precisiontype: GLenum, range: CValuesRef<GLintVar>?, precision: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge439(shadertype, precisiontype, range?.getPointer(memScope).rawValue, precision?.getPointer(memScope).rawValue)
    }
}

fun glDepthRangef(n: GLclampf, f: GLclampf): Unit {
    return kniBridge440(n, f)
}

fun glClearDepthf(d: GLclampf): Unit {
    return kniBridge441(d)
}

fun glGetProgramBinary(program: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, binaryFormat: CValuesRef<GLenumVar>?, binary: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge442(program, bufSize, length?.getPointer(memScope).rawValue, binaryFormat?.getPointer(memScope).rawValue, binary?.getPointer(memScope).rawValue)
    }
}

fun glProgramBinary(program: GLuint, binaryFormat: GLenum, binary: CValuesRef<*>?, length: GLsizei): Unit {
    memScoped {
        return kniBridge443(program, binaryFormat, binary?.getPointer(memScope).rawValue, length)
    }
}

fun glProgramParameteri(program: GLuint, pname: GLenum, value: GLint): Unit {
    return kniBridge444(program, pname, value)
}

fun glUseProgramStages(pipeline: GLuint, stages: GLbitfield, program: GLuint): Unit {
    return kniBridge445(pipeline, stages, program)
}

fun glActiveShaderProgram(pipeline: GLuint, program: GLuint): Unit {
    return kniBridge446(pipeline, program)
}

fun glCreateShaderProgramv(type: GLenum, count: GLsizei, strings: CValuesRef<CPointerVar<GLcharVar>>?): GLuint {
    memScoped {
        return kniBridge447(type, count, strings?.getPointer(memScope).rawValue)
    }
}

fun glBindProgramPipeline(pipeline: GLuint): Unit {
    return kniBridge448(pipeline)
}

fun glDeleteProgramPipelines(n: GLsizei, pipelines: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge449(n, pipelines?.getPointer(memScope).rawValue)
    }
}

fun glGenProgramPipelines(n: GLsizei, pipelines: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge450(n, pipelines?.getPointer(memScope).rawValue)
    }
}

fun glIsProgramPipeline(pipeline: GLuint): GLboolean {
    return kniBridge451(pipeline)
}

fun glGetProgramPipelineiv(pipeline: GLuint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge452(pipeline, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform1i(program: GLuint, location: GLint, v0: GLint): Unit {
    return kniBridge453(program, location, v0)
}

fun glProgramUniform1iv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge454(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform1f(program: GLuint, location: GLint, v0: GLfloat): Unit {
    return kniBridge455(program, location, v0)
}

fun glProgramUniform1fv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge456(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform1d(program: GLuint, location: GLint, v0: GLdouble): Unit {
    return kniBridge457(program, location, v0)
}

fun glProgramUniform1dv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge458(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform1ui(program: GLuint, location: GLint, v0: GLuint): Unit {
    return kniBridge459(program, location, v0)
}

fun glProgramUniform1uiv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge460(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform2i(program: GLuint, location: GLint, v0: GLint, v1: GLint): Unit {
    return kniBridge461(program, location, v0, v1)
}

fun glProgramUniform2iv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge462(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform2f(program: GLuint, location: GLint, v0: GLfloat, v1: GLfloat): Unit {
    return kniBridge463(program, location, v0, v1)
}

fun glProgramUniform2fv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge464(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform2d(program: GLuint, location: GLint, v0: GLdouble, v1: GLdouble): Unit {
    return kniBridge465(program, location, v0, v1)
}

fun glProgramUniform2dv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge466(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform2ui(program: GLuint, location: GLint, v0: GLuint, v1: GLuint): Unit {
    return kniBridge467(program, location, v0, v1)
}

fun glProgramUniform2uiv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge468(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform3i(program: GLuint, location: GLint, v0: GLint, v1: GLint, v2: GLint): Unit {
    return kniBridge469(program, location, v0, v1, v2)
}

fun glProgramUniform3iv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge470(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform3f(program: GLuint, location: GLint, v0: GLfloat, v1: GLfloat, v2: GLfloat): Unit {
    return kniBridge471(program, location, v0, v1, v2)
}

fun glProgramUniform3fv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge472(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform3d(program: GLuint, location: GLint, v0: GLdouble, v1: GLdouble, v2: GLdouble): Unit {
    return kniBridge473(program, location, v0, v1, v2)
}

fun glProgramUniform3dv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge474(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform3ui(program: GLuint, location: GLint, v0: GLuint, v1: GLuint, v2: GLuint): Unit {
    return kniBridge475(program, location, v0, v1, v2)
}

fun glProgramUniform3uiv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge476(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform4i(program: GLuint, location: GLint, v0: GLint, v1: GLint, v2: GLint, v3: GLint): Unit {
    return kniBridge477(program, location, v0, v1, v2, v3)
}

fun glProgramUniform4iv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge478(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform4f(program: GLuint, location: GLint, v0: GLfloat, v1: GLfloat, v2: GLfloat, v3: GLfloat): Unit {
    return kniBridge479(program, location, v0, v1, v2, v3)
}

fun glProgramUniform4fv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge480(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform4d(program: GLuint, location: GLint, v0: GLdouble, v1: GLdouble, v2: GLdouble, v3: GLdouble): Unit {
    return kniBridge481(program, location, v0, v1, v2, v3)
}

fun glProgramUniform4dv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge482(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniform4ui(program: GLuint, location: GLint, v0: GLuint, v1: GLuint, v2: GLuint, v3: GLuint): Unit {
    return kniBridge483(program, location, v0, v1, v2, v3)
}

fun glProgramUniform4uiv(program: GLuint, location: GLint, count: GLsizei, value: CValuesRef<GLuintVar>?): Unit {
    memScoped {
        return kniBridge484(program, location, count, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix2fv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge485(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix3fv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge486(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix4fv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge487(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix2dv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge488(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix3dv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge489(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix4dv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge490(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix2x3fv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge491(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix3x2fv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge492(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix2x4fv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge493(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix4x2fv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge494(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix3x4fv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge495(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix4x3fv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge496(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix2x3dv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge497(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix3x2dv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge498(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix2x4dv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge499(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix4x2dv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge500(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix3x4dv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge501(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glProgramUniformMatrix4x3dv(program: GLuint, location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge502(program, location, count, transpose, value?.getPointer(memScope).rawValue)
    }
}

fun glValidateProgramPipeline(pipeline: GLuint): Unit {
    return kniBridge503(pipeline)
}

fun glGetProgramPipelineInfoLog(pipeline: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, infoLog: CValuesRef<GLcharVar>?): Unit {
    memScoped {
        return kniBridge504(pipeline, bufSize, length?.getPointer(memScope).rawValue, infoLog?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribL1d(index: GLuint, x: GLdouble): Unit {
    return kniBridge505(index, x)
}

fun glVertexAttribL2d(index: GLuint, x: GLdouble, y: GLdouble): Unit {
    return kniBridge506(index, x, y)
}

fun glVertexAttribL3d(index: GLuint, x: GLdouble, y: GLdouble, z: GLdouble): Unit {
    return kniBridge507(index, x, y, z)
}

fun glVertexAttribL4d(index: GLuint, x: GLdouble, y: GLdouble, z: GLdouble, w: GLdouble): Unit {
    return kniBridge508(index, x, y, z, w)
}

fun glVertexAttribL1dv(index: GLuint, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge509(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribL2dv(index: GLuint, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge510(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribL3dv(index: GLuint, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge511(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribL4dv(index: GLuint, v: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge512(index, v?.getPointer(memScope).rawValue)
    }
}

fun glVertexAttribLPointer(index: GLuint, size: GLint, type: GLenum, stride: GLsizei, pointer: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge513(index, size, type, stride, pointer?.getPointer(memScope).rawValue)
    }
}

fun glGetVertexAttribLdv(index: GLuint, pname: GLenum, params: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge514(index, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glViewportArrayv(first: GLuint, count: GLsizei, v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge515(first, count, v?.getPointer(memScope).rawValue)
    }
}

fun glViewportIndexedf(index: GLuint, x: GLfloat, y: GLfloat, w: GLfloat, h: GLfloat): Unit {
    return kniBridge516(index, x, y, w, h)
}

fun glViewportIndexedfv(index: GLuint, v: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge517(index, v?.getPointer(memScope).rawValue)
    }
}

fun glScissorArrayv(first: GLuint, count: GLsizei, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge518(first, count, v?.getPointer(memScope).rawValue)
    }
}

fun glScissorIndexed(index: GLuint, left: GLint, bottom: GLint, width: GLsizei, height: GLsizei): Unit {
    return kniBridge519(index, left, bottom, width, height)
}

fun glScissorIndexedv(index: GLuint, v: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge520(index, v?.getPointer(memScope).rawValue)
    }
}

fun glDepthRangeArrayv(first: GLuint, count: GLsizei, v: CValuesRef<GLclampdVar>?): Unit {
    memScoped {
        return kniBridge521(first, count, v?.getPointer(memScope).rawValue)
    }
}

fun glDepthRangeIndexed(index: GLuint, n: GLclampd, f: GLclampd): Unit {
    return kniBridge522(index, n, f)
}

fun glGetFloati_v(target: GLenum, index: GLuint, data: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge523(target, index, data?.getPointer(memScope).rawValue)
    }
}

fun glGetDoublei_v(target: GLenum, index: GLuint, data: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge524(target, index, data?.getPointer(memScope).rawValue)
    }
}

fun glBlendEquationiARB(buf: GLuint, mode: GLenum): Unit {
    return kniBridge525(buf, mode)
}

fun glBlendEquationSeparateiARB(buf: GLuint, modeRGB: GLenum, modeAlpha: GLenum): Unit {
    return kniBridge526(buf, modeRGB, modeAlpha)
}

fun glBlendFunciARB(buf: GLuint, src: GLenum, dst: GLenum): Unit {
    return kniBridge527(buf, src, dst)
}

fun glBlendFuncSeparateiARB(buf: GLuint, srcRGB: GLenum, dstRGB: GLenum, srcAlpha: GLenum, dstAlpha: GLenum): Unit {
    return kniBridge528(buf, srcRGB, dstRGB, srcAlpha, dstAlpha)
}

fun glVertexAttribDivisorARB(index: GLuint, divisor: GLuint): Unit {
    return kniBridge529(index, divisor)
}

fun glGetInternalformativ(target: GLenum, internalformat: GLenum, pname: GLenum, bufSize: GLsizei, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge530(target, internalformat, pname, bufSize, params?.getPointer(memScope).rawValue)
    }
}

fun glMinSampleShadingARB(value: GLclampf): Unit {
    return kniBridge531(value)
}

fun glNamedStringARB(type: GLenum, namelen: GLint, name: String?, stringlen: GLint, string: String?): Unit {
    memScoped {
        return kniBridge532(type, namelen, name?.cstr?.getPointer(memScope).rawValue, stringlen, string?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glDeleteNamedStringARB(namelen: GLint, name: String?): Unit {
    memScoped {
        return kniBridge533(namelen, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glCompileShaderIncludeARB(shader: GLuint, count: GLsizei, path: CValuesRef<CPointerVar<GLcharVar>>?, length: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge534(shader, count, path?.getPointer(memScope).rawValue, length?.getPointer(memScope).rawValue)
    }
}

fun glIsNamedStringARB(namelen: GLint, name: String?): GLboolean {
    memScoped {
        return kniBridge535(namelen, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glGetNamedStringARB(namelen: GLint, name: String?, bufSize: GLsizei, stringlen: CValuesRef<GLintVar>?, string: CValuesRef<GLcharVar>?): Unit {
    memScoped {
        return kniBridge536(namelen, name?.cstr?.getPointer(memScope).rawValue, bufSize, stringlen?.getPointer(memScope).rawValue, string?.getPointer(memScope).rawValue)
    }
}

fun glGetNamedStringivARB(namelen: GLint, name: String?, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge537(namelen, name?.cstr?.getPointer(memScope).rawValue, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glTexStorage1D(target: GLenum, levels: GLsizei, internalformat: GLenum, width: GLsizei): Unit {
    return kniBridge538(target, levels, internalformat, width)
}

fun glTexStorage2D(target: GLenum, levels: GLsizei, internalformat: GLenum, width: GLsizei, height: GLsizei): Unit {
    return kniBridge539(target, levels, internalformat, width, height)
}

fun glTexStorage3D(target: GLenum, levels: GLsizei, internalformat: GLenum, width: GLsizei, height: GLsizei, depth: GLsizei): Unit {
    return kniBridge540(target, levels, internalformat, width, height, depth)
}

fun glLabelObjectEXT(type: GLenum, `object`: GLuint, length: GLsizei, label: String?): Unit {
    memScoped {
        return kniBridge541(type, `object`, length, label?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glGetObjectLabelEXT(type: GLenum, `object`: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, label: CValuesRef<GLcharVar>?): Unit {
    memScoped {
        return kniBridge542(type, `object`, bufSize, length?.getPointer(memScope).rawValue, label?.getPointer(memScope).rawValue)
    }
}

fun glInsertEventMarkerEXT(length: GLsizei, marker: String?): Unit {
    memScoped {
        return kniBridge543(length, marker?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glPushGroupMarkerEXT(length: GLsizei, marker: String?): Unit {
    memScoped {
        return kniBridge544(length, marker?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glPopGroupMarkerEXT(): Unit {
    return kniBridge545()
}

fun glDepthBoundsEXT(zmin: GLclampd, zmax: GLclampd): Unit {
    return kniBridge546(zmin, zmax)
}

fun glFlushRenderAPPLE(): Unit {
    return kniBridge547()
}

fun glFinishRenderAPPLE(): Unit {
    return kniBridge548()
}

fun glSwapAPPLE(): Unit {
    return kniBridge549()
}

fun glObjectPurgeableAPPLE(objectType: GLenum, name: GLuint, option: GLenum): GLenum {
    return kniBridge550(objectType, name, option)
}

fun glObjectUnpurgeableAPPLE(objectType: GLenum, name: GLuint, option: GLenum): GLenum {
    return kniBridge551(objectType, name, option)
}

fun glGetObjectParameterivAPPLE(objectType: GLenum, name: GLuint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge552(objectType, name, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glTextureRangeAPPLE(target: GLenum, length: GLsizei, pointer: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge553(target, length, pointer?.getPointer(memScope).rawValue)
    }
}

fun glGetTexParameterPointervAPPLE(target: GLenum, pname: GLenum, params: CValuesRef<COpaquePointerVar>?): Unit {
    memScoped {
        return kniBridge554(target, pname, params?.getPointer(memScope).rawValue)
    }
}

fun glTextureBarrierNV(): Unit {
    return kniBridge555()
}

fun gluBeginCurve(nurb: CValuesRef<GLUnurbs>?): Unit {
    memScoped {
        return kniBridge556(nurb?.getPointer(memScope).rawValue)
    }
}

fun gluBeginPolygon(tess: CValuesRef<GLUtesselator>?): Unit {
    memScoped {
        return kniBridge557(tess?.getPointer(memScope).rawValue)
    }
}

fun gluBeginSurface(nurb: CValuesRef<GLUnurbs>?): Unit {
    memScoped {
        return kniBridge558(nurb?.getPointer(memScope).rawValue)
    }
}

fun gluBeginTrim(nurb: CValuesRef<GLUnurbs>?): Unit {
    memScoped {
        return kniBridge559(nurb?.getPointer(memScope).rawValue)
    }
}

fun gluBuild1DMipmapLevels(target: GLenum, internalFormat: GLint, width: GLsizei, format: GLenum, type: GLenum, level: GLint, base: GLint, max: GLint, data: CValuesRef<*>?): GLint {
    memScoped {
        return kniBridge560(target, internalFormat, width, format, type, level, base, max, data?.getPointer(memScope).rawValue)
    }
}

fun gluBuild1DMipmaps(target: GLenum, internalFormat: GLint, width: GLsizei, format: GLenum, type: GLenum, data: CValuesRef<*>?): GLint {
    memScoped {
        return kniBridge561(target, internalFormat, width, format, type, data?.getPointer(memScope).rawValue)
    }
}

fun gluBuild2DMipmapLevels(target: GLenum, internalFormat: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, level: GLint, base: GLint, max: GLint, data: CValuesRef<*>?): GLint {
    memScoped {
        return kniBridge562(target, internalFormat, width, height, format, type, level, base, max, data?.getPointer(memScope).rawValue)
    }
}

fun gluBuild2DMipmaps(target: GLenum, internalFormat: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, data: CValuesRef<*>?): GLint {
    memScoped {
        return kniBridge563(target, internalFormat, width, height, format, type, data?.getPointer(memScope).rawValue)
    }
}

fun gluBuild3DMipmapLevels(target: GLenum, internalFormat: GLint, width: GLsizei, height: GLsizei, depth: GLsizei, format: GLenum, type: GLenum, level: GLint, base: GLint, max: GLint, data: CValuesRef<*>?): GLint {
    memScoped {
        return kniBridge564(target, internalFormat, width, height, depth, format, type, level, base, max, data?.getPointer(memScope).rawValue)
    }
}

fun gluBuild3DMipmaps(target: GLenum, internalFormat: GLint, width: GLsizei, height: GLsizei, depth: GLsizei, format: GLenum, type: GLenum, data: CValuesRef<*>?): GLint {
    memScoped {
        return kniBridge565(target, internalFormat, width, height, depth, format, type, data?.getPointer(memScope).rawValue)
    }
}

fun gluCheckExtension(extName: CValuesRef<GLubyteVar>?, extString: CValuesRef<GLubyteVar>?): GLboolean {
    memScoped {
        return kniBridge566(extName?.getPointer(memScope).rawValue, extString?.getPointer(memScope).rawValue)
    }
}

fun gluCylinder(quad: CValuesRef<GLUquadric>?, base: GLdouble, top: GLdouble, height: GLdouble, slices: GLint, stacks: GLint): Unit {
    memScoped {
        return kniBridge567(quad?.getPointer(memScope).rawValue, base, top, height, slices, stacks)
    }
}

fun gluDeleteNurbsRenderer(nurb: CValuesRef<GLUnurbs>?): Unit {
    memScoped {
        return kniBridge568(nurb?.getPointer(memScope).rawValue)
    }
}

fun gluDeleteQuadric(quad: CValuesRef<GLUquadric>?): Unit {
    memScoped {
        return kniBridge569(quad?.getPointer(memScope).rawValue)
    }
}

fun gluDeleteTess(tess: CValuesRef<GLUtesselator>?): Unit {
    memScoped {
        return kniBridge570(tess?.getPointer(memScope).rawValue)
    }
}

fun gluDisk(quad: CValuesRef<GLUquadric>?, inner: GLdouble, outer: GLdouble, slices: GLint, loops: GLint): Unit {
    memScoped {
        return kniBridge571(quad?.getPointer(memScope).rawValue, inner, outer, slices, loops)
    }
}

fun gluEndCurve(nurb: CValuesRef<GLUnurbs>?): Unit {
    memScoped {
        return kniBridge572(nurb?.getPointer(memScope).rawValue)
    }
}

fun gluEndPolygon(tess: CValuesRef<GLUtesselator>?): Unit {
    memScoped {
        return kniBridge573(tess?.getPointer(memScope).rawValue)
    }
}

fun gluEndSurface(nurb: CValuesRef<GLUnurbs>?): Unit {
    memScoped {
        return kniBridge574(nurb?.getPointer(memScope).rawValue)
    }
}

fun gluEndTrim(nurb: CValuesRef<GLUnurbs>?): Unit {
    memScoped {
        return kniBridge575(nurb?.getPointer(memScope).rawValue)
    }
}

fun gluErrorString(error: GLenum): CPointer<GLubyteVar>? {
    return interpretCPointer<GLubyteVar>(kniBridge576(error))
}

fun gluGetNurbsProperty(nurb: CValuesRef<GLUnurbs>?, property: GLenum, data: CValuesRef<GLfloatVar>?): Unit {
    memScoped {
        return kniBridge577(nurb?.getPointer(memScope).rawValue, property, data?.getPointer(memScope).rawValue)
    }
}

fun gluGetString(name: GLenum): CPointer<GLubyteVar>? {
    return interpretCPointer<GLubyteVar>(kniBridge578(name))
}

fun gluGetTessProperty(tess: CValuesRef<GLUtesselator>?, which: GLenum, data: CValuesRef<GLdoubleVar>?): Unit {
    memScoped {
        return kniBridge579(tess?.getPointer(memScope).rawValue, which, data?.getPointer(memScope).rawValue)
    }
}

fun gluLoadSamplingMatrices(nurb: CValuesRef<GLUnurbs>?, model: CValuesRef<GLfloatVar>?, perspective: CValuesRef<GLfloatVar>?, view: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge580(nurb?.getPointer(memScope).rawValue, model?.getPointer(memScope).rawValue, perspective?.getPointer(memScope).rawValue, view?.getPointer(memScope).rawValue)
    }
}

fun gluLookAt(eyeX: GLdouble, eyeY: GLdouble, eyeZ: GLdouble, centerX: GLdouble, centerY: GLdouble, centerZ: GLdouble, upX: GLdouble, upY: GLdouble, upZ: GLdouble): Unit {
    return kniBridge581(eyeX, eyeY, eyeZ, centerX, centerY, centerZ, upX, upY, upZ)
}

fun gluNewNurbsRenderer(): CPointer<GLUnurbs>? {
    return interpretCPointer<GLUnurbs>(kniBridge582())
}

fun gluNewQuadric(): CPointer<GLUquadric>? {
    return interpretCPointer<GLUquadric>(kniBridge583())
}

fun gluNewTess(): CPointer<GLUtesselator>? {
    return interpretCPointer<GLUtesselator>(kniBridge584())
}

fun gluNextContour(tess: CValuesRef<GLUtesselator>?, type: GLenum): Unit {
    memScoped {
        return kniBridge585(tess?.getPointer(memScope).rawValue, type)
    }
}

fun gluNurbsCallback(nurb: CValuesRef<GLUnurbs>?, which: GLenum, CallBackFunc: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge586(nurb?.getPointer(memScope).rawValue, which, CallBackFunc?.getPointer(memScope).rawValue)
    }
}

fun gluNurbsCallbackData(nurb: CValuesRef<GLUnurbs>?, userData: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge587(nurb?.getPointer(memScope).rawValue, userData?.getPointer(memScope).rawValue)
    }
}

fun gluNurbsCallbackDataEXT(nurb: CValuesRef<GLUnurbs>?, userData: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge588(nurb?.getPointer(memScope).rawValue, userData?.getPointer(memScope).rawValue)
    }
}

fun gluNurbsCurve(nurb: CValuesRef<GLUnurbs>?, knotCount: GLint, knots: CValuesRef<GLfloatVar>?, stride: GLint, control: CValuesRef<GLfloatVar>?, order: GLint, type: GLenum): Unit {
    memScoped {
        return kniBridge589(nurb?.getPointer(memScope).rawValue, knotCount, knots?.getPointer(memScope).rawValue, stride, control?.getPointer(memScope).rawValue, order, type)
    }
}

fun gluNurbsProperty(nurb: CValuesRef<GLUnurbs>?, property: GLenum, value: GLfloat): Unit {
    memScoped {
        return kniBridge590(nurb?.getPointer(memScope).rawValue, property, value)
    }
}

fun gluNurbsSurface(nurb: CValuesRef<GLUnurbs>?, sKnotCount: GLint, sKnots: CValuesRef<GLfloatVar>?, tKnotCount: GLint, tKnots: CValuesRef<GLfloatVar>?, sStride: GLint, tStride: GLint, control: CValuesRef<GLfloatVar>?, sOrder: GLint, tOrder: GLint, type: GLenum): Unit {
    memScoped {
        return kniBridge591(nurb?.getPointer(memScope).rawValue, sKnotCount, sKnots?.getPointer(memScope).rawValue, tKnotCount, tKnots?.getPointer(memScope).rawValue, sStride, tStride, control?.getPointer(memScope).rawValue, sOrder, tOrder, type)
    }
}

fun gluOrtho2D(left: GLdouble, right: GLdouble, bottom: GLdouble, top: GLdouble): Unit {
    return kniBridge592(left, right, bottom, top)
}

fun gluPartialDisk(quad: CValuesRef<GLUquadric>?, inner: GLdouble, outer: GLdouble, slices: GLint, loops: GLint, start: GLdouble, sweep: GLdouble): Unit {
    memScoped {
        return kniBridge593(quad?.getPointer(memScope).rawValue, inner, outer, slices, loops, start, sweep)
    }
}

fun gluPerspective(fovy: GLdouble, aspect: GLdouble, zNear: GLdouble, zFar: GLdouble): Unit {
    return kniBridge594(fovy, aspect, zNear, zFar)
}

fun gluPickMatrix(x: GLdouble, y: GLdouble, delX: GLdouble, delY: GLdouble, viewport: CValuesRef<GLintVar>?): Unit {
    memScoped {
        return kniBridge595(x, y, delX, delY, viewport?.getPointer(memScope).rawValue)
    }
}

fun gluProject(objX: GLdouble, objY: GLdouble, objZ: GLdouble, model: CValuesRef<GLdoubleVar>?, proj: CValuesRef<GLdoubleVar>?, view: CValuesRef<GLintVar>?, winX: CValuesRef<GLdoubleVar>?, winY: CValuesRef<GLdoubleVar>?, winZ: CValuesRef<GLdoubleVar>?): GLint {
    memScoped {
        return kniBridge596(objX, objY, objZ, model?.getPointer(memScope).rawValue, proj?.getPointer(memScope).rawValue, view?.getPointer(memScope).rawValue, winX?.getPointer(memScope).rawValue, winY?.getPointer(memScope).rawValue, winZ?.getPointer(memScope).rawValue)
    }
}

fun gluPwlCurve(nurb: CValuesRef<GLUnurbs>?, count: GLint, data: CValuesRef<GLfloatVar>?, stride: GLint, type: GLenum): Unit {
    memScoped {
        return kniBridge597(nurb?.getPointer(memScope).rawValue, count, data?.getPointer(memScope).rawValue, stride, type)
    }
}

fun gluQuadricCallback(quad: CValuesRef<GLUquadric>?, which: GLenum, CallBackFunc: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge598(quad?.getPointer(memScope).rawValue, which, CallBackFunc?.getPointer(memScope).rawValue)
    }
}

fun gluQuadricDrawStyle(quad: CValuesRef<GLUquadric>?, draw: GLenum): Unit {
    memScoped {
        return kniBridge599(quad?.getPointer(memScope).rawValue, draw)
    }
}

fun gluQuadricNormals(quad: CValuesRef<GLUquadric>?, normal: GLenum): Unit {
    memScoped {
        return kniBridge600(quad?.getPointer(memScope).rawValue, normal)
    }
}

fun gluQuadricOrientation(quad: CValuesRef<GLUquadric>?, orientation: GLenum): Unit {
    memScoped {
        return kniBridge601(quad?.getPointer(memScope).rawValue, orientation)
    }
}

fun gluQuadricTexture(quad: CValuesRef<GLUquadric>?, texture: GLboolean): Unit {
    memScoped {
        return kniBridge602(quad?.getPointer(memScope).rawValue, texture)
    }
}

fun gluScaleImage(format: GLenum, wIn: GLsizei, hIn: GLsizei, typeIn: GLenum, dataIn: CValuesRef<*>?, wOut: GLsizei, hOut: GLsizei, typeOut: GLenum, dataOut: CValuesRef<*>?): GLint {
    memScoped {
        return kniBridge603(format, wIn, hIn, typeIn, dataIn?.getPointer(memScope).rawValue, wOut, hOut, typeOut, dataOut?.getPointer(memScope).rawValue)
    }
}

fun gluSphere(quad: CValuesRef<GLUquadric>?, radius: GLdouble, slices: GLint, stacks: GLint): Unit {
    memScoped {
        return kniBridge604(quad?.getPointer(memScope).rawValue, radius, slices, stacks)
    }
}

fun gluTessBeginContour(tess: CValuesRef<GLUtesselator>?): Unit {
    memScoped {
        return kniBridge605(tess?.getPointer(memScope).rawValue)
    }
}

fun gluTessBeginPolygon(tess: CValuesRef<GLUtesselator>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge606(tess?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun gluTessCallback(tess: CValuesRef<GLUtesselator>?, which: GLenum, CallBackFunc: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge607(tess?.getPointer(memScope).rawValue, which, CallBackFunc?.getPointer(memScope).rawValue)
    }
}

fun gluTessEndContour(tess: CValuesRef<GLUtesselator>?): Unit {
    memScoped {
        return kniBridge608(tess?.getPointer(memScope).rawValue)
    }
}

fun gluTessEndPolygon(tess: CValuesRef<GLUtesselator>?): Unit {
    memScoped {
        return kniBridge609(tess?.getPointer(memScope).rawValue)
    }
}

fun gluTessNormal(tess: CValuesRef<GLUtesselator>?, valueX: GLdouble, valueY: GLdouble, valueZ: GLdouble): Unit {
    memScoped {
        return kniBridge610(tess?.getPointer(memScope).rawValue, valueX, valueY, valueZ)
    }
}

fun gluTessProperty(tess: CValuesRef<GLUtesselator>?, which: GLenum, data: GLdouble): Unit {
    memScoped {
        return kniBridge611(tess?.getPointer(memScope).rawValue, which, data)
    }
}

fun gluTessVertex(tess: CValuesRef<GLUtesselator>?, location: CValuesRef<GLdoubleVar>?, data: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge612(tess?.getPointer(memScope).rawValue, location?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue)
    }
}

fun gluUnProject(winX: GLdouble, winY: GLdouble, winZ: GLdouble, model: CValuesRef<GLdoubleVar>?, proj: CValuesRef<GLdoubleVar>?, view: CValuesRef<GLintVar>?, objX: CValuesRef<GLdoubleVar>?, objY: CValuesRef<GLdoubleVar>?, objZ: CValuesRef<GLdoubleVar>?): GLint {
    memScoped {
        return kniBridge613(winX, winY, winZ, model?.getPointer(memScope).rawValue, proj?.getPointer(memScope).rawValue, view?.getPointer(memScope).rawValue, objX?.getPointer(memScope).rawValue, objY?.getPointer(memScope).rawValue, objZ?.getPointer(memScope).rawValue)
    }
}

fun gluUnProject4(winX: GLdouble, winY: GLdouble, winZ: GLdouble, clipW: GLdouble, model: CValuesRef<GLdoubleVar>?, proj: CValuesRef<GLdoubleVar>?, view: CValuesRef<GLintVar>?, nearPlane: GLdouble, farPlane: GLdouble, objX: CValuesRef<GLdoubleVar>?, objY: CValuesRef<GLdoubleVar>?, objZ: CValuesRef<GLdoubleVar>?, objW: CValuesRef<GLdoubleVar>?): GLint {
    memScoped {
        return kniBridge614(winX, winY, winZ, clipW, model?.getPointer(memScope).rawValue, proj?.getPointer(memScope).rawValue, view?.getPointer(memScope).rawValue, nearPlane, farPlane, objX?.getPointer(memScope).rawValue, objY?.getPointer(memScope).rawValue, objZ?.getPointer(memScope).rawValue, objW?.getPointer(memScope).rawValue)
    }
}

const val CGL_VERSION_1_0: Int = 1

const val CGL_VERSION_1_1: Int = 1

const val CGL_VERSION_1_2: Int = 1

const val CGL_VERSION_1_3: Int = 1

const val GL_DEPTH_BUFFER_BIT: Int = 256

const val GL_STENCIL_BUFFER_BIT: Int = 1024

const val GL_COLOR_BUFFER_BIT: Int = 16384

const val GL_FALSE: Int = 0

const val GL_TRUE: Int = 1

const val GL_POINTS: Int = 0

const val GL_LINES: Int = 1

const val GL_LINE_LOOP: Int = 2

const val GL_LINE_STRIP: Int = 3

const val GL_TRIANGLES: Int = 4

const val GL_TRIANGLE_STRIP: Int = 5

const val GL_TRIANGLE_FAN: Int = 6

const val GL_NEVER: Int = 512

const val GL_LESS: Int = 513

const val GL_EQUAL: Int = 514

const val GL_LEQUAL: Int = 515

const val GL_GREATER: Int = 516

const val GL_NOTEQUAL: Int = 517

const val GL_GEQUAL: Int = 518

const val GL_ALWAYS: Int = 519

const val GL_ZERO: Int = 0

const val GL_ONE: Int = 1

const val GL_SRC_COLOR: Int = 768

const val GL_ONE_MINUS_SRC_COLOR: Int = 769

const val GL_SRC_ALPHA: Int = 770

const val GL_ONE_MINUS_SRC_ALPHA: Int = 771

const val GL_DST_ALPHA: Int = 772

const val GL_ONE_MINUS_DST_ALPHA: Int = 773

const val GL_DST_COLOR: Int = 774

const val GL_ONE_MINUS_DST_COLOR: Int = 775

const val GL_SRC_ALPHA_SATURATE: Int = 776

const val GL_NONE: Int = 0

const val GL_FRONT_LEFT: Int = 1024

const val GL_FRONT_RIGHT: Int = 1025

const val GL_BACK_LEFT: Int = 1026

const val GL_BACK_RIGHT: Int = 1027

const val GL_FRONT: Int = 1028

const val GL_BACK: Int = 1029

const val GL_LEFT: Int = 1030

const val GL_RIGHT: Int = 1031

const val GL_FRONT_AND_BACK: Int = 1032

const val GL_NO_ERROR: Int = 0

const val GL_INVALID_ENUM: Int = 1280

const val GL_INVALID_VALUE: Int = 1281

const val GL_INVALID_OPERATION: Int = 1282

const val GL_OUT_OF_MEMORY: Int = 1285

const val GL_CW: Int = 2304

const val GL_CCW: Int = 2305

const val GL_POINT_SIZE: Int = 2833

const val GL_POINT_SIZE_RANGE: Int = 2834

const val GL_POINT_SIZE_GRANULARITY: Int = 2835

const val GL_LINE_SMOOTH: Int = 2848

const val GL_LINE_WIDTH: Int = 2849

const val GL_LINE_WIDTH_RANGE: Int = 2850

const val GL_LINE_WIDTH_GRANULARITY: Int = 2851

const val GL_POLYGON_MODE: Int = 2880

const val GL_POLYGON_SMOOTH: Int = 2881

const val GL_CULL_FACE: Int = 2884

const val GL_CULL_FACE_MODE: Int = 2885

const val GL_FRONT_FACE: Int = 2886

const val GL_DEPTH_RANGE: Int = 2928

const val GL_DEPTH_TEST: Int = 2929

const val GL_DEPTH_WRITEMASK: Int = 2930

const val GL_DEPTH_CLEAR_VALUE: Int = 2931

const val GL_DEPTH_FUNC: Int = 2932

const val GL_STENCIL_TEST: Int = 2960

const val GL_STENCIL_CLEAR_VALUE: Int = 2961

const val GL_STENCIL_FUNC: Int = 2962

const val GL_STENCIL_VALUE_MASK: Int = 2963

const val GL_STENCIL_FAIL: Int = 2964

const val GL_STENCIL_PASS_DEPTH_FAIL: Int = 2965

const val GL_STENCIL_PASS_DEPTH_PASS: Int = 2966

const val GL_STENCIL_REF: Int = 2967

const val GL_STENCIL_WRITEMASK: Int = 2968

const val GL_VIEWPORT: Int = 2978

const val GL_DITHER: Int = 3024

const val GL_BLEND_DST: Int = 3040

const val GL_BLEND_SRC: Int = 3041

const val GL_BLEND: Int = 3042

const val GL_LOGIC_OP_MODE: Int = 3056

const val GL_COLOR_LOGIC_OP: Int = 3058

const val GL_DRAW_BUFFER: Int = 3073

const val GL_READ_BUFFER: Int = 3074

const val GL_SCISSOR_BOX: Int = 3088

const val GL_SCISSOR_TEST: Int = 3089

const val GL_COLOR_CLEAR_VALUE: Int = 3106

const val GL_COLOR_WRITEMASK: Int = 3107

const val GL_DOUBLEBUFFER: Int = 3122

const val GL_STEREO: Int = 3123

const val GL_LINE_SMOOTH_HINT: Int = 3154

const val GL_POLYGON_SMOOTH_HINT: Int = 3155

const val GL_UNPACK_SWAP_BYTES: Int = 3312

const val GL_UNPACK_LSB_FIRST: Int = 3313

const val GL_UNPACK_ROW_LENGTH: Int = 3314

const val GL_UNPACK_SKIP_ROWS: Int = 3315

const val GL_UNPACK_SKIP_PIXELS: Int = 3316

const val GL_UNPACK_ALIGNMENT: Int = 3317

const val GL_PACK_SWAP_BYTES: Int = 3328

const val GL_PACK_LSB_FIRST: Int = 3329

const val GL_PACK_ROW_LENGTH: Int = 3330

const val GL_PACK_SKIP_ROWS: Int = 3331

const val GL_PACK_SKIP_PIXELS: Int = 3332

const val GL_PACK_ALIGNMENT: Int = 3333

const val GL_MAX_TEXTURE_SIZE: Int = 3379

const val GL_MAX_VIEWPORT_DIMS: Int = 3386

const val GL_SUBPIXEL_BITS: Int = 3408

const val GL_TEXTURE_1D: Int = 3552

const val GL_TEXTURE_2D: Int = 3553

const val GL_POLYGON_OFFSET_UNITS: Int = 10752

const val GL_POLYGON_OFFSET_POINT: Int = 10753

const val GL_POLYGON_OFFSET_LINE: Int = 10754

const val GL_POLYGON_OFFSET_FILL: Int = 32823

const val GL_POLYGON_OFFSET_FACTOR: Int = 32824

const val GL_TEXTURE_BINDING_1D: Int = 32872

const val GL_TEXTURE_BINDING_2D: Int = 32873

const val GL_TEXTURE_WIDTH: Int = 4096

const val GL_TEXTURE_HEIGHT: Int = 4097

const val GL_TEXTURE_INTERNAL_FORMAT: Int = 4099

const val GL_TEXTURE_BORDER_COLOR: Int = 4100

const val GL_TEXTURE_RED_SIZE: Int = 32860

const val GL_TEXTURE_GREEN_SIZE: Int = 32861

const val GL_TEXTURE_BLUE_SIZE: Int = 32862

const val GL_TEXTURE_ALPHA_SIZE: Int = 32863

const val GL_DONT_CARE: Int = 4352

const val GL_FASTEST: Int = 4353

const val GL_NICEST: Int = 4354

const val GL_BYTE: Int = 5120

const val GL_UNSIGNED_BYTE: Int = 5121

const val GL_SHORT: Int = 5122

const val GL_UNSIGNED_SHORT: Int = 5123

const val GL_INT: Int = 5124

const val GL_UNSIGNED_INT: Int = 5125

const val GL_FLOAT: Int = 5126

const val GL_DOUBLE: Int = 5130

const val GL_CLEAR: Int = 5376

const val GL_AND: Int = 5377

const val GL_AND_REVERSE: Int = 5378

const val GL_COPY: Int = 5379

const val GL_AND_INVERTED: Int = 5380

const val GL_NOOP: Int = 5381

const val GL_XOR: Int = 5382

const val GL_OR: Int = 5383

const val GL_NOR: Int = 5384

const val GL_EQUIV: Int = 5385

const val GL_INVERT: Int = 5386

const val GL_OR_REVERSE: Int = 5387

const val GL_COPY_INVERTED: Int = 5388

const val GL_OR_INVERTED: Int = 5389

const val GL_NAND: Int = 5390

const val GL_SET: Int = 5391

const val GL_TEXTURE: Int = 5890

const val GL_COLOR: Int = 6144

const val GL_DEPTH: Int = 6145

const val GL_STENCIL: Int = 6146

const val GL_STENCIL_INDEX: Int = 6401

const val GL_DEPTH_COMPONENT: Int = 6402

const val GL_RED: Int = 6403

const val GL_GREEN: Int = 6404

const val GL_BLUE: Int = 6405

const val GL_ALPHA: Int = 6406

const val GL_RGB: Int = 6407

const val GL_RGBA: Int = 6408

const val GL_POINT: Int = 6912

const val GL_LINE: Int = 6913

const val GL_FILL: Int = 6914

const val GL_KEEP: Int = 7680

const val GL_REPLACE: Int = 7681

const val GL_INCR: Int = 7682

const val GL_DECR: Int = 7683

const val GL_VENDOR: Int = 7936

const val GL_RENDERER: Int = 7937

const val GL_VERSION: Int = 7938

const val GL_EXTENSIONS: Int = 7939

const val GL_NEAREST: Int = 9728

const val GL_LINEAR: Int = 9729

const val GL_NEAREST_MIPMAP_NEAREST: Int = 9984

const val GL_LINEAR_MIPMAP_NEAREST: Int = 9985

const val GL_NEAREST_MIPMAP_LINEAR: Int = 9986

const val GL_LINEAR_MIPMAP_LINEAR: Int = 9987

const val GL_TEXTURE_MAG_FILTER: Int = 10240

const val GL_TEXTURE_MIN_FILTER: Int = 10241

const val GL_TEXTURE_WRAP_S: Int = 10242

const val GL_TEXTURE_WRAP_T: Int = 10243

const val GL_PROXY_TEXTURE_1D: Int = 32867

const val GL_PROXY_TEXTURE_2D: Int = 32868

const val GL_REPEAT: Int = 10497

const val GL_R3_G3_B2: Int = 10768

const val GL_RGB4: Int = 32847

const val GL_RGB5: Int = 32848

const val GL_RGB8: Int = 32849

const val GL_RGB10: Int = 32850

const val GL_RGB12: Int = 32851

const val GL_RGB16: Int = 32852

const val GL_RGBA2: Int = 32853

const val GL_RGBA4: Int = 32854

const val GL_RGB5_A1: Int = 32855

const val GL_RGBA8: Int = 32856

const val GL_RGB10_A2: Int = 32857

const val GL_RGBA12: Int = 32858

const val GL_RGBA16: Int = 32859

const val GL_UNSIGNED_BYTE_3_3_2: Int = 32818

const val GL_UNSIGNED_SHORT_4_4_4_4: Int = 32819

const val GL_UNSIGNED_SHORT_5_5_5_1: Int = 32820

const val GL_UNSIGNED_INT_8_8_8_8: Int = 32821

const val GL_UNSIGNED_INT_10_10_10_2: Int = 32822

const val GL_TEXTURE_BINDING_3D: Int = 32874

const val GL_PACK_SKIP_IMAGES: Int = 32875

const val GL_PACK_IMAGE_HEIGHT: Int = 32876

const val GL_UNPACK_SKIP_IMAGES: Int = 32877

const val GL_UNPACK_IMAGE_HEIGHT: Int = 32878

const val GL_TEXTURE_3D: Int = 32879

const val GL_PROXY_TEXTURE_3D: Int = 32880

const val GL_TEXTURE_DEPTH: Int = 32881

const val GL_TEXTURE_WRAP_R: Int = 32882

const val GL_MAX_3D_TEXTURE_SIZE: Int = 32883

const val GL_UNSIGNED_BYTE_2_3_3_REV: Int = 33634

const val GL_UNSIGNED_SHORT_5_6_5: Int = 33635

const val GL_UNSIGNED_SHORT_5_6_5_REV: Int = 33636

const val GL_UNSIGNED_SHORT_4_4_4_4_REV: Int = 33637

const val GL_UNSIGNED_SHORT_1_5_5_5_REV: Int = 33638

const val GL_UNSIGNED_INT_8_8_8_8_REV: Int = 33639

const val GL_UNSIGNED_INT_2_10_10_10_REV: Int = 33640

const val GL_BGR: Int = 32992

const val GL_BGRA: Int = 32993

const val GL_MAX_ELEMENTS_VERTICES: Int = 33000

const val GL_MAX_ELEMENTS_INDICES: Int = 33001

const val GL_CLAMP_TO_EDGE: Int = 33071

const val GL_TEXTURE_MIN_LOD: Int = 33082

const val GL_TEXTURE_MAX_LOD: Int = 33083

const val GL_TEXTURE_BASE_LEVEL: Int = 33084

const val GL_TEXTURE_MAX_LEVEL: Int = 33085

const val GL_SMOOTH_POINT_SIZE_RANGE: Int = 2834

const val GL_SMOOTH_POINT_SIZE_GRANULARITY: Int = 2835

const val GL_SMOOTH_LINE_WIDTH_RANGE: Int = 2850

const val GL_SMOOTH_LINE_WIDTH_GRANULARITY: Int = 2851

const val GL_ALIASED_LINE_WIDTH_RANGE: Int = 33902

const val GL_CONSTANT_COLOR: Int = 32769

const val GL_ONE_MINUS_CONSTANT_COLOR: Int = 32770

const val GL_CONSTANT_ALPHA: Int = 32771

const val GL_ONE_MINUS_CONSTANT_ALPHA: Int = 32772

const val GL_BLEND_COLOR: Int = 32773

const val GL_FUNC_ADD: Int = 32774

const val GL_MIN: Int = 32775

const val GL_MAX: Int = 32776

const val GL_BLEND_EQUATION: Int = 32777

const val GL_FUNC_SUBTRACT: Int = 32778

const val GL_FUNC_REVERSE_SUBTRACT: Int = 32779

const val GL_TEXTURE0: Int = 33984

const val GL_TEXTURE1: Int = 33985

const val GL_TEXTURE2: Int = 33986

const val GL_TEXTURE3: Int = 33987

const val GL_TEXTURE4: Int = 33988

const val GL_TEXTURE5: Int = 33989

const val GL_TEXTURE6: Int = 33990

const val GL_TEXTURE7: Int = 33991

const val GL_TEXTURE8: Int = 33992

const val GL_TEXTURE9: Int = 33993

const val GL_TEXTURE10: Int = 33994

const val GL_TEXTURE11: Int = 33995

const val GL_TEXTURE12: Int = 33996

const val GL_TEXTURE13: Int = 33997

const val GL_TEXTURE14: Int = 33998

const val GL_TEXTURE15: Int = 33999

const val GL_TEXTURE16: Int = 34000

const val GL_TEXTURE17: Int = 34001

const val GL_TEXTURE18: Int = 34002

const val GL_TEXTURE19: Int = 34003

const val GL_TEXTURE20: Int = 34004

const val GL_TEXTURE21: Int = 34005

const val GL_TEXTURE22: Int = 34006

const val GL_TEXTURE23: Int = 34007

const val GL_TEXTURE24: Int = 34008

const val GL_TEXTURE25: Int = 34009

const val GL_TEXTURE26: Int = 34010

const val GL_TEXTURE27: Int = 34011

const val GL_TEXTURE28: Int = 34012

const val GL_TEXTURE29: Int = 34013

const val GL_TEXTURE30: Int = 34014

const val GL_TEXTURE31: Int = 34015

const val GL_ACTIVE_TEXTURE: Int = 34016

const val GL_MULTISAMPLE: Int = 32925

const val GL_SAMPLE_ALPHA_TO_COVERAGE: Int = 32926

const val GL_SAMPLE_ALPHA_TO_ONE: Int = 32927

const val GL_SAMPLE_COVERAGE: Int = 32928

const val GL_SAMPLE_BUFFERS: Int = 32936

const val GL_SAMPLES: Int = 32937

const val GL_SAMPLE_COVERAGE_VALUE: Int = 32938

const val GL_SAMPLE_COVERAGE_INVERT: Int = 32939

const val GL_TEXTURE_CUBE_MAP: Int = 34067

const val GL_TEXTURE_BINDING_CUBE_MAP: Int = 34068

const val GL_TEXTURE_CUBE_MAP_POSITIVE_X: Int = 34069

const val GL_TEXTURE_CUBE_MAP_NEGATIVE_X: Int = 34070

const val GL_TEXTURE_CUBE_MAP_POSITIVE_Y: Int = 34071

const val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y: Int = 34072

const val GL_TEXTURE_CUBE_MAP_POSITIVE_Z: Int = 34073

const val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z: Int = 34074

const val GL_PROXY_TEXTURE_CUBE_MAP: Int = 34075

const val GL_MAX_CUBE_MAP_TEXTURE_SIZE: Int = 34076

const val GL_COMPRESSED_RGB: Int = 34029

const val GL_COMPRESSED_RGBA: Int = 34030

const val GL_TEXTURE_COMPRESSION_HINT: Int = 34031

const val GL_TEXTURE_COMPRESSED_IMAGE_SIZE: Int = 34464

const val GL_TEXTURE_COMPRESSED: Int = 34465

const val GL_NUM_COMPRESSED_TEXTURE_FORMATS: Int = 34466

const val GL_COMPRESSED_TEXTURE_FORMATS: Int = 34467

const val GL_CLAMP_TO_BORDER: Int = 33069

const val GL_BLEND_DST_RGB: Int = 32968

const val GL_BLEND_SRC_RGB: Int = 32969

const val GL_BLEND_DST_ALPHA: Int = 32970

const val GL_BLEND_SRC_ALPHA: Int = 32971

const val GL_POINT_FADE_THRESHOLD_SIZE: Int = 33064

const val GL_DEPTH_COMPONENT16: Int = 33189

const val GL_DEPTH_COMPONENT24: Int = 33190

const val GL_DEPTH_COMPONENT32: Int = 33191

const val GL_MIRRORED_REPEAT: Int = 33648

const val GL_MAX_TEXTURE_LOD_BIAS: Int = 34045

const val GL_TEXTURE_LOD_BIAS: Int = 34049

const val GL_INCR_WRAP: Int = 34055

const val GL_DECR_WRAP: Int = 34056

const val GL_TEXTURE_DEPTH_SIZE: Int = 34890

const val GL_TEXTURE_COMPARE_MODE: Int = 34892

const val GL_TEXTURE_COMPARE_FUNC: Int = 34893

const val GL_BUFFER_SIZE: Int = 34660

const val GL_BUFFER_USAGE: Int = 34661

const val GL_QUERY_COUNTER_BITS: Int = 34916

const val GL_CURRENT_QUERY: Int = 34917

const val GL_QUERY_RESULT: Int = 34918

const val GL_QUERY_RESULT_AVAILABLE: Int = 34919

const val GL_ARRAY_BUFFER: Int = 34962

const val GL_ELEMENT_ARRAY_BUFFER: Int = 34963

const val GL_ARRAY_BUFFER_BINDING: Int = 34964

const val GL_ELEMENT_ARRAY_BUFFER_BINDING: Int = 34965

const val GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int = 34975

const val GL_READ_ONLY: Int = 35000

const val GL_WRITE_ONLY: Int = 35001

const val GL_READ_WRITE: Int = 35002

const val GL_BUFFER_ACCESS: Int = 35003

const val GL_BUFFER_MAPPED: Int = 35004

const val GL_BUFFER_MAP_POINTER: Int = 35005

const val GL_STREAM_DRAW: Int = 35040

const val GL_STREAM_READ: Int = 35041

const val GL_STREAM_COPY: Int = 35042

const val GL_STATIC_DRAW: Int = 35044

const val GL_STATIC_READ: Int = 35045

const val GL_STATIC_COPY: Int = 35046

const val GL_DYNAMIC_DRAW: Int = 35048

const val GL_DYNAMIC_READ: Int = 35049

const val GL_DYNAMIC_COPY: Int = 35050

const val GL_SAMPLES_PASSED: Int = 35092

const val GL_BLEND_EQUATION_RGB: Int = 32777

const val GL_VERTEX_ATTRIB_ARRAY_ENABLED: Int = 34338

const val GL_VERTEX_ATTRIB_ARRAY_SIZE: Int = 34339

const val GL_VERTEX_ATTRIB_ARRAY_STRIDE: Int = 34340

const val GL_VERTEX_ATTRIB_ARRAY_TYPE: Int = 34341

const val GL_CURRENT_VERTEX_ATTRIB: Int = 34342

const val GL_VERTEX_PROGRAM_POINT_SIZE: Int = 34370

const val GL_VERTEX_ATTRIB_ARRAY_POINTER: Int = 34373

const val GL_STENCIL_BACK_FUNC: Int = 34816

const val GL_STENCIL_BACK_FAIL: Int = 34817

const val GL_STENCIL_BACK_PASS_DEPTH_FAIL: Int = 34818

const val GL_STENCIL_BACK_PASS_DEPTH_PASS: Int = 34819

const val GL_MAX_DRAW_BUFFERS: Int = 34852

const val GL_DRAW_BUFFER0: Int = 34853

const val GL_DRAW_BUFFER1: Int = 34854

const val GL_DRAW_BUFFER2: Int = 34855

const val GL_DRAW_BUFFER3: Int = 34856

const val GL_DRAW_BUFFER4: Int = 34857

const val GL_DRAW_BUFFER5: Int = 34858

const val GL_DRAW_BUFFER6: Int = 34859

const val GL_DRAW_BUFFER7: Int = 34860

const val GL_DRAW_BUFFER8: Int = 34861

const val GL_DRAW_BUFFER9: Int = 34862

const val GL_DRAW_BUFFER10: Int = 34863

const val GL_DRAW_BUFFER11: Int = 34864

const val GL_DRAW_BUFFER12: Int = 34865

const val GL_DRAW_BUFFER13: Int = 34866

const val GL_DRAW_BUFFER14: Int = 34867

const val GL_DRAW_BUFFER15: Int = 34868

const val GL_BLEND_EQUATION_ALPHA: Int = 34877

const val GL_MAX_VERTEX_ATTRIBS: Int = 34921

const val GL_VERTEX_ATTRIB_ARRAY_NORMALIZED: Int = 34922

const val GL_MAX_TEXTURE_IMAGE_UNITS: Int = 34930

const val GL_FRAGMENT_SHADER: Int = 35632

const val GL_VERTEX_SHADER: Int = 35633

const val GL_MAX_FRAGMENT_UNIFORM_COMPONENTS: Int = 35657

const val GL_MAX_VERTEX_UNIFORM_COMPONENTS: Int = 35658

const val GL_MAX_VARYING_FLOATS: Int = 35659

const val GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int = 35660

const val GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int = 35661

const val GL_SHADER_TYPE: Int = 35663

const val GL_FLOAT_VEC2: Int = 35664

const val GL_FLOAT_VEC3: Int = 35665

const val GL_FLOAT_VEC4: Int = 35666

const val GL_INT_VEC2: Int = 35667

const val GL_INT_VEC3: Int = 35668

const val GL_INT_VEC4: Int = 35669

const val GL_BOOL: Int = 35670

const val GL_BOOL_VEC2: Int = 35671

const val GL_BOOL_VEC3: Int = 35672

const val GL_BOOL_VEC4: Int = 35673

const val GL_FLOAT_MAT2: Int = 35674

const val GL_FLOAT_MAT3: Int = 35675

const val GL_FLOAT_MAT4: Int = 35676

const val GL_SAMPLER_1D: Int = 35677

const val GL_SAMPLER_2D: Int = 35678

const val GL_SAMPLER_3D: Int = 35679

const val GL_SAMPLER_CUBE: Int = 35680

const val GL_SAMPLER_1D_SHADOW: Int = 35681

const val GL_SAMPLER_2D_SHADOW: Int = 35682

const val GL_DELETE_STATUS: Int = 35712

const val GL_COMPILE_STATUS: Int = 35713

const val GL_LINK_STATUS: Int = 35714

const val GL_VALIDATE_STATUS: Int = 35715

const val GL_INFO_LOG_LENGTH: Int = 35716

const val GL_ATTACHED_SHADERS: Int = 35717

const val GL_ACTIVE_UNIFORMS: Int = 35718

const val GL_ACTIVE_UNIFORM_MAX_LENGTH: Int = 35719

const val GL_SHADER_SOURCE_LENGTH: Int = 35720

const val GL_ACTIVE_ATTRIBUTES: Int = 35721

const val GL_ACTIVE_ATTRIBUTE_MAX_LENGTH: Int = 35722

const val GL_FRAGMENT_SHADER_DERIVATIVE_HINT: Int = 35723

const val GL_SHADING_LANGUAGE_VERSION: Int = 35724

const val GL_CURRENT_PROGRAM: Int = 35725

const val GL_POINT_SPRITE_COORD_ORIGIN: Int = 36000

const val GL_LOWER_LEFT: Int = 36001

const val GL_UPPER_LEFT: Int = 36002

const val GL_STENCIL_BACK_REF: Int = 36003

const val GL_STENCIL_BACK_VALUE_MASK: Int = 36004

const val GL_STENCIL_BACK_WRITEMASK: Int = 36005

const val GL_PIXEL_PACK_BUFFER: Int = 35051

const val GL_PIXEL_UNPACK_BUFFER: Int = 35052

const val GL_PIXEL_PACK_BUFFER_BINDING: Int = 35053

const val GL_PIXEL_UNPACK_BUFFER_BINDING: Int = 35055

const val GL_FLOAT_MAT2x3: Int = 35685

const val GL_FLOAT_MAT2x4: Int = 35686

const val GL_FLOAT_MAT3x2: Int = 35687

const val GL_FLOAT_MAT3x4: Int = 35688

const val GL_FLOAT_MAT4x2: Int = 35689

const val GL_FLOAT_MAT4x3: Int = 35690

const val GL_SRGB: Int = 35904

const val GL_SRGB8: Int = 35905

const val GL_SRGB_ALPHA: Int = 35906

const val GL_SRGB8_ALPHA8: Int = 35907

const val GL_COMPRESSED_SRGB: Int = 35912

const val GL_COMPRESSED_SRGB_ALPHA: Int = 35913

const val GL_COMPARE_REF_TO_TEXTURE: Int = 34894

const val GL_CLIP_DISTANCE0: Int = 12288

const val GL_CLIP_DISTANCE1: Int = 12289

const val GL_CLIP_DISTANCE2: Int = 12290

const val GL_CLIP_DISTANCE3: Int = 12291

const val GL_CLIP_DISTANCE4: Int = 12292

const val GL_CLIP_DISTANCE5: Int = 12293

const val GL_CLIP_DISTANCE6: Int = 12294

const val GL_CLIP_DISTANCE7: Int = 12295

const val GL_MAX_CLIP_DISTANCES: Int = 3378

const val GL_MAJOR_VERSION: Int = 33307

const val GL_MINOR_VERSION: Int = 33308

const val GL_NUM_EXTENSIONS: Int = 33309

const val GL_CONTEXT_FLAGS: Int = 33310

const val GL_COMPRESSED_RED: Int = 33317

const val GL_COMPRESSED_RG: Int = 33318

const val GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT: Int = 1

const val GL_RGBA32F: Int = 34836

const val GL_RGB32F: Int = 34837

const val GL_RGBA16F: Int = 34842

const val GL_RGB16F: Int = 34843

const val GL_VERTEX_ATTRIB_ARRAY_INTEGER: Int = 35069

const val GL_MAX_ARRAY_TEXTURE_LAYERS: Int = 35071

const val GL_MIN_PROGRAM_TEXEL_OFFSET: Int = 35076

const val GL_MAX_PROGRAM_TEXEL_OFFSET: Int = 35077

const val GL_CLAMP_READ_COLOR: Int = 35100

const val GL_FIXED_ONLY: Int = 35101

const val GL_MAX_VARYING_COMPONENTS: Int = 35659

const val GL_TEXTURE_1D_ARRAY: Int = 35864

const val GL_PROXY_TEXTURE_1D_ARRAY: Int = 35865

const val GL_TEXTURE_2D_ARRAY: Int = 35866

const val GL_PROXY_TEXTURE_2D_ARRAY: Int = 35867

const val GL_TEXTURE_BINDING_1D_ARRAY: Int = 35868

const val GL_TEXTURE_BINDING_2D_ARRAY: Int = 35869

const val GL_R11F_G11F_B10F: Int = 35898

const val GL_UNSIGNED_INT_10F_11F_11F_REV: Int = 35899

const val GL_RGB9_E5: Int = 35901

const val GL_UNSIGNED_INT_5_9_9_9_REV: Int = 35902

const val GL_TEXTURE_SHARED_SIZE: Int = 35903

const val GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH: Int = 35958

const val GL_TRANSFORM_FEEDBACK_BUFFER_MODE: Int = 35967

const val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: Int = 35968

const val GL_TRANSFORM_FEEDBACK_VARYINGS: Int = 35971

const val GL_TRANSFORM_FEEDBACK_BUFFER_START: Int = 35972

const val GL_TRANSFORM_FEEDBACK_BUFFER_SIZE: Int = 35973

const val GL_PRIMITIVES_GENERATED: Int = 35975

const val GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: Int = 35976

const val GL_RASTERIZER_DISCARD: Int = 35977

const val GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: Int = 35978

const val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: Int = 35979

const val GL_INTERLEAVED_ATTRIBS: Int = 35980

const val GL_SEPARATE_ATTRIBS: Int = 35981

const val GL_TRANSFORM_FEEDBACK_BUFFER: Int = 35982

const val GL_TRANSFORM_FEEDBACK_BUFFER_BINDING: Int = 35983

const val GL_RGBA32UI: Int = 36208

const val GL_RGB32UI: Int = 36209

const val GL_RGBA16UI: Int = 36214

const val GL_RGB16UI: Int = 36215

const val GL_RGBA8UI: Int = 36220

const val GL_RGB8UI: Int = 36221

const val GL_RGBA32I: Int = 36226

const val GL_RGB32I: Int = 36227

const val GL_RGBA16I: Int = 36232

const val GL_RGB16I: Int = 36233

const val GL_RGBA8I: Int = 36238

const val GL_RGB8I: Int = 36239

const val GL_RED_INTEGER: Int = 36244

const val GL_GREEN_INTEGER: Int = 36245

const val GL_BLUE_INTEGER: Int = 36246

const val GL_RGB_INTEGER: Int = 36248

const val GL_RGBA_INTEGER: Int = 36249

const val GL_BGR_INTEGER: Int = 36250

const val GL_BGRA_INTEGER: Int = 36251

const val GL_SAMPLER_1D_ARRAY: Int = 36288

const val GL_SAMPLER_2D_ARRAY: Int = 36289

const val GL_SAMPLER_1D_ARRAY_SHADOW: Int = 36291

const val GL_SAMPLER_2D_ARRAY_SHADOW: Int = 36292

const val GL_SAMPLER_CUBE_SHADOW: Int = 36293

const val GL_UNSIGNED_INT_VEC2: Int = 36294

const val GL_UNSIGNED_INT_VEC3: Int = 36295

const val GL_UNSIGNED_INT_VEC4: Int = 36296

const val GL_INT_SAMPLER_1D: Int = 36297

const val GL_INT_SAMPLER_2D: Int = 36298

const val GL_INT_SAMPLER_3D: Int = 36299

const val GL_INT_SAMPLER_CUBE: Int = 36300

const val GL_INT_SAMPLER_1D_ARRAY: Int = 36302

const val GL_INT_SAMPLER_2D_ARRAY: Int = 36303

const val GL_UNSIGNED_INT_SAMPLER_1D: Int = 36305

const val GL_UNSIGNED_INT_SAMPLER_2D: Int = 36306

const val GL_UNSIGNED_INT_SAMPLER_3D: Int = 36307

const val GL_UNSIGNED_INT_SAMPLER_CUBE: Int = 36308

const val GL_UNSIGNED_INT_SAMPLER_1D_ARRAY: Int = 36310

const val GL_UNSIGNED_INT_SAMPLER_2D_ARRAY: Int = 36311

const val GL_QUERY_WAIT: Int = 36371

const val GL_QUERY_NO_WAIT: Int = 36372

const val GL_QUERY_BY_REGION_WAIT: Int = 36373

const val GL_QUERY_BY_REGION_NO_WAIT: Int = 36374

const val GL_BUFFER_ACCESS_FLAGS: Int = 37151

const val GL_BUFFER_MAP_LENGTH: Int = 37152

const val GL_BUFFER_MAP_OFFSET: Int = 37153

const val GL_SAMPLER_2D_RECT: Int = 35683

const val GL_SAMPLER_2D_RECT_SHADOW: Int = 35684

const val GL_SAMPLER_BUFFER: Int = 36290

const val GL_INT_SAMPLER_2D_RECT: Int = 36301

const val GL_INT_SAMPLER_BUFFER: Int = 36304

const val GL_UNSIGNED_INT_SAMPLER_2D_RECT: Int = 36309

const val GL_UNSIGNED_INT_SAMPLER_BUFFER: Int = 36312

const val GL_TEXTURE_BUFFER: Int = 35882

const val GL_MAX_TEXTURE_BUFFER_SIZE: Int = 35883

const val GL_TEXTURE_BINDING_BUFFER: Int = 35884

const val GL_TEXTURE_BUFFER_DATA_STORE_BINDING: Int = 35885

const val GL_TEXTURE_RECTANGLE: Int = 34037

const val GL_TEXTURE_BINDING_RECTANGLE: Int = 34038

const val GL_PROXY_TEXTURE_RECTANGLE: Int = 34039

const val GL_MAX_RECTANGLE_TEXTURE_SIZE: Int = 34040

const val GL_R8_SNORM: Int = 36756

const val GL_RG8_SNORM: Int = 36757

const val GL_RGB8_SNORM: Int = 36758

const val GL_RGBA8_SNORM: Int = 36759

const val GL_R16_SNORM: Int = 36760

const val GL_RG16_SNORM: Int = 36761

const val GL_RGB16_SNORM: Int = 36762

const val GL_RGBA16_SNORM: Int = 36763

const val GL_SIGNED_NORMALIZED: Int = 36764

const val GL_PRIMITIVE_RESTART: Int = 36765

const val GL_PRIMITIVE_RESTART_INDEX: Int = 36766

const val GL_CONTEXT_CORE_PROFILE_BIT: Int = 1

const val GL_CONTEXT_COMPATIBILITY_PROFILE_BIT: Int = 2

const val GL_LINES_ADJACENCY: Int = 10

const val GL_LINE_STRIP_ADJACENCY: Int = 11

const val GL_TRIANGLES_ADJACENCY: Int = 12

const val GL_TRIANGLE_STRIP_ADJACENCY: Int = 13

const val GL_PROGRAM_POINT_SIZE: Int = 34370

const val GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS: Int = 35881

const val GL_FRAMEBUFFER_ATTACHMENT_LAYERED: Int = 36263

const val GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS: Int = 36264

const val GL_GEOMETRY_SHADER: Int = 36313

const val GL_GEOMETRY_VERTICES_OUT: Int = 35094

const val GL_GEOMETRY_INPUT_TYPE: Int = 35095

const val GL_GEOMETRY_OUTPUT_TYPE: Int = 35096

const val GL_MAX_GEOMETRY_UNIFORM_COMPONENTS: Int = 36319

const val GL_MAX_GEOMETRY_OUTPUT_VERTICES: Int = 36320

const val GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS: Int = 36321

const val GL_MAX_VERTEX_OUTPUT_COMPONENTS: Int = 37154

const val GL_MAX_GEOMETRY_INPUT_COMPONENTS: Int = 37155

const val GL_MAX_GEOMETRY_OUTPUT_COMPONENTS: Int = 37156

const val GL_MAX_FRAGMENT_INPUT_COMPONENTS: Int = 37157

const val GL_CONTEXT_PROFILE_MASK: Int = 37158

const val GL_VERTEX_ATTRIB_ARRAY_DIVISOR: Int = 35070

const val GL_SAMPLE_SHADING: Int = 35894

const val GL_MIN_SAMPLE_SHADING_VALUE: Int = 35895

const val GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET: Int = 36446

const val GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET: Int = 36447

const val GL_TEXTURE_CUBE_MAP_ARRAY: Int = 36873

const val GL_TEXTURE_BINDING_CUBE_MAP_ARRAY: Int = 36874

const val GL_PROXY_TEXTURE_CUBE_MAP_ARRAY: Int = 36875

const val GL_SAMPLER_CUBE_MAP_ARRAY: Int = 36876

const val GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW: Int = 36877

const val GL_INT_SAMPLER_CUBE_MAP_ARRAY: Int = 36878

const val GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY: Int = 36879

const val GL_DEPTH_COMPONENT32F: Int = 36012

const val GL_DEPTH32F_STENCIL8: Int = 36013

const val GL_FLOAT_32_UNSIGNED_INT_24_8_REV: Int = 36269

const val GL_INVALID_FRAMEBUFFER_OPERATION: Int = 1286

const val GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: Int = 33296

const val GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: Int = 33297

const val GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE: Int = 33298

const val GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: Int = 33299

const val GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: Int = 33300

const val GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: Int = 33301

const val GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: Int = 33302

const val GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: Int = 33303

const val GL_FRAMEBUFFER_DEFAULT: Int = 33304

const val GL_FRAMEBUFFER_UNDEFINED: Int = 33305

const val GL_DEPTH_STENCIL_ATTACHMENT: Int = 33306

const val GL_MAX_RENDERBUFFER_SIZE: Int = 34024

const val GL_DEPTH_STENCIL: Int = 34041

const val GL_UNSIGNED_INT_24_8: Int = 34042

const val GL_DEPTH24_STENCIL8: Int = 35056

const val GL_TEXTURE_STENCIL_SIZE: Int = 35057

const val GL_TEXTURE_RED_TYPE: Int = 35856

const val GL_TEXTURE_GREEN_TYPE: Int = 35857

const val GL_TEXTURE_BLUE_TYPE: Int = 35858

const val GL_TEXTURE_ALPHA_TYPE: Int = 35859

const val GL_TEXTURE_DEPTH_TYPE: Int = 35862

const val GL_UNSIGNED_NORMALIZED: Int = 35863

const val GL_FRAMEBUFFER_BINDING: Int = 36006

const val GL_DRAW_FRAMEBUFFER_BINDING: Int = 36006

const val GL_RENDERBUFFER_BINDING: Int = 36007

const val GL_READ_FRAMEBUFFER: Int = 36008

const val GL_DRAW_FRAMEBUFFER: Int = 36009

const val GL_READ_FRAMEBUFFER_BINDING: Int = 36010

const val GL_RENDERBUFFER_SAMPLES: Int = 36011

const val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int = 36048

const val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int = 36049

const val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int = 36050

const val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int = 36051

const val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: Int = 36052

const val GL_FRAMEBUFFER_COMPLETE: Int = 36053

const val GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int = 36054

const val GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int = 36055

const val GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER: Int = 36059

const val GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER: Int = 36060

const val GL_FRAMEBUFFER_UNSUPPORTED: Int = 36061

const val GL_MAX_COLOR_ATTACHMENTS: Int = 36063

const val GL_COLOR_ATTACHMENT0: Int = 36064

const val GL_COLOR_ATTACHMENT1: Int = 36065

const val GL_COLOR_ATTACHMENT2: Int = 36066

const val GL_COLOR_ATTACHMENT3: Int = 36067

const val GL_COLOR_ATTACHMENT4: Int = 36068

const val GL_COLOR_ATTACHMENT5: Int = 36069

const val GL_COLOR_ATTACHMENT6: Int = 36070

const val GL_COLOR_ATTACHMENT7: Int = 36071

const val GL_COLOR_ATTACHMENT8: Int = 36072

const val GL_COLOR_ATTACHMENT9: Int = 36073

const val GL_COLOR_ATTACHMENT10: Int = 36074

const val GL_COLOR_ATTACHMENT11: Int = 36075

const val GL_COLOR_ATTACHMENT12: Int = 36076

const val GL_COLOR_ATTACHMENT13: Int = 36077

const val GL_COLOR_ATTACHMENT14: Int = 36078

const val GL_COLOR_ATTACHMENT15: Int = 36079

const val GL_DEPTH_ATTACHMENT: Int = 36096

const val GL_STENCIL_ATTACHMENT: Int = 36128

const val GL_FRAMEBUFFER: Int = 36160

const val GL_RENDERBUFFER: Int = 36161

const val GL_RENDERBUFFER_WIDTH: Int = 36162

const val GL_RENDERBUFFER_HEIGHT: Int = 36163

const val GL_RENDERBUFFER_INTERNAL_FORMAT: Int = 36164

const val GL_STENCIL_INDEX1: Int = 36166

const val GL_STENCIL_INDEX4: Int = 36167

const val GL_STENCIL_INDEX8: Int = 36168

const val GL_STENCIL_INDEX16: Int = 36169

const val GL_RENDERBUFFER_RED_SIZE: Int = 36176

const val GL_RENDERBUFFER_GREEN_SIZE: Int = 36177

const val GL_RENDERBUFFER_BLUE_SIZE: Int = 36178

const val GL_RENDERBUFFER_ALPHA_SIZE: Int = 36179

const val GL_RENDERBUFFER_DEPTH_SIZE: Int = 36180

const val GL_RENDERBUFFER_STENCIL_SIZE: Int = 36181

const val GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: Int = 36182

const val GL_MAX_SAMPLES: Int = 36183

const val GL_FRAMEBUFFER_SRGB: Int = 36281

const val GL_HALF_FLOAT: Int = 5131

const val GL_MAP_READ_BIT: Int = 1

const val GL_MAP_WRITE_BIT: Int = 2

const val GL_MAP_INVALIDATE_RANGE_BIT: Int = 4

const val GL_MAP_INVALIDATE_BUFFER_BIT: Int = 8

const val GL_MAP_FLUSH_EXPLICIT_BIT: Int = 16

const val GL_MAP_UNSYNCHRONIZED_BIT: Int = 32

const val GL_COMPRESSED_RED_RGTC1: Int = 36283

const val GL_COMPRESSED_SIGNED_RED_RGTC1: Int = 36284

const val GL_COMPRESSED_RG_RGTC2: Int = 36285

const val GL_COMPRESSED_SIGNED_RG_RGTC2: Int = 36286

const val GL_RG: Int = 33319

const val GL_RG_INTEGER: Int = 33320

const val GL_R8: Int = 33321

const val GL_R16: Int = 33322

const val GL_RG8: Int = 33323

const val GL_RG16: Int = 33324

const val GL_R16F: Int = 33325

const val GL_R32F: Int = 33326

const val GL_RG16F: Int = 33327

const val GL_RG32F: Int = 33328

const val GL_R8I: Int = 33329

const val GL_R8UI: Int = 33330

const val GL_R16I: Int = 33331

const val GL_R16UI: Int = 33332

const val GL_R32I: Int = 33333

const val GL_R32UI: Int = 33334

const val GL_RG8I: Int = 33335

const val GL_RG8UI: Int = 33336

const val GL_RG16I: Int = 33337

const val GL_RG16UI: Int = 33338

const val GL_RG32I: Int = 33339

const val GL_RG32UI: Int = 33340

const val GL_VERTEX_ARRAY_BINDING: Int = 34229

const val GL_UNIFORM_BUFFER: Int = 35345

const val GL_UNIFORM_BUFFER_BINDING: Int = 35368

const val GL_UNIFORM_BUFFER_START: Int = 35369

const val GL_UNIFORM_BUFFER_SIZE: Int = 35370

const val GL_MAX_VERTEX_UNIFORM_BLOCKS: Int = 35371

const val GL_MAX_GEOMETRY_UNIFORM_BLOCKS: Int = 35372

const val GL_MAX_FRAGMENT_UNIFORM_BLOCKS: Int = 35373

const val GL_MAX_COMBINED_UNIFORM_BLOCKS: Int = 35374

const val GL_MAX_UNIFORM_BUFFER_BINDINGS: Int = 35375

const val GL_MAX_UNIFORM_BLOCK_SIZE: Int = 35376

const val GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: Int = 35377

const val GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS: Int = 35378

const val GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: Int = 35379

const val GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT: Int = 35380

const val GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH: Int = 35381

const val GL_ACTIVE_UNIFORM_BLOCKS: Int = 35382

const val GL_UNIFORM_TYPE: Int = 35383

const val GL_UNIFORM_SIZE: Int = 35384

const val GL_UNIFORM_NAME_LENGTH: Int = 35385

const val GL_UNIFORM_BLOCK_INDEX: Int = 35386

const val GL_UNIFORM_OFFSET: Int = 35387

const val GL_UNIFORM_ARRAY_STRIDE: Int = 35388

const val GL_UNIFORM_MATRIX_STRIDE: Int = 35389

const val GL_UNIFORM_IS_ROW_MAJOR: Int = 35390

const val GL_UNIFORM_BLOCK_BINDING: Int = 35391

const val GL_UNIFORM_BLOCK_DATA_SIZE: Int = 35392

const val GL_UNIFORM_BLOCK_NAME_LENGTH: Int = 35393

const val GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS: Int = 35394

const val GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: Int = 35395

const val GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: Int = 35396

const val GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER: Int = 35397

const val GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: Int = 35398

const val GL_INVALID_INDEX: UInt = 4294967295u

const val GL_COPY_READ_BUFFER: Int = 36662

const val GL_COPY_WRITE_BUFFER: Int = 36663

const val GL_DEPTH_CLAMP: Int = 34383

const val GL_FIRST_VERTEX_CONVENTION: Int = 36429

const val GL_LAST_VERTEX_CONVENTION: Int = 36430

const val GL_PROVOKING_VERTEX: Int = 36431

const val GL_TEXTURE_CUBE_MAP_SEAMLESS: Int = 34895

const val GL_MAX_SERVER_WAIT_TIMEOUT: Int = 37137

const val GL_OBJECT_TYPE: Int = 37138

const val GL_SYNC_CONDITION: Int = 37139

const val GL_SYNC_STATUS: Int = 37140

const val GL_SYNC_FLAGS: Int = 37141

const val GL_SYNC_FENCE: Int = 37142

const val GL_SYNC_GPU_COMMANDS_COMPLETE: Int = 37143

const val GL_UNSIGNALED: Int = 37144

const val GL_SIGNALED: Int = 37145

const val GL_ALREADY_SIGNALED: Int = 37146

const val GL_TIMEOUT_EXPIRED: Int = 37147

const val GL_CONDITION_SATISFIED: Int = 37148

const val GL_WAIT_FAILED: Int = 37149

const val GL_SYNC_FLUSH_COMMANDS_BIT: Int = 1

const val GL_TIMEOUT_IGNORED: ULong = 18446744073709551615u

const val GL_SAMPLE_POSITION: Int = 36432

const val GL_SAMPLE_MASK: Int = 36433

const val GL_SAMPLE_MASK_VALUE: Int = 36434

const val GL_MAX_SAMPLE_MASK_WORDS: Int = 36441

const val GL_TEXTURE_2D_MULTISAMPLE: Int = 37120

const val GL_PROXY_TEXTURE_2D_MULTISAMPLE: Int = 37121

const val GL_TEXTURE_2D_MULTISAMPLE_ARRAY: Int = 37122

const val GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY: Int = 37123

const val GL_TEXTURE_BINDING_2D_MULTISAMPLE: Int = 37124

const val GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY: Int = 37125

const val GL_TEXTURE_SAMPLES: Int = 37126

const val GL_TEXTURE_FIXED_SAMPLE_LOCATIONS: Int = 37127

const val GL_SAMPLER_2D_MULTISAMPLE: Int = 37128

const val GL_INT_SAMPLER_2D_MULTISAMPLE: Int = 37129

const val GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE: Int = 37130

const val GL_SAMPLER_2D_MULTISAMPLE_ARRAY: Int = 37131

const val GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY: Int = 37132

const val GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY: Int = 37133

const val GL_MAX_COLOR_TEXTURE_SAMPLES: Int = 37134

const val GL_MAX_DEPTH_TEXTURE_SAMPLES: Int = 37135

const val GL_MAX_INTEGER_SAMPLES: Int = 37136

const val GL_SRC1_COLOR: Int = 35065

const val GL_SRC1_ALPHA: Int = 34185

const val GL_ONE_MINUS_SRC1_COLOR: Int = 35066

const val GL_ONE_MINUS_SRC1_ALPHA: Int = 35067

const val GL_MAX_DUAL_SOURCE_DRAW_BUFFERS: Int = 35068

const val GL_ANY_SAMPLES_PASSED: Int = 35887

const val GL_SAMPLER_BINDING: Int = 35097

const val GL_RGB10_A2UI: Int = 36975

const val GL_TEXTURE_SWIZZLE_R: Int = 36418

const val GL_TEXTURE_SWIZZLE_G: Int = 36419

const val GL_TEXTURE_SWIZZLE_B: Int = 36420

const val GL_TEXTURE_SWIZZLE_A: Int = 36421

const val GL_TEXTURE_SWIZZLE_RGBA: Int = 36422

const val GL_TIME_ELAPSED: Int = 35007

const val GL_TIMESTAMP: Int = 36392

const val GL_INT_2_10_10_10_REV: Int = 36255

const val GL_DRAW_INDIRECT_BUFFER: Int = 36671

const val GL_DRAW_INDIRECT_BUFFER_BINDING: Int = 36675

const val GL_GEOMETRY_SHADER_INVOCATIONS: Int = 34943

const val GL_MAX_GEOMETRY_SHADER_INVOCATIONS: Int = 36442

const val GL_MIN_FRAGMENT_INTERPOLATION_OFFSET: Int = 36443

const val GL_MAX_FRAGMENT_INTERPOLATION_OFFSET: Int = 36444

const val GL_FRAGMENT_INTERPOLATION_OFFSET_BITS: Int = 36445

const val GL_DOUBLE_VEC2: Int = 36860

const val GL_DOUBLE_VEC3: Int = 36861

const val GL_DOUBLE_VEC4: Int = 36862

const val GL_DOUBLE_MAT2: Int = 36678

const val GL_DOUBLE_MAT3: Int = 36679

const val GL_DOUBLE_MAT4: Int = 36680

const val GL_DOUBLE_MAT2x3: Int = 36681

const val GL_DOUBLE_MAT2x4: Int = 36682

const val GL_DOUBLE_MAT3x2: Int = 36683

const val GL_DOUBLE_MAT3x4: Int = 36684

const val GL_DOUBLE_MAT4x2: Int = 36685

const val GL_DOUBLE_MAT4x3: Int = 36686

const val GL_ACTIVE_SUBROUTINES: Int = 36325

const val GL_ACTIVE_SUBROUTINE_UNIFORMS: Int = 36326

const val GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS: Int = 36423

const val GL_ACTIVE_SUBROUTINE_MAX_LENGTH: Int = 36424

const val GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH: Int = 36425

const val GL_MAX_SUBROUTINES: Int = 36327

const val GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS: Int = 36328

const val GL_NUM_COMPATIBLE_SUBROUTINES: Int = 36426

const val GL_COMPATIBLE_SUBROUTINES: Int = 36427

const val GL_PATCHES: Int = 14

const val GL_PATCH_VERTICES: Int = 36466

const val GL_PATCH_DEFAULT_INNER_LEVEL: Int = 36467

const val GL_PATCH_DEFAULT_OUTER_LEVEL: Int = 36468

const val GL_TESS_CONTROL_OUTPUT_VERTICES: Int = 36469

const val GL_TESS_GEN_MODE: Int = 36470

const val GL_TESS_GEN_SPACING: Int = 36471

const val GL_TESS_GEN_VERTEX_ORDER: Int = 36472

const val GL_TESS_GEN_POINT_MODE: Int = 36473

const val GL_QUADS: Int = 7

const val GL_ISOLINES: Int = 36474

const val GL_FRACTIONAL_ODD: Int = 36475

const val GL_FRACTIONAL_EVEN: Int = 36476

const val GL_MAX_PATCH_VERTICES: Int = 36477

const val GL_MAX_TESS_GEN_LEVEL: Int = 36478

const val GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS: Int = 36479

const val GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS: Int = 36480

const val GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS: Int = 36481

const val GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS: Int = 36482

const val GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS: Int = 36483

const val GL_MAX_TESS_PATCH_COMPONENTS: Int = 36484

const val GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS: Int = 36485

const val GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS: Int = 36486

const val GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS: Int = 36489

const val GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS: Int = 36490

const val GL_MAX_TESS_CONTROL_INPUT_COMPONENTS: Int = 34924

const val GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS: Int = 34925

const val GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS: Int = 36382

const val GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS: Int = 36383

const val GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER: Int = 34032

const val GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER: Int = 34033

const val GL_TESS_EVALUATION_SHADER: Int = 36487

const val GL_TESS_CONTROL_SHADER: Int = 36488

const val GL_TRANSFORM_FEEDBACK: Int = 36386

const val GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED: Int = 36387

const val GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE: Int = 36388

const val GL_TRANSFORM_FEEDBACK_BINDING: Int = 36389

const val GL_MAX_TRANSFORM_FEEDBACK_BUFFERS: Int = 36464

const val GL_MAX_VERTEX_STREAMS: Int = 36465

const val GL_FIXED: Int = 5132

const val GL_IMPLEMENTATION_COLOR_READ_TYPE: Int = 35738

const val GL_IMPLEMENTATION_COLOR_READ_FORMAT: Int = 35739

const val GL_LOW_FLOAT: Int = 36336

const val GL_MEDIUM_FLOAT: Int = 36337

const val GL_HIGH_FLOAT: Int = 36338

const val GL_LOW_INT: Int = 36339

const val GL_MEDIUM_INT: Int = 36340

const val GL_HIGH_INT: Int = 36341

const val GL_SHADER_COMPILER: Int = 36346

const val GL_SHADER_BINARY_FORMATS: Int = 36344

const val GL_NUM_SHADER_BINARY_FORMATS: Int = 36345

const val GL_MAX_VERTEX_UNIFORM_VECTORS: Int = 36347

const val GL_MAX_VARYING_VECTORS: Int = 36348

const val GL_MAX_FRAGMENT_UNIFORM_VECTORS: Int = 36349

const val GL_RGB565: Int = 36194

const val GL_PROGRAM_BINARY_RETRIEVABLE_HINT: Int = 33367

const val GL_PROGRAM_BINARY_LENGTH: Int = 34625

const val GL_NUM_PROGRAM_BINARY_FORMATS: Int = 34814

const val GL_PROGRAM_BINARY_FORMATS: Int = 34815

const val GL_VERTEX_SHADER_BIT: Int = 1

const val GL_FRAGMENT_SHADER_BIT: Int = 2

const val GL_GEOMETRY_SHADER_BIT: Int = 4

const val GL_TESS_CONTROL_SHADER_BIT: Int = 8

const val GL_TESS_EVALUATION_SHADER_BIT: Int = 16

const val GL_ALL_SHADER_BITS: UInt = 4294967295u

const val GL_PROGRAM_SEPARABLE: Int = 33368

const val GL_ACTIVE_PROGRAM: Int = 33369

const val GL_PROGRAM_PIPELINE_BINDING: Int = 33370

const val GL_MAX_VIEWPORTS: Int = 33371

const val GL_VIEWPORT_SUBPIXEL_BITS: Int = 33372

const val GL_VIEWPORT_BOUNDS_RANGE: Int = 33373

const val GL_LAYER_PROVOKING_VERTEX: Int = 33374

const val GL_VIEWPORT_INDEX_PROVOKING_VERTEX: Int = 33375

const val GL_UNDEFINED_VERTEX: Int = 33376

const val GL_VERSION_1_0: Int = 1

const val GL_VERSION_1_1: Int = 1

const val GL_VERSION_1_2: Int = 1

const val GL_VERSION_1_3: Int = 1

const val GL_VERSION_1_4: Int = 1

const val GL_VERSION_1_5: Int = 1

const val GL_VERSION_2_0: Int = 1

const val GL_VERSION_2_1: Int = 1

const val GL_VERSION_3_0: Int = 1

const val GL_VERSION_3_1: Int = 1

const val GL_VERSION_3_2: Int = 1

const val GL_VERSION_3_3: Int = 1

const val GL_VERSION_4_0: Int = 1

const val GL_VERSION_4_1: Int = 1

const val GL_ARB_depth_buffer_float: Int = 1

const val GL_ARB_framebuffer_object: Int = 1

const val GL_ARB_framebuffer_sRGB: Int = 1

const val GL_ARB_half_float_vertex: Int = 1

const val GL_ARB_map_buffer_range: Int = 1

const val GL_ARB_texture_compression_rgtc: Int = 1

const val GL_ARB_texture_rg: Int = 1

const val GL_ARB_vertex_array_object: Int = 1

const val GL_ARB_uniform_buffer_object: Int = 1

const val GL_ARB_copy_buffer: Int = 1

const val GL_ARB_depth_clamp: Int = 1

const val GL_ARB_draw_elements_base_vertex: Int = 1

const val GL_ARB_fragment_coord_conventions: Int = 1

const val GL_ARB_provoking_vertex: Int = 1

const val GL_ARB_seamless_cube_map: Int = 1

const val GL_ARB_sync: Int = 1

const val GL_ARB_texture_multisample: Int = 1

const val GL_ARB_vertex_array_bgra: Int = 1

const val GL_ARB_texture_query_lod: Int = 1

const val GL_ARB_blend_func_extended: Int = 1

const val GL_ARB_explicit_attrib_location: Int = 1

const val GL_ARB_occlusion_query2: Int = 1

const val GL_ARB_sampler_objects: Int = 1

const val GL_ARB_shader_bit_encoding: Int = 1

const val GL_ARB_texture_rgb10_a2ui: Int = 1

const val GL_ARB_texture_swizzle: Int = 1

const val GL_ARB_timer_query: Int = 1

const val GL_ARB_vertex_type_2_10_10_10_rev: Int = 1

const val GL_ARB_draw_indirect: Int = 1

const val GL_ARB_gpu_shader5: Int = 1

const val GL_ARB_gpu_shader_fp64: Int = 1

const val GL_ARB_shader_subroutine: Int = 1

const val GL_ARB_tessellation_shader: Int = 1

const val GL_ARB_texture_buffer_object_rgb32: Int = 1

const val GL_ARB_transform_feedback2: Int = 1

const val GL_ARB_transform_feedback3: Int = 1

const val GL_ARB_ES2_compatibility: Int = 1

const val GL_ARB_get_program_binary: Int = 1

const val GL_ARB_separate_shader_objects: Int = 1

const val GL_ARB_shader_precision: Int = 1

const val GL_ARB_vertex_attrib_64bit: Int = 1

const val GL_ARB_viewport_array: Int = 1

const val GL_VERTEX_ATTRIB_ARRAY_DIVISOR_ARB: Int = 35070

const val GL_NUM_SAMPLE_COUNTS: Int = 37760

const val GL_SAMPLE_SHADING_ARB: Int = 35894

const val GL_MIN_SAMPLE_SHADING_VALUE_ARB: Int = 35895

const val GL_SHADER_INCLUDE_ARB: Int = 36270

const val GL_NAMED_STRING_LENGTH_ARB: Int = 36329

const val GL_NAMED_STRING_TYPE_ARB: Int = 36330

const val GL_TEXTURE_CUBE_MAP_ARRAY_ARB: Int = 36873

const val GL_TEXTURE_BINDING_CUBE_MAP_ARRAY_ARB: Int = 36874

const val GL_PROXY_TEXTURE_CUBE_MAP_ARRAY_ARB: Int = 36875

const val GL_SAMPLER_CUBE_MAP_ARRAY_ARB: Int = 36876

const val GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW_ARB: Int = 36877

const val GL_INT_SAMPLER_CUBE_MAP_ARRAY_ARB: Int = 36878

const val GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_ARB: Int = 36879

const val GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_ARB: Int = 36446

const val GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_ARB: Int = 36447

const val GL_MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS_ARB: Int = 36767

const val GL_TEXTURE_IMMUTABLE_FORMAT: Int = 37167

const val GL_BUFFER_OBJECT_EXT: Int = 37201

const val GL_SHADER_OBJECT_EXT: Int = 35656

const val GL_PROGRAM_OBJECT_EXT: Int = 35648

const val GL_VERTEX_ARRAY_OBJECT_EXT: Int = 37204

const val GL_QUERY_OBJECT_EXT: Int = 37203

const val GL_PROGRAM_PIPELINE_OBJECT_EXT: Int = 35407

const val GL_SYNC_OBJECT_APPLE: Int = 35411

const val GL_SAMPLER: Int = 33510

const val GL_DEPTH_BOUNDS_TEST_EXT: Int = 34960

const val GL_DEPTH_BOUNDS_EXT: Int = 34961

const val GL_SCALED_RESOLVE_FASTEST_EXT: Int = 37050

const val GL_SCALED_RESOLVE_NICEST_EXT: Int = 37051

const val GL_COMPRESSED_RGB_S3TC_DXT1_EXT: Int = 33776

const val GL_COMPRESSED_RGBA_S3TC_DXT1_EXT: Int = 33777

const val GL_COMPRESSED_RGBA_S3TC_DXT3_EXT: Int = 33778

const val GL_COMPRESSED_RGBA_S3TC_DXT5_EXT: Int = 33779

const val GL_COMPRESSED_SRGB_S3TC_DXT1_EXT: Int = 35916

const val GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT: Int = 35917

const val GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT: Int = 35918

const val GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT: Int = 35919

const val GL_TEXTURE_MAX_ANISOTROPY_EXT: Int = 34046

const val GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT: Int = 34047

const val GL_MIRROR_CLAMP_EXT: Int = 34626

const val GL_MIRROR_CLAMP_TO_EDGE_EXT: Int = 34627

const val GL_MIRROR_CLAMP_TO_BORDER_EXT: Int = 35090

const val GL_TEXTURE_SRGB_DECODE_EXT: Int = 35400

const val GL_DECODE_EXT: Int = 35401

const val GL_SKIP_DECODE_EXT: Int = 35402

const val GL_UNPACK_CLIENT_STORAGE_APPLE: Int = 34226

const val GL_RELEASED_APPLE: Int = 35353

const val GL_VOLATILE_APPLE: Int = 35354

const val GL_RETAINED_APPLE: Int = 35355

const val GL_UNDEFINED_APPLE: Int = 35356

const val GL_PURGEABLE_APPLE: Int = 35357

const val GL_RGB_422_APPLE: Int = 35359

const val GL_UNSIGNED_SHORT_8_8_APPLE: Int = 34234

const val GL_UNSIGNED_SHORT_8_8_REV_APPLE: Int = 34235

const val GL_RGB_RAW_422_APPLE: Int = 35409

const val GL_PACK_ROW_BYTES_APPLE: Int = 35349

const val GL_UNPACK_ROW_BYTES_APPLE: Int = 35350

const val GL_PACK_IMAGE_BYTES_APPLE: Int = 35351

const val GL_UNPACK_IMAGE_BYTES_APPLE: Int = 35352

const val GL_TEXTURE_RANGE_LENGTH_APPLE: Int = 34231

const val GL_TEXTURE_RANGE_POINTER_APPLE: Int = 34232

const val GL_TEXTURE_STORAGE_HINT_APPLE: Int = 34236

const val GL_TEXTURE_MINIMIZE_STORAGE_APPLE: Int = 34230

const val GL_STORAGE_PRIVATE_APPLE: Int = 34237

const val GL_STORAGE_CACHED_APPLE: Int = 34238

const val GL_STORAGE_SHARED_APPLE: Int = 34239

const val GL_MIRROR_CLAMP_ATI: Int = 34626

const val GL_MIRROR_CLAMP_TO_EDGE_ATI: Int = 34627

const val GL_ARB_draw_buffers_blend: Int = 1

const val GL_ARB_instanced_arrays: Int = 1

const val GL_ARB_internalformat_query: Int = 1

const val GL_ARB_sample_shading: Int = 1

const val GL_ARB_shading_language_include: Int = 1

const val GL_ARB_texture_cube_map_array: Int = 1

const val GL_ARB_texture_gather: Int = 1

const val GL_ARB_texture_storage: Int = 1

const val GL_EXT_debug_label: Int = 1

const val GL_EXT_debug_marker: Int = 1

const val GL_EXT_depth_bounds_test: Int = 1

const val GL_EXT_framebuffer_multisample_blit_scaled: Int = 1

const val GL_EXT_texture_compression_s3tc: Int = 1

const val GL_EXT_texture_filter_anisotropic: Int = 1

const val GL_EXT_texture_mirror_clamp: Int = 1

const val GL_EXT_texture_sRGB_decode: Int = 1

const val GL_APPLE_client_storage: Int = 1

const val GL_APPLE_container_object_shareable: Int = 1

const val GL_APPLE_flush_render: Int = 1

const val GL_APPLE_object_purgeable: Int = 1

const val GL_APPLE_rgb_422: Int = 1

const val GL_APPLE_row_bytes: Int = 1

const val GL_APPLE_texture_range: Int = 1

const val GL_ATI_texture_mirror_once: Int = 1

const val GL_NV_texture_barrier: Int = 1

const val GLU_EXT_object_space_tess: Int = 1

const val GLU_EXT_nurbs_tessellator: Int = 1

const val GLU_FALSE: Int = 0

const val GLU_TRUE: Int = 1

const val GLU_VERSION_1_1: Int = 1

const val GLU_VERSION_1_2: Int = 1

const val GLU_VERSION_1_3: Int = 1

const val GLU_VERSION: Int = 100800

const val GLU_EXTENSIONS: Int = 100801

const val GLU_INVALID_ENUM: Int = 100900

const val GLU_INVALID_VALUE: Int = 100901

const val GLU_OUT_OF_MEMORY: Int = 100902

const val GLU_INCOMPATIBLE_GL_VERSION: Int = 100903

const val GLU_INVALID_OPERATION: Int = 100904

const val GLU_OUTLINE_POLYGON: Int = 100240

const val GLU_OUTLINE_PATCH: Int = 100241

const val GLU_NURBS_ERROR: Int = 100103

const val GLU_ERROR: Int = 100103

const val GLU_NURBS_BEGIN: Int = 100164

const val GLU_NURBS_BEGIN_EXT: Int = 100164

const val GLU_NURBS_VERTEX: Int = 100165

const val GLU_NURBS_VERTEX_EXT: Int = 100165

const val GLU_NURBS_NORMAL: Int = 100166

const val GLU_NURBS_NORMAL_EXT: Int = 100166

const val GLU_NURBS_COLOR: Int = 100167

const val GLU_NURBS_COLOR_EXT: Int = 100167

const val GLU_NURBS_TEXTURE_COORD: Int = 100168

const val GLU_NURBS_TEX_COORD_EXT: Int = 100168

const val GLU_NURBS_END: Int = 100169

const val GLU_NURBS_END_EXT: Int = 100169

const val GLU_NURBS_BEGIN_DATA: Int = 100170

const val GLU_NURBS_BEGIN_DATA_EXT: Int = 100170

const val GLU_NURBS_VERTEX_DATA: Int = 100171

const val GLU_NURBS_VERTEX_DATA_EXT: Int = 100171

const val GLU_NURBS_NORMAL_DATA: Int = 100172

const val GLU_NURBS_NORMAL_DATA_EXT: Int = 100172

const val GLU_NURBS_COLOR_DATA: Int = 100173

const val GLU_NURBS_COLOR_DATA_EXT: Int = 100173

const val GLU_NURBS_TEXTURE_COORD_DATA: Int = 100174

const val GLU_NURBS_TEX_COORD_DATA_EXT: Int = 100174

const val GLU_NURBS_END_DATA: Int = 100175

const val GLU_NURBS_END_DATA_EXT: Int = 100175

const val GLU_NURBS_ERROR1: Int = 100251

const val GLU_NURBS_ERROR2: Int = 100252

const val GLU_NURBS_ERROR3: Int = 100253

const val GLU_NURBS_ERROR4: Int = 100254

const val GLU_NURBS_ERROR5: Int = 100255

const val GLU_NURBS_ERROR6: Int = 100256

const val GLU_NURBS_ERROR7: Int = 100257

const val GLU_NURBS_ERROR8: Int = 100258

const val GLU_NURBS_ERROR9: Int = 100259

const val GLU_NURBS_ERROR10: Int = 100260

const val GLU_NURBS_ERROR11: Int = 100261

const val GLU_NURBS_ERROR12: Int = 100262

const val GLU_NURBS_ERROR13: Int = 100263

const val GLU_NURBS_ERROR14: Int = 100264

const val GLU_NURBS_ERROR15: Int = 100265

const val GLU_NURBS_ERROR16: Int = 100266

const val GLU_NURBS_ERROR17: Int = 100267

const val GLU_NURBS_ERROR18: Int = 100268

const val GLU_NURBS_ERROR19: Int = 100269

const val GLU_NURBS_ERROR20: Int = 100270

const val GLU_NURBS_ERROR21: Int = 100271

const val GLU_NURBS_ERROR22: Int = 100272

const val GLU_NURBS_ERROR23: Int = 100273

const val GLU_NURBS_ERROR24: Int = 100274

const val GLU_NURBS_ERROR25: Int = 100275

const val GLU_NURBS_ERROR26: Int = 100276

const val GLU_NURBS_ERROR27: Int = 100277

const val GLU_NURBS_ERROR28: Int = 100278

const val GLU_NURBS_ERROR29: Int = 100279

const val GLU_NURBS_ERROR30: Int = 100280

const val GLU_NURBS_ERROR31: Int = 100281

const val GLU_NURBS_ERROR32: Int = 100282

const val GLU_NURBS_ERROR33: Int = 100283

const val GLU_NURBS_ERROR34: Int = 100284

const val GLU_NURBS_ERROR35: Int = 100285

const val GLU_NURBS_ERROR36: Int = 100286

const val GLU_NURBS_ERROR37: Int = 100287

const val GLU_AUTO_LOAD_MATRIX: Int = 100200

const val GLU_CULLING: Int = 100201

const val GLU_SAMPLING_TOLERANCE: Int = 100203

const val GLU_DISPLAY_MODE: Int = 100204

const val GLU_PARAMETRIC_TOLERANCE: Int = 100202

const val GLU_SAMPLING_METHOD: Int = 100205

const val GLU_U_STEP: Int = 100206

const val GLU_V_STEP: Int = 100207

const val GLU_NURBS_MODE: Int = 100160

const val GLU_NURBS_MODE_EXT: Int = 100160

const val GLU_NURBS_TESSELLATOR: Int = 100161

const val GLU_NURBS_TESSELLATOR_EXT: Int = 100161

const val GLU_NURBS_RENDERER: Int = 100162

const val GLU_NURBS_RENDERER_EXT: Int = 100162

const val GLU_OBJECT_PARAMETRIC_ERROR: Int = 100208

const val GLU_OBJECT_PARAMETRIC_ERROR_EXT: Int = 100208

const val GLU_OBJECT_PATH_LENGTH: Int = 100209

const val GLU_OBJECT_PATH_LENGTH_EXT: Int = 100209

const val GLU_PATH_LENGTH: Int = 100215

const val GLU_PARAMETRIC_ERROR: Int = 100216

const val GLU_DOMAIN_DISTANCE: Int = 100217

const val GLU_MAP1_TRIM_2: Int = 100210

const val GLU_MAP1_TRIM_3: Int = 100211

const val GLU_POINT: Int = 100010

const val GLU_LINE: Int = 100011

const val GLU_FILL: Int = 100012

const val GLU_SILHOUETTE: Int = 100013

const val GLU_SMOOTH: Int = 100000

const val GLU_FLAT: Int = 100001

const val GLU_NONE: Int = 100002

const val GLU_OUTSIDE: Int = 100020

const val GLU_INSIDE: Int = 100021

const val GLU_TESS_BEGIN: Int = 100100

const val GLU_BEGIN: Int = 100100

const val GLU_TESS_VERTEX: Int = 100101

const val GLU_VERTEX: Int = 100101

const val GLU_TESS_END: Int = 100102

const val GLU_END: Int = 100102

const val GLU_TESS_ERROR: Int = 100103

const val GLU_TESS_EDGE_FLAG: Int = 100104

const val GLU_EDGE_FLAG: Int = 100104

const val GLU_TESS_COMBINE: Int = 100105

const val GLU_TESS_BEGIN_DATA: Int = 100106

const val GLU_TESS_VERTEX_DATA: Int = 100107

const val GLU_TESS_END_DATA: Int = 100108

const val GLU_TESS_ERROR_DATA: Int = 100109

const val GLU_TESS_EDGE_FLAG_DATA: Int = 100110

const val GLU_TESS_COMBINE_DATA: Int = 100111

const val GLU_CW: Int = 100120

const val GLU_CCW: Int = 100121

const val GLU_INTERIOR: Int = 100122

const val GLU_EXTERIOR: Int = 100123

const val GLU_UNKNOWN: Int = 100124

const val GLU_TESS_WINDING_RULE: Int = 100140

const val GLU_TESS_BOUNDARY_ONLY: Int = 100141

const val GLU_TESS_TOLERANCE: Int = 100142

const val GLU_TESS_ERROR1: Int = 100151

const val GLU_TESS_ERROR2: Int = 100152

const val GLU_TESS_ERROR3: Int = 100153

const val GLU_TESS_ERROR4: Int = 100154

const val GLU_TESS_ERROR5: Int = 100155

const val GLU_TESS_ERROR6: Int = 100156

const val GLU_TESS_ERROR7: Int = 100157

const val GLU_TESS_ERROR8: Int = 100158

const val GLU_TESS_MISSING_BEGIN_POLYGON: Int = 100151

const val GLU_TESS_MISSING_BEGIN_CONTOUR: Int = 100152

const val GLU_TESS_MISSING_END_POLYGON: Int = 100153

const val GLU_TESS_MISSING_END_CONTOUR: Int = 100154

const val GLU_TESS_COORD_TOO_LARGE: Int = 100155

const val GLU_TESS_NEED_COMBINE_CALLBACK: Int = 100156

const val GLU_TESS_WINDING_ODD: Int = 100130

const val GLU_TESS_WINDING_NONZERO: Int = 100131

const val GLU_TESS_WINDING_POSITIVE: Int = 100132

const val GLU_TESS_WINDING_NEGATIVE: Int = 100133

const val GLU_TESS_WINDING_ABS_GEQ_TWO: Int = 100134

val GLU_TESS_MAX_COORD: Double get() = bitsToDouble(6850974717710472879) /* == 1.0E150 */




typealias PFNGLCULLFACEPROCVar = CPointerVarOf<PFNGLCULLFACEPROC>
typealias PFNGLCULLFACEPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLFRONTFACEPROCVar = CPointerVarOf<PFNGLFRONTFACEPROC>
typealias PFNGLFRONTFACEPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLHINTPROCVar = CPointerVarOf<PFNGLHINTPROC>
typealias PFNGLHINTPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLLINEWIDTHPROCVar = CPointerVarOf<PFNGLLINEWIDTHPROC>
typealias PFNGLLINEWIDTHPROC = CPointer<CFunction<(GLfloat) -> Unit>>

typealias PFNGLPOINTSIZEPROCVar = CPointerVarOf<PFNGLPOINTSIZEPROC>
typealias PFNGLPOINTSIZEPROC = CPointer<CFunction<(GLfloat) -> Unit>>

typealias PFNGLPOLYGONMODEPROCVar = CPointerVarOf<PFNGLPOLYGONMODEPROC>
typealias PFNGLPOLYGONMODEPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLSCISSORPROCVar = CPointerVarOf<PFNGLSCISSORPROC>
typealias PFNGLSCISSORPROC = CPointer<CFunction<(GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLTEXPARAMETERFPROCVar = CPointerVarOf<PFNGLTEXPARAMETERFPROC>
typealias PFNGLTEXPARAMETERFPROC = CPointer<CFunction<(GLenum, GLenum, GLfloat) -> Unit>>

typealias PFNGLTEXPARAMETERFVPROCVar = CPointerVarOf<PFNGLTEXPARAMETERFVPROC>
typealias PFNGLTEXPARAMETERFVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLTEXPARAMETERIPROCVar = CPointerVarOf<PFNGLTEXPARAMETERIPROC>
typealias PFNGLTEXPARAMETERIPROC = CPointer<CFunction<(GLenum, GLenum, GLint) -> Unit>>

typealias PFNGLTEXPARAMETERIVPROCVar = CPointerVarOf<PFNGLTEXPARAMETERIVPROC>
typealias PFNGLTEXPARAMETERIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTEXIMAGE1DPROCVar = CPointerVarOf<PFNGLTEXIMAGE1DPROC>
typealias PFNGLTEXIMAGE1DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLsizei, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXIMAGE2DPROCVar = CPointerVarOf<PFNGLTEXIMAGE2DPROC>
typealias PFNGLTEXIMAGE2DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLsizei, GLsizei, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLDRAWBUFFERPROCVar = CPointerVarOf<PFNGLDRAWBUFFERPROC>
typealias PFNGLDRAWBUFFERPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLCLEARPROCVar = CPointerVarOf<PFNGLCLEARPROC>
typealias PFNGLCLEARPROC = CPointer<CFunction<(GLbitfield) -> Unit>>

typealias PFNGLCLEARCOLORPROCVar = CPointerVarOf<PFNGLCLEARCOLORPROC>
typealias PFNGLCLEARCOLORPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLCLEARSTENCILPROCVar = CPointerVarOf<PFNGLCLEARSTENCILPROC>
typealias PFNGLCLEARSTENCILPROC = CPointer<CFunction<(GLint) -> Unit>>

typealias PFNGLCLEARDEPTHPROCVar = CPointerVarOf<PFNGLCLEARDEPTHPROC>
typealias PFNGLCLEARDEPTHPROC = CPointer<CFunction<(GLclampd) -> Unit>>

typealias PFNGLSTENCILMASKPROCVar = CPointerVarOf<PFNGLSTENCILMASKPROC>
typealias PFNGLSTENCILMASKPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLCOLORMASKPROCVar = CPointerVarOf<PFNGLCOLORMASKPROC>
typealias PFNGLCOLORMASKPROC = CPointer<CFunction<(GLboolean, GLboolean, GLboolean, GLboolean) -> Unit>>

typealias PFNGLDEPTHMASKPROCVar = CPointerVarOf<PFNGLDEPTHMASKPROC>
typealias PFNGLDEPTHMASKPROC = CPointer<CFunction<(GLboolean) -> Unit>>

typealias PFNGLDISABLEPROCVar = CPointerVarOf<PFNGLDISABLEPROC>
typealias PFNGLDISABLEPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLENABLEPROCVar = CPointerVarOf<PFNGLENABLEPROC>
typealias PFNGLENABLEPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLFINISHPROCVar = CPointerVarOf<PFNGLFINISHPROC>
typealias PFNGLFINISHPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLFLUSHPROCVar = CPointerVarOf<PFNGLFLUSHPROC>
typealias PFNGLFLUSHPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLBLENDFUNCPROCVar = CPointerVarOf<PFNGLBLENDFUNCPROC>
typealias PFNGLBLENDFUNCPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLLOGICOPPROCVar = CPointerVarOf<PFNGLLOGICOPPROC>
typealias PFNGLLOGICOPPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLSTENCILFUNCPROCVar = CPointerVarOf<PFNGLSTENCILFUNCPROC>
typealias PFNGLSTENCILFUNCPROC = CPointer<CFunction<(GLenum, GLint, GLuint) -> Unit>>

typealias PFNGLSTENCILOPPROCVar = CPointerVarOf<PFNGLSTENCILOPPROC>
typealias PFNGLSTENCILOPPROC = CPointer<CFunction<(GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLDEPTHFUNCPROCVar = CPointerVarOf<PFNGLDEPTHFUNCPROC>
typealias PFNGLDEPTHFUNCPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLPIXELSTOREFPROCVar = CPointerVarOf<PFNGLPIXELSTOREFPROC>
typealias PFNGLPIXELSTOREFPROC = CPointer<CFunction<(GLenum, GLfloat) -> Unit>>

typealias PFNGLPIXELSTOREIPROCVar = CPointerVarOf<PFNGLPIXELSTOREIPROC>
typealias PFNGLPIXELSTOREIPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLREADBUFFERPROCVar = CPointerVarOf<PFNGLREADBUFFERPROC>
typealias PFNGLREADBUFFERPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLREADPIXELSPROCVar = CPointerVarOf<PFNGLREADPIXELSPROC>
typealias PFNGLREADPIXELSPROC = CPointer<CFunction<(GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLGETBOOLEANVPROCVar = CPointerVarOf<PFNGLGETBOOLEANVPROC>
typealias PFNGLGETBOOLEANVPROC = CPointer<CFunction<(GLenum, CPointer<GLbooleanVar>?) -> Unit>>

typealias PFNGLGETDOUBLEVPROCVar = CPointerVarOf<PFNGLGETDOUBLEVPROC>
typealias PFNGLGETDOUBLEVPROC = CPointer<CFunction<(GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETERRORPROCVar = CPointerVarOf<PFNGLGETERRORPROC>
typealias PFNGLGETERRORPROC = CPointer<CFunction<() -> GLenum>>

typealias PFNGLGETFLOATVPROCVar = CPointerVarOf<PFNGLGETFLOATVPROC>
typealias PFNGLGETFLOATVPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETINTEGERVPROCVar = CPointerVarOf<PFNGLGETINTEGERVPROC>
typealias PFNGLGETINTEGERVPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETSTRINGPROCVar = CPointerVarOf<PFNGLGETSTRINGPROC>
typealias PFNGLGETSTRINGPROC = CPointer<CFunction<(GLenum) -> CPointer<GLubyteVar>?>>

typealias PFNGLGETTEXIMAGEPROCVar = CPointerVarOf<PFNGLGETTEXIMAGEPROC>
typealias PFNGLGETTEXIMAGEPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLGETTEXPARAMETERFVPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERFVPROC>
typealias PFNGLGETTEXPARAMETERFVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETTEXPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERIVPROC>
typealias PFNGLGETTEXPARAMETERIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETTEXLEVELPARAMETERFVPROCVar = CPointerVarOf<PFNGLGETTEXLEVELPARAMETERFVPROC>
typealias PFNGLGETTEXLEVELPARAMETERFVPROC = CPointer<CFunction<(GLenum, GLint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETTEXLEVELPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETTEXLEVELPARAMETERIVPROC>
typealias PFNGLGETTEXLEVELPARAMETERIVPROC = CPointer<CFunction<(GLenum, GLint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLISENABLEDPROCVar = CPointerVarOf<PFNGLISENABLEDPROC>
typealias PFNGLISENABLEDPROC = CPointer<CFunction<(GLenum) -> GLboolean>>

typealias PFNGLDEPTHRANGEPROCVar = CPointerVarOf<PFNGLDEPTHRANGEPROC>
typealias PFNGLDEPTHRANGEPROC = CPointer<CFunction<(GLclampd, GLclampd) -> Unit>>

typealias PFNGLVIEWPORTPROCVar = CPointerVarOf<PFNGLVIEWPORTPROC>
typealias PFNGLVIEWPORTPROC = CPointer<CFunction<(GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLDRAWARRAYSPROCVar = CPointerVarOf<PFNGLDRAWARRAYSPROC>
typealias PFNGLDRAWARRAYSPROC = CPointer<CFunction<(GLenum, GLint, GLsizei) -> Unit>>

typealias PFNGLDRAWELEMENTSPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSPROC>
typealias PFNGLDRAWELEMENTSPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLPOLYGONOFFSETPROCVar = CPointerVarOf<PFNGLPOLYGONOFFSETPROC>
typealias PFNGLPOLYGONOFFSETPROC = CPointer<CFunction<(GLfloat, GLfloat) -> Unit>>

typealias PFNGLCOPYTEXIMAGE1DPROCVar = CPointerVarOf<PFNGLCOPYTEXIMAGE1DPROC>
typealias PFNGLCOPYTEXIMAGE1DPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLint) -> Unit>>

typealias PFNGLCOPYTEXIMAGE2DPROCVar = CPointerVarOf<PFNGLCOPYTEXIMAGE2DPROC>
typealias PFNGLCOPYTEXIMAGE2DPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLsizei, GLint) -> Unit>>

typealias PFNGLCOPYTEXSUBIMAGE1DPROCVar = CPointerVarOf<PFNGLCOPYTEXSUBIMAGE1DPROC>
typealias PFNGLCOPYTEXSUBIMAGE1DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint, GLsizei) -> Unit>>

typealias PFNGLCOPYTEXSUBIMAGE2DPROCVar = CPointerVarOf<PFNGLCOPYTEXSUBIMAGE2DPROC>
typealias PFNGLCOPYTEXSUBIMAGE2DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLTEXSUBIMAGE1DPROCVar = CPointerVarOf<PFNGLTEXSUBIMAGE1DPROC>
typealias PFNGLTEXSUBIMAGE1DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXSUBIMAGE2DPROCVar = CPointerVarOf<PFNGLTEXSUBIMAGE2DPROC>
typealias PFNGLTEXSUBIMAGE2DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLBINDTEXTUREPROCVar = CPointerVarOf<PFNGLBINDTEXTUREPROC>
typealias PFNGLBINDTEXTUREPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETETEXTURESPROCVar = CPointerVarOf<PFNGLDELETETEXTURESPROC>
typealias PFNGLDELETETEXTURESPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENTEXTURESPROCVar = CPointerVarOf<PFNGLGENTEXTURESPROC>
typealias PFNGLGENTEXTURESPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISTEXTUREPROCVar = CPointerVarOf<PFNGLISTEXTUREPROC>
typealias PFNGLISTEXTUREPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBLENDCOLORPROCVar = CPointerVarOf<PFNGLBLENDCOLORPROC>
typealias PFNGLBLENDCOLORPROC = CPointer<CFunction<(GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLBLENDEQUATIONPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONPROC>
typealias PFNGLBLENDEQUATIONPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLDRAWRANGEELEMENTSPROCVar = CPointerVarOf<PFNGLDRAWRANGEELEMENTSPROC>
typealias PFNGLDRAWRANGEELEMENTSPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLsizei, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXIMAGE3DPROCVar = CPointerVarOf<PFNGLTEXIMAGE3DPROC>
typealias PFNGLTEXIMAGE3DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLTEXSUBIMAGE3DPROCVar = CPointerVarOf<PFNGLTEXSUBIMAGE3DPROC>
typealias PFNGLTEXSUBIMAGE3DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLCOPYTEXSUBIMAGE3DPROCVar = CPointerVarOf<PFNGLCOPYTEXSUBIMAGE3DPROC>
typealias PFNGLCOPYTEXSUBIMAGE3DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLACTIVETEXTUREPROCVar = CPointerVarOf<PFNGLACTIVETEXTUREPROC>
typealias PFNGLACTIVETEXTUREPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLSAMPLECOVERAGEPROCVar = CPointerVarOf<PFNGLSAMPLECOVERAGEPROC>
typealias PFNGLSAMPLECOVERAGEPROC = CPointer<CFunction<(GLclampf, GLboolean) -> Unit>>

typealias PFNGLCOMPRESSEDTEXIMAGE3DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXIMAGE3DPROC>
typealias PFNGLCOMPRESSEDTEXIMAGE3DPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXIMAGE2DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXIMAGE2DPROC>
typealias PFNGLCOMPRESSEDTEXIMAGE2DPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLsizei, GLsizei, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXIMAGE1DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXIMAGE1DPROC>
typealias PFNGLCOMPRESSEDTEXIMAGE1DPROC = CPointer<CFunction<(GLenum, GLint, GLenum, GLsizei, GLint, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXSUBIMAGE3DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC>
typealias PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXSUBIMAGE2DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC>
typealias PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLCOMPRESSEDTEXSUBIMAGE1DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXSUBIMAGE1DPROC>
typealias PFNGLCOMPRESSEDTEXSUBIMAGE1DPROC = CPointer<CFunction<(GLenum, GLint, GLint, GLsizei, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETCOMPRESSEDTEXIMAGEPROCVar = CPointerVarOf<PFNGLGETCOMPRESSEDTEXIMAGEPROC>
typealias PFNGLGETCOMPRESSEDTEXIMAGEPROC = CPointer<CFunction<(GLenum, GLint, COpaquePointer?) -> Unit>>

typealias PFNGLBLENDFUNCSEPARATEPROCVar = CPointerVarOf<PFNGLBLENDFUNCSEPARATEPROC>
typealias PFNGLBLENDFUNCSEPARATEPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLMULTIDRAWARRAYSPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSPROC>
typealias PFNGLMULTIDRAWARRAYSPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?, CPointer<GLsizeiVar>?, GLsizei) -> Unit>>

typealias PFNGLMULTIDRAWELEMENTSPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSPROC>
typealias PFNGLMULTIDRAWELEMENTSPROC = CPointer<CFunction<(GLenum, CPointer<GLsizeiVar>?, GLenum, CPointer<COpaquePointerVar>?, GLsizei) -> Unit>>

typealias PFNGLPOINTPARAMETERFPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFPROC>
typealias PFNGLPOINTPARAMETERFPROC = CPointer<CFunction<(GLenum, GLfloat) -> Unit>>

typealias PFNGLPOINTPARAMETERFVPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFVPROC>
typealias PFNGLPOINTPARAMETERFVPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPOINTPARAMETERIPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERIPROC>
typealias PFNGLPOINTPARAMETERIPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLPOINTPARAMETERIVPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERIVPROC>
typealias PFNGLPOINTPARAMETERIVPROC = CPointer<CFunction<(GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGENQUERIESPROCVar = CPointerVarOf<PFNGLGENQUERIESPROC>
typealias PFNGLGENQUERIESPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLDELETEQUERIESPROCVar = CPointerVarOf<PFNGLDELETEQUERIESPROC>
typealias PFNGLDELETEQUERIESPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISQUERYPROCVar = CPointerVarOf<PFNGLISQUERYPROC>
typealias PFNGLISQUERYPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBEGINQUERYPROCVar = CPointerVarOf<PFNGLBEGINQUERYPROC>
typealias PFNGLBEGINQUERYPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLENDQUERYPROCVar = CPointerVarOf<PFNGLENDQUERYPROC>
typealias PFNGLENDQUERYPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLGETQUERYIVPROCVar = CPointerVarOf<PFNGLGETQUERYIVPROC>
typealias PFNGLGETQUERYIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETQUERYOBJECTIVPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTIVPROC>
typealias PFNGLGETQUERYOBJECTIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETQUERYOBJECTUIVPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTUIVPROC>
typealias PFNGLGETQUERYOBJECTUIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLBINDBUFFERPROCVar = CPointerVarOf<PFNGLBINDBUFFERPROC>
typealias PFNGLBINDBUFFERPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETEBUFFERSPROCVar = CPointerVarOf<PFNGLDELETEBUFFERSPROC>
typealias PFNGLDELETEBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENBUFFERSPROCVar = CPointerVarOf<PFNGLGENBUFFERSPROC>
typealias PFNGLGENBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISBUFFERPROCVar = CPointerVarOf<PFNGLISBUFFERPROC>
typealias PFNGLISBUFFERPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBUFFERDATAPROCVar = CPointerVarOf<PFNGLBUFFERDATAPROC>
typealias PFNGLBUFFERDATAPROC = CPointer<CFunction<(GLenum, GLsizeiptr, COpaquePointer?, GLenum) -> Unit>>

typealias PFNGLBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLBUFFERSUBDATAPROC>
typealias PFNGLBUFFERSUBDATAPROC = CPointer<CFunction<(GLenum, GLintptr, GLsizeiptr, COpaquePointer?) -> Unit>>

typealias PFNGLGETBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLGETBUFFERSUBDATAPROC>
typealias PFNGLGETBUFFERSUBDATAPROC = CPointer<CFunction<(GLenum, GLintptr, GLsizeiptr, COpaquePointer?) -> Unit>>

typealias PFNGLMAPBUFFERPROCVar = CPointerVarOf<PFNGLMAPBUFFERPROC>
typealias PFNGLMAPBUFFERPROC = CPointer<CFunction<(GLenum, GLenum) -> COpaquePointer?>>

typealias PFNGLUNMAPBUFFERPROCVar = CPointerVarOf<PFNGLUNMAPBUFFERPROC>
typealias PFNGLUNMAPBUFFERPROC = CPointer<CFunction<(GLenum) -> GLboolean>>

typealias PFNGLGETBUFFERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETBUFFERPARAMETERIVPROC>
typealias PFNGLGETBUFFERPARAMETERIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETBUFFERPOINTERVPROCVar = CPointerVarOf<PFNGLGETBUFFERPOINTERVPROC>
typealias PFNGLGETBUFFERPOINTERVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLBLENDEQUATIONSEPARATEPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONSEPARATEPROC>
typealias PFNGLBLENDEQUATIONSEPARATEPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLDRAWBUFFERSPROCVar = CPointerVarOf<PFNGLDRAWBUFFERSPROC>
typealias PFNGLDRAWBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLenumVar>?) -> Unit>>

typealias PFNGLSTENCILOPSEPARATEPROCVar = CPointerVarOf<PFNGLSTENCILOPSEPARATEPROC>
typealias PFNGLSTENCILOPSEPARATEPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLSTENCILFUNCSEPARATEPROCVar = CPointerVarOf<PFNGLSTENCILFUNCSEPARATEPROC>
typealias PFNGLSTENCILFUNCSEPARATEPROC = CPointer<CFunction<(GLenum, GLenum, GLint, GLuint) -> Unit>>

typealias PFNGLSTENCILMASKSEPARATEPROCVar = CPointerVarOf<PFNGLSTENCILMASKSEPARATEPROC>
typealias PFNGLSTENCILMASKSEPARATEPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLATTACHSHADERPROCVar = CPointerVarOf<PFNGLATTACHSHADERPROC>
typealias PFNGLATTACHSHADERPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLBINDATTRIBLOCATIONPROCVar = CPointerVarOf<PFNGLBINDATTRIBLOCATIONPROC>
typealias PFNGLBINDATTRIBLOCATIONPROC = CPointer<CFunction<(GLuint, GLuint, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLCOMPILESHADERPROCVar = CPointerVarOf<PFNGLCOMPILESHADERPROC>
typealias PFNGLCOMPILESHADERPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLCREATEPROGRAMPROCVar = CPointerVarOf<PFNGLCREATEPROGRAMPROC>
typealias PFNGLCREATEPROGRAMPROC = CPointer<CFunction<() -> GLuint>>

typealias PFNGLCREATESHADERPROCVar = CPointerVarOf<PFNGLCREATESHADERPROC>
typealias PFNGLCREATESHADERPROC = CPointer<CFunction<(GLenum) -> GLuint>>

typealias PFNGLDELETEPROGRAMPROCVar = CPointerVarOf<PFNGLDELETEPROGRAMPROC>
typealias PFNGLDELETEPROGRAMPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLDELETESHADERPROCVar = CPointerVarOf<PFNGLDELETESHADERPROC>
typealias PFNGLDELETESHADERPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLDETACHSHADERPROCVar = CPointerVarOf<PFNGLDETACHSHADERPROC>
typealias PFNGLDETACHSHADERPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLDISABLEVERTEXATTRIBARRAYPROCVar = CPointerVarOf<PFNGLDISABLEVERTEXATTRIBARRAYPROC>
typealias PFNGLDISABLEVERTEXATTRIBARRAYPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLENABLEVERTEXATTRIBARRAYPROCVar = CPointerVarOf<PFNGLENABLEVERTEXATTRIBARRAYPROC>
typealias PFNGLENABLEVERTEXATTRIBARRAYPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLGETACTIVEATTRIBPROCVar = CPointerVarOf<PFNGLGETACTIVEATTRIBPROC>
typealias PFNGLGETACTIVEATTRIBPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLintVar>?, CPointer<GLenumVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETACTIVEUNIFORMPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMPROC>
typealias PFNGLGETACTIVEUNIFORMPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLintVar>?, CPointer<GLenumVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETATTACHEDSHADERSPROCVar = CPointerVarOf<PFNGLGETATTACHEDSHADERSPROC>
typealias PFNGLGETATTACHEDSHADERSPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETATTRIBLOCATIONPROCVar = CPointerVarOf<PFNGLGETATTRIBLOCATIONPROC>
typealias PFNGLGETATTRIBLOCATIONPROC = CPointer<CFunction<(GLuint, CPointer<GLcharVar>?) -> GLint>>

typealias PFNGLGETPROGRAMIVPROCVar = CPointerVarOf<PFNGLGETPROGRAMIVPROC>
typealias PFNGLGETPROGRAMIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETPROGRAMINFOLOGPROCVar = CPointerVarOf<PFNGLGETPROGRAMINFOLOGPROC>
typealias PFNGLGETPROGRAMINFOLOGPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETSHADERIVPROCVar = CPointerVarOf<PFNGLGETSHADERIVPROC>
typealias PFNGLGETSHADERIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETSHADERINFOLOGPROCVar = CPointerVarOf<PFNGLGETSHADERINFOLOGPROC>
typealias PFNGLGETSHADERINFOLOGPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETSHADERSOURCEPROCVar = CPointerVarOf<PFNGLGETSHADERSOURCEPROC>
typealias PFNGLGETSHADERSOURCEPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETUNIFORMLOCATIONPROCVar = CPointerVarOf<PFNGLGETUNIFORMLOCATIONPROC>
typealias PFNGLGETUNIFORMLOCATIONPROC = CPointer<CFunction<(GLuint, CPointer<GLcharVar>?) -> GLint>>

typealias PFNGLGETUNIFORMFVPROCVar = CPointerVarOf<PFNGLGETUNIFORMFVPROC>
typealias PFNGLGETUNIFORMFVPROC = CPointer<CFunction<(GLuint, GLint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETUNIFORMIVPROCVar = CPointerVarOf<PFNGLGETUNIFORMIVPROC>
typealias PFNGLGETUNIFORMIVPROC = CPointer<CFunction<(GLuint, GLint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBDVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBDVPROC>
typealias PFNGLGETVERTEXATTRIBDVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBFVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBFVPROC>
typealias PFNGLGETVERTEXATTRIBFVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBIVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIVPROC>
typealias PFNGLGETVERTEXATTRIBIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBPOINTERVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBPOINTERVPROC>
typealias PFNGLGETVERTEXATTRIBPOINTERVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLISPROGRAMPROCVar = CPointerVarOf<PFNGLISPROGRAMPROC>
typealias PFNGLISPROGRAMPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLISSHADERPROCVar = CPointerVarOf<PFNGLISSHADERPROC>
typealias PFNGLISSHADERPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLLINKPROGRAMPROCVar = CPointerVarOf<PFNGLLINKPROGRAMPROC>
typealias PFNGLLINKPROGRAMPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLSHADERSOURCEPROCVar = CPointerVarOf<PFNGLSHADERSOURCEPROC>
typealias PFNGLSHADERSOURCEPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<CPointerVar<GLcharVar>>?, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLUSEPROGRAMPROCVar = CPointerVarOf<PFNGLUSEPROGRAMPROC>
typealias PFNGLUSEPROGRAMPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLUNIFORM1FPROCVar = CPointerVarOf<PFNGLUNIFORM1FPROC>
typealias PFNGLUNIFORM1FPROC = CPointer<CFunction<(GLint, GLfloat) -> Unit>>

typealias PFNGLUNIFORM2FPROCVar = CPointerVarOf<PFNGLUNIFORM2FPROC>
typealias PFNGLUNIFORM2FPROC = CPointer<CFunction<(GLint, GLfloat, GLfloat) -> Unit>>

typealias PFNGLUNIFORM3FPROCVar = CPointerVarOf<PFNGLUNIFORM3FPROC>
typealias PFNGLUNIFORM3FPROC = CPointer<CFunction<(GLint, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLUNIFORM4FPROCVar = CPointerVarOf<PFNGLUNIFORM4FPROC>
typealias PFNGLUNIFORM4FPROC = CPointer<CFunction<(GLint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLUNIFORM1IPROCVar = CPointerVarOf<PFNGLUNIFORM1IPROC>
typealias PFNGLUNIFORM1IPROC = CPointer<CFunction<(GLint, GLint) -> Unit>>

typealias PFNGLUNIFORM2IPROCVar = CPointerVarOf<PFNGLUNIFORM2IPROC>
typealias PFNGLUNIFORM2IPROC = CPointer<CFunction<(GLint, GLint, GLint) -> Unit>>

typealias PFNGLUNIFORM3IPROCVar = CPointerVarOf<PFNGLUNIFORM3IPROC>
typealias PFNGLUNIFORM3IPROC = CPointer<CFunction<(GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLUNIFORM4IPROCVar = CPointerVarOf<PFNGLUNIFORM4IPROC>
typealias PFNGLUNIFORM4IPROC = CPointer<CFunction<(GLint, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLUNIFORM1FVPROCVar = CPointerVarOf<PFNGLUNIFORM1FVPROC>
typealias PFNGLUNIFORM1FVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORM2FVPROCVar = CPointerVarOf<PFNGLUNIFORM2FVPROC>
typealias PFNGLUNIFORM2FVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORM3FVPROCVar = CPointerVarOf<PFNGLUNIFORM3FVPROC>
typealias PFNGLUNIFORM3FVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORM4FVPROCVar = CPointerVarOf<PFNGLUNIFORM4FVPROC>
typealias PFNGLUNIFORM4FVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORM1IVPROCVar = CPointerVarOf<PFNGLUNIFORM1IVPROC>
typealias PFNGLUNIFORM1IVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLUNIFORM2IVPROCVar = CPointerVarOf<PFNGLUNIFORM2IVPROC>
typealias PFNGLUNIFORM2IVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLUNIFORM3IVPROCVar = CPointerVarOf<PFNGLUNIFORM3IVPROC>
typealias PFNGLUNIFORM3IVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLUNIFORM4IVPROCVar = CPointerVarOf<PFNGLUNIFORM4IVPROC>
typealias PFNGLUNIFORM4IVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX2FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2FVPROC>
typealias PFNGLUNIFORMMATRIX2FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX3FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3FVPROC>
typealias PFNGLUNIFORMMATRIX3FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX4FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4FVPROC>
typealias PFNGLUNIFORMMATRIX4FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVALIDATEPROGRAMPROCVar = CPointerVarOf<PFNGLVALIDATEPROGRAMPROC>
typealias PFNGLVALIDATEPROGRAMPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIB1DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1DPROC>
typealias PFNGLVERTEXATTRIB1DPROC = CPointer<CFunction<(GLuint, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB1DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1DVPROC>
typealias PFNGLVERTEXATTRIB1DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB1FPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1FPROC>
typealias PFNGLVERTEXATTRIB1FPROC = CPointer<CFunction<(GLuint, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB1FVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1FVPROC>
typealias PFNGLVERTEXATTRIB1FVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB1SPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1SPROC>
typealias PFNGLVERTEXATTRIB1SPROC = CPointer<CFunction<(GLuint, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB1SVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1SVPROC>
typealias PFNGLVERTEXATTRIB1SVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB2DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2DPROC>
typealias PFNGLVERTEXATTRIB2DPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB2DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2DVPROC>
typealias PFNGLVERTEXATTRIB2DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB2FPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2FPROC>
typealias PFNGLVERTEXATTRIB2FPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB2FVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2FVPROC>
typealias PFNGLVERTEXATTRIB2FVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB2SPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2SPROC>
typealias PFNGLVERTEXATTRIB2SPROC = CPointer<CFunction<(GLuint, GLshort, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB2SVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2SVPROC>
typealias PFNGLVERTEXATTRIB2SVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB3DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3DPROC>
typealias PFNGLVERTEXATTRIB3DPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB3DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3DVPROC>
typealias PFNGLVERTEXATTRIB3DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB3FPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3FPROC>
typealias PFNGLVERTEXATTRIB3FPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB3FVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3FVPROC>
typealias PFNGLVERTEXATTRIB3FVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB3SPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3SPROC>
typealias PFNGLVERTEXATTRIB3SPROC = CPointer<CFunction<(GLuint, GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB3SVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3SVPROC>
typealias PFNGLVERTEXATTRIB3SVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NBVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NBVPROC>
typealias PFNGLVERTEXATTRIB4NBVPROC = CPointer<CFunction<(GLuint, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NIVPROC>
typealias PFNGLVERTEXATTRIB4NIVPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NSVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NSVPROC>
typealias PFNGLVERTEXATTRIB4NSVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NUBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUBPROC>
typealias PFNGLVERTEXATTRIB4NUBPROC = CPointer<CFunction<(GLuint, GLubyte, GLubyte, GLubyte, GLubyte) -> Unit>>

typealias PFNGLVERTEXATTRIB4NUBVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUBVPROC>
typealias PFNGLVERTEXATTRIB4NUBVPROC = CPointer<CFunction<(GLuint, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NUIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUIVPROC>
typealias PFNGLVERTEXATTRIB4NUIVPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4NUSVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUSVPROC>
typealias PFNGLVERTEXATTRIB4NUSVPROC = CPointer<CFunction<(GLuint, CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4BVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4BVPROC>
typealias PFNGLVERTEXATTRIB4BVPROC = CPointer<CFunction<(GLuint, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4DPROC>
typealias PFNGLVERTEXATTRIB4DPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIB4DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4DVPROC>
typealias PFNGLVERTEXATTRIB4DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4FPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4FPROC>
typealias PFNGLVERTEXATTRIB4FPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVERTEXATTRIB4FVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4FVPROC>
typealias PFNGLVERTEXATTRIB4FVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4IVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4IVPROC>
typealias PFNGLVERTEXATTRIB4IVPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4SPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4SPROC>
typealias PFNGLVERTEXATTRIB4SPROC = CPointer<CFunction<(GLuint, GLshort, GLshort, GLshort, GLshort) -> Unit>>

typealias PFNGLVERTEXATTRIB4SVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4SVPROC>
typealias PFNGLVERTEXATTRIB4SVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4UBVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4UBVPROC>
typealias PFNGLVERTEXATTRIB4UBVPROC = CPointer<CFunction<(GLuint, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4UIVPROC>
typealias PFNGLVERTEXATTRIB4UIVPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIB4USVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4USVPROC>
typealias PFNGLVERTEXATTRIB4USVPROC = CPointer<CFunction<(GLuint, CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBPOINTERPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBPOINTERPROC>
typealias PFNGLVERTEXATTRIBPOINTERPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLboolean, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLUNIFORMMATRIX2X3FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2X3FVPROC>
typealias PFNGLUNIFORMMATRIX2X3FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX3X2FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3X2FVPROC>
typealias PFNGLUNIFORMMATRIX3X2FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX2X4FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2X4FVPROC>
typealias PFNGLUNIFORMMATRIX2X4FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX4X2FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4X2FVPROC>
typealias PFNGLUNIFORMMATRIX4X2FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX3X4FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3X4FVPROC>
typealias PFNGLUNIFORMMATRIX3X4FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX4X3FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4X3FVPROC>
typealias PFNGLUNIFORMMATRIX4X3FVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLCOLORMASKIPROCVar = CPointerVarOf<PFNGLCOLORMASKIPROC>
typealias PFNGLCOLORMASKIPROC = CPointer<CFunction<(GLuint, GLboolean, GLboolean, GLboolean, GLboolean) -> Unit>>

typealias PFNGLGETBOOLEANI_VPROCVar = CPointerVarOf<PFNGLGETBOOLEANI_VPROC>
typealias PFNGLGETBOOLEANI_VPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLbooleanVar>?) -> Unit>>

typealias PFNGLGETINTEGERI_VPROCVar = CPointerVarOf<PFNGLGETINTEGERI_VPROC>
typealias PFNGLGETINTEGERI_VPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLENABLEIPROCVar = CPointerVarOf<PFNGLENABLEIPROC>
typealias PFNGLENABLEIPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDISABLEIPROCVar = CPointerVarOf<PFNGLDISABLEIPROC>
typealias PFNGLDISABLEIPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLISENABLEDIPROCVar = CPointerVarOf<PFNGLISENABLEDIPROC>
typealias PFNGLISENABLEDIPROC = CPointer<CFunction<(GLenum, GLuint) -> GLboolean>>

typealias PFNGLBEGINTRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLBEGINTRANSFORMFEEDBACKPROC>
typealias PFNGLBEGINTRANSFORMFEEDBACKPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLENDTRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLENDTRANSFORMFEEDBACKPROC>
typealias PFNGLENDTRANSFORMFEEDBACKPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLBINDBUFFERRANGEPROCVar = CPointerVarOf<PFNGLBINDBUFFERRANGEPROC>
typealias PFNGLBINDBUFFERRANGEPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLBINDBUFFERBASEPROCVar = CPointerVarOf<PFNGLBINDBUFFERBASEPROC>
typealias PFNGLBINDBUFFERBASEPROC = CPointer<CFunction<(GLenum, GLuint, GLuint) -> Unit>>

typealias PFNGLTRANSFORMFEEDBACKVARYINGSPROCVar = CPointerVarOf<PFNGLTRANSFORMFEEDBACKVARYINGSPROC>
typealias PFNGLTRANSFORMFEEDBACKVARYINGSPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<CPointerVar<GLcharVar>>?, GLenum) -> Unit>>

typealias PFNGLGETTRANSFORMFEEDBACKVARYINGPROCVar = CPointerVarOf<PFNGLGETTRANSFORMFEEDBACKVARYINGPROC>
typealias PFNGLGETTRANSFORMFEEDBACKVARYINGPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLsizeiVar>?, CPointer<GLenumVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLCLAMPCOLORPROCVar = CPointerVarOf<PFNGLCLAMPCOLORPROC>
typealias PFNGLCLAMPCOLORPROC = CPointer<CFunction<(GLenum, GLenum) -> Unit>>

typealias PFNGLBEGINCONDITIONALRENDERPROCVar = CPointerVarOf<PFNGLBEGINCONDITIONALRENDERPROC>
typealias PFNGLBEGINCONDITIONALRENDERPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLENDCONDITIONALRENDERPROCVar = CPointerVarOf<PFNGLENDCONDITIONALRENDERPROC>
typealias PFNGLENDCONDITIONALRENDERPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLVERTEXATTRIBIPOINTERPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBIPOINTERPROC>
typealias PFNGLVERTEXATTRIBIPOINTERPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBIIVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIIVPROC>
typealias PFNGLGETVERTEXATTRIBIIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBIUIVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIUIVPROC>
typealias PFNGLGETVERTEXATTRIBIUIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI1IPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1IPROC>
typealias PFNGLVERTEXATTRIBI1IPROC = CPointer<CFunction<(GLuint, GLint) -> Unit>>

typealias PFNGLVERTEXATTRIBI2IPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2IPROC>
typealias PFNGLVERTEXATTRIBI2IPROC = CPointer<CFunction<(GLuint, GLint, GLint) -> Unit>>

typealias PFNGLVERTEXATTRIBI3IPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3IPROC>
typealias PFNGLVERTEXATTRIBI3IPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLVERTEXATTRIBI4IPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4IPROC>
typealias PFNGLVERTEXATTRIBI4IPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLVERTEXATTRIBI1UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1UIPROC>
typealias PFNGLVERTEXATTRIBI1UIPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBI2UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2UIPROC>
typealias PFNGLVERTEXATTRIBI2UIPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBI3UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3UIPROC>
typealias PFNGLVERTEXATTRIBI3UIPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBI4UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4UIPROC>
typealias PFNGLVERTEXATTRIBI4UIPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBI1IVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1IVPROC>
typealias PFNGLVERTEXATTRIBI1IVPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI2IVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2IVPROC>
typealias PFNGLVERTEXATTRIBI2IVPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI3IVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3IVPROC>
typealias PFNGLVERTEXATTRIBI3IVPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4IVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4IVPROC>
typealias PFNGLVERTEXATTRIBI4IVPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI1UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1UIVPROC>
typealias PFNGLVERTEXATTRIBI1UIVPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI2UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2UIVPROC>
typealias PFNGLVERTEXATTRIBI2UIVPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI3UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3UIVPROC>
typealias PFNGLVERTEXATTRIBI3UIVPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4UIVPROC>
typealias PFNGLVERTEXATTRIBI4UIVPROC = CPointer<CFunction<(GLuint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4BVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4BVPROC>
typealias PFNGLVERTEXATTRIBI4BVPROC = CPointer<CFunction<(GLuint, CPointer<GLbyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4SVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4SVPROC>
typealias PFNGLVERTEXATTRIBI4SVPROC = CPointer<CFunction<(GLuint, CPointer<GLshortVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4UBVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4UBVPROC>
typealias PFNGLVERTEXATTRIBI4UBVPROC = CPointer<CFunction<(GLuint, CPointer<GLubyteVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBI4USVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4USVPROC>
typealias PFNGLVERTEXATTRIBI4USVPROC = CPointer<CFunction<(GLuint, CPointer<GLushortVar>?) -> Unit>>

typealias PFNGLGETUNIFORMUIVPROCVar = CPointerVarOf<PFNGLGETUNIFORMUIVPROC>
typealias PFNGLGETUNIFORMUIVPROC = CPointer<CFunction<(GLuint, GLint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLBINDFRAGDATALOCATIONPROCVar = CPointerVarOf<PFNGLBINDFRAGDATALOCATIONPROC>
typealias PFNGLBINDFRAGDATALOCATIONPROC = CPointer<CFunction<(GLuint, GLuint, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETFRAGDATALOCATIONPROCVar = CPointerVarOf<PFNGLGETFRAGDATALOCATIONPROC>
typealias PFNGLGETFRAGDATALOCATIONPROC = CPointer<CFunction<(GLuint, CPointer<GLcharVar>?) -> GLint>>

typealias PFNGLUNIFORM1UIPROCVar = CPointerVarOf<PFNGLUNIFORM1UIPROC>
typealias PFNGLUNIFORM1UIPROC = CPointer<CFunction<(GLint, GLuint) -> Unit>>

typealias PFNGLUNIFORM2UIPROCVar = CPointerVarOf<PFNGLUNIFORM2UIPROC>
typealias PFNGLUNIFORM2UIPROC = CPointer<CFunction<(GLint, GLuint, GLuint) -> Unit>>

typealias PFNGLUNIFORM3UIPROCVar = CPointerVarOf<PFNGLUNIFORM3UIPROC>
typealias PFNGLUNIFORM3UIPROC = CPointer<CFunction<(GLint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLUNIFORM4UIPROCVar = CPointerVarOf<PFNGLUNIFORM4UIPROC>
typealias PFNGLUNIFORM4UIPROC = CPointer<CFunction<(GLint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLUNIFORM1UIVPROCVar = CPointerVarOf<PFNGLUNIFORM1UIVPROC>
typealias PFNGLUNIFORM1UIVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLUNIFORM2UIVPROCVar = CPointerVarOf<PFNGLUNIFORM2UIVPROC>
typealias PFNGLUNIFORM2UIVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLUNIFORM3UIVPROCVar = CPointerVarOf<PFNGLUNIFORM3UIVPROC>
typealias PFNGLUNIFORM3UIVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLUNIFORM4UIVPROCVar = CPointerVarOf<PFNGLUNIFORM4UIVPROC>
typealias PFNGLUNIFORM4UIVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLTEXPARAMETERIIVPROCVar = CPointerVarOf<PFNGLTEXPARAMETERIIVPROC>
typealias PFNGLTEXPARAMETERIIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTEXPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLTEXPARAMETERIUIVPROC>
typealias PFNGLTEXPARAMETERIUIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETTEXPARAMETERIIVPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERIIVPROC>
typealias PFNGLGETTEXPARAMETERIIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETTEXPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERIUIVPROC>
typealias PFNGLGETTEXPARAMETERIUIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLCLEARBUFFERIVPROCVar = CPointerVarOf<PFNGLCLEARBUFFERIVPROC>
typealias PFNGLCLEARBUFFERIVPROC = CPointer<CFunction<(GLenum, GLint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLCLEARBUFFERUIVPROCVar = CPointerVarOf<PFNGLCLEARBUFFERUIVPROC>
typealias PFNGLCLEARBUFFERUIVPROC = CPointer<CFunction<(GLenum, GLint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLCLEARBUFFERFVPROCVar = CPointerVarOf<PFNGLCLEARBUFFERFVPROC>
typealias PFNGLCLEARBUFFERFVPROC = CPointer<CFunction<(GLenum, GLint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLCLEARBUFFERFIPROCVar = CPointerVarOf<PFNGLCLEARBUFFERFIPROC>
typealias PFNGLCLEARBUFFERFIPROC = CPointer<CFunction<(GLenum, GLint, GLfloat, GLint) -> Unit>>

typealias PFNGLGETSTRINGIPROCVar = CPointerVarOf<PFNGLGETSTRINGIPROC>
typealias PFNGLGETSTRINGIPROC = CPointer<CFunction<(GLenum, GLuint) -> CPointer<GLubyteVar>?>>

typealias PFNGLDRAWARRAYSINSTANCEDPROCVar = CPointerVarOf<PFNGLDRAWARRAYSINSTANCEDPROC>
typealias PFNGLDRAWARRAYSINSTANCEDPROC = CPointer<CFunction<(GLenum, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLDRAWELEMENTSINSTANCEDPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINSTANCEDPROC>
typealias PFNGLDRAWELEMENTSINSTANCEDPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, COpaquePointer?, GLsizei) -> Unit>>

typealias PFNGLTEXBUFFERPROCVar = CPointerVarOf<PFNGLTEXBUFFERPROC>
typealias PFNGLTEXBUFFERPROC = CPointer<CFunction<(GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLPRIMITIVERESTARTINDEXPROCVar = CPointerVarOf<PFNGLPRIMITIVERESTARTINDEXPROC>
typealias PFNGLPRIMITIVERESTARTINDEXPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLGETINTEGER64I_VPROCVar = CPointerVarOf<PFNGLGETINTEGER64I_VPROC>
typealias PFNGLGETINTEGER64I_VPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLGETBUFFERPARAMETERI64VPROCVar = CPointerVarOf<PFNGLGETBUFFERPARAMETERI64VPROC>
typealias PFNGLGETBUFFERPARAMETERI64VPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTUREPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTUREPROC>
typealias PFNGLFRAMEBUFFERTEXTUREPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLint) -> Unit>>

typealias PFNGLVERTEXATTRIBDIVISORPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBDIVISORPROC>
typealias PFNGLVERTEXATTRIBDIVISORPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLMINSAMPLESHADINGPROCVar = CPointerVarOf<PFNGLMINSAMPLESHADINGPROC>
typealias PFNGLMINSAMPLESHADINGPROC = CPointer<CFunction<(GLfloat) -> Unit>>

typealias PFNGLBLENDEQUATIONIPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONIPROC>
typealias PFNGLBLENDEQUATIONIPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLBLENDEQUATIONSEPARATEIPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONSEPARATEIPROC>
typealias PFNGLBLENDEQUATIONSEPARATEIPROC = CPointer<CFunction<(GLuint, GLenum, GLenum) -> Unit>>

typealias PFNGLBLENDFUNCIPROCVar = CPointerVarOf<PFNGLBLENDFUNCIPROC>
typealias PFNGLBLENDFUNCIPROC = CPointer<CFunction<(GLuint, GLenum, GLenum) -> Unit>>

typealias PFNGLBLENDFUNCSEPARATEIPROCVar = CPointerVarOf<PFNGLBLENDFUNCSEPARATEIPROC>
typealias PFNGLBLENDFUNCSEPARATEIPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLISRENDERBUFFERPROCVar = CPointerVarOf<PFNGLISRENDERBUFFERPROC>
typealias PFNGLISRENDERBUFFERPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBINDRENDERBUFFERPROCVar = CPointerVarOf<PFNGLBINDRENDERBUFFERPROC>
typealias PFNGLBINDRENDERBUFFERPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETERENDERBUFFERSPROCVar = CPointerVarOf<PFNGLDELETERENDERBUFFERSPROC>
typealias PFNGLDELETERENDERBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENRENDERBUFFERSPROCVar = CPointerVarOf<PFNGLGENRENDERBUFFERSPROC>
typealias PFNGLGENRENDERBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLRENDERBUFFERSTORAGEPROCVar = CPointerVarOf<PFNGLRENDERBUFFERSTORAGEPROC>
typealias PFNGLRENDERBUFFERSTORAGEPROC = CPointer<CFunction<(GLenum, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLGETRENDERBUFFERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETRENDERBUFFERPARAMETERIVPROC>
typealias PFNGLGETRENDERBUFFERPARAMETERIVPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLISFRAMEBUFFERPROCVar = CPointerVarOf<PFNGLISFRAMEBUFFERPROC>
typealias PFNGLISFRAMEBUFFERPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBINDFRAMEBUFFERPROCVar = CPointerVarOf<PFNGLBINDFRAMEBUFFERPROC>
typealias PFNGLBINDFRAMEBUFFERPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETEFRAMEBUFFERSPROCVar = CPointerVarOf<PFNGLDELETEFRAMEBUFFERSPROC>
typealias PFNGLDELETEFRAMEBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENFRAMEBUFFERSPROCVar = CPointerVarOf<PFNGLGENFRAMEBUFFERSPROC>
typealias PFNGLGENFRAMEBUFFERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLCHECKFRAMEBUFFERSTATUSPROCVar = CPointerVarOf<PFNGLCHECKFRAMEBUFFERSTATUSPROC>
typealias PFNGLCHECKFRAMEBUFFERSTATUSPROC = CPointer<CFunction<(GLenum) -> GLenum>>

typealias PFNGLFRAMEBUFFERTEXTURE1DPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURE1DPROC>
typealias PFNGLFRAMEBUFFERTEXTURE1DPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLuint, GLint) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTURE2DPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURE2DPROC>
typealias PFNGLFRAMEBUFFERTEXTURE2DPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLuint, GLint) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTURE3DPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURE3DPROC>
typealias PFNGLFRAMEBUFFERTEXTURE3DPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLuint, GLint, GLint) -> Unit>>

typealias PFNGLFRAMEBUFFERRENDERBUFFERPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERRENDERBUFFERPROC>
typealias PFNGLFRAMEBUFFERRENDERBUFFERPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLuint) -> Unit>>

typealias PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC>
typealias PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGENERATEMIPMAPPROCVar = CPointerVarOf<PFNGLGENERATEMIPMAPPROC>
typealias PFNGLGENERATEMIPMAPPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLBLITFRAMEBUFFERPROCVar = CPointerVarOf<PFNGLBLITFRAMEBUFFERPROC>
typealias PFNGLBLITFRAMEBUFFERPROC = CPointer<CFunction<(GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum) -> Unit>>

typealias PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROCVar = CPointerVarOf<PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC>
typealias PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLFRAMEBUFFERTEXTURELAYERPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURELAYERPROC>
typealias PFNGLFRAMEBUFFERTEXTURELAYERPROC = CPointer<CFunction<(GLenum, GLenum, GLuint, GLint, GLint) -> Unit>>

typealias PFNGLMAPBUFFERRANGEPROCVar = CPointerVarOf<PFNGLMAPBUFFERRANGEPROC>
typealias PFNGLMAPBUFFERRANGEPROC = CPointer<CFunction<(GLenum, GLintptr, GLsizeiptr, GLbitfield) -> COpaquePointer?>>

typealias PFNGLFLUSHMAPPEDBUFFERRANGEPROCVar = CPointerVarOf<PFNGLFLUSHMAPPEDBUFFERRANGEPROC>
typealias PFNGLFLUSHMAPPEDBUFFERRANGEPROC = CPointer<CFunction<(GLenum, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLBINDVERTEXARRAYPROCVar = CPointerVarOf<PFNGLBINDVERTEXARRAYPROC>
typealias PFNGLBINDVERTEXARRAYPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLDELETEVERTEXARRAYSPROCVar = CPointerVarOf<PFNGLDELETEVERTEXARRAYSPROC>
typealias PFNGLDELETEVERTEXARRAYSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENVERTEXARRAYSPROCVar = CPointerVarOf<PFNGLGENVERTEXARRAYSPROC>
typealias PFNGLGENVERTEXARRAYSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISVERTEXARRAYPROCVar = CPointerVarOf<PFNGLISVERTEXARRAYPROC>
typealias PFNGLISVERTEXARRAYPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLGETUNIFORMINDICESPROCVar = CPointerVarOf<PFNGLGETUNIFORMINDICESPROC>
typealias PFNGLGETUNIFORMINDICESPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<CPointerVar<GLcharVar>>?, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETACTIVEUNIFORMSIVPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMSIVPROC>
typealias PFNGLGETACTIVEUNIFORMSIVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLuintVar>?, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETACTIVEUNIFORMNAMEPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMNAMEPROC>
typealias PFNGLGETACTIVEUNIFORMNAMEPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETUNIFORMBLOCKINDEXPROCVar = CPointerVarOf<PFNGLGETUNIFORMBLOCKINDEXPROC>
typealias PFNGLGETUNIFORMBLOCKINDEXPROC = CPointer<CFunction<(GLuint, CPointer<GLcharVar>?) -> GLuint>>

typealias PFNGLGETACTIVEUNIFORMBLOCKIVPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMBLOCKIVPROC>
typealias PFNGLGETACTIVEUNIFORMBLOCKIVPROC = CPointer<CFunction<(GLuint, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETACTIVEUNIFORMBLOCKNAMEPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC>
typealias PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC = CPointer<CFunction<(GLuint, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLUNIFORMBLOCKBINDINGPROCVar = CPointerVarOf<PFNGLUNIFORMBLOCKBINDINGPROC>
typealias PFNGLUNIFORMBLOCKBINDINGPROC = CPointer<CFunction<(GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLCOPYBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLCOPYBUFFERSUBDATAPROC>
typealias PFNGLCOPYBUFFERSUBDATAPROC = CPointer<CFunction<(GLenum, GLenum, GLintptr, GLintptr, GLsizeiptr) -> Unit>>

typealias PFNGLDRAWELEMENTSBASEVERTEXPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSBASEVERTEXPROC>
typealias PFNGLDRAWELEMENTSBASEVERTEXPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, COpaquePointer?, GLint) -> Unit>>

typealias PFNGLDRAWRANGEELEMENTSBASEVERTEXPROCVar = CPointerVarOf<PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC>
typealias PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC = CPointer<CFunction<(GLenum, GLuint, GLuint, GLsizei, GLenum, COpaquePointer?, GLint) -> Unit>>

typealias PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC>
typealias PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, COpaquePointer?, GLsizei, GLint) -> Unit>>

typealias PFNGLMULTIDRAWELEMENTSBASEVERTEXPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC>
typealias PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC = CPointer<CFunction<(GLenum, CPointer<GLsizeiVar>?, GLenum, CPointer<COpaquePointerVar>?, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROVOKINGVERTEXPROCVar = CPointerVarOf<PFNGLPROVOKINGVERTEXPROC>
typealias PFNGLPROVOKINGVERTEXPROC = CPointer<CFunction<(GLenum) -> Unit>>

typealias PFNGLFENCESYNCPROCVar = CPointerVarOf<PFNGLFENCESYNCPROC>
typealias PFNGLFENCESYNCPROC = CPointer<CFunction<(GLenum, GLbitfield) -> GLsync?>>

typealias PFNGLISSYNCPROCVar = CPointerVarOf<PFNGLISSYNCPROC>
typealias PFNGLISSYNCPROC = CPointer<CFunction<(GLsync?) -> GLboolean>>

typealias PFNGLDELETESYNCPROCVar = CPointerVarOf<PFNGLDELETESYNCPROC>
typealias PFNGLDELETESYNCPROC = CPointer<CFunction<(GLsync?) -> Unit>>

typealias PFNGLCLIENTWAITSYNCPROCVar = CPointerVarOf<PFNGLCLIENTWAITSYNCPROC>
typealias PFNGLCLIENTWAITSYNCPROC = CPointer<CFunction<(GLsync?, GLbitfield, GLuint64) -> GLenum>>

typealias PFNGLWAITSYNCPROCVar = CPointerVarOf<PFNGLWAITSYNCPROC>
typealias PFNGLWAITSYNCPROC = CPointer<CFunction<(GLsync?, GLbitfield, GLuint64) -> Unit>>

typealias PFNGLGETINTEGER64VPROCVar = CPointerVarOf<PFNGLGETINTEGER64VPROC>
typealias PFNGLGETINTEGER64VPROC = CPointer<CFunction<(GLenum, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLGETSYNCIVPROCVar = CPointerVarOf<PFNGLGETSYNCIVPROC>
typealias PFNGLGETSYNCIVPROC = CPointer<CFunction<(GLsync?, GLenum, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTEXIMAGE2DMULTISAMPLEPROCVar = CPointerVarOf<PFNGLTEXIMAGE2DMULTISAMPLEPROC>
typealias PFNGLTEXIMAGE2DMULTISAMPLEPROC = CPointer<CFunction<(GLenum, GLsizei, GLint, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLTEXIMAGE3DMULTISAMPLEPROCVar = CPointerVarOf<PFNGLTEXIMAGE3DMULTISAMPLEPROC>
typealias PFNGLTEXIMAGE3DMULTISAMPLEPROC = CPointer<CFunction<(GLenum, GLsizei, GLint, GLsizei, GLsizei, GLsizei, GLboolean) -> Unit>>

typealias PFNGLGETMULTISAMPLEFVPROCVar = CPointerVarOf<PFNGLGETMULTISAMPLEFVPROC>
typealias PFNGLGETMULTISAMPLEFVPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLSAMPLEMASKIPROCVar = CPointerVarOf<PFNGLSAMPLEMASKIPROC>
typealias PFNGLSAMPLEMASKIPROC = CPointer<CFunction<(GLuint, GLbitfield) -> Unit>>

typealias PFNGLBINDFRAGDATALOCATIONINDEXEDPROCVar = CPointerVarOf<PFNGLBINDFRAGDATALOCATIONINDEXEDPROC>
typealias PFNGLBINDFRAGDATALOCATIONINDEXEDPROC = CPointer<CFunction<(GLuint, GLuint, GLuint, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETFRAGDATAINDEXPROCVar = CPointerVarOf<PFNGLGETFRAGDATAINDEXPROC>
typealias PFNGLGETFRAGDATAINDEXPROC = CPointer<CFunction<(GLuint, CPointer<GLcharVar>?) -> GLint>>

typealias PFNGLGENSAMPLERSPROCVar = CPointerVarOf<PFNGLGENSAMPLERSPROC>
typealias PFNGLGENSAMPLERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLDELETESAMPLERSPROCVar = CPointerVarOf<PFNGLDELETESAMPLERSPROC>
typealias PFNGLDELETESAMPLERSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISSAMPLERPROCVar = CPointerVarOf<PFNGLISSAMPLERPROC>
typealias PFNGLISSAMPLERPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLBINDSAMPLERPROCVar = CPointerVarOf<PFNGLBINDSAMPLERPROC>
typealias PFNGLBINDSAMPLERPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLSAMPLERPARAMETERIPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERIPROC>
typealias PFNGLSAMPLERPARAMETERIPROC = CPointer<CFunction<(GLuint, GLenum, GLint) -> Unit>>

typealias PFNGLSAMPLERPARAMETERIVPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERIVPROC>
typealias PFNGLSAMPLERPARAMETERIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLSAMPLERPARAMETERFPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERFPROC>
typealias PFNGLSAMPLERPARAMETERFPROC = CPointer<CFunction<(GLuint, GLenum, GLfloat) -> Unit>>

typealias PFNGLSAMPLERPARAMETERFVPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERFVPROC>
typealias PFNGLSAMPLERPARAMETERFVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLSAMPLERPARAMETERIIVPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERIIVPROC>
typealias PFNGLSAMPLERPARAMETERIIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLSAMPLERPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERIUIVPROC>
typealias PFNGLSAMPLERPARAMETERIUIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETSAMPLERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETSAMPLERPARAMETERIVPROC>
typealias PFNGLGETSAMPLERPARAMETERIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETSAMPLERPARAMETERIIVPROCVar = CPointerVarOf<PFNGLGETSAMPLERPARAMETERIIVPROC>
typealias PFNGLGETSAMPLERPARAMETERIIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETSAMPLERPARAMETERFVPROCVar = CPointerVarOf<PFNGLGETSAMPLERPARAMETERFVPROC>
typealias PFNGLGETSAMPLERPARAMETERFVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETSAMPLERPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLGETSAMPLERPARAMETERIUIVPROC>
typealias PFNGLGETSAMPLERPARAMETERIUIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLQUERYCOUNTERPROCVar = CPointerVarOf<PFNGLQUERYCOUNTERPROC>
typealias PFNGLQUERYCOUNTERPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLGETQUERYOBJECTI64VPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTI64VPROC>
typealias PFNGLGETQUERYOBJECTI64VPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLint64Var>?) -> Unit>>

typealias PFNGLGETQUERYOBJECTUI64VPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTUI64VPROC>
typealias PFNGLGETQUERYOBJECTUI64VPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLuint64Var>?) -> Unit>>

typealias PFNGLVERTEXATTRIBP1UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP1UIPROC>
typealias PFNGLVERTEXATTRIBP1UIPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBP1UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP1UIVPROC>
typealias PFNGLVERTEXATTRIBP1UIVPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBP2UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP2UIPROC>
typealias PFNGLVERTEXATTRIBP2UIPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBP2UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP2UIVPROC>
typealias PFNGLVERTEXATTRIBP2UIVPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBP3UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP3UIPROC>
typealias PFNGLVERTEXATTRIBP3UIPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBP3UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP3UIVPROC>
typealias PFNGLVERTEXATTRIBP3UIVPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBP4UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP4UIPROC>
typealias PFNGLVERTEXATTRIBP4UIPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, GLuint) -> Unit>>

typealias PFNGLVERTEXATTRIBP4UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP4UIVPROC>
typealias PFNGLVERTEXATTRIBP4UIVPROC = CPointer<CFunction<(GLuint, GLenum, GLboolean, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLDRAWARRAYSINDIRECTPROCVar = CPointerVarOf<PFNGLDRAWARRAYSINDIRECTPROC>
typealias PFNGLDRAWARRAYSINDIRECTPROC = CPointer<CFunction<(GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLDRAWELEMENTSINDIRECTPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINDIRECTPROC>
typealias PFNGLDRAWELEMENTSINDIRECTPROC = CPointer<CFunction<(GLenum, GLenum, COpaquePointer?) -> Unit>>

typealias PFNGLUNIFORM1DPROCVar = CPointerVarOf<PFNGLUNIFORM1DPROC>
typealias PFNGLUNIFORM1DPROC = CPointer<CFunction<(GLint, GLdouble) -> Unit>>

typealias PFNGLUNIFORM2DPROCVar = CPointerVarOf<PFNGLUNIFORM2DPROC>
typealias PFNGLUNIFORM2DPROC = CPointer<CFunction<(GLint, GLdouble, GLdouble) -> Unit>>

typealias PFNGLUNIFORM3DPROCVar = CPointerVarOf<PFNGLUNIFORM3DPROC>
typealias PFNGLUNIFORM3DPROC = CPointer<CFunction<(GLint, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLUNIFORM4DPROCVar = CPointerVarOf<PFNGLUNIFORM4DPROC>
typealias PFNGLUNIFORM4DPROC = CPointer<CFunction<(GLint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLUNIFORM1DVPROCVar = CPointerVarOf<PFNGLUNIFORM1DVPROC>
typealias PFNGLUNIFORM1DVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORM2DVPROCVar = CPointerVarOf<PFNGLUNIFORM2DVPROC>
typealias PFNGLUNIFORM2DVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORM3DVPROCVar = CPointerVarOf<PFNGLUNIFORM3DVPROC>
typealias PFNGLUNIFORM3DVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORM4DVPROCVar = CPointerVarOf<PFNGLUNIFORM4DVPROC>
typealias PFNGLUNIFORM4DVPROC = CPointer<CFunction<(GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX2DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2DVPROC>
typealias PFNGLUNIFORMMATRIX2DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX3DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3DVPROC>
typealias PFNGLUNIFORMMATRIX3DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX4DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4DVPROC>
typealias PFNGLUNIFORMMATRIX4DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX2X3DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2X3DVPROC>
typealias PFNGLUNIFORMMATRIX2X3DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX2X4DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2X4DVPROC>
typealias PFNGLUNIFORMMATRIX2X4DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX3X2DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3X2DVPROC>
typealias PFNGLUNIFORMMATRIX3X2DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX3X4DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3X4DVPROC>
typealias PFNGLUNIFORMMATRIX3X4DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX4X2DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4X2DVPROC>
typealias PFNGLUNIFORMMATRIX4X2DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLUNIFORMMATRIX4X3DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4X3DVPROC>
typealias PFNGLUNIFORMMATRIX4X3DVPROC = CPointer<CFunction<(GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETUNIFORMDVPROCVar = CPointerVarOf<PFNGLGETUNIFORMDVPROC>
typealias PFNGLGETUNIFORMDVPROC = CPointer<CFunction<(GLuint, GLint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLGETSUBROUTINEUNIFORMLOCATIONPROCVar = CPointerVarOf<PFNGLGETSUBROUTINEUNIFORMLOCATIONPROC>
typealias PFNGLGETSUBROUTINEUNIFORMLOCATIONPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLcharVar>?) -> GLint>>

typealias PFNGLGETSUBROUTINEINDEXPROCVar = CPointerVarOf<PFNGLGETSUBROUTINEINDEXPROC>
typealias PFNGLGETSUBROUTINEINDEXPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLcharVar>?) -> GLuint>>

typealias PFNGLGETACTIVESUBROUTINEUNIFORMIVPROCVar = CPointerVarOf<PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC>
typealias PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROCVar = CPointerVarOf<PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROC>
typealias PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETACTIVESUBROUTINENAMEPROCVar = CPointerVarOf<PFNGLGETACTIVESUBROUTINENAMEPROC>
typealias PFNGLGETACTIVESUBROUTINENAMEPROC = CPointer<CFunction<(GLuint, GLenum, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLUNIFORMSUBROUTINESUIVPROCVar = CPointerVarOf<PFNGLUNIFORMSUBROUTINESUIVPROC>
typealias PFNGLUNIFORMSUBROUTINESUIVPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETUNIFORMSUBROUTINEUIVPROCVar = CPointerVarOf<PFNGLGETUNIFORMSUBROUTINEUIVPROC>
typealias PFNGLGETUNIFORMSUBROUTINEUIVPROC = CPointer<CFunction<(GLenum, GLint, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGETPROGRAMSTAGEIVPROCVar = CPointerVarOf<PFNGLGETPROGRAMSTAGEIVPROC>
typealias PFNGLGETPROGRAMSTAGEIVPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPATCHPARAMETERIPROCVar = CPointerVarOf<PFNGLPATCHPARAMETERIPROC>
typealias PFNGLPATCHPARAMETERIPROC = CPointer<CFunction<(GLenum, GLint) -> Unit>>

typealias PFNGLPATCHPARAMETERFVPROCVar = CPointerVarOf<PFNGLPATCHPARAMETERFVPROC>
typealias PFNGLPATCHPARAMETERFVPROC = CPointer<CFunction<(GLenum, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLBINDTRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLBINDTRANSFORMFEEDBACKPROC>
typealias PFNGLBINDTRANSFORMFEEDBACKPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDELETETRANSFORMFEEDBACKSPROCVar = CPointerVarOf<PFNGLDELETETRANSFORMFEEDBACKSPROC>
typealias PFNGLDELETETRANSFORMFEEDBACKSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENTRANSFORMFEEDBACKSPROCVar = CPointerVarOf<PFNGLGENTRANSFORMFEEDBACKSPROC>
typealias PFNGLGENTRANSFORMFEEDBACKSPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISTRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLISTRANSFORMFEEDBACKPROC>
typealias PFNGLISTRANSFORMFEEDBACKPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLPAUSETRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLPAUSETRANSFORMFEEDBACKPROC>
typealias PFNGLPAUSETRANSFORMFEEDBACKPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLRESUMETRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLRESUMETRANSFORMFEEDBACKPROC>
typealias PFNGLRESUMETRANSFORMFEEDBACKPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLDRAWTRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLDRAWTRANSFORMFEEDBACKPROC>
typealias PFNGLDRAWTRANSFORMFEEDBACKPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROCVar = CPointerVarOf<PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC>
typealias PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC = CPointer<CFunction<(GLenum, GLuint, GLuint) -> Unit>>

typealias PFNGLBEGINQUERYINDEXEDPROCVar = CPointerVarOf<PFNGLBEGINQUERYINDEXEDPROC>
typealias PFNGLBEGINQUERYINDEXEDPROC = CPointer<CFunction<(GLenum, GLuint, GLuint) -> Unit>>

typealias PFNGLENDQUERYINDEXEDPROCVar = CPointerVarOf<PFNGLENDQUERYINDEXEDPROC>
typealias PFNGLENDQUERYINDEXEDPROC = CPointer<CFunction<(GLenum, GLuint) -> Unit>>

typealias PFNGLGETQUERYINDEXEDIVPROCVar = CPointerVarOf<PFNGLGETQUERYINDEXEDIVPROC>
typealias PFNGLGETQUERYINDEXEDIVPROC = CPointer<CFunction<(GLenum, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLRELEASESHADERCOMPILERPROCVar = CPointerVarOf<PFNGLRELEASESHADERCOMPILERPROC>
typealias PFNGLRELEASESHADERCOMPILERPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLSHADERBINARYPROCVar = CPointerVarOf<PFNGLSHADERBINARYPROC>
typealias PFNGLSHADERBINARYPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?, GLenum, COpaquePointer?, GLsizei) -> Unit>>

typealias PFNGLGETSHADERPRECISIONFORMATPROCVar = CPointerVarOf<PFNGLGETSHADERPRECISIONFORMATPROC>
typealias PFNGLGETSHADERPRECISIONFORMATPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<GLintVar>?, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLDEPTHRANGEFPROCVar = CPointerVarOf<PFNGLDEPTHRANGEFPROC>
typealias PFNGLDEPTHRANGEFPROC = CPointer<CFunction<(GLclampf, GLclampf) -> Unit>>

typealias PFNGLCLEARDEPTHFPROCVar = CPointerVarOf<PFNGLCLEARDEPTHFPROC>
typealias PFNGLCLEARDEPTHFPROC = CPointer<CFunction<(GLclampf) -> Unit>>

typealias PFNGLGETPROGRAMBINARYPROCVar = CPointerVarOf<PFNGLGETPROGRAMBINARYPROC>
typealias PFNGLGETPROGRAMBINARYPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLenumVar>?, COpaquePointer?) -> Unit>>

typealias PFNGLPROGRAMBINARYPROCVar = CPointerVarOf<PFNGLPROGRAMBINARYPROC>
typealias PFNGLPROGRAMBINARYPROC = CPointer<CFunction<(GLuint, GLenum, COpaquePointer?, GLsizei) -> Unit>>

typealias PFNGLPROGRAMPARAMETERIPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETERIPROC>
typealias PFNGLPROGRAMPARAMETERIPROC = CPointer<CFunction<(GLuint, GLenum, GLint) -> Unit>>

typealias PFNGLUSEPROGRAMSTAGESPROCVar = CPointerVarOf<PFNGLUSEPROGRAMSTAGESPROC>
typealias PFNGLUSEPROGRAMSTAGESPROC = CPointer<CFunction<(GLuint, GLbitfield, GLuint) -> Unit>>

typealias PFNGLACTIVESHADERPROGRAMPROCVar = CPointerVarOf<PFNGLACTIVESHADERPROGRAMPROC>
typealias PFNGLACTIVESHADERPROGRAMPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLCREATESHADERPROGRAMVPROCVar = CPointerVarOf<PFNGLCREATESHADERPROGRAMVPROC>
typealias PFNGLCREATESHADERPROGRAMVPROC = CPointer<CFunction<(GLenum, GLsizei, CPointer<CPointerVar<GLcharVar>>?) -> GLuint>>

typealias PFNGLBINDPROGRAMPIPELINEPROCVar = CPointerVarOf<PFNGLBINDPROGRAMPIPELINEPROC>
typealias PFNGLBINDPROGRAMPIPELINEPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLDELETEPROGRAMPIPELINESPROCVar = CPointerVarOf<PFNGLDELETEPROGRAMPIPELINESPROC>
typealias PFNGLDELETEPROGRAMPIPELINESPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLGENPROGRAMPIPELINESPROCVar = CPointerVarOf<PFNGLGENPROGRAMPIPELINESPROC>
typealias PFNGLGENPROGRAMPIPELINESPROC = CPointer<CFunction<(GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLISPROGRAMPIPELINEPROCVar = CPointerVarOf<PFNGLISPROGRAMPIPELINEPROC>
typealias PFNGLISPROGRAMPIPELINEPROC = CPointer<CFunction<(GLuint) -> GLboolean>>

typealias PFNGLGETPROGRAMPIPELINEIVPROCVar = CPointerVarOf<PFNGLGETPROGRAMPIPELINEIVPROC>
typealias PFNGLGETPROGRAMPIPELINEIVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1IPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1IPROC>
typealias PFNGLPROGRAMUNIFORM1IPROC = CPointer<CFunction<(GLuint, GLint, GLint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1IVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1IVPROC>
typealias PFNGLPROGRAMUNIFORM1IVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1FPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1FPROC>
typealias PFNGLPROGRAMUNIFORM1FPROC = CPointer<CFunction<(GLuint, GLint, GLfloat) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1FVPROC>
typealias PFNGLPROGRAMUNIFORM1FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1DPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1DPROC>
typealias PFNGLPROGRAMUNIFORM1DPROC = CPointer<CFunction<(GLuint, GLint, GLdouble) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1DVPROC>
typealias PFNGLPROGRAMUNIFORM1DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1UIPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UIPROC>
typealias PFNGLPROGRAMUNIFORM1UIPROC = CPointer<CFunction<(GLuint, GLint, GLuint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM1UIVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UIVPROC>
typealias PFNGLPROGRAMUNIFORM1UIVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2IPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2IPROC>
typealias PFNGLPROGRAMUNIFORM2IPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2IVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2IVPROC>
typealias PFNGLPROGRAMUNIFORM2IVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2FPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2FPROC>
typealias PFNGLPROGRAMUNIFORM2FPROC = CPointer<CFunction<(GLuint, GLint, GLfloat, GLfloat) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2FVPROC>
typealias PFNGLPROGRAMUNIFORM2FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2DPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2DPROC>
typealias PFNGLPROGRAMUNIFORM2DPROC = CPointer<CFunction<(GLuint, GLint, GLdouble, GLdouble) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2DVPROC>
typealias PFNGLPROGRAMUNIFORM2DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2UIPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UIPROC>
typealias PFNGLPROGRAMUNIFORM2UIPROC = CPointer<CFunction<(GLuint, GLint, GLuint, GLuint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM2UIVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UIVPROC>
typealias PFNGLPROGRAMUNIFORM2UIVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3IPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3IPROC>
typealias PFNGLPROGRAMUNIFORM3IPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3IVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3IVPROC>
typealias PFNGLPROGRAMUNIFORM3IVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3FPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3FPROC>
typealias PFNGLPROGRAMUNIFORM3FPROC = CPointer<CFunction<(GLuint, GLint, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3FVPROC>
typealias PFNGLPROGRAMUNIFORM3FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3DPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3DPROC>
typealias PFNGLPROGRAMUNIFORM3DPROC = CPointer<CFunction<(GLuint, GLint, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3DVPROC>
typealias PFNGLPROGRAMUNIFORM3DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3UIPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UIPROC>
typealias PFNGLPROGRAMUNIFORM3UIPROC = CPointer<CFunction<(GLuint, GLint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM3UIVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UIVPROC>
typealias PFNGLPROGRAMUNIFORM3UIVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4IPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4IPROC>
typealias PFNGLPROGRAMUNIFORM4IPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLint, GLint, GLint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4IVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4IVPROC>
typealias PFNGLPROGRAMUNIFORM4IVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4FPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4FPROC>
typealias PFNGLPROGRAMUNIFORM4FPROC = CPointer<CFunction<(GLuint, GLint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4FVPROC>
typealias PFNGLPROGRAMUNIFORM4FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4DPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4DPROC>
typealias PFNGLPROGRAMUNIFORM4DPROC = CPointer<CFunction<(GLuint, GLint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4DVPROC>
typealias PFNGLPROGRAMUNIFORM4DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4UIPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UIPROC>
typealias PFNGLPROGRAMUNIFORM4UIPROC = CPointer<CFunction<(GLuint, GLint, GLuint, GLuint, GLuint, GLuint) -> Unit>>

typealias PFNGLPROGRAMUNIFORM4UIVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UIVPROC>
typealias PFNGLPROGRAMUNIFORM4UIVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, CPointer<GLuintVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X3FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X3FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X3FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X2FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X2FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X2FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X4FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X4FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X4FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X2FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X2FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X2FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X4FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X4FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X4FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X3FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X3FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X3FVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X3DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X3DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X3DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X2DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X2DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X2DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X4DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X4DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X4DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X2DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X2DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X2DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X4DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X4DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X4DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X3DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC = CPointer<CFunction<(GLuint, GLint, GLsizei, GLboolean, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVALIDATEPROGRAMPIPELINEPROCVar = CPointerVarOf<PFNGLVALIDATEPROGRAMPIPELINEPROC>
typealias PFNGLVALIDATEPROGRAMPIPELINEPROC = CPointer<CFunction<(GLuint) -> Unit>>

typealias PFNGLGETPROGRAMPIPELINEINFOLOGPROCVar = CPointerVarOf<PFNGLGETPROGRAMPIPELINEINFOLOGPROC>
typealias PFNGLGETPROGRAMPIPELINEINFOLOGPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL1DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1DPROC>
typealias PFNGLVERTEXATTRIBL1DPROC = CPointer<CFunction<(GLuint, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIBL2DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2DPROC>
typealias PFNGLVERTEXATTRIBL2DPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIBL3DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3DPROC>
typealias PFNGLVERTEXATTRIBL3DPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIBL4DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4DPROC>
typealias PFNGLVERTEXATTRIBL4DPROC = CPointer<CFunction<(GLuint, GLdouble, GLdouble, GLdouble, GLdouble) -> Unit>>

typealias PFNGLVERTEXATTRIBL1DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1DVPROC>
typealias PFNGLVERTEXATTRIBL1DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL2DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2DVPROC>
typealias PFNGLVERTEXATTRIBL2DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL3DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3DVPROC>
typealias PFNGLVERTEXATTRIBL3DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBL4DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4DVPROC>
typealias PFNGLVERTEXATTRIBL4DVPROC = CPointer<CFunction<(GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVERTEXATTRIBLPOINTERPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBLPOINTERPROC>
typealias PFNGLVERTEXATTRIBLPOINTERPROC = CPointer<CFunction<(GLuint, GLint, GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETVERTEXATTRIBLDVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBLDVPROC>
typealias PFNGLGETVERTEXATTRIBLDVPROC = CPointer<CFunction<(GLuint, GLenum, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLVIEWPORTARRAYVPROCVar = CPointerVarOf<PFNGLVIEWPORTARRAYVPROC>
typealias PFNGLVIEWPORTARRAYVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLVIEWPORTINDEXEDFPROCVar = CPointerVarOf<PFNGLVIEWPORTINDEXEDFPROC>
typealias PFNGLVIEWPORTINDEXEDFPROC = CPointer<CFunction<(GLuint, GLfloat, GLfloat, GLfloat, GLfloat) -> Unit>>

typealias PFNGLVIEWPORTINDEXEDFVPROCVar = CPointerVarOf<PFNGLVIEWPORTINDEXEDFVPROC>
typealias PFNGLVIEWPORTINDEXEDFVPROC = CPointer<CFunction<(GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLSCISSORARRAYVPROCVar = CPointerVarOf<PFNGLSCISSORARRAYVPROC>
typealias PFNGLSCISSORARRAYVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLSCISSORINDEXEDPROCVar = CPointerVarOf<PFNGLSCISSORINDEXEDPROC>
typealias PFNGLSCISSORINDEXEDPROC = CPointer<CFunction<(GLuint, GLint, GLint, GLsizei, GLsizei) -> Unit>>

typealias PFNGLSCISSORINDEXEDVPROCVar = CPointerVarOf<PFNGLSCISSORINDEXEDVPROC>
typealias PFNGLSCISSORINDEXEDVPROC = CPointer<CFunction<(GLuint, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLDEPTHRANGEARRAYVPROCVar = CPointerVarOf<PFNGLDEPTHRANGEARRAYVPROC>
typealias PFNGLDEPTHRANGEARRAYVPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<GLclampdVar>?) -> Unit>>

typealias PFNGLDEPTHRANGEINDEXEDPROCVar = CPointerVarOf<PFNGLDEPTHRANGEINDEXEDPROC>
typealias PFNGLDEPTHRANGEINDEXEDPROC = CPointer<CFunction<(GLuint, GLclampd, GLclampd) -> Unit>>

typealias PFNGLGETFLOATI_VPROCVar = CPointerVarOf<PFNGLGETFLOATI_VPROC>
typealias PFNGLGETFLOATI_VPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLfloatVar>?) -> Unit>>

typealias PFNGLGETDOUBLEI_VPROCVar = CPointerVarOf<PFNGLGETDOUBLEI_VPROC>
typealias PFNGLGETDOUBLEI_VPROC = CPointer<CFunction<(GLenum, GLuint, CPointer<GLdoubleVar>?) -> Unit>>

typealias PFNGLBLENDEQUATIONIARBPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONIARBPROC>
typealias PFNGLBLENDEQUATIONIARBPROC = CPointer<CFunction<(GLuint, GLenum) -> Unit>>

typealias PFNGLBLENDEQUATIONSEPARATEIARBPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONSEPARATEIARBPROC>
typealias PFNGLBLENDEQUATIONSEPARATEIARBPROC = CPointer<CFunction<(GLuint, GLenum, GLenum) -> Unit>>

typealias PFNGLBLENDFUNCIARBPROCVar = CPointerVarOf<PFNGLBLENDFUNCIARBPROC>
typealias PFNGLBLENDFUNCIARBPROC = CPointer<CFunction<(GLuint, GLenum, GLenum) -> Unit>>

typealias PFNGLBLENDFUNCSEPARATEIARBPROCVar = CPointerVarOf<PFNGLBLENDFUNCSEPARATEIARBPROC>
typealias PFNGLBLENDFUNCSEPARATEIARBPROC = CPointer<CFunction<(GLuint, GLenum, GLenum, GLenum, GLenum) -> Unit>>

typealias PFNGLVERTEXATTRIBDIVISORARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBDIVISORARBPROC>
typealias PFNGLVERTEXATTRIBDIVISORARBPROC = CPointer<CFunction<(GLuint, GLuint) -> Unit>>

typealias PFNGLGETINTERNALFORMATIVPROCVar = CPointerVarOf<PFNGLGETINTERNALFORMATIVPROC>
typealias PFNGLGETINTERNALFORMATIVPROC = CPointer<CFunction<(GLenum, GLenum, GLenum, GLsizei, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLMINSAMPLESHADINGARBPROCVar = CPointerVarOf<PFNGLMINSAMPLESHADINGARBPROC>
typealias PFNGLMINSAMPLESHADINGARBPROC = CPointer<CFunction<(GLclampf) -> Unit>>

typealias PFNGLNAMEDSTRINGARBPROCVar = CPointerVarOf<PFNGLNAMEDSTRINGARBPROC>
typealias PFNGLNAMEDSTRINGARBPROC = CPointer<CFunction<(GLenum, GLint, CPointer<GLcharVar>?, GLint, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLDELETENAMEDSTRINGARBPROCVar = CPointerVarOf<PFNGLDELETENAMEDSTRINGARBPROC>
typealias PFNGLDELETENAMEDSTRINGARBPROC = CPointer<CFunction<(GLint, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLCOMPILESHADERINCLUDEARBPROCVar = CPointerVarOf<PFNGLCOMPILESHADERINCLUDEARBPROC>
typealias PFNGLCOMPILESHADERINCLUDEARBPROC = CPointer<CFunction<(GLuint, GLsizei, CPointer<CPointerVar<GLcharVar>>?, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLISNAMEDSTRINGARBPROCVar = CPointerVarOf<PFNGLISNAMEDSTRINGARBPROC>
typealias PFNGLISNAMEDSTRINGARBPROC = CPointer<CFunction<(GLint, CPointer<GLcharVar>?) -> GLboolean>>

typealias PFNGLGETNAMEDSTRINGARBPROCVar = CPointerVarOf<PFNGLGETNAMEDSTRINGARBPROC>
typealias PFNGLGETNAMEDSTRINGARBPROC = CPointer<CFunction<(GLint, CPointer<GLcharVar>?, GLsizei, CPointer<GLintVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETNAMEDSTRINGIVARBPROCVar = CPointerVarOf<PFNGLGETNAMEDSTRINGIVARBPROC>
typealias PFNGLGETNAMEDSTRINGIVARBPROC = CPointer<CFunction<(GLint, CPointer<GLcharVar>?, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTEXSTORAGE1DPROCVar = CPointerVarOf<PFNGLTEXSTORAGE1DPROC>
typealias PFNGLTEXSTORAGE1DPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei) -> Unit>>

typealias PFNGLTEXSTORAGE2DPROCVar = CPointerVarOf<PFNGLTEXSTORAGE2DPROC>
typealias PFNGLTEXSTORAGE2DPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLsizei) -> Unit>>

typealias PFNGLTEXSTORAGE3DPROCVar = CPointerVarOf<PFNGLTEXSTORAGE3DPROC>
typealias PFNGLTEXSTORAGE3DPROC = CPointer<CFunction<(GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei) -> Unit>>

typealias PFNGLLABELOBJECTEXTPROCVar = CPointerVarOf<PFNGLLABELOBJECTEXTPROC>
typealias PFNGLLABELOBJECTEXTPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLGETOBJECTLABELEXTPROCVar = CPointerVarOf<PFNGLGETOBJECTLABELEXTPROC>
typealias PFNGLGETOBJECTLABELEXTPROC = CPointer<CFunction<(GLenum, GLuint, GLsizei, CPointer<GLsizeiVar>?, CPointer<GLcharVar>?) -> Unit>>

typealias PFNGLINSERTEVENTMARKEREXTPROCVar = CPointerVarOf<PFNGLINSERTEVENTMARKEREXTPROC>
typealias PFNGLINSERTEVENTMARKEREXTPROC = CPointer<CFunction<(GLsizei, CPointer<ByteVar>?) -> Unit>>

typealias PFNGLPUSHGROUPMARKEREXTPROCVar = CPointerVarOf<PFNGLPUSHGROUPMARKEREXTPROC>
typealias PFNGLPUSHGROUPMARKEREXTPROC = CPointer<CFunction<(GLsizei, CPointer<ByteVar>?) -> Unit>>

typealias PFNGLPOPGROUPMARKEREXTPROCVar = CPointerVarOf<PFNGLPOPGROUPMARKEREXTPROC>
typealias PFNGLPOPGROUPMARKEREXTPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLDEPTHBOUNDSEXTPROCVar = CPointerVarOf<PFNGLDEPTHBOUNDSEXTPROC>
typealias PFNGLDEPTHBOUNDSEXTPROC = CPointer<CFunction<(GLclampd, GLclampd) -> Unit>>

typealias PFNGLFLUSHRENDERAPPLEPROCVar = CPointerVarOf<PFNGLFLUSHRENDERAPPLEPROC>
typealias PFNGLFLUSHRENDERAPPLEPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLFINISHRENDERAPPLEPROCVar = CPointerVarOf<PFNGLFINISHRENDERAPPLEPROC>
typealias PFNGLFINISHRENDERAPPLEPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLSWAPAPPLEPROCVar = CPointerVarOf<PFNGLSWAPAPPLEPROC>
typealias PFNGLSWAPAPPLEPROC = CPointer<CFunction<() -> Unit>>

typealias PFNGLOBJECTPURGEABLEAPPLEPROCVar = CPointerVarOf<PFNGLOBJECTPURGEABLEAPPLEPROC>
typealias PFNGLOBJECTPURGEABLEAPPLEPROC = CPointer<CFunction<(GLenum, GLuint, GLenum) -> GLenum>>

typealias PFNGLOBJECTUNPURGEABLEAPPLEPROCVar = CPointerVarOf<PFNGLOBJECTUNPURGEABLEAPPLEPROC>
typealias PFNGLOBJECTUNPURGEABLEAPPLEPROC = CPointer<CFunction<(GLenum, GLuint, GLenum) -> GLenum>>

typealias PFNGLGETOBJECTPARAMETERIVAPPLEPROCVar = CPointerVarOf<PFNGLGETOBJECTPARAMETERIVAPPLEPROC>
typealias PFNGLGETOBJECTPARAMETERIVAPPLEPROC = CPointer<CFunction<(GLenum, GLuint, GLenum, CPointer<GLintVar>?) -> Unit>>

typealias PFNGLTEXTURERANGEAPPLEPROCVar = CPointerVarOf<PFNGLTEXTURERANGEAPPLEPROC>
typealias PFNGLTEXTURERANGEAPPLEPROC = CPointer<CFunction<(GLenum, GLsizei, COpaquePointer?) -> Unit>>

typealias PFNGLGETTEXPARAMETERPOINTERVAPPLEPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERPOINTERVAPPLEPROC>
typealias PFNGLGETTEXPARAMETERPOINTERVAPPLEPROC = CPointer<CFunction<(GLenum, GLenum, CPointer<COpaquePointerVar>?) -> Unit>>

typealias PFNGLTEXTUREBARRIERNVPROCVar = CPointerVarOf<PFNGLTEXTUREBARRIERNVPROC>
typealias PFNGLTEXTUREBARRIERNVPROC = CPointer<CFunction<() -> Unit>>

typealias GLUnurbsObj = GLUnurbs

typealias GLUquadricObj = GLUquadric

typealias GLUtesselatorObj = GLUtesselator

typealias GLUtriangulatorObj = GLUtesselator

@SymbolName("openGL_kniBridge0")
private external fun kniBridge0(p0: NativePtr, p1: NativePtr, p2: NativePtr): UInt
@SymbolName("openGL_kniBridge1")
private external fun kniBridge1(p0: NativePtr): UInt
@SymbolName("openGL_kniBridge2")
private external fun kniBridge2(p0: NativePtr, p1: Int, p2: UInt, p3: NativePtr): UInt
@SymbolName("openGL_kniBridge3")
private external fun kniBridge3(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge4")
private external fun kniBridge4(p0: NativePtr): NativePtr
@SymbolName("openGL_kniBridge5")
private external fun kniBridge5(p0: NativePtr): UInt
@SymbolName("openGL_kniBridge6")
private external fun kniBridge6(p0: UInt, p1: NativePtr, p2: NativePtr): UInt
@SymbolName("openGL_kniBridge7")
private external fun kniBridge7(p0: NativePtr): UInt
@SymbolName("openGL_kniBridge8")
private external fun kniBridge8(p0: NativePtr, p1: Int, p2: UInt, p3: NativePtr): UInt
@SymbolName("openGL_kniBridge9")
private external fun kniBridge9(p0: NativePtr, p1: NativePtr, p2: NativePtr): UInt
@SymbolName("openGL_kniBridge10")
private external fun kniBridge10(p0: NativePtr): UInt
@SymbolName("openGL_kniBridge11")
private external fun kniBridge11(p0: NativePtr, p1: NativePtr, p2: UInt): UInt
@SymbolName("openGL_kniBridge12")
private external fun kniBridge12(p0: NativePtr): NativePtr
@SymbolName("openGL_kniBridge13")
private external fun kniBridge13(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge14")
private external fun kniBridge14(p0: NativePtr): UInt
@SymbolName("openGL_kniBridge15")
private external fun kniBridge15(p0: NativePtr): NativePtr
@SymbolName("openGL_kniBridge16")
private external fun kniBridge16(p0: Int, p1: Int, p2: UInt, p3: UInt, p4: Int, p5: NativePtr): UInt
@SymbolName("openGL_kniBridge17")
private external fun kniBridge17(p0: NativePtr): UInt
@SymbolName("openGL_kniBridge18")
private external fun kniBridge18(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): UInt
@SymbolName("openGL_kniBridge19")
private external fun kniBridge19(p0: NativePtr, p1: NativePtr, p2: UInt): UInt
@SymbolName("openGL_kniBridge20")
private external fun kniBridge20(p0: NativePtr): NativePtr
@SymbolName("openGL_kniBridge21")
private external fun kniBridge21(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge22")
private external fun kniBridge22(p0: NativePtr): UInt
@SymbolName("openGL_kniBridge23")
private external fun kniBridge23(p0: NativePtr, p1: Int, p2: Int, p3: Int, p4: NativePtr): UInt
@SymbolName("openGL_kniBridge24")
private external fun kniBridge24(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): UInt
@SymbolName("openGL_kniBridge25")
private external fun kniBridge25(p0: NativePtr): UInt
@SymbolName("openGL_kniBridge26")
private external fun kniBridge26(p0: NativePtr, p1: UInt): UInt
@SymbolName("openGL_kniBridge27")
private external fun kniBridge27(p0: NativePtr, p1: NativePtr, p2: UInt, p3: Int, p4: Int): UInt
@SymbolName("openGL_kniBridge28")
private external fun kniBridge28(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): UInt
@SymbolName("openGL_kniBridge29")
private external fun kniBridge29(p0: NativePtr): UInt
@SymbolName("openGL_kniBridge30")
private external fun kniBridge30(p0: NativePtr): UInt
@SymbolName("openGL_kniBridge31")
private external fun kniBridge31(p0: NativePtr, p1: UInt): UInt
@SymbolName("openGL_kniBridge32")
private external fun kniBridge32(p0: NativePtr, p1: UInt): UInt
@SymbolName("openGL_kniBridge33")
private external fun kniBridge33(p0: NativePtr, p1: UInt, p2: NativePtr): UInt
@SymbolName("openGL_kniBridge34")
private external fun kniBridge34(p0: NativePtr, p1: UInt, p2: NativePtr): UInt
@SymbolName("openGL_kniBridge35")
private external fun kniBridge35(p0: NativePtr, p1: UInt, p2: NativePtr): UInt
@SymbolName("openGL_kniBridge36")
private external fun kniBridge36(p0: NativePtr, p1: Int): UInt
@SymbolName("openGL_kniBridge37")
private external fun kniBridge37(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("openGL_kniBridge38")
private external fun kniBridge38(p0: NativePtr): UInt
@SymbolName("openGL_kniBridge39")
private external fun kniBridge39(p0: UInt, p1: NativePtr): UInt
@SymbolName("openGL_kniBridge40")
private external fun kniBridge40(p0: UInt, p1: NativePtr): UInt
@SymbolName("openGL_kniBridge41")
private external fun kniBridge41(p0: UInt, p1: Int): UInt
@SymbolName("openGL_kniBridge42")
private external fun kniBridge42(p0: UInt, p1: NativePtr): UInt
@SymbolName("openGL_kniBridge43")
private external fun kniBridge43(p0: NativePtr): UInt
@SymbolName("openGL_kniBridge44")
private external fun kniBridge44(p0: NativePtr): UInt
@SymbolName("openGL_kniBridge45")
private external fun kniBridge45(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge46")
private external fun kniBridge46(p0: UInt): NativePtr
@SymbolName("openGL_kniBridge47")
private external fun kniBridge47(p0: UInt): Unit
@SymbolName("openGL_kniBridge48")
private external fun kniBridge48(p0: UInt): Unit
@SymbolName("openGL_kniBridge49")
private external fun kniBridge49(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge50")
private external fun kniBridge50(p0: Float): Unit
@SymbolName("openGL_kniBridge51")
private external fun kniBridge51(p0: Float): Unit
@SymbolName("openGL_kniBridge52")
private external fun kniBridge52(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge53")
private external fun kniBridge53(p0: Int, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("openGL_kniBridge54")
private external fun kniBridge54(p0: UInt, p1: UInt, p2: Float): Unit
@SymbolName("openGL_kniBridge55")
private external fun kniBridge55(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge56")
private external fun kniBridge56(p0: UInt, p1: UInt, p2: Int): Unit
@SymbolName("openGL_kniBridge57")
private external fun kniBridge57(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge58")
private external fun kniBridge58(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: UInt, p6: UInt, p7: NativePtr): Unit
@SymbolName("openGL_kniBridge59")
private external fun kniBridge59(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: UInt, p7: UInt, p8: NativePtr): Unit
@SymbolName("openGL_kniBridge60")
private external fun kniBridge60(p0: UInt): Unit
@SymbolName("openGL_kniBridge61")
private external fun kniBridge61(p0: UInt): Unit
@SymbolName("openGL_kniBridge62")
private external fun kniBridge62(p0: Float, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("openGL_kniBridge63")
private external fun kniBridge63(p0: Int): Unit
@SymbolName("openGL_kniBridge64")
private external fun kniBridge64(p0: Double): Unit
@SymbolName("openGL_kniBridge65")
private external fun kniBridge65(p0: UInt): Unit
@SymbolName("openGL_kniBridge66")
private external fun kniBridge66(p0: UByte, p1: UByte, p2: UByte, p3: UByte): Unit
@SymbolName("openGL_kniBridge67")
private external fun kniBridge67(p0: UByte): Unit
@SymbolName("openGL_kniBridge68")
private external fun kniBridge68(p0: UInt): Unit
@SymbolName("openGL_kniBridge69")
private external fun kniBridge69(p0: UInt): Unit
@SymbolName("openGL_kniBridge70")
private external fun kniBridge70(): Unit
@SymbolName("openGL_kniBridge71")
private external fun kniBridge71(): Unit
@SymbolName("openGL_kniBridge72")
private external fun kniBridge72(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge73")
private external fun kniBridge73(p0: UInt): Unit
@SymbolName("openGL_kniBridge74")
private external fun kniBridge74(p0: UInt, p1: Int, p2: UInt): Unit
@SymbolName("openGL_kniBridge75")
private external fun kniBridge75(p0: UInt, p1: UInt, p2: UInt): Unit
@SymbolName("openGL_kniBridge76")
private external fun kniBridge76(p0: UInt): Unit
@SymbolName("openGL_kniBridge77")
private external fun kniBridge77(p0: UInt, p1: Float): Unit
@SymbolName("openGL_kniBridge78")
private external fun kniBridge78(p0: UInt, p1: Int): Unit
@SymbolName("openGL_kniBridge79")
private external fun kniBridge79(p0: UInt): Unit
@SymbolName("openGL_kniBridge80")
private external fun kniBridge80(p0: Int, p1: Int, p2: Int, p3: Int, p4: UInt, p5: UInt, p6: NativePtr): Unit
@SymbolName("openGL_kniBridge81")
private external fun kniBridge81(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge82")
private external fun kniBridge82(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge83")
private external fun kniBridge83(): UInt
@SymbolName("openGL_kniBridge84")
private external fun kniBridge84(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge85")
private external fun kniBridge85(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge86")
private external fun kniBridge86(p0: UInt): NativePtr
@SymbolName("openGL_kniBridge87")
private external fun kniBridge87(p0: UInt, p1: Int, p2: UInt, p3: UInt, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge88")
private external fun kniBridge88(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge89")
private external fun kniBridge89(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge90")
private external fun kniBridge90(p0: UInt, p1: Int, p2: UInt, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge91")
private external fun kniBridge91(p0: UInt, p1: Int, p2: UInt, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge92")
private external fun kniBridge92(p0: UInt): UByte
@SymbolName("openGL_kniBridge93")
private external fun kniBridge93(p0: Double, p1: Double): Unit
@SymbolName("openGL_kniBridge94")
private external fun kniBridge94(p0: Int, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("openGL_kniBridge95")
private external fun kniBridge95(p0: UInt, p1: Int, p2: Int): Unit
@SymbolName("openGL_kniBridge96")
private external fun kniBridge96(p0: UInt, p1: Int, p2: UInt, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge97")
private external fun kniBridge97(p0: Float, p1: Float): Unit
@SymbolName("openGL_kniBridge98")
private external fun kniBridge98(p0: UInt, p1: Int, p2: UInt, p3: Int, p4: Int, p5: Int, p6: Int): Unit
@SymbolName("openGL_kniBridge99")
private external fun kniBridge99(p0: UInt, p1: Int, p2: UInt, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int): Unit
@SymbolName("openGL_kniBridge100")
private external fun kniBridge100(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): Unit
@SymbolName("openGL_kniBridge101")
private external fun kniBridge101(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int): Unit
@SymbolName("openGL_kniBridge102")
private external fun kniBridge102(p0: UInt, p1: Int, p2: Int, p3: Int, p4: UInt, p5: UInt, p6: NativePtr): Unit
@SymbolName("openGL_kniBridge103")
private external fun kniBridge103(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: UInt, p7: UInt, p8: NativePtr): Unit
@SymbolName("openGL_kniBridge104")
private external fun kniBridge104(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge105")
private external fun kniBridge105(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge106")
private external fun kniBridge106(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge107")
private external fun kniBridge107(p0: UInt): UByte
@SymbolName("openGL_kniBridge108")
private external fun kniBridge108(p0: Float, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("openGL_kniBridge109")
private external fun kniBridge109(p0: UInt): Unit
@SymbolName("openGL_kniBridge110")
private external fun kniBridge110(p0: UInt, p1: UInt, p2: UInt, p3: Int, p4: UInt, p5: NativePtr): Unit
@SymbolName("openGL_kniBridge111")
private external fun kniBridge111(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: UInt, p8: UInt, p9: NativePtr): Unit
@SymbolName("openGL_kniBridge112")
private external fun kniBridge112(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: UInt, p9: UInt, p10: NativePtr): Unit
@SymbolName("openGL_kniBridge113")
private external fun kniBridge113(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int): Unit
@SymbolName("openGL_kniBridge114")
private external fun kniBridge114(p0: UInt): Unit
@SymbolName("openGL_kniBridge115")
private external fun kniBridge115(p0: Float, p1: UByte): Unit
@SymbolName("openGL_kniBridge116")
private external fun kniBridge116(p0: UInt, p1: Int, p2: UInt, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: NativePtr): Unit
@SymbolName("openGL_kniBridge117")
private external fun kniBridge117(p0: UInt, p1: Int, p2: UInt, p3: Int, p4: Int, p5: Int, p6: Int, p7: NativePtr): Unit
@SymbolName("openGL_kniBridge118")
private external fun kniBridge118(p0: UInt, p1: Int, p2: UInt, p3: Int, p4: Int, p5: Int, p6: NativePtr): Unit
@SymbolName("openGL_kniBridge119")
private external fun kniBridge119(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: UInt, p9: Int, p10: NativePtr): Unit
@SymbolName("openGL_kniBridge120")
private external fun kniBridge120(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: UInt, p7: Int, p8: NativePtr): Unit
@SymbolName("openGL_kniBridge121")
private external fun kniBridge121(p0: UInt, p1: Int, p2: Int, p3: Int, p4: UInt, p5: Int, p6: NativePtr): Unit
@SymbolName("openGL_kniBridge122")
private external fun kniBridge122(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge123")
private external fun kniBridge123(p0: UInt, p1: UInt, p2: UInt, p3: UInt): Unit
@SymbolName("openGL_kniBridge124")
private external fun kniBridge124(p0: UInt, p1: NativePtr, p2: NativePtr, p3: Int): Unit
@SymbolName("openGL_kniBridge125")
private external fun kniBridge125(p0: UInt, p1: NativePtr, p2: UInt, p3: NativePtr, p4: Int): Unit
@SymbolName("openGL_kniBridge126")
private external fun kniBridge126(p0: UInt, p1: Float): Unit
@SymbolName("openGL_kniBridge127")
private external fun kniBridge127(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge128")
private external fun kniBridge128(p0: UInt, p1: Int): Unit
@SymbolName("openGL_kniBridge129")
private external fun kniBridge129(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge130")
private external fun kniBridge130(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge131")
private external fun kniBridge131(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge132")
private external fun kniBridge132(p0: UInt): UByte
@SymbolName("openGL_kniBridge133")
private external fun kniBridge133(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge134")
private external fun kniBridge134(p0: UInt): Unit
@SymbolName("openGL_kniBridge135")
private external fun kniBridge135(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge136")
private external fun kniBridge136(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge137")
private external fun kniBridge137(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge138")
private external fun kniBridge138(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge139")
private external fun kniBridge139(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge140")
private external fun kniBridge140(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge141")
private external fun kniBridge141(p0: UInt): UByte
@SymbolName("openGL_kniBridge142")
private external fun kniBridge142(p0: UInt, p1: Long, p2: NativePtr, p3: UInt): Unit
@SymbolName("openGL_kniBridge143")
private external fun kniBridge143(p0: UInt, p1: Long, p2: Long, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge144")
private external fun kniBridge144(p0: UInt, p1: Long, p2: Long, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge145")
private external fun kniBridge145(p0: UInt, p1: UInt): NativePtr
@SymbolName("openGL_kniBridge146")
private external fun kniBridge146(p0: UInt): UByte
@SymbolName("openGL_kniBridge147")
private external fun kniBridge147(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge148")
private external fun kniBridge148(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge149")
private external fun kniBridge149(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge150")
private external fun kniBridge150(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge151")
private external fun kniBridge151(p0: UInt, p1: UInt, p2: UInt, p3: UInt): Unit
@SymbolName("openGL_kniBridge152")
private external fun kniBridge152(p0: UInt, p1: UInt, p2: Int, p3: UInt): Unit
@SymbolName("openGL_kniBridge153")
private external fun kniBridge153(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge154")
private external fun kniBridge154(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge155")
private external fun kniBridge155(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge156")
private external fun kniBridge156(p0: UInt): Unit
@SymbolName("openGL_kniBridge157")
private external fun kniBridge157(): UInt
@SymbolName("openGL_kniBridge158")
private external fun kniBridge158(p0: UInt): UInt
@SymbolName("openGL_kniBridge159")
private external fun kniBridge159(p0: UInt): Unit
@SymbolName("openGL_kniBridge160")
private external fun kniBridge160(p0: UInt): Unit
@SymbolName("openGL_kniBridge161")
private external fun kniBridge161(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge162")
private external fun kniBridge162(p0: UInt): Unit
@SymbolName("openGL_kniBridge163")
private external fun kniBridge163(p0: UInt): Unit
@SymbolName("openGL_kniBridge164")
private external fun kniBridge164(p0: UInt, p1: UInt, p2: Int, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): Unit
@SymbolName("openGL_kniBridge165")
private external fun kniBridge165(p0: UInt, p1: UInt, p2: Int, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): Unit
@SymbolName("openGL_kniBridge166")
private external fun kniBridge166(p0: UInt, p1: Int, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge167")
private external fun kniBridge167(p0: UInt, p1: NativePtr): Int
@SymbolName("openGL_kniBridge168")
private external fun kniBridge168(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge169")
private external fun kniBridge169(p0: UInt, p1: Int, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge170")
private external fun kniBridge170(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge171")
private external fun kniBridge171(p0: UInt, p1: Int, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge172")
private external fun kniBridge172(p0: UInt, p1: Int, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge173")
private external fun kniBridge173(p0: UInt, p1: NativePtr): Int
@SymbolName("openGL_kniBridge174")
private external fun kniBridge174(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge175")
private external fun kniBridge175(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge176")
private external fun kniBridge176(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge177")
private external fun kniBridge177(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge178")
private external fun kniBridge178(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge179")
private external fun kniBridge179(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge180")
private external fun kniBridge180(p0: UInt): UByte
@SymbolName("openGL_kniBridge181")
private external fun kniBridge181(p0: UInt): UByte
@SymbolName("openGL_kniBridge182")
private external fun kniBridge182(p0: UInt): Unit
@SymbolName("openGL_kniBridge183")
private external fun kniBridge183(p0: UInt, p1: Int, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge184")
private external fun kniBridge184(p0: UInt): Unit
@SymbolName("openGL_kniBridge185")
private external fun kniBridge185(p0: Int, p1: Float): Unit
@SymbolName("openGL_kniBridge186")
private external fun kniBridge186(p0: Int, p1: Float, p2: Float): Unit
@SymbolName("openGL_kniBridge187")
private external fun kniBridge187(p0: Int, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("openGL_kniBridge188")
private external fun kniBridge188(p0: Int, p1: Float, p2: Float, p3: Float, p4: Float): Unit
@SymbolName("openGL_kniBridge189")
private external fun kniBridge189(p0: Int, p1: Int): Unit
@SymbolName("openGL_kniBridge190")
private external fun kniBridge190(p0: Int, p1: Int, p2: Int): Unit
@SymbolName("openGL_kniBridge191")
private external fun kniBridge191(p0: Int, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("openGL_kniBridge192")
private external fun kniBridge192(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): Unit
@SymbolName("openGL_kniBridge193")
private external fun kniBridge193(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge194")
private external fun kniBridge194(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge195")
private external fun kniBridge195(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge196")
private external fun kniBridge196(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge197")
private external fun kniBridge197(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge198")
private external fun kniBridge198(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge199")
private external fun kniBridge199(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge200")
private external fun kniBridge200(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge201")
private external fun kniBridge201(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge202")
private external fun kniBridge202(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge203")
private external fun kniBridge203(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge204")
private external fun kniBridge204(p0: UInt): Unit
@SymbolName("openGL_kniBridge205")
private external fun kniBridge205(p0: UInt, p1: Double): Unit
@SymbolName("openGL_kniBridge206")
private external fun kniBridge206(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge207")
private external fun kniBridge207(p0: UInt, p1: Float): Unit
@SymbolName("openGL_kniBridge208")
private external fun kniBridge208(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge209")
private external fun kniBridge209(p0: UInt, p1: Short): Unit
@SymbolName("openGL_kniBridge210")
private external fun kniBridge210(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge211")
private external fun kniBridge211(p0: UInt, p1: Double, p2: Double): Unit
@SymbolName("openGL_kniBridge212")
private external fun kniBridge212(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge213")
private external fun kniBridge213(p0: UInt, p1: Float, p2: Float): Unit
@SymbolName("openGL_kniBridge214")
private external fun kniBridge214(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge215")
private external fun kniBridge215(p0: UInt, p1: Short, p2: Short): Unit
@SymbolName("openGL_kniBridge216")
private external fun kniBridge216(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge217")
private external fun kniBridge217(p0: UInt, p1: Double, p2: Double, p3: Double): Unit
@SymbolName("openGL_kniBridge218")
private external fun kniBridge218(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge219")
private external fun kniBridge219(p0: UInt, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("openGL_kniBridge220")
private external fun kniBridge220(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge221")
private external fun kniBridge221(p0: UInt, p1: Short, p2: Short, p3: Short): Unit
@SymbolName("openGL_kniBridge222")
private external fun kniBridge222(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge223")
private external fun kniBridge223(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge224")
private external fun kniBridge224(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge225")
private external fun kniBridge225(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge226")
private external fun kniBridge226(p0: UInt, p1: UByte, p2: UByte, p3: UByte, p4: UByte): Unit
@SymbolName("openGL_kniBridge227")
private external fun kniBridge227(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge228")
private external fun kniBridge228(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge229")
private external fun kniBridge229(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge230")
private external fun kniBridge230(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge231")
private external fun kniBridge231(p0: UInt, p1: Double, p2: Double, p3: Double, p4: Double): Unit
@SymbolName("openGL_kniBridge232")
private external fun kniBridge232(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge233")
private external fun kniBridge233(p0: UInt, p1: Float, p2: Float, p3: Float, p4: Float): Unit
@SymbolName("openGL_kniBridge234")
private external fun kniBridge234(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge235")
private external fun kniBridge235(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge236")
private external fun kniBridge236(p0: UInt, p1: Short, p2: Short, p3: Short, p4: Short): Unit
@SymbolName("openGL_kniBridge237")
private external fun kniBridge237(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge238")
private external fun kniBridge238(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge239")
private external fun kniBridge239(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge240")
private external fun kniBridge240(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge241")
private external fun kniBridge241(p0: UInt, p1: Int, p2: UInt, p3: UByte, p4: Int, p5: NativePtr): Unit
@SymbolName("openGL_kniBridge242")
private external fun kniBridge242(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge243")
private external fun kniBridge243(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge244")
private external fun kniBridge244(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge245")
private external fun kniBridge245(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge246")
private external fun kniBridge246(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge247")
private external fun kniBridge247(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge248")
private external fun kniBridge248(p0: UInt, p1: UByte, p2: UByte, p3: UByte, p4: UByte): Unit
@SymbolName("openGL_kniBridge249")
private external fun kniBridge249(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge250")
private external fun kniBridge250(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge251")
private external fun kniBridge251(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge252")
private external fun kniBridge252(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge253")
private external fun kniBridge253(p0: UInt, p1: UInt): UByte
@SymbolName("openGL_kniBridge254")
private external fun kniBridge254(p0: UInt): Unit
@SymbolName("openGL_kniBridge255")
private external fun kniBridge255(): Unit
@SymbolName("openGL_kniBridge256")
private external fun kniBridge256(p0: UInt, p1: UInt, p2: UInt, p3: Long, p4: Long): Unit
@SymbolName("openGL_kniBridge257")
private external fun kniBridge257(p0: UInt, p1: UInt, p2: UInt): Unit
@SymbolName("openGL_kniBridge258")
private external fun kniBridge258(p0: UInt, p1: Int, p2: NativePtr, p3: UInt): Unit
@SymbolName("openGL_kniBridge259")
private external fun kniBridge259(p0: UInt, p1: UInt, p2: Int, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): Unit
@SymbolName("openGL_kniBridge260")
private external fun kniBridge260(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge261")
private external fun kniBridge261(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge262")
private external fun kniBridge262(): Unit
@SymbolName("openGL_kniBridge263")
private external fun kniBridge263(p0: UInt, p1: Int, p2: UInt, p3: Int, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge264")
private external fun kniBridge264(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge265")
private external fun kniBridge265(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge266")
private external fun kniBridge266(p0: UInt, p1: Int): Unit
@SymbolName("openGL_kniBridge267")
private external fun kniBridge267(p0: UInt, p1: Int, p2: Int): Unit
@SymbolName("openGL_kniBridge268")
private external fun kniBridge268(p0: UInt, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("openGL_kniBridge269")
private external fun kniBridge269(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int): Unit
@SymbolName("openGL_kniBridge270")
private external fun kniBridge270(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge271")
private external fun kniBridge271(p0: UInt, p1: UInt, p2: UInt): Unit
@SymbolName("openGL_kniBridge272")
private external fun kniBridge272(p0: UInt, p1: UInt, p2: UInt, p3: UInt): Unit
@SymbolName("openGL_kniBridge273")
private external fun kniBridge273(p0: UInt, p1: UInt, p2: UInt, p3: UInt, p4: UInt): Unit
@SymbolName("openGL_kniBridge274")
private external fun kniBridge274(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge275")
private external fun kniBridge275(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge276")
private external fun kniBridge276(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge277")
private external fun kniBridge277(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge278")
private external fun kniBridge278(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge279")
private external fun kniBridge279(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge280")
private external fun kniBridge280(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge281")
private external fun kniBridge281(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge282")
private external fun kniBridge282(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge283")
private external fun kniBridge283(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge284")
private external fun kniBridge284(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge285")
private external fun kniBridge285(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge286")
private external fun kniBridge286(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge287")
private external fun kniBridge287(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge288")
private external fun kniBridge288(p0: UInt, p1: NativePtr): Int
@SymbolName("openGL_kniBridge289")
private external fun kniBridge289(p0: Int, p1: UInt): Unit
@SymbolName("openGL_kniBridge290")
private external fun kniBridge290(p0: Int, p1: UInt, p2: UInt): Unit
@SymbolName("openGL_kniBridge291")
private external fun kniBridge291(p0: Int, p1: UInt, p2: UInt, p3: UInt): Unit
@SymbolName("openGL_kniBridge292")
private external fun kniBridge292(p0: Int, p1: UInt, p2: UInt, p3: UInt, p4: UInt): Unit
@SymbolName("openGL_kniBridge293")
private external fun kniBridge293(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge294")
private external fun kniBridge294(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge295")
private external fun kniBridge295(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge296")
private external fun kniBridge296(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge297")
private external fun kniBridge297(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge298")
private external fun kniBridge298(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge299")
private external fun kniBridge299(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge300")
private external fun kniBridge300(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge301")
private external fun kniBridge301(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge302")
private external fun kniBridge302(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge303")
private external fun kniBridge303(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge304")
private external fun kniBridge304(p0: UInt, p1: Int, p2: Float, p3: Int): Unit
@SymbolName("openGL_kniBridge305")
private external fun kniBridge305(p0: UInt, p1: UInt): NativePtr
@SymbolName("openGL_kniBridge306")
private external fun kniBridge306(p0: UInt, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("openGL_kniBridge307")
private external fun kniBridge307(p0: UInt, p1: Int, p2: UInt, p3: NativePtr, p4: Int): Unit
@SymbolName("openGL_kniBridge308")
private external fun kniBridge308(p0: UInt, p1: UInt, p2: UInt): Unit
@SymbolName("openGL_kniBridge309")
private external fun kniBridge309(p0: UInt): Unit
@SymbolName("openGL_kniBridge310")
private external fun kniBridge310(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge311")
private external fun kniBridge311(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge312")
private external fun kniBridge312(p0: UInt, p1: UInt, p2: UInt, p3: Int): Unit
@SymbolName("openGL_kniBridge313")
private external fun kniBridge313(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge314")
private external fun kniBridge314(p0: Float): Unit
@SymbolName("openGL_kniBridge315")
private external fun kniBridge315(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge316")
private external fun kniBridge316(p0: UInt, p1: UInt, p2: UInt): Unit
@SymbolName("openGL_kniBridge317")
private external fun kniBridge317(p0: UInt, p1: UInt, p2: UInt): Unit
@SymbolName("openGL_kniBridge318")
private external fun kniBridge318(p0: UInt, p1: UInt, p2: UInt, p3: UInt, p4: UInt): Unit
@SymbolName("openGL_kniBridge319")
private external fun kniBridge319(p0: UInt): UByte
@SymbolName("openGL_kniBridge320")
private external fun kniBridge320(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge321")
private external fun kniBridge321(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge322")
private external fun kniBridge322(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge323")
private external fun kniBridge323(p0: UInt, p1: UInt, p2: Int, p3: Int): Unit
@SymbolName("openGL_kniBridge324")
private external fun kniBridge324(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge325")
private external fun kniBridge325(p0: UInt): UByte
@SymbolName("openGL_kniBridge326")
private external fun kniBridge326(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge327")
private external fun kniBridge327(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge328")
private external fun kniBridge328(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge329")
private external fun kniBridge329(p0: UInt): UInt
@SymbolName("openGL_kniBridge330")
private external fun kniBridge330(p0: UInt, p1: UInt, p2: UInt, p3: UInt, p4: Int): Unit
@SymbolName("openGL_kniBridge331")
private external fun kniBridge331(p0: UInt, p1: UInt, p2: UInt, p3: UInt, p4: Int): Unit
@SymbolName("openGL_kniBridge332")
private external fun kniBridge332(p0: UInt, p1: UInt, p2: UInt, p3: UInt, p4: Int, p5: Int): Unit
@SymbolName("openGL_kniBridge333")
private external fun kniBridge333(p0: UInt, p1: UInt, p2: UInt, p3: UInt): Unit
@SymbolName("openGL_kniBridge334")
private external fun kniBridge334(p0: UInt, p1: UInt, p2: UInt, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge335")
private external fun kniBridge335(p0: UInt): Unit
@SymbolName("openGL_kniBridge336")
private external fun kniBridge336(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: UInt, p9: UInt): Unit
@SymbolName("openGL_kniBridge337")
private external fun kniBridge337(p0: UInt, p1: Int, p2: UInt, p3: Int, p4: Int): Unit
@SymbolName("openGL_kniBridge338")
private external fun kniBridge338(p0: UInt, p1: UInt, p2: UInt, p3: Int, p4: Int): Unit
@SymbolName("openGL_kniBridge339")
private external fun kniBridge339(p0: UInt, p1: Long, p2: Long, p3: UInt): NativePtr
@SymbolName("openGL_kniBridge340")
private external fun kniBridge340(p0: UInt, p1: Long, p2: Long): Unit
@SymbolName("openGL_kniBridge341")
private external fun kniBridge341(p0: UInt): Unit
@SymbolName("openGL_kniBridge342")
private external fun kniBridge342(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge343")
private external fun kniBridge343(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge344")
private external fun kniBridge344(p0: UInt): UByte
@SymbolName("openGL_kniBridge345")
private external fun kniBridge345(p0: UInt, p1: Int, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge346")
private external fun kniBridge346(p0: UInt, p1: Int, p2: NativePtr, p3: UInt, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge347")
private external fun kniBridge347(p0: UInt, p1: UInt, p2: Int, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge348")
private external fun kniBridge348(p0: UInt, p1: NativePtr): UInt
@SymbolName("openGL_kniBridge349")
private external fun kniBridge349(p0: UInt, p1: UInt, p2: UInt, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge350")
private external fun kniBridge350(p0: UInt, p1: UInt, p2: Int, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge351")
private external fun kniBridge351(p0: UInt, p1: UInt, p2: UInt): Unit
@SymbolName("openGL_kniBridge352")
private external fun kniBridge352(p0: UInt, p1: UInt, p2: Long, p3: Long, p4: Long): Unit
@SymbolName("openGL_kniBridge353")
private external fun kniBridge353(p0: UInt, p1: Int, p2: UInt, p3: NativePtr, p4: Int): Unit
@SymbolName("openGL_kniBridge354")
private external fun kniBridge354(p0: UInt, p1: UInt, p2: UInt, p3: Int, p4: UInt, p5: NativePtr, p6: Int): Unit
@SymbolName("openGL_kniBridge355")
private external fun kniBridge355(p0: UInt, p1: Int, p2: UInt, p3: NativePtr, p4: Int, p5: Int): Unit
@SymbolName("openGL_kniBridge356")
private external fun kniBridge356(p0: UInt, p1: NativePtr, p2: UInt, p3: NativePtr, p4: Int, p5: NativePtr): Unit
@SymbolName("openGL_kniBridge357")
private external fun kniBridge357(p0: UInt): Unit
@SymbolName("openGL_kniBridge358")
private external fun kniBridge358(p0: UInt, p1: UInt): NativePtr
@SymbolName("openGL_kniBridge359")
private external fun kniBridge359(p0: NativePtr): UByte
@SymbolName("openGL_kniBridge360")
private external fun kniBridge360(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge361")
private external fun kniBridge361(p0: NativePtr, p1: UInt, p2: ULong): UInt
@SymbolName("openGL_kniBridge362")
private external fun kniBridge362(p0: NativePtr, p1: UInt, p2: ULong): Unit
@SymbolName("openGL_kniBridge363")
private external fun kniBridge363(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge364")
private external fun kniBridge364(p0: NativePtr, p1: UInt, p2: Int, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge365")
private external fun kniBridge365(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: UByte): Unit
@SymbolName("openGL_kniBridge366")
private external fun kniBridge366(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: UByte): Unit
@SymbolName("openGL_kniBridge367")
private external fun kniBridge367(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge368")
private external fun kniBridge368(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge369")
private external fun kniBridge369(p0: UInt, p1: UInt, p2: UInt, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge370")
private external fun kniBridge370(p0: UInt, p1: NativePtr): Int
@SymbolName("openGL_kniBridge371")
private external fun kniBridge371(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge372")
private external fun kniBridge372(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge373")
private external fun kniBridge373(p0: UInt): UByte
@SymbolName("openGL_kniBridge374")
private external fun kniBridge374(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge375")
private external fun kniBridge375(p0: UInt, p1: UInt, p2: Int): Unit
@SymbolName("openGL_kniBridge376")
private external fun kniBridge376(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge377")
private external fun kniBridge377(p0: UInt, p1: UInt, p2: Float): Unit
@SymbolName("openGL_kniBridge378")
private external fun kniBridge378(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge379")
private external fun kniBridge379(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge380")
private external fun kniBridge380(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge381")
private external fun kniBridge381(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge382")
private external fun kniBridge382(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge383")
private external fun kniBridge383(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge384")
private external fun kniBridge384(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge385")
private external fun kniBridge385(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge386")
private external fun kniBridge386(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge387")
private external fun kniBridge387(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge388")
private external fun kniBridge388(p0: UInt, p1: UInt, p2: UByte, p3: UInt): Unit
@SymbolName("openGL_kniBridge389")
private external fun kniBridge389(p0: UInt, p1: UInt, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge390")
private external fun kniBridge390(p0: UInt, p1: UInt, p2: UByte, p3: UInt): Unit
@SymbolName("openGL_kniBridge391")
private external fun kniBridge391(p0: UInt, p1: UInt, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge392")
private external fun kniBridge392(p0: UInt, p1: UInt, p2: UByte, p3: UInt): Unit
@SymbolName("openGL_kniBridge393")
private external fun kniBridge393(p0: UInt, p1: UInt, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge394")
private external fun kniBridge394(p0: UInt, p1: UInt, p2: UByte, p3: UInt): Unit
@SymbolName("openGL_kniBridge395")
private external fun kniBridge395(p0: UInt, p1: UInt, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge396")
private external fun kniBridge396(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge397")
private external fun kniBridge397(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge398")
private external fun kniBridge398(p0: Int, p1: Double): Unit
@SymbolName("openGL_kniBridge399")
private external fun kniBridge399(p0: Int, p1: Double, p2: Double): Unit
@SymbolName("openGL_kniBridge400")
private external fun kniBridge400(p0: Int, p1: Double, p2: Double, p3: Double): Unit
@SymbolName("openGL_kniBridge401")
private external fun kniBridge401(p0: Int, p1: Double, p2: Double, p3: Double, p4: Double): Unit
@SymbolName("openGL_kniBridge402")
private external fun kniBridge402(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge403")
private external fun kniBridge403(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge404")
private external fun kniBridge404(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge405")
private external fun kniBridge405(p0: Int, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge406")
private external fun kniBridge406(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge407")
private external fun kniBridge407(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge408")
private external fun kniBridge408(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge409")
private external fun kniBridge409(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge410")
private external fun kniBridge410(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge411")
private external fun kniBridge411(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge412")
private external fun kniBridge412(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge413")
private external fun kniBridge413(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge414")
private external fun kniBridge414(p0: Int, p1: Int, p2: UByte, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge415")
private external fun kniBridge415(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge416")
private external fun kniBridge416(p0: UInt, p1: UInt, p2: NativePtr): Int
@SymbolName("openGL_kniBridge417")
private external fun kniBridge417(p0: UInt, p1: UInt, p2: NativePtr): UInt
@SymbolName("openGL_kniBridge418")
private external fun kniBridge418(p0: UInt, p1: UInt, p2: UInt, p3: UInt, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge419")
private external fun kniBridge419(p0: UInt, p1: UInt, p2: UInt, p3: Int, p4: NativePtr, p5: NativePtr): Unit
@SymbolName("openGL_kniBridge420")
private external fun kniBridge420(p0: UInt, p1: UInt, p2: UInt, p3: Int, p4: NativePtr, p5: NativePtr): Unit
@SymbolName("openGL_kniBridge421")
private external fun kniBridge421(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge422")
private external fun kniBridge422(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge423")
private external fun kniBridge423(p0: UInt, p1: UInt, p2: UInt, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge424")
private external fun kniBridge424(p0: UInt, p1: Int): Unit
@SymbolName("openGL_kniBridge425")
private external fun kniBridge425(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge426")
private external fun kniBridge426(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge427")
private external fun kniBridge427(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge428")
private external fun kniBridge428(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge429")
private external fun kniBridge429(p0: UInt): UByte
@SymbolName("openGL_kniBridge430")
private external fun kniBridge430(): Unit
@SymbolName("openGL_kniBridge431")
private external fun kniBridge431(): Unit
@SymbolName("openGL_kniBridge432")
private external fun kniBridge432(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge433")
private external fun kniBridge433(p0: UInt, p1: UInt, p2: UInt): Unit
@SymbolName("openGL_kniBridge434")
private external fun kniBridge434(p0: UInt, p1: UInt, p2: UInt): Unit
@SymbolName("openGL_kniBridge435")
private external fun kniBridge435(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge436")
private external fun kniBridge436(p0: UInt, p1: UInt, p2: UInt, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge437")
private external fun kniBridge437(): Unit
@SymbolName("openGL_kniBridge438")
private external fun kniBridge438(p0: Int, p1: NativePtr, p2: UInt, p3: NativePtr, p4: Int): Unit
@SymbolName("openGL_kniBridge439")
private external fun kniBridge439(p0: UInt, p1: UInt, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge440")
private external fun kniBridge440(p0: Float, p1: Float): Unit
@SymbolName("openGL_kniBridge441")
private external fun kniBridge441(p0: Float): Unit
@SymbolName("openGL_kniBridge442")
private external fun kniBridge442(p0: UInt, p1: Int, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge443")
private external fun kniBridge443(p0: UInt, p1: UInt, p2: NativePtr, p3: Int): Unit
@SymbolName("openGL_kniBridge444")
private external fun kniBridge444(p0: UInt, p1: UInt, p2: Int): Unit
@SymbolName("openGL_kniBridge445")
private external fun kniBridge445(p0: UInt, p1: UInt, p2: UInt): Unit
@SymbolName("openGL_kniBridge446")
private external fun kniBridge446(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge447")
private external fun kniBridge447(p0: UInt, p1: Int, p2: NativePtr): UInt
@SymbolName("openGL_kniBridge448")
private external fun kniBridge448(p0: UInt): Unit
@SymbolName("openGL_kniBridge449")
private external fun kniBridge449(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge450")
private external fun kniBridge450(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge451")
private external fun kniBridge451(p0: UInt): UByte
@SymbolName("openGL_kniBridge452")
private external fun kniBridge452(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge453")
private external fun kniBridge453(p0: UInt, p1: Int, p2: Int): Unit
@SymbolName("openGL_kniBridge454")
private external fun kniBridge454(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge455")
private external fun kniBridge455(p0: UInt, p1: Int, p2: Float): Unit
@SymbolName("openGL_kniBridge456")
private external fun kniBridge456(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge457")
private external fun kniBridge457(p0: UInt, p1: Int, p2: Double): Unit
@SymbolName("openGL_kniBridge458")
private external fun kniBridge458(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge459")
private external fun kniBridge459(p0: UInt, p1: Int, p2: UInt): Unit
@SymbolName("openGL_kniBridge460")
private external fun kniBridge460(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge461")
private external fun kniBridge461(p0: UInt, p1: Int, p2: Int, p3: Int): Unit
@SymbolName("openGL_kniBridge462")
private external fun kniBridge462(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge463")
private external fun kniBridge463(p0: UInt, p1: Int, p2: Float, p3: Float): Unit
@SymbolName("openGL_kniBridge464")
private external fun kniBridge464(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge465")
private external fun kniBridge465(p0: UInt, p1: Int, p2: Double, p3: Double): Unit
@SymbolName("openGL_kniBridge466")
private external fun kniBridge466(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge467")
private external fun kniBridge467(p0: UInt, p1: Int, p2: UInt, p3: UInt): Unit
@SymbolName("openGL_kniBridge468")
private external fun kniBridge468(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge469")
private external fun kniBridge469(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int): Unit
@SymbolName("openGL_kniBridge470")
private external fun kniBridge470(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge471")
private external fun kniBridge471(p0: UInt, p1: Int, p2: Float, p3: Float, p4: Float): Unit
@SymbolName("openGL_kniBridge472")
private external fun kniBridge472(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge473")
private external fun kniBridge473(p0: UInt, p1: Int, p2: Double, p3: Double, p4: Double): Unit
@SymbolName("openGL_kniBridge474")
private external fun kniBridge474(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge475")
private external fun kniBridge475(p0: UInt, p1: Int, p2: UInt, p3: UInt, p4: UInt): Unit
@SymbolName("openGL_kniBridge476")
private external fun kniBridge476(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge477")
private external fun kniBridge477(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): Unit
@SymbolName("openGL_kniBridge478")
private external fun kniBridge478(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge479")
private external fun kniBridge479(p0: UInt, p1: Int, p2: Float, p3: Float, p4: Float, p5: Float): Unit
@SymbolName("openGL_kniBridge480")
private external fun kniBridge480(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge481")
private external fun kniBridge481(p0: UInt, p1: Int, p2: Double, p3: Double, p4: Double, p5: Double): Unit
@SymbolName("openGL_kniBridge482")
private external fun kniBridge482(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge483")
private external fun kniBridge483(p0: UInt, p1: Int, p2: UInt, p3: UInt, p4: UInt, p5: UInt): Unit
@SymbolName("openGL_kniBridge484")
private external fun kniBridge484(p0: UInt, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge485")
private external fun kniBridge485(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge486")
private external fun kniBridge486(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge487")
private external fun kniBridge487(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge488")
private external fun kniBridge488(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge489")
private external fun kniBridge489(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge490")
private external fun kniBridge490(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge491")
private external fun kniBridge491(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge492")
private external fun kniBridge492(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge493")
private external fun kniBridge493(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge494")
private external fun kniBridge494(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge495")
private external fun kniBridge495(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge496")
private external fun kniBridge496(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge497")
private external fun kniBridge497(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge498")
private external fun kniBridge498(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge499")
private external fun kniBridge499(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge500")
private external fun kniBridge500(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge501")
private external fun kniBridge501(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge502")
private external fun kniBridge502(p0: UInt, p1: Int, p2: Int, p3: UByte, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge503")
private external fun kniBridge503(p0: UInt): Unit
@SymbolName("openGL_kniBridge504")
private external fun kniBridge504(p0: UInt, p1: Int, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge505")
private external fun kniBridge505(p0: UInt, p1: Double): Unit
@SymbolName("openGL_kniBridge506")
private external fun kniBridge506(p0: UInt, p1: Double, p2: Double): Unit
@SymbolName("openGL_kniBridge507")
private external fun kniBridge507(p0: UInt, p1: Double, p2: Double, p3: Double): Unit
@SymbolName("openGL_kniBridge508")
private external fun kniBridge508(p0: UInt, p1: Double, p2: Double, p3: Double, p4: Double): Unit
@SymbolName("openGL_kniBridge509")
private external fun kniBridge509(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge510")
private external fun kniBridge510(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge511")
private external fun kniBridge511(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge512")
private external fun kniBridge512(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge513")
private external fun kniBridge513(p0: UInt, p1: Int, p2: UInt, p3: Int, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge514")
private external fun kniBridge514(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge515")
private external fun kniBridge515(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge516")
private external fun kniBridge516(p0: UInt, p1: Float, p2: Float, p3: Float, p4: Float): Unit
@SymbolName("openGL_kniBridge517")
private external fun kniBridge517(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge518")
private external fun kniBridge518(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge519")
private external fun kniBridge519(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int): Unit
@SymbolName("openGL_kniBridge520")
private external fun kniBridge520(p0: UInt, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge521")
private external fun kniBridge521(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge522")
private external fun kniBridge522(p0: UInt, p1: Double, p2: Double): Unit
@SymbolName("openGL_kniBridge523")
private external fun kniBridge523(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge524")
private external fun kniBridge524(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge525")
private external fun kniBridge525(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge526")
private external fun kniBridge526(p0: UInt, p1: UInt, p2: UInt): Unit
@SymbolName("openGL_kniBridge527")
private external fun kniBridge527(p0: UInt, p1: UInt, p2: UInt): Unit
@SymbolName("openGL_kniBridge528")
private external fun kniBridge528(p0: UInt, p1: UInt, p2: UInt, p3: UInt, p4: UInt): Unit
@SymbolName("openGL_kniBridge529")
private external fun kniBridge529(p0: UInt, p1: UInt): Unit
@SymbolName("openGL_kniBridge530")
private external fun kniBridge530(p0: UInt, p1: UInt, p2: UInt, p3: Int, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge531")
private external fun kniBridge531(p0: Float): Unit
@SymbolName("openGL_kniBridge532")
private external fun kniBridge532(p0: UInt, p1: Int, p2: NativePtr, p3: Int, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge533")
private external fun kniBridge533(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge534")
private external fun kniBridge534(p0: UInt, p1: Int, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge535")
private external fun kniBridge535(p0: Int, p1: NativePtr): UByte
@SymbolName("openGL_kniBridge536")
private external fun kniBridge536(p0: Int, p1: NativePtr, p2: Int, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge537")
private external fun kniBridge537(p0: Int, p1: NativePtr, p2: UInt, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge538")
private external fun kniBridge538(p0: UInt, p1: Int, p2: UInt, p3: Int): Unit
@SymbolName("openGL_kniBridge539")
private external fun kniBridge539(p0: UInt, p1: Int, p2: UInt, p3: Int, p4: Int): Unit
@SymbolName("openGL_kniBridge540")
private external fun kniBridge540(p0: UInt, p1: Int, p2: UInt, p3: Int, p4: Int, p5: Int): Unit
@SymbolName("openGL_kniBridge541")
private external fun kniBridge541(p0: UInt, p1: UInt, p2: Int, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge542")
private external fun kniBridge542(p0: UInt, p1: UInt, p2: Int, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge543")
private external fun kniBridge543(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge544")
private external fun kniBridge544(p0: Int, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge545")
private external fun kniBridge545(): Unit
@SymbolName("openGL_kniBridge546")
private external fun kniBridge546(p0: Double, p1: Double): Unit
@SymbolName("openGL_kniBridge547")
private external fun kniBridge547(): Unit
@SymbolName("openGL_kniBridge548")
private external fun kniBridge548(): Unit
@SymbolName("openGL_kniBridge549")
private external fun kniBridge549(): Unit
@SymbolName("openGL_kniBridge550")
private external fun kniBridge550(p0: UInt, p1: UInt, p2: UInt): UInt
@SymbolName("openGL_kniBridge551")
private external fun kniBridge551(p0: UInt, p1: UInt, p2: UInt): UInt
@SymbolName("openGL_kniBridge552")
private external fun kniBridge552(p0: UInt, p1: UInt, p2: UInt, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge553")
private external fun kniBridge553(p0: UInt, p1: Int, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge554")
private external fun kniBridge554(p0: UInt, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge555")
private external fun kniBridge555(): Unit
@SymbolName("openGL_kniBridge556")
private external fun kniBridge556(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge557")
private external fun kniBridge557(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge558")
private external fun kniBridge558(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge559")
private external fun kniBridge559(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge560")
private external fun kniBridge560(p0: UInt, p1: Int, p2: Int, p3: UInt, p4: UInt, p5: Int, p6: Int, p7: Int, p8: NativePtr): Int
@SymbolName("openGL_kniBridge561")
private external fun kniBridge561(p0: UInt, p1: Int, p2: Int, p3: UInt, p4: UInt, p5: NativePtr): Int
@SymbolName("openGL_kniBridge562")
private external fun kniBridge562(p0: UInt, p1: Int, p2: Int, p3: Int, p4: UInt, p5: UInt, p6: Int, p7: Int, p8: Int, p9: NativePtr): Int
@SymbolName("openGL_kniBridge563")
private external fun kniBridge563(p0: UInt, p1: Int, p2: Int, p3: Int, p4: UInt, p5: UInt, p6: NativePtr): Int
@SymbolName("openGL_kniBridge564")
private external fun kniBridge564(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: UInt, p6: UInt, p7: Int, p8: Int, p9: Int, p10: NativePtr): Int
@SymbolName("openGL_kniBridge565")
private external fun kniBridge565(p0: UInt, p1: Int, p2: Int, p3: Int, p4: Int, p5: UInt, p6: UInt, p7: NativePtr): Int
@SymbolName("openGL_kniBridge566")
private external fun kniBridge566(p0: NativePtr, p1: NativePtr): UByte
@SymbolName("openGL_kniBridge567")
private external fun kniBridge567(p0: NativePtr, p1: Double, p2: Double, p3: Double, p4: Int, p5: Int): Unit
@SymbolName("openGL_kniBridge568")
private external fun kniBridge568(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge569")
private external fun kniBridge569(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge570")
private external fun kniBridge570(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge571")
private external fun kniBridge571(p0: NativePtr, p1: Double, p2: Double, p3: Int, p4: Int): Unit
@SymbolName("openGL_kniBridge572")
private external fun kniBridge572(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge573")
private external fun kniBridge573(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge574")
private external fun kniBridge574(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge575")
private external fun kniBridge575(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge576")
private external fun kniBridge576(p0: UInt): NativePtr
@SymbolName("openGL_kniBridge577")
private external fun kniBridge577(p0: NativePtr, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge578")
private external fun kniBridge578(p0: UInt): NativePtr
@SymbolName("openGL_kniBridge579")
private external fun kniBridge579(p0: NativePtr, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge580")
private external fun kniBridge580(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("openGL_kniBridge581")
private external fun kniBridge581(p0: Double, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double, p6: Double, p7: Double, p8: Double): Unit
@SymbolName("openGL_kniBridge582")
private external fun kniBridge582(): NativePtr
@SymbolName("openGL_kniBridge583")
private external fun kniBridge583(): NativePtr
@SymbolName("openGL_kniBridge584")
private external fun kniBridge584(): NativePtr
@SymbolName("openGL_kniBridge585")
private external fun kniBridge585(p0: NativePtr, p1: UInt): Unit
@SymbolName("openGL_kniBridge586")
private external fun kniBridge586(p0: NativePtr, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge587")
private external fun kniBridge587(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge588")
private external fun kniBridge588(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge589")
private external fun kniBridge589(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int, p4: NativePtr, p5: Int, p6: UInt): Unit
@SymbolName("openGL_kniBridge590")
private external fun kniBridge590(p0: NativePtr, p1: UInt, p2: Float): Unit
@SymbolName("openGL_kniBridge591")
private external fun kniBridge591(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int, p4: NativePtr, p5: Int, p6: Int, p7: NativePtr, p8: Int, p9: Int, p10: UInt): Unit
@SymbolName("openGL_kniBridge592")
private external fun kniBridge592(p0: Double, p1: Double, p2: Double, p3: Double): Unit
@SymbolName("openGL_kniBridge593")
private external fun kniBridge593(p0: NativePtr, p1: Double, p2: Double, p3: Int, p4: Int, p5: Double, p6: Double): Unit
@SymbolName("openGL_kniBridge594")
private external fun kniBridge594(p0: Double, p1: Double, p2: Double, p3: Double): Unit
@SymbolName("openGL_kniBridge595")
private external fun kniBridge595(p0: Double, p1: Double, p2: Double, p3: Double, p4: NativePtr): Unit
@SymbolName("openGL_kniBridge596")
private external fun kniBridge596(p0: Double, p1: Double, p2: Double, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: NativePtr, p8: NativePtr): Int
@SymbolName("openGL_kniBridge597")
private external fun kniBridge597(p0: NativePtr, p1: Int, p2: NativePtr, p3: Int, p4: UInt): Unit
@SymbolName("openGL_kniBridge598")
private external fun kniBridge598(p0: NativePtr, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge599")
private external fun kniBridge599(p0: NativePtr, p1: UInt): Unit
@SymbolName("openGL_kniBridge600")
private external fun kniBridge600(p0: NativePtr, p1: UInt): Unit
@SymbolName("openGL_kniBridge601")
private external fun kniBridge601(p0: NativePtr, p1: UInt): Unit
@SymbolName("openGL_kniBridge602")
private external fun kniBridge602(p0: NativePtr, p1: UByte): Unit
@SymbolName("openGL_kniBridge603")
private external fun kniBridge603(p0: UInt, p1: Int, p2: Int, p3: UInt, p4: NativePtr, p5: Int, p6: Int, p7: UInt, p8: NativePtr): Int
@SymbolName("openGL_kniBridge604")
private external fun kniBridge604(p0: NativePtr, p1: Double, p2: Int, p3: Int): Unit
@SymbolName("openGL_kniBridge605")
private external fun kniBridge605(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge606")
private external fun kniBridge606(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("openGL_kniBridge607")
private external fun kniBridge607(p0: NativePtr, p1: UInt, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge608")
private external fun kniBridge608(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge609")
private external fun kniBridge609(p0: NativePtr): Unit
@SymbolName("openGL_kniBridge610")
private external fun kniBridge610(p0: NativePtr, p1: Double, p2: Double, p3: Double): Unit
@SymbolName("openGL_kniBridge611")
private external fun kniBridge611(p0: NativePtr, p1: UInt, p2: Double): Unit
@SymbolName("openGL_kniBridge612")
private external fun kniBridge612(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("openGL_kniBridge613")
private external fun kniBridge613(p0: Double, p1: Double, p2: Double, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: NativePtr, p8: NativePtr): Int
@SymbolName("openGL_kniBridge614")
private external fun kniBridge614(p0: Double, p1: Double, p2: Double, p3: Double, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: Double, p8: Double, p9: NativePtr, p10: NativePtr, p11: NativePtr, p12: NativePtr): Int
