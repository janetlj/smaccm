/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.3
 */
#include "sequence_numbered_xyz_calibration_types.h"

void sequence_numbered_xyz_calibration_get_le(const uint8_t *n_var0, uint32_t n_var1, struct sequence_numbered_xyz_calibration *n_var2)
{
    sequence_num_t_get_le(n_var0, n_var1, &n_var2->seqnum);
    xyz_calibration_get_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 4U), &n_var2->val);
}

void sequence_numbered_xyz_calibration_get_be(const uint8_t *n_var0, uint32_t n_var1, struct sequence_numbered_xyz_calibration *n_var2)
{
    sequence_num_t_get_be(n_var0, n_var1, &n_var2->seqnum);
    xyz_calibration_get_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 4U), &n_var2->val);
}

void sequence_numbered_xyz_calibration_set_le(uint8_t *n_var0, uint32_t n_var1, const struct sequence_numbered_xyz_calibration *n_var2)
{
    sequence_num_t_set_le(n_var0, n_var1, &n_var2->seqnum);
    xyz_calibration_set_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 4U), &n_var2->val);
}

void sequence_numbered_xyz_calibration_set_be(uint8_t *n_var0, uint32_t n_var1, const struct sequence_numbered_xyz_calibration *n_var2)
{
    sequence_num_t_set_be(n_var0, n_var1, &n_var2->seqnum);
    xyz_calibration_set_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 4U), &n_var2->val);
}