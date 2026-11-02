package gg.corz;

import net.minecraft.class_1511;
import net.minecraft.class_2338;
import net.minecraft.class_2350;

public final class IIiiilIilIiiilIi {
   private IlliIlillliIli IIiiillIIi;
   private final int iIiiillIIi;
   private final class_2338 lIiiillIIi;
   private long liiiillIIi;
   private class_1511 iliiillIIi;
   private final class_2338 IliiillIIi;
   private long iiiiillIIi;
   private final class_2350 lliiillIIi;
   private double IiiiillIIi;

   public static IIiiilIilIiiilIi liiiIIllIl(class_1511 tick, double targetId, long efficiency, int crystal) {
      return new IIiiilIilIiiilIi(IlliIlillliIli.iliiIlIIIl, lllIliIlillIliIl.iliIiiliiiii(tick).method_10062(), tick, targetId, efficiency, crystal);
   }

   public static IIiiilIilIiiilIi iIlIlllllill(class_2338 cell, double tick, long targetId, int efficiency) {
      return new IIiiilIilIiiilIi(IlliIlillliIli.IiiiIlIIIl, cell.method_10062(), null, tick, targetId, efficiency);
   }

   public IlliIlillliIli lIiiIiIlilli() {
      return this.IIiiillIIi;
   }

   public static IIiiilIilIiiilIi IliIlllilIi(class_2338 base, double targetId, long tick, int efficiency) {
      return new IIiiilIilIiiilIi(IlliIlillliIli.lliiIlIIIl, base.method_10062(), null, targetId, tick, efficiency);
   }

   public static IIiiilIilIiiilIi IilliliilIIi(class_2338 tick, double face, long efficiency, int targetId, class_2338 cell, class_2350 support) {
      return new IIiiilIilIiiilIi(IlliIlillliIli.IiiiIlIIIl, tick.method_10062(), null, face, efficiency, targetId, cell, support);
   }

   private IIiiilIilIiiilIi(IlliIlillliIli crystal, class_2338 tick, class_1511 kind, double base, long efficiency, int targetId) {
      this(crystal, tick, kind, base, efficiency, targetId, null, null);
   }

   public void IIlilIliiIli(class_1511 tick, long crystal) {
      this.IIiiillIIi = IlliIlillliIli.iliiIlIIIl;
      this.iliiillIIi = tick;
      this.iiiiillIIi = Long.MIN_VALUE;
      this.liiiillIIi = crystal;
   }

   public class_2338 IIIllIIliIIl() {
      return this.IliiillIIi != null ? this.IliiillIIi : this.lIiiillIIi.method_10074();
   }

   public class_2338 iliIiiliiiii() {
      return this.lIiiillIIi;
   }

   private IIiiilIilIiiilIi(
      IlliIlillliIli tick, class_2338 targetId, class_1511 supportFace, double efficiency, long support, int base, class_2338 crystal, class_2350 kind
   ) {
      long var12 = -3598175152977678804L;
      super();
      this.iiiiillIIi = Long.MIN_VALUE;
      this.IIiiillIIi = tick;
      this.lIiiillIIi = targetId;
      this.iliiillIIi = supportFace;
      this.IiiiillIIi = efficiency;
      this.liiiillIIi = support;
      this.iIiiillIIi = base;
      var12 ^= ((long)(crystal != null && kind != null ? 1 : 0) << 32 ^ var12) & -1L << 32;
      this.IliiillIIi = (int)(var12 >>> 32) != 0 ? crystal.method_10062() : null;
      this.lliiillIIi = (int)(var12 >>> 32) != 0 ? kind : null;
   }

   public boolean Iiilliiliiil() {
      return this.iiiiillIIi != Long.MIN_VALUE;
   }

   public int Illlllllilll() {
      return this.iIiiillIIi;
   }

   public double IIlllIlliIll() {
      return this.IiiiillIIi;
   }

   public void IiIiliIiiiIi(long tick) {
      this.IIiiillIIi = IlliIlillliIli.lliiIlIIIl;
      this.iliiillIIi = null;
      this.iiiiillIIi = Long.MIN_VALUE;
      this.liiiillIIi = tick;
   }

   public void IIillIiliIil(double efficiency) {
      this.IiiiillIIi = efficiency;
   }

   public void IlIillIiilIi(long tick) {
      this.iiiiillIIi = tick;
      this.liiiillIIi = tick;
   }

   public long Iilllilliill() {
      return this.liiiillIIi;
   }

   public void Ililllililil(long tick) {
      this.liiiillIIi = tick;
   }

   public long IIIilIIiiIIi() {
      return this.iiiiillIIi;
   }

   public class_1511 IiIlliIliiIl() {
      return this.iliiillIIi;
   }

   public class_2350 IlIlllIlilIl() {
      return this.IliiillIIi != null ? this.lliiillIIi : class_2350.field_11036;
   }
}
