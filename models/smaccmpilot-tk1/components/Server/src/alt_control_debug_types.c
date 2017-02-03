/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.5
 */
#include "alt_control_debug_types.h"

void alt_control_debug_get_le(const uint8_t *n_var0, uint32_t n_var1, struct alt_control_debug *n_var2)
{
    ivory_serialize_unpack_float_le(n_var0, n_var1, &n_var2->alt_est);
    ivory_serialize_unpack_float_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 4U), &n_var2->alt_rate_est);
    ivory_serialize_unpack_float_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 8U), &n_var2->r22_gain);
    pid_state_get_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 12U), &n_var2->thrust);
    ivory_serialize_unpack_float_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 29U), &n_var2->ui_setp);
    ivory_serialize_unpack_float_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 33U), &n_var2->ui_rate_setp);
    pid_state_get_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 37U), &n_var2->pos);
    ivory_serialize_unpack_float_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 54U), &n_var2->pos_setp);
    ivory_serialize_unpack_float_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 58U), &n_var2->pos_rate_setp);
}

void alt_control_debug_get_be(const uint8_t *n_var0, uint32_t n_var1, struct alt_control_debug *n_var2)
{
    ivory_serialize_unpack_float_be(n_var0, n_var1, &n_var2->alt_est);
    ivory_serialize_unpack_float_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 4U), &n_var2->alt_rate_est);
    ivory_serialize_unpack_float_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 8U), &n_var2->r22_gain);
    pid_state_get_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 12U), &n_var2->thrust);
    ivory_serialize_unpack_float_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 29U), &n_var2->ui_setp);
    ivory_serialize_unpack_float_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 33U), &n_var2->ui_rate_setp);
    pid_state_get_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 37U), &n_var2->pos);
    ivory_serialize_unpack_float_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 54U), &n_var2->pos_setp);
    ivory_serialize_unpack_float_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 58U), &n_var2->pos_rate_setp);
}

void alt_control_debug_set_le(uint8_t *n_var0, uint32_t n_var1, const struct alt_control_debug *n_var2)
{
    ivory_serialize_pack_float_le(n_var0, n_var1, &n_var2->alt_est);
    ivory_serialize_pack_float_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 4U), &n_var2->alt_rate_est);
    ivory_serialize_pack_float_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 8U), &n_var2->r22_gain);
    pid_state_set_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 12U), &n_var2->thrust);
    ivory_serialize_pack_float_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 29U), &n_var2->ui_setp);
    ivory_serialize_pack_float_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 33U), &n_var2->ui_rate_setp);
    pid_state_set_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 37U), &n_var2->pos);
    ivory_serialize_pack_float_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 54U), &n_var2->pos_setp);
    ivory_serialize_pack_float_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 58U), &n_var2->pos_rate_setp);
}

void alt_control_debug_set_be(uint8_t *n_var0, uint32_t n_var1, const struct alt_control_debug *n_var2)
{
    ivory_serialize_pack_float_be(n_var0, n_var1, &n_var2->alt_est);
    ivory_serialize_pack_float_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 4U), &n_var2->alt_rate_est);
    ivory_serialize_pack_float_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 8U), &n_var2->r22_gain);
    pid_state_set_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 12U), &n_var2->thrust);
    ivory_serialize_pack_float_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 29U), &n_var2->ui_setp);
    ivory_serialize_pack_float_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 33U), &n_var2->ui_rate_setp);
    pid_state_set_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 37U), &n_var2->pos);
    ivory_serialize_pack_float_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 54U), &n_var2->pos_setp);
    ivory_serialize_pack_float_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 58U), &n_var2->pos_rate_setp);
}
