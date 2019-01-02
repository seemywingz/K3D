@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package cglm

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import platform.posix.FILE
import platform.posix.size_t
import platform.posix.uint32_t

// NOTE THIS FILE IS AUTO-GENERATED

fun malloc(__size: size_t): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge0(__size))
}

fun calloc(__count: size_t, __size: size_t): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge1(__count, __size))
}

fun free(arg0: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge2(arg0?.getPointer(memScope).rawValue)
    }
}

fun realloc(__ptr: CValuesRef<*>?, __size: size_t): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge3(__ptr?.getPointer(memScope).rawValue, __size))
    }
}

fun valloc(arg0: size_t): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge4(arg0))
}

fun posix_memalign(__memptr: CValuesRef<COpaquePointerVar>?, __alignment: size_t, __size: size_t): Int {
    memScoped {
        return kniBridge5(__memptr?.getPointer(memScope).rawValue, __alignment, __size)
    }
}

fun glm_sign(`val`: Int): Int {
    return kniBridge6(`val`)
}

fun glm_signf(`val`: Float): Float {
    return kniBridge7(`val`)
}

fun glm_rad(deg: Float): Float {
    return kniBridge8(deg)
}

fun glm_deg(rad: Float): Float {
    return kniBridge9(rad)
}

fun glm_make_rad(deg: CValuesRef<FloatVar>?): Unit {
    memScoped {
        return kniBridge10(deg?.getPointer(memScope).rawValue)
    }
}

fun glm_make_deg(rad: CValuesRef<FloatVar>?): Unit {
    memScoped {
        return kniBridge11(rad?.getPointer(memScope).rawValue)
    }
}

fun glm_pow2(x: Float): Float {
    return kniBridge12(x)
}

fun glm_min(a: Float, b: Float): Float {
    return kniBridge13(a, b)
}

fun glm_max(a: Float, b: Float): Float {
    return kniBridge14(a, b)
}

fun glm_clamp(`val`: Float, minVal: Float, maxVal: Float): Float {
    return kniBridge15(`val`, minVal, maxVal)
}

fun glm_clamp_zo(`val`: Float): Float {
    return kniBridge16(`val`)
}

fun glm_lerp(from: Float, to: Float, t: Float): Float {
    return kniBridge17(from, to, t)
}

fun glm_eq(a: Float, b: Float): Boolean {
    return kniBridge18(a, b).toBoolean()
}

fun glm_percent(from: Float, to: Float, current: Float): Float {
    return kniBridge19(from, to, current)
}

fun glm_percentc(from: Float, to: Float, current: Float): Float {
    return kniBridge20(from, to, current)
}

fun glm_vec3_broadcast(`val`: Float, d: vec3?): Unit {
    return kniBridge21(`val`, d.rawValue)
}

fun glm_vec3_eq(v: vec3?, `val`: Float): Boolean {
    return kniBridge22(v.rawValue, `val`).toBoolean()
}

fun glm_vec3_eq_eps(v: vec3?, `val`: Float): Boolean {
    return kniBridge23(v.rawValue, `val`).toBoolean()
}

fun glm_vec3_eq_all(v: vec3?): Boolean {
    return kniBridge24(v.rawValue).toBoolean()
}

fun glm_vec3_eqv(a: vec3?, b: vec3?): Boolean {
    return kniBridge25(a.rawValue, b.rawValue).toBoolean()
}

fun glm_vec3_eqv_eps(a: vec3?, b: vec3?): Boolean {
    return kniBridge26(a.rawValue, b.rawValue).toBoolean()
}

fun glm_vec3_max(v: vec3?): Float {
    return kniBridge27(v.rawValue)
}

fun glm_vec3_min(v: vec3?): Float {
    return kniBridge28(v.rawValue)
}

fun glm_vec3_isnan(v: vec3?): Boolean {
    return kniBridge29(v.rawValue).toBoolean()
}

fun glm_vec3_isinf(v: vec3?): Boolean {
    return kniBridge30(v.rawValue).toBoolean()
}

fun glm_vec3_isvalid(v: vec3?): Boolean {
    return kniBridge31(v.rawValue).toBoolean()
}

fun glm_vec3_sign(v: vec3?, dest: vec3?): Unit {
    return kniBridge32(v.rawValue, dest.rawValue)
}

fun glm_vec3_sqrt(v: vec3?, dest: vec3?): Unit {
    return kniBridge33(v.rawValue, dest.rawValue)
}

fun glm_vec4_broadcast(`val`: Float, d: vec4?): Unit {
    return kniBridge34(`val`, d.rawValue)
}

fun glm_vec4_eq(v: vec4?, `val`: Float): Boolean {
    return kniBridge35(v.rawValue, `val`).toBoolean()
}

fun glm_vec4_eq_eps(v: vec4?, `val`: Float): Boolean {
    return kniBridge36(v.rawValue, `val`).toBoolean()
}

fun glm_vec4_eq_all(v: vec4?): Boolean {
    return kniBridge37(v.rawValue).toBoolean()
}

fun glm_vec4_eqv(a: vec4?, b: vec4?): Boolean {
    return kniBridge38(a.rawValue, b.rawValue).toBoolean()
}

fun glm_vec4_eqv_eps(a: vec4?, b: vec4?): Boolean {
    return kniBridge39(a.rawValue, b.rawValue).toBoolean()
}

fun glm_vec4_max(v: vec4?): Float {
    return kniBridge40(v.rawValue)
}

fun glm_vec4_min(v: vec4?): Float {
    return kniBridge41(v.rawValue)
}

fun glm_vec4_isnan(v: vec4?): Boolean {
    return kniBridge42(v.rawValue).toBoolean()
}

fun glm_vec4_isinf(v: vec4?): Boolean {
    return kniBridge43(v.rawValue).toBoolean()
}

fun glm_vec4_isvalid(v: vec4?): Boolean {
    return kniBridge44(v.rawValue).toBoolean()
}

fun glm_vec4_sign(v: vec4?, dest: vec4?): Unit {
    return kniBridge45(v.rawValue, dest.rawValue)
}

fun glm_vec4_sqrt(v: vec4?, dest: vec4?): Unit {
    return kniBridge46(v.rawValue, dest.rawValue)
}

fun glm_vec4(v3: vec3?, last: Float, dest: vec4?): Unit {
    return kniBridge47(v3.rawValue, last, dest.rawValue)
}

fun glm_vec4_copy3(a: vec4?, dest: vec3?): Unit {
    return kniBridge48(a.rawValue, dest.rawValue)
}

fun glm_vec4_copy(v: vec4?, dest: vec4?): Unit {
    return kniBridge49(v.rawValue, dest.rawValue)
}

fun glm_vec4_ucopy(v: vec4?, dest: vec4?): Unit {
    return kniBridge50(v.rawValue, dest.rawValue)
}

fun glm_vec4_zero(v: vec4?): Unit {
    return kniBridge51(v.rawValue)
}

fun glm_vec4_one(v: vec4?): Unit {
    return kniBridge52(v.rawValue)
}

fun glm_vec4_dot(a: vec4?, b: vec4?): Float {
    return kniBridge53(a.rawValue, b.rawValue)
}

fun glm_vec4_norm2(v: vec4?): Float {
    return kniBridge54(v.rawValue)
}

fun glm_vec4_norm(v: vec4?): Float {
    return kniBridge55(v.rawValue)
}

fun glm_vec4_add(a: vec4?, b: vec4?, dest: vec4?): Unit {
    return kniBridge56(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec4_adds(v: vec4?, s: Float, dest: vec4?): Unit {
    return kniBridge57(v.rawValue, s, dest.rawValue)
}

fun glm_vec4_sub(a: vec4?, b: vec4?, dest: vec4?): Unit {
    return kniBridge58(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec4_subs(v: vec4?, s: Float, dest: vec4?): Unit {
    return kniBridge59(v.rawValue, s, dest.rawValue)
}

fun glm_vec4_mul(a: vec4?, b: vec4?, dest: vec4?): Unit {
    return kniBridge60(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec4_scale(v: vec4?, s: Float, dest: vec4?): Unit {
    return kniBridge61(v.rawValue, s, dest.rawValue)
}

fun glm_vec4_scale_as(v: vec4?, s: Float, dest: vec4?): Unit {
    return kniBridge62(v.rawValue, s, dest.rawValue)
}

fun glm_vec4_div(a: vec4?, b: vec4?, dest: vec4?): Unit {
    return kniBridge63(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec4_divs(v: vec4?, s: Float, dest: vec4?): Unit {
    return kniBridge64(v.rawValue, s, dest.rawValue)
}

fun glm_vec4_addadd(a: vec4?, b: vec4?, dest: vec4?): Unit {
    return kniBridge65(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec4_subadd(a: vec4?, b: vec4?, dest: vec4?): Unit {
    return kniBridge66(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec4_muladd(a: vec4?, b: vec4?, dest: vec4?): Unit {
    return kniBridge67(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec4_muladds(a: vec4?, s: Float, dest: vec4?): Unit {
    return kniBridge68(a.rawValue, s, dest.rawValue)
}

fun glm_vec4_maxadd(a: vec4?, b: vec4?, dest: vec4?): Unit {
    return kniBridge69(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec4_minadd(a: vec4?, b: vec4?, dest: vec4?): Unit {
    return kniBridge70(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec4_negate_to(v: vec4?, dest: vec4?): Unit {
    return kniBridge71(v.rawValue, dest.rawValue)
}

fun glm_vec4_negate(v: vec4?): Unit {
    return kniBridge72(v.rawValue)
}

fun glm_vec4_normalize_to(v: vec4?, dest: vec4?): Unit {
    return kniBridge73(v.rawValue, dest.rawValue)
}

fun glm_vec4_normalize(v: vec4?): Unit {
    return kniBridge74(v.rawValue)
}

fun glm_vec4_distance(a: vec4?, b: vec4?): Float {
    return kniBridge75(a.rawValue, b.rawValue)
}

fun glm_vec4_maxv(a: vec4?, b: vec4?, dest: vec4?): Unit {
    return kniBridge76(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec4_minv(a: vec4?, b: vec4?, dest: vec4?): Unit {
    return kniBridge77(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec4_clamp(v: vec4?, minVal: Float, maxVal: Float): Unit {
    return kniBridge78(v.rawValue, minVal, maxVal)
}

fun glm_vec4_lerp(from: vec4?, to: vec4?, t: Float, dest: vec4?): Unit {
    return kniBridge79(from.rawValue, to.rawValue, t, dest.rawValue)
}

fun glm_vec3(v4: vec4?, dest: vec3?): Unit {
    return kniBridge80(v4.rawValue, dest.rawValue)
}

fun glm_vec3_copy(a: vec3?, dest: vec3?): Unit {
    return kniBridge81(a.rawValue, dest.rawValue)
}

fun glm_vec3_zero(v: vec3?): Unit {
    return kniBridge82(v.rawValue)
}

fun glm_vec3_one(v: vec3?): Unit {
    return kniBridge83(v.rawValue)
}

fun glm_vec3_dot(a: vec3?, b: vec3?): Float {
    return kniBridge84(a.rawValue, b.rawValue)
}

fun glm_vec3_cross(a: vec3?, b: vec3?, d: vec3?): Unit {
    return kniBridge85(a.rawValue, b.rawValue, d.rawValue)
}

fun glm_vec3_norm2(v: vec3?): Float {
    return kniBridge86(v.rawValue)
}

fun glm_vec3_norm(v: vec3?): Float {
    return kniBridge87(v.rawValue)
}

fun glm_vec3_add(a: vec3?, b: vec3?, dest: vec3?): Unit {
    return kniBridge88(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec3_adds(v: vec3?, s: Float, dest: vec3?): Unit {
    return kniBridge89(v.rawValue, s, dest.rawValue)
}

fun glm_vec3_sub(a: vec3?, b: vec3?, dest: vec3?): Unit {
    return kniBridge90(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec3_subs(v: vec3?, s: Float, dest: vec3?): Unit {
    return kniBridge91(v.rawValue, s, dest.rawValue)
}

fun glm_vec3_mul(a: vec3?, b: vec3?, dest: vec3?): Unit {
    return kniBridge92(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec3_scale(v: vec3?, s: Float, dest: vec3?): Unit {
    return kniBridge93(v.rawValue, s, dest.rawValue)
}

fun glm_vec3_scale_as(v: vec3?, s: Float, dest: vec3?): Unit {
    return kniBridge94(v.rawValue, s, dest.rawValue)
}

fun glm_vec3_div(a: vec3?, b: vec3?, dest: vec3?): Unit {
    return kniBridge95(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec3_divs(v: vec3?, s: Float, dest: vec3?): Unit {
    return kniBridge96(v.rawValue, s, dest.rawValue)
}

fun glm_vec3_addadd(a: vec3?, b: vec3?, dest: vec3?): Unit {
    return kniBridge97(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec3_subadd(a: vec3?, b: vec3?, dest: vec3?): Unit {
    return kniBridge98(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec3_muladd(a: vec3?, b: vec3?, dest: vec3?): Unit {
    return kniBridge99(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec3_muladds(a: vec3?, s: Float, dest: vec3?): Unit {
    return kniBridge100(a.rawValue, s, dest.rawValue)
}

fun glm_vec3_maxadd(a: vec3?, b: vec3?, dest: vec3?): Unit {
    return kniBridge101(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec3_minadd(a: vec3?, b: vec3?, dest: vec3?): Unit {
    return kniBridge102(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec3_negate_to(v: vec3?, dest: vec3?): Unit {
    return kniBridge103(v.rawValue, dest.rawValue)
}

fun glm_vec3_negate(v: vec3?): Unit {
    return kniBridge104(v.rawValue)
}

fun glm_vec3_normalize(v: vec3?): Unit {
    return kniBridge105(v.rawValue)
}

fun glm_vec3_normalize_to(v: vec3?, dest: vec3?): Unit {
    return kniBridge106(v.rawValue, dest.rawValue)
}

fun glm_vec3_angle(a: vec3?, b: vec3?): Float {
    return kniBridge107(a.rawValue, b.rawValue)
}

fun glm_vec3_rotate(v: vec3?, angle: Float, axis: vec3?): Unit {
    return kniBridge108(v.rawValue, angle, axis.rawValue)
}

fun glm_vec3_rotate_m4(m: mat4?, v: vec3?, dest: vec3?): Unit {
    return kniBridge109(m.rawValue, v.rawValue, dest.rawValue)
}

fun glm_vec3_rotate_m3(m: mat3?, v: vec3?, dest: vec3?): Unit {
    return kniBridge110(m.rawValue, v.rawValue, dest.rawValue)
}

fun glm_vec3_proj(a: vec3?, b: vec3?, dest: vec3?): Unit {
    return kniBridge111(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec3_center(a: vec3?, b: vec3?, dest: vec3?): Unit {
    return kniBridge112(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec3_distance2(a: vec3?, b: vec3?): Float {
    return kniBridge113(a.rawValue, b.rawValue)
}

fun glm_vec3_distance(a: vec3?, b: vec3?): Float {
    return kniBridge114(a.rawValue, b.rawValue)
}

fun glm_vec3_maxv(a: vec3?, b: vec3?, dest: vec3?): Unit {
    return kniBridge115(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec3_minv(a: vec3?, b: vec3?, dest: vec3?): Unit {
    return kniBridge116(a.rawValue, b.rawValue, dest.rawValue)
}

fun glm_vec3_ortho(v: vec3?, dest: vec3?): Unit {
    return kniBridge117(v.rawValue, dest.rawValue)
}

fun glm_vec3_clamp(v: vec3?, minVal: Float, maxVal: Float): Unit {
    return kniBridge118(v.rawValue, minVal, maxVal)
}

fun glm_vec3_lerp(from: vec3?, to: vec3?, t: Float, dest: vec3?): Unit {
    return kniBridge119(from.rawValue, to.rawValue, t, dest.rawValue)
}

fun glm_cross(a: vec3?, b: vec3?, d: vec3?): Unit {
    return kniBridge120(a.rawValue, b.rawValue, d.rawValue)
}

fun glm_dot(a: vec3?, b: vec3?): Float {
    return kniBridge121(a.rawValue, b.rawValue)
}

fun glm_normalize(v: vec3?): Unit {
    return kniBridge122(v.rawValue)
}

fun glm_normalize_to(v: vec3?, dest: vec3?): Unit {
    return kniBridge123(v.rawValue, dest.rawValue)
}

fun glm_mat4_scale_sse2(m: mat4?, s: Float): Unit {
    return kniBridge124(m.rawValue, s)
}

fun glm_mat4_transp_sse2(m: mat4?, dest: mat4?): Unit {
    return kniBridge125(m.rawValue, dest.rawValue)
}

fun glm_mat4_mul_sse2(m1: mat4?, m2: mat4?, dest: mat4?): Unit {
    return kniBridge126(m1.rawValue, m2.rawValue, dest.rawValue)
}

fun glm_mat4_mulv_sse2(m: mat4?, v: vec4?, dest: vec4?): Unit {
    return kniBridge127(m.rawValue, v.rawValue, dest.rawValue)
}

fun glm_mat4_det_sse2(mat: mat4?): Float {
    return kniBridge128(mat.rawValue)
}

fun glm_mat4_inv_fast_sse2(mat: mat4?, dest: mat4?): Unit {
    return kniBridge129(mat.rawValue, dest.rawValue)
}

fun glm_mat4_inv_sse2(mat: mat4?, dest: mat4?): Unit {
    return kniBridge130(mat.rawValue, dest.rawValue)
}

fun glm_mat4_ucopy(mat: mat4?, dest: mat4?): Unit {
    return kniBridge131(mat.rawValue, dest.rawValue)
}

fun glm_mat4_copy(mat: mat4?, dest: mat4?): Unit {
    return kniBridge132(mat.rawValue, dest.rawValue)
}

fun glm_mat4_identity(mat: mat4?): Unit {
    return kniBridge133(mat.rawValue)
}

fun glm_mat4_identity_array(mat: mat4?, count: size_t): Unit {
    return kniBridge134(mat.rawValue, count)
}

fun glm_mat4_pick3(mat: mat4?, dest: mat3?): Unit {
    return kniBridge135(mat.rawValue, dest.rawValue)
}

fun glm_mat4_pick3t(mat: mat4?, dest: mat3?): Unit {
    return kniBridge136(mat.rawValue, dest.rawValue)
}

fun glm_mat4_ins3(mat: mat3?, dest: mat4?): Unit {
    return kniBridge137(mat.rawValue, dest.rawValue)
}

fun glm_mat4_mul(m1: mat4?, m2: mat4?, dest: mat4?): Unit {
    return kniBridge138(m1.rawValue, m2.rawValue, dest.rawValue)
}

fun glm_mat4_mulN(matrices: CValuesRef<mat4Var>?, len: uint32_t, dest: mat4?): Unit {
    memScoped {
        return kniBridge139(matrices?.getPointer(memScope).rawValue, len, dest.rawValue)
    }
}

fun glm_mat4_mulv(m: mat4?, v: vec4?, dest: vec4?): Unit {
    return kniBridge140(m.rawValue, v.rawValue, dest.rawValue)
}

fun glm_mat4_quat(m: mat4?, dest: versor?): Unit {
    return kniBridge141(m.rawValue, dest.rawValue)
}

fun glm_mat4_mulv3(m: mat4?, v: vec3?, last: Float, dest: vec3?): Unit {
    return kniBridge142(m.rawValue, v.rawValue, last, dest.rawValue)
}

fun glm_mat4_transpose_to(m: mat4?, dest: mat4?): Unit {
    return kniBridge143(m.rawValue, dest.rawValue)
}

fun glm_mat4_transpose(m: mat4?): Unit {
    return kniBridge144(m.rawValue)
}

fun glm_mat4_scale_p(m: mat4?, s: Float): Unit {
    return kniBridge145(m.rawValue, s)
}

fun glm_mat4_scale(m: mat4?, s: Float): Unit {
    return kniBridge146(m.rawValue, s)
}

fun glm_mat4_det(mat: mat4?): Float {
    return kniBridge147(mat.rawValue)
}

fun glm_mat4_inv(mat: mat4?, dest: mat4?): Unit {
    return kniBridge148(mat.rawValue, dest.rawValue)
}

fun glm_mat4_inv_fast(mat: mat4?, dest: mat4?): Unit {
    return kniBridge149(mat.rawValue, dest.rawValue)
}

fun glm_mat4_swap_col(mat: mat4?, col1: Int, col2: Int): Unit {
    return kniBridge150(mat.rawValue, col1, col2)
}

fun glm_mat4_swap_row(mat: mat4?, row1: Int, row2: Int): Unit {
    return kniBridge151(mat.rawValue, row1, row2)
}

fun glm_mat3_mul_sse2(m1: mat3?, m2: mat3?, dest: mat3?): Unit {
    return kniBridge152(m1.rawValue, m2.rawValue, dest.rawValue)
}

fun glm_mat3_copy(mat: mat3?, dest: mat3?): Unit {
    return kniBridge153(mat.rawValue, dest.rawValue)
}

fun glm_mat3_identity(mat: mat3?): Unit {
    return kniBridge154(mat.rawValue)
}

fun glm_mat3_identity_array(mat: mat3?, count: size_t): Unit {
    return kniBridge155(mat.rawValue, count)
}

fun glm_mat3_mul(m1: mat3?, m2: mat3?, dest: mat3?): Unit {
    return kniBridge156(m1.rawValue, m2.rawValue, dest.rawValue)
}

fun glm_mat3_transpose_to(m: mat3?, dest: mat3?): Unit {
    return kniBridge157(m.rawValue, dest.rawValue)
}

fun glm_mat3_transpose(m: mat3?): Unit {
    return kniBridge158(m.rawValue)
}

fun glm_mat3_mulv(m: mat3?, v: vec3?, dest: vec3?): Unit {
    return kniBridge159(m.rawValue, v.rawValue, dest.rawValue)
}

fun glm_mat3_quat(m: mat3?, dest: versor?): Unit {
    return kniBridge160(m.rawValue, dest.rawValue)
}

fun glm_mat3_scale(m: mat3?, s: Float): Unit {
    return kniBridge161(m.rawValue, s)
}

fun glm_mat3_det(mat: mat3?): Float {
    return kniBridge162(mat.rawValue)
}

fun glm_mat3_inv(mat: mat3?, dest: mat3?): Unit {
    return kniBridge163(mat.rawValue, dest.rawValue)
}

fun glm_mat3_swap_col(mat: mat3?, col1: Int, col2: Int): Unit {
    return kniBridge164(mat.rawValue, col1, col2)
}

fun glm_mat3_swap_row(mat: mat3?, row1: Int, row2: Int): Unit {
    return kniBridge165(mat.rawValue, row1, row2)
}

fun glm_mul_sse2(m1: mat4?, m2: mat4?, dest: mat4?): Unit {
    return kniBridge166(m1.rawValue, m2.rawValue, dest.rawValue)
}

fun glm_mul_rot_sse2(m1: mat4?, m2: mat4?, dest: mat4?): Unit {
    return kniBridge167(m1.rawValue, m2.rawValue, dest.rawValue)
}

fun glm_inv_tr_sse2(mat: mat4?): Unit {
    return kniBridge168(mat.rawValue)
}

fun glm_mul(m1: mat4?, m2: mat4?, dest: mat4?): Unit {
    return kniBridge169(m1.rawValue, m2.rawValue, dest.rawValue)
}

fun glm_mul_rot(m1: mat4?, m2: mat4?, dest: mat4?): Unit {
    return kniBridge170(m1.rawValue, m2.rawValue, dest.rawValue)
}

fun glm_inv_tr(mat: mat4?): Unit {
    return kniBridge171(mat.rawValue)
}

fun glm_translate(m: mat4?, v: vec3?): Unit {
    return kniBridge172(m.rawValue, v.rawValue)
}

fun glm_translate_to(m: mat4?, v: vec3?, dest: mat4?): Unit {
    return kniBridge173(m.rawValue, v.rawValue, dest.rawValue)
}

fun glm_translate_x(m: mat4?, x: Float): Unit {
    return kniBridge174(m.rawValue, x)
}

fun glm_translate_y(m: mat4?, y: Float): Unit {
    return kniBridge175(m.rawValue, y)
}

fun glm_translate_z(m: mat4?, z: Float): Unit {
    return kniBridge176(m.rawValue, z)
}

fun glm_translate_make(m: mat4?, v: vec3?): Unit {
    return kniBridge177(m.rawValue, v.rawValue)
}

fun glm_scale_to(m: mat4?, v: vec3?, dest: mat4?): Unit {
    return kniBridge178(m.rawValue, v.rawValue, dest.rawValue)
}

fun glm_scale_make(m: mat4?, v: vec3?): Unit {
    return kniBridge179(m.rawValue, v.rawValue)
}

fun glm_scale(m: mat4?, v: vec3?): Unit {
    return kniBridge180(m.rawValue, v.rawValue)
}

fun glm_scale_uni(m: mat4?, s: Float): Unit {
    return kniBridge181(m.rawValue, s)
}

fun glm_rotate_x(m: mat4?, angle: Float, dest: mat4?): Unit {
    return kniBridge182(m.rawValue, angle, dest.rawValue)
}

fun glm_rotate_y(m: mat4?, angle: Float, dest: mat4?): Unit {
    return kniBridge183(m.rawValue, angle, dest.rawValue)
}

fun glm_rotate_z(m: mat4?, angle: Float, dest: mat4?): Unit {
    return kniBridge184(m.rawValue, angle, dest.rawValue)
}

fun glm_rotate_make(m: mat4?, angle: Float, axis: vec3?): Unit {
    return kniBridge185(m.rawValue, angle, axis.rawValue)
}

fun glm_rotate(m: mat4?, angle: Float, axis: vec3?): Unit {
    return kniBridge186(m.rawValue, angle, axis.rawValue)
}

fun glm_rotate_at(m: mat4?, pivot: vec3?, angle: Float, axis: vec3?): Unit {
    return kniBridge187(m.rawValue, pivot.rawValue, angle, axis.rawValue)
}

fun glm_rotate_atm(m: mat4?, pivot: vec3?, angle: Float, axis: vec3?): Unit {
    return kniBridge188(m.rawValue, pivot.rawValue, angle, axis.rawValue)
}

fun glm_decompose_scalev(m: mat4?, s: vec3?): Unit {
    return kniBridge189(m.rawValue, s.rawValue)
}

fun glm_uniscaled(m: mat4?): Boolean {
    return kniBridge190(m.rawValue).toBoolean()
}

fun glm_decompose_rs(m: mat4?, r: mat4?, s: vec3?): Unit {
    return kniBridge191(m.rawValue, r.rawValue, s.rawValue)
}

fun glm_decompose(m: mat4?, t: vec4?, r: mat4?, s: vec3?): Unit {
    return kniBridge192(m.rawValue, t.rawValue, r.rawValue, s.rawValue)
}

fun glm_plane_normalize(plane: vec4?): Unit {
    return kniBridge193(plane.rawValue)
}

fun glm_frustum(left: Float, right: Float, bottom: Float, top: Float, nearVal: Float, farVal: Float, dest: mat4?): Unit {
    return kniBridge194(left, right, bottom, top, nearVal, farVal, dest.rawValue)
}

fun glm_ortho(left: Float, right: Float, bottom: Float, top: Float, nearVal: Float, farVal: Float, dest: mat4?): Unit {
    return kniBridge195(left, right, bottom, top, nearVal, farVal, dest.rawValue)
}

fun glm_ortho_aabb(box: vec3?, dest: mat4?): Unit {
    return kniBridge196(box.rawValue, dest.rawValue)
}

fun glm_ortho_aabb_p(box: vec3?, padding: Float, dest: mat4?): Unit {
    return kniBridge197(box.rawValue, padding, dest.rawValue)
}

fun glm_ortho_aabb_pz(box: vec3?, padding: Float, dest: mat4?): Unit {
    return kniBridge198(box.rawValue, padding, dest.rawValue)
}

fun glm_ortho_default(aspect: Float, dest: mat4?): Unit {
    return kniBridge199(aspect, dest.rawValue)
}

fun glm_ortho_default_s(aspect: Float, size: Float, dest: mat4?): Unit {
    return kniBridge200(aspect, size, dest.rawValue)
}

fun glm_perspective(fovy: Float, aspect: Float, nearVal: Float, farVal: Float, dest: mat4?): Unit {
    return kniBridge201(fovy, aspect, nearVal, farVal, dest.rawValue)
}

fun glm_perspective_default(aspect: Float, dest: mat4?): Unit {
    return kniBridge202(aspect, dest.rawValue)
}

fun glm_perspective_resize(aspect: Float, proj: mat4?): Unit {
    return kniBridge203(aspect, proj.rawValue)
}

fun glm_lookat(eye: vec3?, center: vec3?, up: vec3?, dest: mat4?): Unit {
    return kniBridge204(eye.rawValue, center.rawValue, up.rawValue, dest.rawValue)
}

fun glm_look(eye: vec3?, dir: vec3?, up: vec3?, dest: mat4?): Unit {
    return kniBridge205(eye.rawValue, dir.rawValue, up.rawValue, dest.rawValue)
}

fun glm_look_anyup(eye: vec3?, dir: vec3?, dest: mat4?): Unit {
    return kniBridge206(eye.rawValue, dir.rawValue, dest.rawValue)
}

fun glm_persp_decomp(proj: mat4?, nearVal: CValuesRef<FloatVar>?, farVal: CValuesRef<FloatVar>?, top: CValuesRef<FloatVar>?, bottom: CValuesRef<FloatVar>?, left: CValuesRef<FloatVar>?, right: CValuesRef<FloatVar>?): Unit {
    memScoped {
        return kniBridge207(proj.rawValue, nearVal?.getPointer(memScope).rawValue, farVal?.getPointer(memScope).rawValue, top?.getPointer(memScope).rawValue, bottom?.getPointer(memScope).rawValue, left?.getPointer(memScope).rawValue, right?.getPointer(memScope).rawValue)
    }
}

fun glm_persp_decompv(proj: mat4?, dest: CValuesRef<FloatVar>?): Unit {
    memScoped {
        return kniBridge208(proj.rawValue, dest?.getPointer(memScope).rawValue)
    }
}

fun glm_persp_decomp_x(proj: mat4?, left: CValuesRef<FloatVar>?, right: CValuesRef<FloatVar>?): Unit {
    memScoped {
        return kniBridge209(proj.rawValue, left?.getPointer(memScope).rawValue, right?.getPointer(memScope).rawValue)
    }
}

fun glm_persp_decomp_y(proj: mat4?, top: CValuesRef<FloatVar>?, bottom: CValuesRef<FloatVar>?): Unit {
    memScoped {
        return kniBridge210(proj.rawValue, top?.getPointer(memScope).rawValue, bottom?.getPointer(memScope).rawValue)
    }
}

fun glm_persp_decomp_z(proj: mat4?, nearVal: CValuesRef<FloatVar>?, farVal: CValuesRef<FloatVar>?): Unit {
    memScoped {
        return kniBridge211(proj.rawValue, nearVal?.getPointer(memScope).rawValue, farVal?.getPointer(memScope).rawValue)
    }
}

fun glm_persp_decomp_far(proj: mat4?, farVal: CValuesRef<FloatVar>?): Unit {
    memScoped {
        return kniBridge212(proj.rawValue, farVal?.getPointer(memScope).rawValue)
    }
}

fun glm_persp_decomp_near(proj: mat4?, nearVal: CValuesRef<FloatVar>?): Unit {
    memScoped {
        return kniBridge213(proj.rawValue, nearVal?.getPointer(memScope).rawValue)
    }
}

fun glm_persp_fovy(proj: mat4?): Float {
    return kniBridge214(proj.rawValue)
}

fun glm_persp_aspect(proj: mat4?): Float {
    return kniBridge215(proj.rawValue)
}

fun glm_persp_sizes(proj: mat4?, fovy: Float, dest: vec4?): Unit {
    return kniBridge216(proj.rawValue, fovy, dest.rawValue)
}

fun glm_frustum_planes(m: mat4?, dest: vec4?): Unit {
    return kniBridge217(m.rawValue, dest.rawValue)
}

fun glm_frustum_corners(invMat: mat4?, dest: vec4?): Unit {
    return kniBridge218(invMat.rawValue, dest.rawValue)
}

fun glm_frustum_center(corners: vec4?, dest: vec4?): Unit {
    return kniBridge219(corners.rawValue, dest.rawValue)
}

fun glm_frustum_box(corners: vec4?, m: mat4?, box: vec3?): Unit {
    return kniBridge220(corners.rawValue, m.rawValue, box.rawValue)
}

fun glm_frustum_corners_at(corners: vec4?, splitDist: Float, farDist: Float, planeCorners: vec4?): Unit {
    return kniBridge221(corners.rawValue, splitDist, farDist, planeCorners.rawValue)
}

fun glm_quat_mul_sse2(p: versor?, q: versor?, dest: versor?): Unit {
    return kniBridge222(p.rawValue, q.rawValue, dest.rawValue)
}

fun glm_quat_identity(q: versor?): Unit {
    return kniBridge223(q.rawValue)
}

fun glm_quat_identity_array(q: versor?, count: size_t): Unit {
    return kniBridge224(q.rawValue, count)
}

fun glm_quat_init(q: versor?, x: Float, y: Float, z: Float, w: Float): Unit {
    return kniBridge225(q.rawValue, x, y, z, w)
}

fun glm_quatv(q: versor?, angle: Float, axis: vec3?): Unit {
    return kniBridge226(q.rawValue, angle, axis.rawValue)
}

fun glm_quat(q: versor?, angle: Float, x: Float, y: Float, z: Float): Unit {
    return kniBridge227(q.rawValue, angle, x, y, z)
}

fun glm_quat_copy(q: versor?, dest: versor?): Unit {
    return kniBridge228(q.rawValue, dest.rawValue)
}

fun glm_quat_norm(q: versor?): Float {
    return kniBridge229(q.rawValue)
}

fun glm_quat_normalize_to(q: versor?, dest: versor?): Unit {
    return kniBridge230(q.rawValue, dest.rawValue)
}

fun glm_quat_normalize(q: versor?): Unit {
    return kniBridge231(q.rawValue)
}

fun glm_quat_dot(p: versor?, q: versor?): Float {
    return kniBridge232(p.rawValue, q.rawValue)
}

fun glm_quat_conjugate(q: versor?, dest: versor?): Unit {
    return kniBridge233(q.rawValue, dest.rawValue)
}

fun glm_quat_inv(q: versor?, dest: versor?): Unit {
    return kniBridge234(q.rawValue, dest.rawValue)
}

fun glm_quat_add(p: versor?, q: versor?, dest: versor?): Unit {
    return kniBridge235(p.rawValue, q.rawValue, dest.rawValue)
}

fun glm_quat_sub(p: versor?, q: versor?, dest: versor?): Unit {
    return kniBridge236(p.rawValue, q.rawValue, dest.rawValue)
}

fun glm_quat_real(q: versor?): Float {
    return kniBridge237(q.rawValue)
}

fun glm_quat_imag(q: versor?, dest: vec3?): Unit {
    return kniBridge238(q.rawValue, dest.rawValue)
}

fun glm_quat_imagn(q: versor?, dest: vec3?): Unit {
    return kniBridge239(q.rawValue, dest.rawValue)
}

fun glm_quat_imaglen(q: versor?): Float {
    return kniBridge240(q.rawValue)
}

fun glm_quat_angle(q: versor?): Float {
    return kniBridge241(q.rawValue)
}

fun glm_quat_axis(q: versor?, dest: versor?): Unit {
    return kniBridge242(q.rawValue, dest.rawValue)
}

fun glm_quat_mul(p: versor?, q: versor?, dest: versor?): Unit {
    return kniBridge243(p.rawValue, q.rawValue, dest.rawValue)
}

fun glm_quat_mat4(q: versor?, dest: mat4?): Unit {
    return kniBridge244(q.rawValue, dest.rawValue)
}

fun glm_quat_mat4t(q: versor?, dest: mat4?): Unit {
    return kniBridge245(q.rawValue, dest.rawValue)
}

fun glm_quat_mat3(q: versor?, dest: mat3?): Unit {
    return kniBridge246(q.rawValue, dest.rawValue)
}

fun glm_quat_mat3t(q: versor?, dest: mat3?): Unit {
    return kniBridge247(q.rawValue, dest.rawValue)
}

fun glm_quat_lerp(from: versor?, to: versor?, t: Float, dest: versor?): Unit {
    return kniBridge248(from.rawValue, to.rawValue, t, dest.rawValue)
}

fun glm_quat_slerp(from: versor?, to: versor?, t: Float, dest: versor?): Unit {
    return kniBridge249(from.rawValue, to.rawValue, t, dest.rawValue)
}

fun glm_quat_look(eye: vec3?, ori: versor?, dest: mat4?): Unit {
    return kniBridge250(eye.rawValue, ori.rawValue, dest.rawValue)
}

fun glm_quat_for(dir: vec3?, fwd: vec3?, up: vec3?, dest: versor?): Unit {
    return kniBridge251(dir.rawValue, fwd.rawValue, up.rawValue, dest.rawValue)
}

fun glm_quat_forp(from: vec3?, to: vec3?, fwd: vec3?, up: vec3?, dest: versor?): Unit {
    return kniBridge252(from.rawValue, to.rawValue, fwd.rawValue, up.rawValue, dest.rawValue)
}

fun glm_quat_rotatev(q: versor?, v: vec3?, dest: vec3?): Unit {
    return kniBridge253(q.rawValue, v.rawValue, dest.rawValue)
}

fun glm_quat_rotate(m: mat4?, q: versor?, dest: mat4?): Unit {
    return kniBridge254(m.rawValue, q.rawValue, dest.rawValue)
}

fun glm_quat_rotate_at(m: mat4?, q: versor?, pivot: vec3?): Unit {
    return kniBridge255(m.rawValue, q.rawValue, pivot.rawValue)
}

fun glm_quat_rotate_atm(m: mat4?, q: versor?, pivot: vec3?): Unit {
    return kniBridge256(m.rawValue, q.rawValue, pivot.rawValue)
}

fun glm_euler_order(ord: CValuesRef<IntVar>?): glm_euler_sq {
    memScoped {
        return kniBridge257(ord?.getPointer(memScope).rawValue)
    }
}

fun glm_euler_angles(m: mat4?, dest: vec3?): Unit {
    return kniBridge258(m.rawValue, dest.rawValue)
}

fun glm_euler_xyz(angles: vec3?, dest: mat4?): Unit {
    return kniBridge259(angles.rawValue, dest.rawValue)
}

fun glm_euler(angles: vec3?, dest: mat4?): Unit {
    return kniBridge260(angles.rawValue, dest.rawValue)
}

fun glm_euler_xzy(angles: vec3?, dest: mat4?): Unit {
    return kniBridge261(angles.rawValue, dest.rawValue)
}

fun glm_euler_yxz(angles: vec3?, dest: mat4?): Unit {
    return kniBridge262(angles.rawValue, dest.rawValue)
}

fun glm_euler_yzx(angles: vec3?, dest: mat4?): Unit {
    return kniBridge263(angles.rawValue, dest.rawValue)
}

fun glm_euler_zxy(angles: vec3?, dest: mat4?): Unit {
    return kniBridge264(angles.rawValue, dest.rawValue)
}

fun glm_euler_zyx(angles: vec3?, dest: mat4?): Unit {
    return kniBridge265(angles.rawValue, dest.rawValue)
}

fun glm_euler_by_order(angles: vec3?, ord: glm_euler_sq, dest: mat4?): Unit {
    return kniBridge266(angles.rawValue, ord, dest.rawValue)
}

fun glm_aabb_transform(box: vec3?, m: mat4?, dest: vec3?): Unit {
    return kniBridge267(box.rawValue, m.rawValue, dest.rawValue)
}

fun glm_aabb_merge(box1: vec3?, box2: vec3?, dest: vec3?): Unit {
    return kniBridge268(box1.rawValue, box2.rawValue, dest.rawValue)
}

fun glm_aabb_crop(box: vec3?, cropBox: vec3?, dest: vec3?): Unit {
    return kniBridge269(box.rawValue, cropBox.rawValue, dest.rawValue)
}

fun glm_aabb_crop_until(box: vec3?, cropBox: vec3?, clampBox: vec3?, dest: vec3?): Unit {
    return kniBridge270(box.rawValue, cropBox.rawValue, clampBox.rawValue, dest.rawValue)
}

fun glm_aabb_frustum(box: vec3?, planes: vec4?): Boolean {
    return kniBridge271(box.rawValue, planes.rawValue).toBoolean()
}

fun glm_aabb_invalidate(box: vec3?): Unit {
    return kniBridge272(box.rawValue)
}

fun glm_aabb_isvalid(box: vec3?): Boolean {
    return kniBridge273(box.rawValue).toBoolean()
}

fun glm_aabb_size(box: vec3?): Float {
    return kniBridge274(box.rawValue)
}

fun glm_aabb_radius(box: vec3?): Float {
    return kniBridge275(box.rawValue)
}

fun glm_aabb_center(box: vec3?, dest: vec3?): Unit {
    return kniBridge276(box.rawValue, dest.rawValue)
}

fun glm_aabb_aabb(box: vec3?, other: vec3?): Boolean {
    return kniBridge277(box.rawValue, other.rawValue).toBoolean()
}

fun glm_aabb_sphere(box: vec3?, s: vec4?): Boolean {
    return kniBridge278(box.rawValue, s.rawValue).toBoolean()
}

fun glm_aabb_point(box: vec3?, point: vec3?): Boolean {
    return kniBridge279(box.rawValue, point.rawValue).toBoolean()
}

fun glm_aabb_contains(box: vec3?, other: vec3?): Boolean {
    return kniBridge280(box.rawValue, other.rawValue).toBoolean()
}

fun glm_luminance(rgb: vec3?): Float {
    return kniBridge281(rgb.rawValue)
}

fun glm_mat4_print(matrix: mat4?, ostream: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge282(matrix.rawValue, ostream?.getPointer(memScope).rawValue)
    }
}

fun glm_mat3_print(matrix: mat3?, ostream: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge283(matrix.rawValue, ostream?.getPointer(memScope).rawValue)
    }
}

fun glm_vec4_print(vec: vec4?, ostream: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge284(vec.rawValue, ostream?.getPointer(memScope).rawValue)
    }
}

fun glm_vec3_print(vec: vec3?, ostream: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge285(vec.rawValue, ostream?.getPointer(memScope).rawValue)
    }
}

fun glm_ivec3_print(vec: ivec3?, ostream: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge286(vec.rawValue, ostream?.getPointer(memScope).rawValue)
    }
}

fun glm_versor_print(vec: versor?, ostream: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge287(vec.rawValue, ostream?.getPointer(memScope).rawValue)
    }
}

fun glm_aabb_print(bbox: vec3?, tag: String?, ostream: CValuesRef<FILE>?): Unit {
    memScoped {
        return kniBridge288(bbox.rawValue, tag?.cstr?.getPointer(memScope).rawValue, ostream?.getPointer(memScope).rawValue)
    }
}

fun glm_unprojecti(pos: vec3?, invMat: mat4?, vp: vec4?, dest: vec3?): Unit {
    return kniBridge289(pos.rawValue, invMat.rawValue, vp.rawValue, dest.rawValue)
}

fun glm_unproject(pos: vec3?, m: mat4?, vp: vec4?, dest: vec3?): Unit {
    return kniBridge290(pos.rawValue, m.rawValue, vp.rawValue, dest.rawValue)
}

fun glm_project(pos: vec3?, m: mat4?, vp: vec4?, dest: vec3?): Unit {
    return kniBridge291(pos.rawValue, m.rawValue, vp.rawValue, dest.rawValue)
}

fun glm_sphere_radii(s: vec4?): Float {
    return kniBridge292(s.rawValue)
}

fun glm_sphere_transform(s: vec4?, m: mat4?, dest: vec4?): Unit {
    return kniBridge293(s.rawValue, m.rawValue, dest.rawValue)
}

fun glm_sphere_merge(s1: vec4?, s2: vec4?, dest: vec4?): Unit {
    return kniBridge294(s1.rawValue, s2.rawValue, dest.rawValue)
}

fun glm_sphere_sphere(s1: vec4?, s2: vec4?): Boolean {
    return kniBridge295(s1.rawValue, s2.rawValue).toBoolean()
}

fun glm_sphere_point(s: vec4?, point: vec3?): Boolean {
    return kniBridge296(s.rawValue, point.rawValue).toBoolean()
}

fun glm_ease_linear(t: Float): Float {
    return kniBridge297(t)
}

fun glm_ease_sine_in(t: Float): Float {
    return kniBridge298(t)
}

fun glm_ease_sine_out(t: Float): Float {
    return kniBridge299(t)
}

fun glm_ease_sine_inout(t: Float): Float {
    return kniBridge300(t)
}

fun glm_ease_quad_in(t: Float): Float {
    return kniBridge301(t)
}

fun glm_ease_quad_out(t: Float): Float {
    return kniBridge302(t)
}

fun glm_ease_quad_inout(t: Float): Float {
    return kniBridge303(t)
}

fun glm_ease_cubic_in(t: Float): Float {
    return kniBridge304(t)
}

fun glm_ease_cubic_out(t: Float): Float {
    return kniBridge305(t)
}

fun glm_ease_cubic_inout(t: Float): Float {
    return kniBridge306(t)
}

fun glm_ease_quart_in(t: Float): Float {
    return kniBridge307(t)
}

fun glm_ease_quart_out(t: Float): Float {
    return kniBridge308(t)
}

fun glm_ease_quart_inout(t: Float): Float {
    return kniBridge309(t)
}

fun glm_ease_quint_in(t: Float): Float {
    return kniBridge310(t)
}

fun glm_ease_quint_out(t: Float): Float {
    return kniBridge311(t)
}

fun glm_ease_quint_inout(t: Float): Float {
    return kniBridge312(t)
}

fun glm_ease_exp_in(t: Float): Float {
    return kniBridge313(t)
}

fun glm_ease_exp_out(t: Float): Float {
    return kniBridge314(t)
}

fun glm_ease_exp_inout(t: Float): Float {
    return kniBridge315(t)
}

fun glm_ease_circ_in(t: Float): Float {
    return kniBridge316(t)
}

fun glm_ease_circ_out(t: Float): Float {
    return kniBridge317(t)
}

fun glm_ease_circ_inout(t: Float): Float {
    return kniBridge318(t)
}

fun glm_ease_back_in(t: Float): Float {
    return kniBridge319(t)
}

fun glm_ease_back_out(t: Float): Float {
    return kniBridge320(t)
}

fun glm_ease_back_inout(t: Float): Float {
    return kniBridge321(t)
}

fun glm_ease_elast_in(t: Float): Float {
    return kniBridge322(t)
}

fun glm_ease_elast_out(t: Float): Float {
    return kniBridge323(t)
}

fun glm_ease_elast_inout(t: Float): Float {
    return kniBridge324(t)
}

fun glm_ease_bounce_out(t: Float): Float {
    return kniBridge325(t)
}

fun glm_ease_bounce_in(t: Float): Float {
    return kniBridge326(t)
}

fun glm_ease_bounce_inout(t: Float): Float {
    return kniBridge327(t)
}

val GLM_E: Double get() = bitsToDouble(4613303445314885481) /* == 2.718281828459045 */

val GLM_LOG2E: Double get() = bitsToDouble(4609176140021203710) /* == 1.4426950408889634 */

val GLM_LOG10E: Double get() = bitsToDouble(4601495173785380110) /* == 0.4342944819032518 */

val GLM_LN2: Double get() = bitsToDouble(4604418534313441775) /* == 0.6931471805599453 */

val GLM_LN10: Double get() = bitsToDouble(4612367379483415830) /* == 2.302585092994046 */

val GLM_PI: Double get() = bitsToDouble(4614256656552045848) /* == 3.141592653589793 */

val GLM_PI_2: Double get() = bitsToDouble(4609753056924675352) /* == 1.5707963267948966 */

val GLM_PI_4: Double get() = bitsToDouble(4605249457297304856) /* == 0.7853981633974483 */

val GLM_1_PI: Double get() = bitsToDouble(4599405781057128579) /* == 0.3183098861837907 */

val GLM_2_PI: Double get() = bitsToDouble(4603909380684499075) /* == 0.6366197723675814 */

val GLM_2_SQRTPI: Double get() = bitsToDouble(4607760587169110893) /* == 1.1283791670955126 */

val GLM_SQRT2: Double get() = bitsToDouble(4609047870845172685) /* == 1.4142135623730951 */

val GLM_SQRT1_2: Double get() = bitsToDouble(4604544271217802189) /* == 0.7071067811865476 */

val GLM_Ef: Float get() = bitsToFloat(1076754516) /* == 2.7182817 */

val GLM_LOG2Ef: Float get() = bitsToFloat(1069066811) /* == 1.442695 */

val GLM_LOG10Ef: Float get() = bitsToFloat(1054759897) /* == 0.4342945 */

val GLM_LN2f: Float get() = bitsToFloat(1060205080) /* == 0.6931472 */

val GLM_LN10f: Float get() = bitsToFloat(1075010958) /* == 2.3025851 */

val GLM_PIf: Float get() = bitsToFloat(1078530011) /* == 3.1415927 */

val GLM_PI_2f: Float get() = bitsToFloat(1070141403) /* == 1.5707964 */

val GLM_PI_4f: Float get() = bitsToFloat(1061752795) /* == 0.7853982 */

val GLM_1_PIf: Float get() = bitsToFloat(1050868099) /* == 0.31830987 */

val GLM_2_PIf: Float get() = bitsToFloat(1059256707) /* == 0.63661975 */

val GLM_2_SQRTPIf: Float get() = bitsToFloat(1066430139) /* == 1.1283792 */

val GLM_SQRT2f: Float get() = bitsToFloat(1068827891) /* == 1.4142135 */

val GLM_SQRT1_2f: Float get() = bitsToFloat(1060439283) /* == 0.70710677 */

val CGLM_PI: Float get() = bitsToFloat(1078530011) /* == 3.1415927 */

val CGLM_PI_2: Float get() = bitsToFloat(1070141403) /* == 1.5707964 */

val CGLM_PI_4: Float get() = bitsToFloat(1061752795) /* == 0.7853982 */

const val CGLM_SSE_FP: Int = 1

const val GLM_LBN: Int = 0

const val GLM_LTN: Int = 1

const val GLM_RTN: Int = 2

const val GLM_RBN: Int = 3

const val GLM_LBF: Int = 4

const val GLM_LTF: Int = 5

const val GLM_RTF: Int = 6

const val GLM_RBF: Int = 7

const val GLM_LEFT: Int = 0

const val GLM_RIGHT: Int = 1

const val GLM_BOTTOM: Int = 2

const val GLM_TOP: Int = 3

const val GLM_NEAR: Int = 4

const val GLM_FAR: Int = 5

typealias glm_euler_sqVar = UIntVarOf<glm_euler_sq>
typealias glm_euler_sq = UInt

val GLM_EULER_XYZ: glm_euler_sq get() = 36u
val GLM_EULER_XZY: glm_euler_sq get() = 24u
val GLM_EULER_YZX: glm_euler_sq get() = 9u
val GLM_EULER_YXZ: glm_euler_sq get() = 33u
val GLM_EULER_ZXY: glm_euler_sq get() = 18u
val GLM_EULER_ZYX: glm_euler_sq get() = 6u

typealias vec2Var = CPointerVarOf<vec2>
typealias vec2 = CArrayPointer<FloatVar>

typealias vec3Var = CPointerVarOf<vec3>
typealias vec3 = CArrayPointer<FloatVar>

typealias ivec3Var = CPointerVarOf<ivec3>
typealias ivec3 = CArrayPointer<IntVar>

typealias vec4Var = CPointerVarOf<vec4>
typealias vec4 = CArrayPointer<FloatVar>

typealias mat3Var = CPointerVarOf<mat3>
typealias mat3 = vec3

typealias mat4Var = CPointerVarOf<mat4>
typealias mat4 = vec4

typealias versorVar = CPointerVarOf<versor>
typealias versor = vec4

@SymbolName("cglm_kniBridge0")
private external fun kniBridge0(p0: ULong): NativePtr
@SymbolName("cglm_kniBridge1")
private external fun kniBridge1(p0: ULong, p1: ULong): NativePtr
@SymbolName("cglm_kniBridge2")
private external fun kniBridge2(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge3")
private external fun kniBridge3(p0: NativePtr, p1: ULong): NativePtr
@SymbolName("cglm_kniBridge4")
private external fun kniBridge4(p0: ULong): NativePtr
@SymbolName("cglm_kniBridge5")
private external fun kniBridge5(p0: NativePtr, p1: ULong, p2: ULong): Int
@SymbolName("cglm_kniBridge6")
private external fun kniBridge6(p0: Int): Int
@SymbolName("cglm_kniBridge7")
private external fun kniBridge7(p0: Float): Float
@SymbolName("cglm_kniBridge8")
private external fun kniBridge8(p0: Float): Float
@SymbolName("cglm_kniBridge9")
private external fun kniBridge9(p0: Float): Float
@SymbolName("cglm_kniBridge10")
private external fun kniBridge10(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge11")
private external fun kniBridge11(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge12")
private external fun kniBridge12(p0: Float): Float
@SymbolName("cglm_kniBridge13")
private external fun kniBridge13(p0: Float, p1: Float): Float
@SymbolName("cglm_kniBridge14")
private external fun kniBridge14(p0: Float, p1: Float): Float
@SymbolName("cglm_kniBridge15")
private external fun kniBridge15(p0: Float, p1: Float, p2: Float): Float
@SymbolName("cglm_kniBridge16")
private external fun kniBridge16(p0: Float): Float
@SymbolName("cglm_kniBridge17")
private external fun kniBridge17(p0: Float, p1: Float, p2: Float): Float
@SymbolName("cglm_kniBridge18")
private external fun kniBridge18(p0: Float, p1: Float): Byte
@SymbolName("cglm_kniBridge19")
private external fun kniBridge19(p0: Float, p1: Float, p2: Float): Float
@SymbolName("cglm_kniBridge20")
private external fun kniBridge20(p0: Float, p1: Float, p2: Float): Float
@SymbolName("cglm_kniBridge21")
private external fun kniBridge21(p0: Float, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge22")
private external fun kniBridge22(p0: NativePtr, p1: Float): Byte
@SymbolName("cglm_kniBridge23")
private external fun kniBridge23(p0: NativePtr, p1: Float): Byte
@SymbolName("cglm_kniBridge24")
private external fun kniBridge24(p0: NativePtr): Byte
@SymbolName("cglm_kniBridge25")
private external fun kniBridge25(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("cglm_kniBridge26")
private external fun kniBridge26(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("cglm_kniBridge27")
private external fun kniBridge27(p0: NativePtr): Float
@SymbolName("cglm_kniBridge28")
private external fun kniBridge28(p0: NativePtr): Float
@SymbolName("cglm_kniBridge29")
private external fun kniBridge29(p0: NativePtr): Byte
@SymbolName("cglm_kniBridge30")
private external fun kniBridge30(p0: NativePtr): Byte
@SymbolName("cglm_kniBridge31")
private external fun kniBridge31(p0: NativePtr): Byte
@SymbolName("cglm_kniBridge32")
private external fun kniBridge32(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge33")
private external fun kniBridge33(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge34")
private external fun kniBridge34(p0: Float, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge35")
private external fun kniBridge35(p0: NativePtr, p1: Float): Byte
@SymbolName("cglm_kniBridge36")
private external fun kniBridge36(p0: NativePtr, p1: Float): Byte
@SymbolName("cglm_kniBridge37")
private external fun kniBridge37(p0: NativePtr): Byte
@SymbolName("cglm_kniBridge38")
private external fun kniBridge38(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("cglm_kniBridge39")
private external fun kniBridge39(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("cglm_kniBridge40")
private external fun kniBridge40(p0: NativePtr): Float
@SymbolName("cglm_kniBridge41")
private external fun kniBridge41(p0: NativePtr): Float
@SymbolName("cglm_kniBridge42")
private external fun kniBridge42(p0: NativePtr): Byte
@SymbolName("cglm_kniBridge43")
private external fun kniBridge43(p0: NativePtr): Byte
@SymbolName("cglm_kniBridge44")
private external fun kniBridge44(p0: NativePtr): Byte
@SymbolName("cglm_kniBridge45")
private external fun kniBridge45(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge46")
private external fun kniBridge46(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge47")
private external fun kniBridge47(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge49")
private external fun kniBridge49(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge50")
private external fun kniBridge50(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge51")
private external fun kniBridge51(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge52")
private external fun kniBridge52(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge53")
private external fun kniBridge53(p0: NativePtr, p1: NativePtr): Float
@SymbolName("cglm_kniBridge54")
private external fun kniBridge54(p0: NativePtr): Float
@SymbolName("cglm_kniBridge55")
private external fun kniBridge55(p0: NativePtr): Float
@SymbolName("cglm_kniBridge56")
private external fun kniBridge56(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge57")
private external fun kniBridge57(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge58")
private external fun kniBridge58(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge59")
private external fun kniBridge59(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge60")
private external fun kniBridge60(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge61")
private external fun kniBridge61(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge62")
private external fun kniBridge62(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge63")
private external fun kniBridge63(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge64")
private external fun kniBridge64(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge65")
private external fun kniBridge65(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge66")
private external fun kniBridge66(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge67")
private external fun kniBridge67(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge68")
private external fun kniBridge68(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge69")
private external fun kniBridge69(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge70")
private external fun kniBridge70(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge71")
private external fun kniBridge71(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge72")
private external fun kniBridge72(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge73")
private external fun kniBridge73(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge74")
private external fun kniBridge74(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge75")
private external fun kniBridge75(p0: NativePtr, p1: NativePtr): Float
@SymbolName("cglm_kniBridge76")
private external fun kniBridge76(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge77")
private external fun kniBridge77(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge78")
private external fun kniBridge78(p0: NativePtr, p1: Float, p2: Float): Unit
@SymbolName("cglm_kniBridge79")
private external fun kniBridge79(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge80")
private external fun kniBridge80(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge81")
private external fun kniBridge81(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge82")
private external fun kniBridge82(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge83")
private external fun kniBridge83(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge84")
private external fun kniBridge84(p0: NativePtr, p1: NativePtr): Float
@SymbolName("cglm_kniBridge85")
private external fun kniBridge85(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge86")
private external fun kniBridge86(p0: NativePtr): Float
@SymbolName("cglm_kniBridge87")
private external fun kniBridge87(p0: NativePtr): Float
@SymbolName("cglm_kniBridge88")
private external fun kniBridge88(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge89")
private external fun kniBridge89(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge90")
private external fun kniBridge90(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge91")
private external fun kniBridge91(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge92")
private external fun kniBridge92(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge93")
private external fun kniBridge93(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge94")
private external fun kniBridge94(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge95")
private external fun kniBridge95(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge96")
private external fun kniBridge96(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge97")
private external fun kniBridge97(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge98")
private external fun kniBridge98(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge99")
private external fun kniBridge99(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge100")
private external fun kniBridge100(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge101")
private external fun kniBridge101(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge102")
private external fun kniBridge102(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge103")
private external fun kniBridge103(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge104")
private external fun kniBridge104(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge105")
private external fun kniBridge105(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge106")
private external fun kniBridge106(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge107")
private external fun kniBridge107(p0: NativePtr, p1: NativePtr): Float
@SymbolName("cglm_kniBridge108")
private external fun kniBridge108(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge109")
private external fun kniBridge109(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge110")
private external fun kniBridge110(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge111")
private external fun kniBridge111(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge112")
private external fun kniBridge112(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge113")
private external fun kniBridge113(p0: NativePtr, p1: NativePtr): Float
@SymbolName("cglm_kniBridge114")
private external fun kniBridge114(p0: NativePtr, p1: NativePtr): Float
@SymbolName("cglm_kniBridge115")
private external fun kniBridge115(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge116")
private external fun kniBridge116(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge117")
private external fun kniBridge117(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge118")
private external fun kniBridge118(p0: NativePtr, p1: Float, p2: Float): Unit
@SymbolName("cglm_kniBridge119")
private external fun kniBridge119(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge120")
private external fun kniBridge120(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge121")
private external fun kniBridge121(p0: NativePtr, p1: NativePtr): Float
@SymbolName("cglm_kniBridge122")
private external fun kniBridge122(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge123")
private external fun kniBridge123(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge124")
private external fun kniBridge124(p0: NativePtr, p1: Float): Unit
@SymbolName("cglm_kniBridge125")
private external fun kniBridge125(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge126")
private external fun kniBridge126(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge127")
private external fun kniBridge127(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge128")
private external fun kniBridge128(p0: NativePtr): Float
@SymbolName("cglm_kniBridge129")
private external fun kniBridge129(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge130")
private external fun kniBridge130(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge131")
private external fun kniBridge131(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge132")
private external fun kniBridge132(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge133")
private external fun kniBridge133(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge134")
private external fun kniBridge134(p0: NativePtr, p1: ULong): Unit
@SymbolName("cglm_kniBridge135")
private external fun kniBridge135(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge136")
private external fun kniBridge136(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge137")
private external fun kniBridge137(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge138")
private external fun kniBridge138(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge139")
private external fun kniBridge139(p0: NativePtr, p1: UInt, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge140")
private external fun kniBridge140(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge141")
private external fun kniBridge141(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge142")
private external fun kniBridge142(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge143")
private external fun kniBridge143(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge144")
private external fun kniBridge144(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge145")
private external fun kniBridge145(p0: NativePtr, p1: Float): Unit
@SymbolName("cglm_kniBridge146")
private external fun kniBridge146(p0: NativePtr, p1: Float): Unit
@SymbolName("cglm_kniBridge147")
private external fun kniBridge147(p0: NativePtr): Float
@SymbolName("cglm_kniBridge148")
private external fun kniBridge148(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge149")
private external fun kniBridge149(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge150")
private external fun kniBridge150(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("cglm_kniBridge151")
private external fun kniBridge151(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("cglm_kniBridge152")
private external fun kniBridge152(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge153")
private external fun kniBridge153(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge154")
private external fun kniBridge154(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge155")
private external fun kniBridge155(p0: NativePtr, p1: ULong): Unit
@SymbolName("cglm_kniBridge156")
private external fun kniBridge156(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge157")
private external fun kniBridge157(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge158")
private external fun kniBridge158(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge159")
private external fun kniBridge159(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge160")
private external fun kniBridge160(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge161")
private external fun kniBridge161(p0: NativePtr, p1: Float): Unit
@SymbolName("cglm_kniBridge162")
private external fun kniBridge162(p0: NativePtr): Float
@SymbolName("cglm_kniBridge163")
private external fun kniBridge163(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge164")
private external fun kniBridge164(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("cglm_kniBridge165")
private external fun kniBridge165(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("cglm_kniBridge166")
private external fun kniBridge166(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge167")
private external fun kniBridge167(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge168")
private external fun kniBridge168(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge169")
private external fun kniBridge169(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge170")
private external fun kniBridge170(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge171")
private external fun kniBridge171(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge172")
private external fun kniBridge172(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge173")
private external fun kniBridge173(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge174")
private external fun kniBridge174(p0: NativePtr, p1: Float): Unit
@SymbolName("cglm_kniBridge175")
private external fun kniBridge175(p0: NativePtr, p1: Float): Unit
@SymbolName("cglm_kniBridge176")
private external fun kniBridge176(p0: NativePtr, p1: Float): Unit
@SymbolName("cglm_kniBridge177")
private external fun kniBridge177(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge178")
private external fun kniBridge178(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge179")
private external fun kniBridge179(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge180")
private external fun kniBridge180(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge181")
private external fun kniBridge181(p0: NativePtr, p1: Float): Unit
@SymbolName("cglm_kniBridge182")
private external fun kniBridge182(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge183")
private external fun kniBridge183(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge184")
private external fun kniBridge184(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge185")
private external fun kniBridge185(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge186")
private external fun kniBridge186(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge187")
private external fun kniBridge187(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge188")
private external fun kniBridge188(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge189")
private external fun kniBridge189(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge190")
private external fun kniBridge190(p0: NativePtr): Byte
@SymbolName("cglm_kniBridge191")
private external fun kniBridge191(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge192")
private external fun kniBridge192(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge193")
private external fun kniBridge193(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge194")
private external fun kniBridge194(p0: Float, p1: Float, p2: Float, p3: Float, p4: Float, p5: Float, p6: NativePtr): Unit
@SymbolName("cglm_kniBridge195")
private external fun kniBridge195(p0: Float, p1: Float, p2: Float, p3: Float, p4: Float, p5: Float, p6: NativePtr): Unit
@SymbolName("cglm_kniBridge196")
private external fun kniBridge196(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge197")
private external fun kniBridge197(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge198")
private external fun kniBridge198(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge199")
private external fun kniBridge199(p0: Float, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge200")
private external fun kniBridge200(p0: Float, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge201")
private external fun kniBridge201(p0: Float, p1: Float, p2: Float, p3: Float, p4: NativePtr): Unit
@SymbolName("cglm_kniBridge202")
private external fun kniBridge202(p0: Float, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge203")
private external fun kniBridge203(p0: Float, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge204")
private external fun kniBridge204(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge205")
private external fun kniBridge205(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge206")
private external fun kniBridge206(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge207")
private external fun kniBridge207(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): Unit
@SymbolName("cglm_kniBridge208")
private external fun kniBridge208(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge209")
private external fun kniBridge209(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge210")
private external fun kniBridge210(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge211")
private external fun kniBridge211(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge212")
private external fun kniBridge212(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge213")
private external fun kniBridge213(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge214")
private external fun kniBridge214(p0: NativePtr): Float
@SymbolName("cglm_kniBridge215")
private external fun kniBridge215(p0: NativePtr): Float
@SymbolName("cglm_kniBridge216")
private external fun kniBridge216(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge217")
private external fun kniBridge217(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge218")
private external fun kniBridge218(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge219")
private external fun kniBridge219(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge220")
private external fun kniBridge220(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge221")
private external fun kniBridge221(p0: NativePtr, p1: Float, p2: Float, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge222")
private external fun kniBridge222(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge223")
private external fun kniBridge223(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge224")
private external fun kniBridge224(p0: NativePtr, p1: ULong): Unit
@SymbolName("cglm_kniBridge225")
private external fun kniBridge225(p0: NativePtr, p1: Float, p2: Float, p3: Float, p4: Float): Unit
@SymbolName("cglm_kniBridge226")
private external fun kniBridge226(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge227")
private external fun kniBridge227(p0: NativePtr, p1: Float, p2: Float, p3: Float, p4: Float): Unit
@SymbolName("cglm_kniBridge228")
private external fun kniBridge228(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge229")
private external fun kniBridge229(p0: NativePtr): Float
@SymbolName("cglm_kniBridge230")
private external fun kniBridge230(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge231")
private external fun kniBridge231(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge232")
private external fun kniBridge232(p0: NativePtr, p1: NativePtr): Float
@SymbolName("cglm_kniBridge233")
private external fun kniBridge233(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge234")
private external fun kniBridge234(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge235")
private external fun kniBridge235(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge236")
private external fun kniBridge236(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge237")
private external fun kniBridge237(p0: NativePtr): Float
@SymbolName("cglm_kniBridge238")
private external fun kniBridge238(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge239")
private external fun kniBridge239(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge240")
private external fun kniBridge240(p0: NativePtr): Float
@SymbolName("cglm_kniBridge241")
private external fun kniBridge241(p0: NativePtr): Float
@SymbolName("cglm_kniBridge242")
private external fun kniBridge242(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge243")
private external fun kniBridge243(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge244")
private external fun kniBridge244(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge245")
private external fun kniBridge245(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge246")
private external fun kniBridge246(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge247")
private external fun kniBridge247(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge248")
private external fun kniBridge248(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge249")
private external fun kniBridge249(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge250")
private external fun kniBridge250(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge251")
private external fun kniBridge251(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge252")
private external fun kniBridge252(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("cglm_kniBridge253")
private external fun kniBridge253(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge254")
private external fun kniBridge254(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge255")
private external fun kniBridge255(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge256")
private external fun kniBridge256(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge257")
private external fun kniBridge257(p0: NativePtr): UInt
@SymbolName("cglm_kniBridge258")
private external fun kniBridge258(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge259")
private external fun kniBridge259(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge260")
private external fun kniBridge260(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge261")
private external fun kniBridge261(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge262")
private external fun kniBridge262(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge263")
private external fun kniBridge263(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge264")
private external fun kniBridge264(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge265")
private external fun kniBridge265(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge266")
private external fun kniBridge266(p0: NativePtr, p1: UInt, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge267")
private external fun kniBridge267(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge268")
private external fun kniBridge268(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge269")
private external fun kniBridge269(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge270")
private external fun kniBridge270(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge271")
private external fun kniBridge271(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("cglm_kniBridge272")
private external fun kniBridge272(p0: NativePtr): Unit
@SymbolName("cglm_kniBridge273")
private external fun kniBridge273(p0: NativePtr): Byte
@SymbolName("cglm_kniBridge274")
private external fun kniBridge274(p0: NativePtr): Float
@SymbolName("cglm_kniBridge275")
private external fun kniBridge275(p0: NativePtr): Float
@SymbolName("cglm_kniBridge276")
private external fun kniBridge276(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge277")
private external fun kniBridge277(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("cglm_kniBridge278")
private external fun kniBridge278(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("cglm_kniBridge279")
private external fun kniBridge279(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("cglm_kniBridge280")
private external fun kniBridge280(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("cglm_kniBridge281")
private external fun kniBridge281(p0: NativePtr): Float
@SymbolName("cglm_kniBridge282")
private external fun kniBridge282(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge283")
private external fun kniBridge283(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge284")
private external fun kniBridge284(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge285")
private external fun kniBridge285(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge286")
private external fun kniBridge286(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge287")
private external fun kniBridge287(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("cglm_kniBridge288")
private external fun kniBridge288(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge289")
private external fun kniBridge289(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge290")
private external fun kniBridge290(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge291")
private external fun kniBridge291(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("cglm_kniBridge292")
private external fun kniBridge292(p0: NativePtr): Float
@SymbolName("cglm_kniBridge293")
private external fun kniBridge293(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge294")
private external fun kniBridge294(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("cglm_kniBridge295")
private external fun kniBridge295(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("cglm_kniBridge296")
private external fun kniBridge296(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("cglm_kniBridge297")
private external fun kniBridge297(p0: Float): Float
@SymbolName("cglm_kniBridge298")
private external fun kniBridge298(p0: Float): Float
@SymbolName("cglm_kniBridge299")
private external fun kniBridge299(p0: Float): Float
@SymbolName("cglm_kniBridge300")
private external fun kniBridge300(p0: Float): Float
@SymbolName("cglm_kniBridge301")
private external fun kniBridge301(p0: Float): Float
@SymbolName("cglm_kniBridge302")
private external fun kniBridge302(p0: Float): Float
@SymbolName("cglm_kniBridge303")
private external fun kniBridge303(p0: Float): Float
@SymbolName("cglm_kniBridge304")
private external fun kniBridge304(p0: Float): Float
@SymbolName("cglm_kniBridge305")
private external fun kniBridge305(p0: Float): Float
@SymbolName("cglm_kniBridge306")
private external fun kniBridge306(p0: Float): Float
@SymbolName("cglm_kniBridge307")
private external fun kniBridge307(p0: Float): Float
@SymbolName("cglm_kniBridge308")
private external fun kniBridge308(p0: Float): Float
@SymbolName("cglm_kniBridge309")
private external fun kniBridge309(p0: Float): Float
@SymbolName("cglm_kniBridge310")
private external fun kniBridge310(p0: Float): Float
@SymbolName("cglm_kniBridge311")
private external fun kniBridge311(p0: Float): Float
@SymbolName("cglm_kniBridge312")
private external fun kniBridge312(p0: Float): Float
@SymbolName("cglm_kniBridge313")
private external fun kniBridge313(p0: Float): Float
@SymbolName("cglm_kniBridge314")
private external fun kniBridge314(p0: Float): Float
@SymbolName("cglm_kniBridge315")
private external fun kniBridge315(p0: Float): Float
@SymbolName("cglm_kniBridge316")
private external fun kniBridge316(p0: Float): Float
@SymbolName("cglm_kniBridge317")
private external fun kniBridge317(p0: Float): Float
@SymbolName("cglm_kniBridge318")
private external fun kniBridge318(p0: Float): Float
@SymbolName("cglm_kniBridge319")
private external fun kniBridge319(p0: Float): Float
@SymbolName("cglm_kniBridge320")
private external fun kniBridge320(p0: Float): Float
@SymbolName("cglm_kniBridge321")
private external fun kniBridge321(p0: Float): Float
@SymbolName("cglm_kniBridge322")
private external fun kniBridge322(p0: Float): Float
@SymbolName("cglm_kniBridge323")
private external fun kniBridge323(p0: Float): Float
@SymbolName("cglm_kniBridge324")
private external fun kniBridge324(p0: Float): Float
@SymbolName("cglm_kniBridge325")
private external fun kniBridge325(p0: Float): Float
@SymbolName("cglm_kniBridge326")
private external fun kniBridge326(p0: Float): Float
@SymbolName("cglm_kniBridge327")
private external fun kniBridge327(p0: Float): Float
