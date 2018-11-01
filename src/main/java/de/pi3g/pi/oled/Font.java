/*
 * Copyright (C) 2016 Florian Frankenberger.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

package de.pi3g.pi.oled;

/**
 *
 * @author Florian Frankenberger
 */
public enum Font {

    FONT_5X8(0, 255, 5, 8, 9, 3, new byte[] {
        (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
        (byte) 0x3E, (byte) 0x5B, (byte) 0x4F, (byte) 0x5B, (byte) 0x3E,
        (byte) 0x3E, (byte) 0x6B, (byte) 0x4F, (byte) 0x6B, (byte) 0x3E,
        (byte) 0x1C, (byte) 0x3E, (byte) 0x7C, (byte) 0x3E, (byte) 0x1C,
        (byte) 0x18, (byte) 0x3C, (byte) 0x7E, (byte) 0x3C, (byte) 0x18,
        (byte) 0x1C, (byte) 0x57, (byte) 0x7D, (byte) 0x57, (byte) 0x1C,
        (byte) 0x1C, (byte) 0x5E, (byte) 0x7F, (byte) 0x5E, (byte) 0x1C,
        (byte) 0x00, (byte) 0x18, (byte) 0x3C, (byte) 0x18, (byte) 0x00,
        (byte) 0xFF, (byte) 0xE7, (byte) 0xC3, (byte) 0xE7, (byte) 0xFF,
        (byte) 0x00, (byte) 0x18, (byte) 0x24, (byte) 0x18, (byte) 0x00,
        (byte) 0xFF, (byte) 0xE7, (byte) 0xDB, (byte) 0xE7, (byte) 0xFF,
        (byte) 0x30, (byte) 0x48, (byte) 0x3A, (byte) 0x06, (byte) 0x0E,
        (byte) 0x26, (byte) 0x29, (byte) 0x79, (byte) 0x29, (byte) 0x26,
        (byte) 0x40, (byte) 0x7F, (byte) 0x05, (byte) 0x05, (byte) 0x07,
        (byte) 0x40, (byte) 0x7F, (byte) 0x05, (byte) 0x25, (byte) 0x3F,
        (byte) 0x5A, (byte) 0x3C, (byte) 0xE7, (byte) 0x3C, (byte) 0x5A,
        (byte) 0x7F, (byte) 0x3E, (byte) 0x1C, (byte) 0x1C, (byte) 0x08,
        (byte) 0x08, (byte) 0x1C, (byte) 0x1C, (byte) 0x3E, (byte) 0x7F,
        (byte) 0x14, (byte) 0x22, (byte) 0x7F, (byte) 0x22, (byte) 0x14,
        (byte) 0x5F, (byte) 0x5F, (byte) 0x00, (byte) 0x5F, (byte) 0x5F,
        (byte) 0x06, (byte) 0x09, (byte) 0x7F, (byte) 0x01, (byte) 0x7F,
        (byte) 0x00, (byte) 0x66, (byte) 0x89, (byte) 0x95, (byte) 0x6A,
        (byte) 0x60, (byte) 0x60, (byte) 0x60, (byte) 0x60, (byte) 0x60,
        (byte) 0x94, (byte) 0xA2, (byte) 0xFF, (byte) 0xA2, (byte) 0x94,
        (byte) 0x08, (byte) 0x04, (byte) 0x7E, (byte) 0x04, (byte) 0x08,
        (byte) 0x10, (byte) 0x20, (byte) 0x7E, (byte) 0x20, (byte) 0x10,
        (byte) 0x08, (byte) 0x08, (byte) 0x2A, (byte) 0x1C, (byte) 0x08,
        (byte) 0x08, (byte) 0x1C, (byte) 0x2A, (byte) 0x08, (byte) 0x08,
        (byte) 0x1E, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x10,
        (byte) 0x0C, (byte) 0x1E, (byte) 0x0C, (byte) 0x1E, (byte) 0x0C,
        (byte) 0x30, (byte) 0x38, (byte) 0x3E, (byte) 0x38, (byte) 0x30,
        (byte) 0x06, (byte) 0x0E, (byte) 0x3E, (byte) 0x0E, (byte) 0x06,
        (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
        (byte) 0x00, (byte) 0x00, (byte) 0x5F, (byte) 0x00, (byte) 0x00,
        (byte) 0x00, (byte) 0x07, (byte) 0x00, (byte) 0x07, (byte) 0x00,
        (byte) 0x14, (byte) 0x7F, (byte) 0x14, (byte) 0x7F, (byte) 0x14,
        (byte) 0x24, (byte) 0x2A, (byte) 0x7F, (byte) 0x2A, (byte) 0x12,
        (byte) 0x23, (byte) 0x13, (byte) 0x08, (byte) 0x64, (byte) 0x62,
        (byte) 0x36, (byte) 0x49, (byte) 0x56, (byte) 0x20, (byte) 0x50,
        (byte) 0x00, (byte) 0x08, (byte) 0x07, (byte) 0x03, (byte) 0x00,
        (byte) 0x00, (byte) 0x1C, (byte) 0x22, (byte) 0x41, (byte) 0x00,
        (byte) 0x00, (byte) 0x41, (byte) 0x22, (byte) 0x1C, (byte) 0x00,
        (byte) 0x2A, (byte) 0x1C, (byte) 0x7F, (byte) 0x1C, (byte) 0x2A,
        (byte) 0x08, (byte) 0x08, (byte) 0x3E, (byte) 0x08, (byte) 0x08,
        (byte) 0x00, (byte) 0x80, (byte) 0x70, (byte) 0x30, (byte) 0x00,
        (byte) 0x08, (byte) 0x08, (byte) 0x08, (byte) 0x08, (byte) 0x08,
        (byte) 0x00, (byte) 0x00, (byte) 0x60, (byte) 0x60, (byte) 0x00,
        (byte) 0x20, (byte) 0x10, (byte) 0x08, (byte) 0x04, (byte) 0x02,
        (byte) 0x3E, (byte) 0x51, (byte) 0x49, (byte) 0x45, (byte) 0x3E,
        (byte) 0x00, (byte) 0x42, (byte) 0x7F, (byte) 0x40, (byte) 0x00,
        (byte) 0x72, (byte) 0x49, (byte) 0x49, (byte) 0x49, (byte) 0x46,
        (byte) 0x21, (byte) 0x41, (byte) 0x49, (byte) 0x4D, (byte) 0x33,
        (byte) 0x18, (byte) 0x14, (byte) 0x12, (byte) 0x7F, (byte) 0x10,
        (byte) 0x27, (byte) 0x45, (byte) 0x45, (byte) 0x45, (byte) 0x39,
        (byte) 0x3C, (byte) 0x4A, (byte) 0x49, (byte) 0x49, (byte) 0x31,
        (byte) 0x41, (byte) 0x21, (byte) 0x11, (byte) 0x09, (byte) 0x07,
        (byte) 0x36, (byte) 0x49, (byte) 0x49, (byte) 0x49, (byte) 0x36,
        (byte) 0x46, (byte) 0x49, (byte) 0x49, (byte) 0x29, (byte) 0x1E,
        (byte) 0x00, (byte) 0x00, (byte) 0x14, (byte) 0x00, (byte) 0x00,
        (byte) 0x00, (byte) 0x40, (byte) 0x34, (byte) 0x00, (byte) 0x00,
        (byte) 0x00, (byte) 0x08, (byte) 0x14, (byte) 0x22, (byte) 0x41,
        (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0x14,
        (byte) 0x00, (byte) 0x41, (byte) 0x22, (byte) 0x14, (byte) 0x08,
        (byte) 0x02, (byte) 0x01, (byte) 0x59, (byte) 0x09, (byte) 0x06,
        (byte) 0x3E, (byte) 0x41, (byte) 0x5D, (byte) 0x59, (byte) 0x4E,
        (byte) 0x7C, (byte) 0x12, (byte) 0x11, (byte) 0x12, (byte) 0x7C,
        (byte) 0x7F, (byte) 0x49, (byte) 0x49, (byte) 0x49, (byte) 0x36,
        (byte) 0x3E, (byte) 0x41, (byte) 0x41, (byte) 0x41, (byte) 0x22,
        (byte) 0x7F, (byte) 0x41, (byte) 0x41, (byte) 0x41, (byte) 0x3E,
        (byte) 0x7F, (byte) 0x49, (byte) 0x49, (byte) 0x49, (byte) 0x41,
        (byte) 0x7F, (byte) 0x09, (byte) 0x09, (byte) 0x09, (byte) 0x01,
        (byte) 0x3E, (byte) 0x41, (byte) 0x41, (byte) 0x51, (byte) 0x73,
        (byte) 0x7F, (byte) 0x08, (byte) 0x08, (byte) 0x08, (byte) 0x7F,
        (byte) 0x00, (byte) 0x41, (byte) 0x7F, (byte) 0x41, (byte) 0x00,
        (byte) 0x20, (byte) 0x40, (byte) 0x41, (byte) 0x3F, (byte) 0x01,
        (byte) 0x7F, (byte) 0x08, (byte) 0x14, (byte) 0x22, (byte) 0x41,
        (byte) 0x7F, (byte) 0x40, (byte) 0x40, (byte) 0x40, (byte) 0x40,
        (byte) 0x7F, (byte) 0x02, (byte) 0x1C, (byte) 0x02, (byte) 0x7F,
        (byte) 0x7F, (byte) 0x04, (byte) 0x08, (byte) 0x10, (byte) 0x7F,
        (byte) 0x3E, (byte) 0x41, (byte) 0x41, (byte) 0x41, (byte) 0x3E,
        (byte) 0x7F, (byte) 0x09, (byte) 0x09, (byte) 0x09, (byte) 0x06,
        (byte) 0x3E, (byte) 0x41, (byte) 0x51, (byte) 0x21, (byte) 0x5E,
        (byte) 0x7F, (byte) 0x09, (byte) 0x19, (byte) 0x29, (byte) 0x46,
        (byte) 0x26, (byte) 0x49, (byte) 0x49, (byte) 0x49, (byte) 0x32,
        (byte) 0x03, (byte) 0x01, (byte) 0x7F, (byte) 0x01, (byte) 0x03,
        (byte) 0x3F, (byte) 0x40, (byte) 0x40, (byte) 0x40, (byte) 0x3F,
        (byte) 0x1F, (byte) 0x20, (byte) 0x40, (byte) 0x20, (byte) 0x1F,
        (byte) 0x3F, (byte) 0x40, (byte) 0x38, (byte) 0x40, (byte) 0x3F,
        (byte) 0x63, (byte) 0x14, (byte) 0x08, (byte) 0x14, (byte) 0x63,
        (byte) 0x03, (byte) 0x04, (byte) 0x78, (byte) 0x04, (byte) 0x03,
        (byte) 0x61, (byte) 0x59, (byte) 0x49, (byte) 0x4D, (byte) 0x43,
        (byte) 0x00, (byte) 0x7F, (byte) 0x41, (byte) 0x41, (byte) 0x41,
        (byte) 0x02, (byte) 0x04, (byte) 0x08, (byte) 0x10, (byte) 0x20,
        (byte) 0x00, (byte) 0x41, (byte) 0x41, (byte) 0x41, (byte) 0x7F,
        (byte) 0x04, (byte) 0x02, (byte) 0x01, (byte) 0x02, (byte) 0x04,
        (byte) 0x40, (byte) 0x40, (byte) 0x40, (byte) 0x40, (byte) 0x40,
        (byte) 0x00, (byte) 0x03, (byte) 0x07, (byte) 0x08, (byte) 0x00,
        (byte) 0x20, (byte) 0x54, (byte) 0x54, (byte) 0x78, (byte) 0x40,
        (byte) 0x7F, (byte) 0x28, (byte) 0x44, (byte) 0x44, (byte) 0x38,
        (byte) 0x38, (byte) 0x44, (byte) 0x44, (byte) 0x44, (byte) 0x28,
        (byte) 0x38, (byte) 0x44, (byte) 0x44, (byte) 0x28, (byte) 0x7F,
        (byte) 0x38, (byte) 0x54, (byte) 0x54, (byte) 0x54, (byte) 0x18,
        (byte) 0x00, (byte) 0x08, (byte) 0x7E, (byte) 0x09, (byte) 0x02,
        (byte) 0x18, (byte) 0xA4, (byte) 0xA4, (byte) 0x9C, (byte) 0x78,
        (byte) 0x7F, (byte) 0x08, (byte) 0x04, (byte) 0x04, (byte) 0x78,
        (byte) 0x00, (byte) 0x44, (byte) 0x7D, (byte) 0x40, (byte) 0x00,
        (byte) 0x20, (byte) 0x40, (byte) 0x40, (byte) 0x3D, (byte) 0x00,
        (byte) 0x7F, (byte) 0x10, (byte) 0x28, (byte) 0x44, (byte) 0x00,
        (byte) 0x00, (byte) 0x41, (byte) 0x7F, (byte) 0x40, (byte) 0x00,
        (byte) 0x7C, (byte) 0x04, (byte) 0x78, (byte) 0x04, (byte) 0x78,
        (byte) 0x7C, (byte) 0x08, (byte) 0x04, (byte) 0x04, (byte) 0x78,
        (byte) 0x38, (byte) 0x44, (byte) 0x44, (byte) 0x44, (byte) 0x38,
        (byte) 0xFC, (byte) 0x18, (byte) 0x24, (byte) 0x24, (byte) 0x18,
        (byte) 0x18, (byte) 0x24, (byte) 0x24, (byte) 0x18, (byte) 0xFC,
        (byte) 0x7C, (byte) 0x08, (byte) 0x04, (byte) 0x04, (byte) 0x08,
        (byte) 0x48, (byte) 0x54, (byte) 0x54, (byte) 0x54, (byte) 0x24,
        (byte) 0x04, (byte) 0x04, (byte) 0x3F, (byte) 0x44, (byte) 0x24,
        (byte) 0x3C, (byte) 0x40, (byte) 0x40, (byte) 0x20, (byte) 0x7C,
        (byte) 0x1C, (byte) 0x20, (byte) 0x40, (byte) 0x20, (byte) 0x1C,
        (byte) 0x3C, (byte) 0x40, (byte) 0x30, (byte) 0x40, (byte) 0x3C,
        (byte) 0x44, (byte) 0x28, (byte) 0x10, (byte) 0x28, (byte) 0x44,
        (byte) 0x4C, (byte) 0x90, (byte) 0x90, (byte) 0x90, (byte) 0x7C,
        (byte) 0x44, (byte) 0x64, (byte) 0x54, (byte) 0x4C, (byte) 0x44,
        (byte) 0x00, (byte) 0x08, (byte) 0x36, (byte) 0x41, (byte) 0x00,
        (byte) 0x00, (byte) 0x00, (byte) 0x77, (byte) 0x00, (byte) 0x00,
        (byte) 0x00, (byte) 0x41, (byte) 0x36, (byte) 0x08, (byte) 0x00,
        (byte) 0x02, (byte) 0x01, (byte) 0x02, (byte) 0x04, (byte) 0x02,
        (byte) 0x3C, (byte) 0x26, (byte) 0x23, (byte) 0x26, (byte) 0x3C,
        (byte) 0x1E, (byte) 0xA1, (byte) 0xA1, (byte) 0x61, (byte) 0x12,
        (byte) 0x3A, (byte) 0x40, (byte) 0x40, (byte) 0x20, (byte) 0x7A,
        (byte) 0x38, (byte) 0x54, (byte) 0x54, (byte) 0x55, (byte) 0x59,
        (byte) 0x21, (byte) 0x55, (byte) 0x55, (byte) 0x79, (byte) 0x41,
        (byte) 0x21, (byte) 0x54, (byte) 0x54, (byte) 0x78, (byte) 0x41,
        (byte) 0x21, (byte) 0x55, (byte) 0x54, (byte) 0x78, (byte) 0x40,
        (byte) 0x20, (byte) 0x54, (byte) 0x55, (byte) 0x79, (byte) 0x40,
        (byte) 0x0C, (byte) 0x1E, (byte) 0x52, (byte) 0x72, (byte) 0x12,
        (byte) 0x39, (byte) 0x55, (byte) 0x55, (byte) 0x55, (byte) 0x59,
        (byte) 0x39, (byte) 0x54, (byte) 0x54, (byte) 0x54, (byte) 0x59,
        (byte) 0x39, (byte) 0x55, (byte) 0x54, (byte) 0x54, (byte) 0x58,
        (byte) 0x00, (byte) 0x00, (byte) 0x45, (byte) 0x7C, (byte) 0x41,
        (byte) 0x00, (byte) 0x02, (byte) 0x45, (byte) 0x7D, (byte) 0x42,
        (byte) 0x00, (byte) 0x01, (byte) 0x45, (byte) 0x7C, (byte) 0x40,
        (byte) 0xF0, (byte) 0x29, (byte) 0x24, (byte) 0x29, (byte) 0xF0,
        (byte) 0xF0, (byte) 0x28, (byte) 0x25, (byte) 0x28, (byte) 0xF0,
        (byte) 0x7C, (byte) 0x54, (byte) 0x55, (byte) 0x45, (byte) 0x00,
        (byte) 0x20, (byte) 0x54, (byte) 0x54, (byte) 0x7C, (byte) 0x54,
        (byte) 0x7C, (byte) 0x0A, (byte) 0x09, (byte) 0x7F, (byte) 0x49,
        (byte) 0x32, (byte) 0x49, (byte) 0x49, (byte) 0x49, (byte) 0x32,
        (byte) 0x32, (byte) 0x48, (byte) 0x48, (byte) 0x48, (byte) 0x32,
        (byte) 0x32, (byte) 0x4A, (byte) 0x48, (byte) 0x48, (byte) 0x30,
        (byte) 0x3A, (byte) 0x41, (byte) 0x41, (byte) 0x21, (byte) 0x7A,
        (byte) 0x3A, (byte) 0x42, (byte) 0x40, (byte) 0x20, (byte) 0x78,
        (byte) 0x00, (byte) 0x9D, (byte) 0xA0, (byte) 0xA0, (byte) 0x7D,
        (byte) 0x39, (byte) 0x44, (byte) 0x44, (byte) 0x44, (byte) 0x39,
        (byte) 0x3D, (byte) 0x40, (byte) 0x40, (byte) 0x40, (byte) 0x3D,
        (byte) 0x3C, (byte) 0x24, (byte) 0xFF, (byte) 0x24, (byte) 0x24,
        (byte) 0x48, (byte) 0x7E, (byte) 0x49, (byte) 0x43, (byte) 0x66,
        (byte) 0x2B, (byte) 0x2F, (byte) 0xFC, (byte) 0x2F, (byte) 0x2B,
        (byte) 0xFF, (byte) 0x09, (byte) 0x29, (byte) 0xF6, (byte) 0x20,
        (byte) 0xC0, (byte) 0x88, (byte) 0x7E, (byte) 0x09, (byte) 0x03,
        (byte) 0x20, (byte) 0x54, (byte) 0x54, (byte) 0x79, (byte) 0x41,
        (byte) 0x00, (byte) 0x00, (byte) 0x44, (byte) 0x7D, (byte) 0x41,
        (byte) 0x30, (byte) 0x48, (byte) 0x48, (byte) 0x4A, (byte) 0x32,
        (byte) 0x38, (byte) 0x40, (byte) 0x40, (byte) 0x22, (byte) 0x7A,
        (byte) 0x00, (byte) 0x7A, (byte) 0x0A, (byte) 0x0A, (byte) 0x72,
        (byte) 0x7D, (byte) 0x0D, (byte) 0x19, (byte) 0x31, (byte) 0x7D,
        (byte) 0x26, (byte) 0x29, (byte) 0x29, (byte) 0x2F, (byte) 0x28,
        (byte) 0x26, (byte) 0x29, (byte) 0x29, (byte) 0x29, (byte) 0x26,
        (byte) 0x30, (byte) 0x48, (byte) 0x4D, (byte) 0x40, (byte) 0x20,
        (byte) 0x38, (byte) 0x08, (byte) 0x08, (byte) 0x08, (byte) 0x08,
        (byte) 0x08, (byte) 0x08, (byte) 0x08, (byte) 0x08, (byte) 0x38,
        (byte) 0x2F, (byte) 0x10, (byte) 0xC8, (byte) 0xAC, (byte) 0xBA,
        (byte) 0x2F, (byte) 0x10, (byte) 0x28, (byte) 0x34, (byte) 0xFA,
        (byte) 0x00, (byte) 0x00, (byte) 0x7B, (byte) 0x00, (byte) 0x00,
        (byte) 0x08, (byte) 0x14, (byte) 0x2A, (byte) 0x14, (byte) 0x22,
        (byte) 0x22, (byte) 0x14, (byte) 0x2A, (byte) 0x14, (byte) 0x08,
        (byte) 0xAA, (byte) 0x00, (byte) 0x55, (byte) 0x00, (byte) 0xAA,
        (byte) 0xAA, (byte) 0x55, (byte) 0xAA, (byte) 0x55, (byte) 0xAA,
        (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x00,
        (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0xFF, (byte) 0x00,
        (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0xFF, (byte) 0x00,
        (byte) 0x10, (byte) 0x10, (byte) 0xFF, (byte) 0x00, (byte) 0xFF,
        (byte) 0x10, (byte) 0x10, (byte) 0xF0, (byte) 0x10, (byte) 0xF0,
        (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0xFC, (byte) 0x00,
        (byte) 0x14, (byte) 0x14, (byte) 0xF7, (byte) 0x00, (byte) 0xFF,
        (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x00, (byte) 0xFF,
        (byte) 0x14, (byte) 0x14, (byte) 0xF4, (byte) 0x04, (byte) 0xFC,
        (byte) 0x14, (byte) 0x14, (byte) 0x17, (byte) 0x10, (byte) 0x1F,
        (byte) 0x10, (byte) 0x10, (byte) 0x1F, (byte) 0x10, (byte) 0x1F,
        (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0x1F, (byte) 0x00,
        (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0xF0, (byte) 0x00,
        (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x1F, (byte) 0x10,
        (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x1F, (byte) 0x10,
        (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0xF0, (byte) 0x10,
        (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x10,
        (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x10,
        (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0xFF, (byte) 0x10,
        (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x14,
        (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x00, (byte) 0xFF,
        (byte) 0x00, (byte) 0x00, (byte) 0x1F, (byte) 0x10, (byte) 0x17,
        (byte) 0x00, (byte) 0x00, (byte) 0xFC, (byte) 0x04, (byte) 0xF4,
        (byte) 0x14, (byte) 0x14, (byte) 0x17, (byte) 0x10, (byte) 0x17,
        (byte) 0x14, (byte) 0x14, (byte) 0xF4, (byte) 0x04, (byte) 0xF4,
        (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x00, (byte) 0xF7,
        (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0x14,
        (byte) 0x14, (byte) 0x14, (byte) 0xF7, (byte) 0x00, (byte) 0xF7,
        (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0x17, (byte) 0x14,
        (byte) 0x10, (byte) 0x10, (byte) 0x1F, (byte) 0x10, (byte) 0x1F,
        (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0xF4, (byte) 0x14,
        (byte) 0x10, (byte) 0x10, (byte) 0xF0, (byte) 0x10, (byte) 0xF0,
        (byte) 0x00, (byte) 0x00, (byte) 0x1F, (byte) 0x10, (byte) 0x1F,
        (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x1F, (byte) 0x14,
        (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFC, (byte) 0x14,
        (byte) 0x00, (byte) 0x00, (byte) 0xF0, (byte) 0x10, (byte) 0xF0,
        (byte) 0x10, (byte) 0x10, (byte) 0xFF, (byte) 0x10, (byte) 0xFF,
        (byte) 0x14, (byte) 0x14, (byte) 0x14, (byte) 0xFF, (byte) 0x14,
        (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x1F, (byte) 0x00,
        (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xF0, (byte) 0x10,
        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
        (byte) 0xF0, (byte) 0xF0, (byte) 0xF0, (byte) 0xF0, (byte) 0xF0,
        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0x00, (byte) 0x00,
        (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0xFF,
        (byte) 0x0F, (byte) 0x0F, (byte) 0x0F, (byte) 0x0F, (byte) 0x0F,
        (byte) 0x38, (byte) 0x44, (byte) 0x44, (byte) 0x38, (byte) 0x44,
        (byte) 0x7C, (byte) 0x2A, (byte) 0x2A, (byte) 0x3E, (byte) 0x14,
        (byte) 0x7E, (byte) 0x02, (byte) 0x02, (byte) 0x06, (byte) 0x06,
        (byte) 0x02, (byte) 0x7E, (byte) 0x02, (byte) 0x7E, (byte) 0x02,
        (byte) 0x63, (byte) 0x55, (byte) 0x49, (byte) 0x41, (byte) 0x63,
        (byte) 0x38, (byte) 0x44, (byte) 0x44, (byte) 0x3C, (byte) 0x04,
        (byte) 0x40, (byte) 0x7E, (byte) 0x20, (byte) 0x1E, (byte) 0x20,
        (byte) 0x06, (byte) 0x02, (byte) 0x7E, (byte) 0x02, (byte) 0x02,
        (byte) 0x99, (byte) 0xA5, (byte) 0xE7, (byte) 0xA5, (byte) 0x99,
        (byte) 0x1C, (byte) 0x2A, (byte) 0x49, (byte) 0x2A, (byte) 0x1C,
        (byte) 0x4C, (byte) 0x72, (byte) 0x01, (byte) 0x72, (byte) 0x4C,
        (byte) 0x30, (byte) 0x4A, (byte) 0x4D, (byte) 0x4D, (byte) 0x30,
        (byte) 0x30, (byte) 0x48, (byte) 0x78, (byte) 0x48, (byte) 0x30,
        (byte) 0xBC, (byte) 0x62, (byte) 0x5A, (byte) 0x46, (byte) 0x3D,
        (byte) 0x3E, (byte) 0x49, (byte) 0x49, (byte) 0x49, (byte) 0x00,
        (byte) 0x7E, (byte) 0x01, (byte) 0x01, (byte) 0x01, (byte) 0x7E,
        (byte) 0x2A, (byte) 0x2A, (byte) 0x2A, (byte) 0x2A, (byte) 0x2A,
        (byte) 0x44, (byte) 0x44, (byte) 0x5F, (byte) 0x44, (byte) 0x44,
        (byte) 0x40, (byte) 0x51, (byte) 0x4A, (byte) 0x44, (byte) 0x40,
        (byte) 0x40, (byte) 0x44, (byte) 0x4A, (byte) 0x51, (byte) 0x40,
        (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x01, (byte) 0x03,
        (byte) 0xE0, (byte) 0x80, (byte) 0xFF, (byte) 0x00, (byte) 0x00,
        (byte) 0x08, (byte) 0x08, (byte) 0x6B, (byte) 0x6B, (byte) 0x08,
        (byte) 0x36, (byte) 0x12, (byte) 0x36, (byte) 0x24, (byte) 0x36,
        (byte) 0x06, (byte) 0x0F, (byte) 0x09, (byte) 0x0F, (byte) 0x06,
        (byte) 0x00, (byte) 0x00, (byte) 0x18, (byte) 0x18, (byte) 0x00,
        (byte) 0x00, (byte) 0x00, (byte) 0x10, (byte) 0x10, (byte) 0x00,
        (byte) 0x30, (byte) 0x40, (byte) 0xFF, (byte) 0x01, (byte) 0x01,
        (byte) 0x00, (byte) 0x1F, (byte) 0x01, (byte) 0x01, (byte) 0x1E,
        (byte) 0x00, (byte) 0x19, (byte) 0x1D, (byte) 0x17, (byte) 0x12,
        (byte) 0x00, (byte) 0x3C, (byte) 0x3C, (byte) 0x3C, (byte) 0x3C,
        (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
    }),

    FONT_4X5(32, 95, 4, 5, 4, 7, new byte[] {
        (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
        (byte) 0x00, (byte) 0x17, (byte) 0x00, (byte) 0x00,
        (byte) 0x03, (byte) 0x00, (byte) 0x03, (byte) 0x00,
        (byte) 0x1F, (byte) 0x0A, (byte) 0x1F, (byte) 0x0A,
        (byte) 0x17, (byte) 0x1F, (byte) 0x1D, (byte) 0x00,
        (byte) 0x09, (byte) 0x04, (byte) 0x12, (byte) 0x00,
        (byte) 0x0A, (byte) 0x15, (byte) 0x09, (byte) 0x14,
        (byte) 0x00, (byte) 0x03, (byte) 0x00, (byte) 0x00,
        (byte) 0x00, (byte) 0x0E, (byte) 0x11, (byte) 0x00,
        (byte) 0x00, (byte) 0x11, (byte) 0x0E, (byte) 0x00,
        (byte) 0x05, (byte) 0x02, (byte) 0x05, (byte) 0x00,
        (byte) 0x04, (byte) 0x0E, (byte) 0x04, (byte) 0x00,
        (byte) 0x00, (byte) 0x18, (byte) 0x00, (byte) 0x00,
        (byte) 0x04, (byte) 0x04, (byte) 0x04, (byte) 0x00,
        (byte) 0x00, (byte) 0x10, (byte) 0x00, (byte) 0x00,
        (byte) 0x10, (byte) 0x0C, (byte) 0x03, (byte) 0x00,
        (byte) 0x1F, (byte) 0x11, (byte) 0x1F, (byte) 0x00,
        (byte) 0x12, (byte) 0x1F, (byte) 0x10, (byte) 0x00,
        (byte) 0x1D, (byte) 0x15, (byte) 0x17, (byte) 0x00,
        (byte) 0x15, (byte) 0x15, (byte) 0x1F, (byte) 0x00,
        (byte) 0x07, (byte) 0x04, (byte) 0x1F, (byte) 0x00,
        (byte) 0x17, (byte) 0x15, (byte) 0x1D, (byte) 0x00,
        (byte) 0x1F, (byte) 0x15, (byte) 0x1D, (byte) 0x00,
        (byte) 0x01, (byte) 0x01, (byte) 0x1F, (byte) 0x00,
        (byte) 0x1F, (byte) 0x15, (byte) 0x1F, (byte) 0x00,
        (byte) 0x17, (byte) 0x15, (byte) 0x1F, (byte) 0x00,
        (byte) 0x00, (byte) 0x0A, (byte) 0x00, (byte) 0x00,
        (byte) 0x00, (byte) 0x1A, (byte) 0x00, (byte) 0x00,
        (byte) 0x04, (byte) 0x0A, (byte) 0x11, (byte) 0x00,
        (byte) 0x0A, (byte) 0x0A, (byte) 0x0A, (byte) 0x00,
        (byte) 0x11, (byte) 0x0A, (byte) 0x04, (byte) 0x00,
        (byte) 0x01, (byte) 0x15, (byte) 0x07, (byte) 0x00,
        (byte) 0x1F, (byte) 0x15, (byte) 0x17, (byte) 0x00,
        (byte) 0x1F, (byte) 0x05, (byte) 0x1F, (byte) 0x00,
        (byte) 0x1F, (byte) 0x15, (byte) 0x0A, (byte) 0x00,
        (byte) 0x1F, (byte) 0x11, (byte) 0x11, (byte) 0x00,
        (byte) 0x1F, (byte) 0x11, (byte) 0x0E, (byte) 0x00,
        (byte) 0x1F, (byte) 0x15, (byte) 0x11, (byte) 0x00,
        (byte) 0x1F, (byte) 0x05, (byte) 0x01, (byte) 0x00,
        (byte) 0x1F, (byte) 0x11, (byte) 0x1D, (byte) 0x00,
        (byte) 0x1F, (byte) 0x04, (byte) 0x1F, (byte) 0x00,
        (byte) 0x00, (byte) 0x1F, (byte) 0x00, (byte) 0x00,
        (byte) 0x11, (byte) 0x11, (byte) 0x0F, (byte) 0x00,
        (byte) 0x1F, (byte) 0x0C, (byte) 0x13, (byte) 0x00,
        (byte) 0x1F, (byte) 0x10, (byte) 0x10, (byte) 0x00,
        (byte) 0x1F, (byte) 0x02, (byte) 0x1F, (byte) 0x00,
        (byte) 0x1F, (byte) 0x06, (byte) 0x1F, (byte) 0x00,
        (byte) 0x1F, (byte) 0x11, (byte) 0x1F, (byte) 0x00,
        (byte) 0x1F, (byte) 0x05, (byte) 0x07, (byte) 0x00,
        (byte) 0x1F, (byte) 0x15, (byte) 0x1F, (byte) 0x08,
        (byte) 0x1F, (byte) 0x0D, (byte) 0x17, (byte) 0x00,
        (byte) 0x17, (byte) 0x15, (byte) 0x1D, (byte) 0x00,
        (byte) 0x01, (byte) 0x1F, (byte) 0x01, (byte) 0x00,
        (byte) 0x1F, (byte) 0x10, (byte) 0x1F, (byte) 0x00,
        (byte) 0x0F, (byte) 0x10, (byte) 0x0F, (byte) 0x00,
        (byte) 0x1F, (byte) 0x08, (byte) 0x1F, (byte) 0x00,
        (byte) 0x1B, (byte) 0x04, (byte) 0x1B, (byte) 0x00,
        (byte) 0x03, (byte) 0x1C, (byte) 0x03, (byte) 0x00,
        (byte) 0x19, (byte) 0x15, (byte) 0x13, (byte) 0x00,
        (byte) 0x00, (byte) 0x1F, (byte) 0x11, (byte) 0x00,
        (byte) 0x03, (byte) 0x0C, (byte) 0x10, (byte) 0x00,
        (byte) 0x00, (byte) 0x11, (byte) 0x1F, (byte) 0x00,
        (byte) 0x02, (byte) 0x01, (byte) 0x02, (byte) 0x00,
        (byte) 0x10, (byte) 0x10, (byte) 0x10, (byte) 0x00,
    });

    private final int minChar, maxChar, width, height, outterWidth, outterHeight;
    private final byte[] data;

    private Font(int minChar, int maxChar, int width, int height, int outterWidth, int outterHeight, byte[] data) {
        this.minChar = minChar;
        this.maxChar = maxChar;
        this.width = width;
        this.height = height;
        this.outterWidth = outterWidth;
        this.outterHeight = outterHeight;
        this.data = data;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getOutterWidth() {
        return outterWidth;
    }

    public int getOutterHeight() {
        return outterHeight;
    }

    public byte getData(int offset) {
        return this.data[offset];
    }

    public int getMinChar() {
        return minChar;
    }

    public int getMaxChar() {
        return maxChar;
    }

    void drawChar(OLEDDisplay display, char c, int x, int y, boolean on) {
        if (c > maxChar || c < minChar) {
            c = '?';
        }

        c-= minChar;

        for (int i = 0; i < width; ++i) {
            int line = data[(c * width) + i];

            for (int j = 0; j < height; ++j) {
                if ((line & 0x01) > 0) {
                    display.setPixel(x + i, y + j, on);
                }
                line >>= 1;
            }
        }
    }

}