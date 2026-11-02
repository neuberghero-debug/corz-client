package gg.corz;

import java.util.Locale;

public record liIiliIliiIiliIl(
   long targetBlock,
   boolean desiredWaterlogged,
   int bucketSlot,
   long interactionBlock,
   int interactionFace,
   double hitX,
   double hitY,
   double hitZ,
   long expectedFluidTarget,
   boolean containerInteractionRisk,
   long geometryFingerprint
) {
   private final boolean iiiiiiiIll;
   private final boolean IIiiiiiIll;
   private final long iIiiiiiIll;
   private final double IiiiiiiIll;
   private final long IIIIIIIlll;
   private final int IliiiiiIll;
   private final double lliiiiiIll;
   private final long liiiiiiIll;
   private final long iiliiiiIll;
   private final int lIiiiiiIll;
   private final double iliiiiiIll;
   public static final int iIIIIIIlll = 8;
   public static final int lIIIIIIlll = 2;

   public int IlIlllIlilIl() {
      return this.lIiiiiiIll;
   }

   public static long liiiIIllIl(long hitBlockFillable, boolean sideOrdinal, int hitBlock) {
      long var7 = 2199038369072414568L;
      long var9 = -3771362368716851353L;
      if (sideOrdinal) {
         return hitBlockFillable;
      } else {
         var7 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(hitBlockFillable) << 32 ^ var7) & -1L << 32;
         var7 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(hitBlockFillable) ^ var7) & -1L >>> 32;
         var9 ^= ((long)llIiIiililIiIiil.Illlllllilll(hitBlockFillable) << 32 ^ var9) & -1L << 32;

         return switch (hitBlock) {
            case 0 -> llIiIiililIiIiil.IIIllIIliIIl((int)(var7 >>> 32), (int)var7 - 1, (int)(var9 >>> 32));
            case 1 -> llIiIiililIiIiil.IIIllIIliIIl((int)(var7 >>> 32), (int)var7 + 1, (int)(var9 >>> 32));
            case 2 -> llIiIiililIiIiil.IIIllIIliIIl((int)(var7 >>> 32), (int)var7, (int)(var9 >>> 32) - 1);
            case 3 -> llIiIiililIiIiil.IIIllIIliIIl((int)(var7 >>> 32), (int)var7, (int)(var9 >>> 32) + 1);
            case 4 -> llIiIiililIiIiil.IIIllIIliIIl((int)(var7 >>> 32) - 1, (int)var7, (int)(var9 >>> 32));
            default -> llIiIiililIiIiil.IIIllIIliIIl((int)(var7 >>> 32) + 1, (int)var7, (int)(var9 >>> 32));
         };
      }
   }

   public static liIiliIliiIiliIl iIlIlllllill(
      long bucketSlot,
      boolean hz,
      int desired,
      long side,
      boolean fingerprint,
      int container,
      double hitBlock,
      double hx,
      double hy,
      boolean target,
      long hitBlockFillable
   ) {
      long var17 = liiiIIllIl(side, fingerprint, container);
      return side == bucketSlot && var17 == bucketSlot
         ? new liIiliIliiIiliIl(bucketSlot, hz, desired, side, container, hitBlock, hx, hy, var17, target, hitBlockFillable)
         : null;
   }

   public boolean IilliliilIIi(long sideNow, boolean hitBlockNow, int fillableNow) {
      return sideNow == this.iIiiiiiIll && liiiIIllIl(sideNow, hitBlockNow, fillableNow) == this.liiiiiiIll;
   }

   public boolean IIIllIIliIIl() {
      return this.IIiiiiiIll;
   }

   public double Iilllilliill() {
      return this.iliiiiiIll;
   }

   public long IiIlliIliiIl() {
      return this.iIiiiiiIll;
   }

   public liIiliIliiIiliIl(
      long targetBlock,
      boolean desiredWaterlogged,
      int bucketSlot,
      long interactionBlock,
      int interactionFace,
      double hitX,
      double hitY,
      double hitZ,
      long expectedFluidTarget,
      boolean containerInteractionRisk,
      long geometryFingerprint
   ) {
      this.iiliiiiIll = targetBlock;
      this.IIiiiiiIll = desiredWaterlogged;
      this.lIiiiiiIll = bucketSlot;
      this.iIiiiiiIll = interactionBlock;
      this.IliiiiiIll = interactionFace;
      this.lliiiiiIll = hitX;
      this.iliiiiiIll = hitY;
      this.IiiiiiiIll = hitZ;
      this.liiiiiiIll = expectedFluidTarget;
      this.iiiiiiiIll = containerInteractionRisk;
      this.IIIIIIIlll = geometryFingerprint;
   }

   public boolean Iiilliiliiil() {
      return this.iiiiiiiIll;
   }

   public static lilliiIiiilliiIi IliIlllilIi(boolean waterloggable, boolean isWaterlogged, boolean wantWaterlogged) {
      if (waterloggable && isWaterlogged != wantWaterlogged) {
         return isWaterlogged ? lilliiIiiilliiIi.llIllIIlIi : lilliiIiiilliiIi.ilIllIIlIi;
      } else {
         return lilliiIiiilliiIi.IlIllIIlIi;
      }
   }

   public long iliIiiliiiii() {
      return this.iiliiiiIll;
   }

   public double Illlllllilll() {
      return this.lliiiiiIll;
   }

   public String lIiiIiIlilli() {
      return String.format(
         Locale.ROOT,
         IlIillIiilIi<"IlIillIiilIi","cRARiGTG98Ix0hDAwwk22rGjUaXizxhKrH+eFGaLjRei8hVLwuE5BMdRhFNVqT+VXLnU60PNE24pz2uduf7q8Zec4Zwa0MmKw+RSpDMckptFk7sqT5bKSfHu0JUenlZmpAbnGR795XKqJL6Rdr4z5orAhAIlOtNx0veIGjR4IObfhjGTGOXZ+CH8Cdx1LENQUkEExyUstDM42AqvFezOR/otFzxX+e88vS8wmc90tN70frSilmJUwPPFhdYW5CR9wjOUKc+kcmWmWuHULlbJHQ==">(),
         llIiIiililIiIiil.IlIlllIlilIl(this.iiliiiiIll),
         this.IIiiiiiIll,
         this.lIiiiiiIll,
         llIiIiililIiIiil.IlIlllIlilIl(this.iIiiiiiIll),
         this.IliiiiiIll,
         this.lliiiiiIll,
         this.iliiiiiIll,
         this.IiiiiiiIll,
         llIiIiililIiIiil.IlIlllIlilIl(this.liiiiiiIll),
         this.iiiiiiiIll,
         Long.toUnsignedString(this.IIIIIIIlll)
      );
   }

   public double IIillIiliIil() {
      return this.IiiiiiiIll;
   }

   public long IIIilIIiiIIi() {
      return this.IIIIIIIlll;
   }

   public int IIlllIlliIll() {
      return this.IliiiiiIll;
   }

   public long Ililllililil() {
      return this.liiiiiiIll;
   }
}
