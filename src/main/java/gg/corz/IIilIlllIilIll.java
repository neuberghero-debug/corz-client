package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class IIilIlllIilIll {
   private float IlIiIIlilllIiIIlil;
   private int IiilIIlilliilIIlil;
   private int llilIIlilililIIlil;
   private int iIilIIlilIlilIIlil;
   private final iiIiiiilIIliiiil[] IIilIIlillIilIIlil = new iiIiiiilIIliiiil[128];
   private float ilIiIIlilIiIiIIlil;
   private int lIIiIIliliIIiIIlil;
   private final Map<Long, lIlilIlliIlilIll> IIliIIlillIliIIlil;
   public static final int liIiIIliliiIiIIlil = 64;
   public static final int lillIIliliillIIlil = 128;
   private long iiilIIlilIIIiIIlil;
   private lIlilIlliIlilIll iIliIIlilIlliIIlil;

   public int lIiiIiIlilli(long block, String face, String support, long tick, int target) {
      long var12 = 8761995746379360169L;
      iiIiiiilIIliiiil var8 = this.Iilllilliill();
      var12 ^= ((long)(this.lIIiIIliliIIiIIlil >= 0 && this.iiilIIlilIIIiIIlil == block ? 1 : 0) << 32 ^ var12) & -1L << 32;
      lIlilIlliIlilIll var10 = new lIlilIlliIlilIll();
      var10.iIiIlIilll = ++this.llilIIlilililIIlil;
      var10.iliIlIilll = block;
      var10.IiiIlIilll = tick;
      var10.liiIlIilll = face == null ? "" : face;
      var10.iiiIlIilll = support == null ? "" : support;
      var10.IIIllIilll = (int)(var12 >>> 32) != 0 ? this.IlIiIIlilllIiIIlil : (var8 == null ? 0.0F : var8.liiiIIllIl());
      var10.iIIllIilll = (int)(var12 >>> 32) != 0 ? this.ilIiIIlilIiIiIIlil : (var8 == null ? 0.0F : var8.iIlIlllllill());
      var10.lIIllIilll = var8 == null ? var10.IIIllIilll : var8.liiiIIllIl();
      var10.IlIllIilll = var8 == null ? var10.iIIllIilll : var8.iIlIlllllill();
      var10.IliIlIilll = (int)(var12 >>> 32) != 0 ? target - this.lIIiIIliliIIiIIlil : 0;
      var10.liIllIilll = var8 != null && var8.IilliliilIIi();
      var10.iiIllIilll = var8 != null && var8.lIiiIiIlilli();
      var10.IIlllIilll = var8 != null && var8.iliIiiliiiii();
      var10.lliIlIilll = this.IiilIIlilliilIIlil < 0 ? -1 : target - this.IiilIIlilliilIIlil;
      this.Ililllililil(var10, (int)(var12 >>> 32) != 0 ? this.lIIiIIliliIIiIIlil : target);
      this.IiilIIlilliilIIlil = target;
      this.IIliIIlillIliIIlil.put(block, var10);

      while (this.IIliIIlillIliIIlil.size() > 64) {
         Iterator var11 = this.IIliIIlillIliIIlil.keySet().iterator();
         var11.next();
         var11.remove();
      }

      this.iIliIIlilIlliIIlil = var10;
      return var10.iIiIlIilll;
   }

   public long IilliliilIIi() {
      return this.lIIiIIliliIIiIIlil < 0 ? 0L : this.iiilIIlilIIIiIIlil;
   }

   public IIilIlllIilIll() {
      this.IiilIIlilliilIIlil = -1;
      this.lIIiIIliliIIiIIlil = -1;
      this.IIliIIlillIliIIlil = new LinkedHashMap<>();
   }

   public iiIiiiilIIliiiil Iilllilliill() {
      return this.iIilIIlilIlilIIlil == 0 ? null : this.IIilIIlillIilIIlil[Math.floorMod(this.iIilIIlilIlilIIlil - 1, 128)];
   }

   public int IIIllIIliIIl() {
      return this.iIliIIlilIlliIIlil == null ? 0 : this.iIliIIlilIlliIIlil.iIiIlIilll;
   }

   public void iIlIlllllill() {
      this.lIIiIIliliIIiIIlil = -1;
      this.iiilIIlilIIIiIIlil = 0L;
   }

   public float IiIlliIliiIl() {
      return this.iIliIIlilIlliIIlil == null ? 0.0F : liillilliiillill.Ililllililil(this.iIliIIlilIlliIIlil.lIIllIilll - this.iIliIIlilIlliIIlil.IIIllIilll);
   }

   public List<iiIiiiilIIliiiil> Illlllllilll() {
      long var5 = 8309391542717160157L;
      ArrayList var1 = new ArrayList(Math.min(this.iIilIIlilIlilIIlil, 128));
      var5 ^= ((long)Math.max(0, this.iIilIIlilIlilIIlil - 128) << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ ((long)((int)(var5 >>> 32)) ^ var5) & -1L >>> 32;
         (int)var8 < this.iIilIIlilIlilIIlil;
         var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32
      ) {
         iiIiiiilIIliiiil var4 = this.IIilIIlillIilIIlil[Math.floorMod((int)var8, 128)];
         if (var4 != null) {
            var1.add(var4);
         }
      }

      return var1;
   }

   public void IliIlllilIi(iiIiiiilIIliiiil s) {
      if (s != null) {
         this.IIilIIlillIilIIlil[Math.floorMod(this.iIilIIlilIlilIIlil, 128)] = s;
         this.iIilIIlilIlilIIlil++;
      }
   }

   public String iliIiiliiiii(long target, String result) {
      lIlilIlliIlilIll var4 = this.IIliIIlillIliIIlil.remove(target);
      if (var4 == null) {
         var4 = this.iIliIIlilIlliIIlil != null && this.iIliIIlilIlliIIlil.iliIlIilll == target ? this.iIliIIlilIlliIIlil : new lIlilIlliIlilIll();
      }

      this.iIliIIlilIlliIIlil = var4;
      return String.format(
         Locale.ROOT,
         Iiilliiliiil<"Iiilliiliiil","shS4Ngr9U8xpa4q4GxY0LqyFHtLuy4dBMuxTQzEKj08UiKtrUsfuHHLmhnEOe9kn1Z5nWeCjGyu/6lu5d/hG1tkw6Z3slRBnrLnAdRAdgb8iLQQEkdm3eg+dW29v9Xg8pkWVX8D2oOiceHFPeqZ0eQU2wPUSu7kMFfK4YHWjZ8VzKg+Y685RaDRdGdKpPlDXGI2m2j9TUwoWnLPVqht3byRRtSKvGdn95MBjUHwmaQoaR76MUWe2zocA33A5g1QBSV83QaNH0938UdUx695Rw9aC+NURGk2coST9lLlOPZlerbpqFHPOaCQpmp5AnTuZDme8qrQphPcMBUlerlAn8tcnVkpIUedND2szQll1JBQ7zNFeFQc3Y6vanB2Rsa5N67JRge5FPNV/HJwEq5yKcQdouJ2S5S3mpZ6GRA==">(),
         var4.iIiIlIilll,
         var4.iliIlIilll,
         var4.liiIlIilll,
         var4.IIIllIilll,
         var4.lIIllIilll,
         liillilliiillill.Ililllililil(var4.lIIllIilll - var4.IIIllIilll),
         var4.iIIllIilll,
         var4.IlIllIilll,
         liillilliiillill.Ililllililil(var4.IlIllIilll - var4.iIIllIilll),
         var4.IliIlIilll,
         var4.llIllIilll,
         var4.ilIllIilll,
         var4.IiIllIilll,
         var4.lliIlIilll,
         var4.liIllIilll,
         var4.iiIllIilll,
         var4.IIlllIilll,
         var4.IiiIlIilll,
         var4.iiiIlIilll,
         result == null ? "" : result
      );
   }

   public void liiiIIllIl(long tick, int target) {
      if (this.lIIiIIliliIIiIIlil >= 0 && this.iiilIIlilIIIiIIlil == tick && target - this.lIIiIIliliIIiIIlil > 128) {
         this.iIlIlllllill();
      }

      if (this.lIIiIIliliIIiIIlil < 0 || this.iiilIIlilIIIiIIlil != tick) {
         iiIiiiilIIliiiil var4 = this.IIillIiliIil(target);
         if (var4 == null) {
            var4 = this.Iilllilliill();
         }

         this.iiilIIlilIIIiIIlil = tick;
         this.lIIiIIliliIIiIIlil = target;
         this.IlIiIIlilllIiIIlil = var4 == null ? 0.0F : var4.liiiIIllIl();
         this.ilIiIIlilIiIiIIlil = var4 == null ? 0.0F : var4.iIlIlllllill();
      }
   }

   private iiIiiiilIIliiiil IIillIiliIil(int tick) {
      for (iiIiiiilIIliiiil var3 : this.Illlllllilll()) {
         if (var3.IliIlllilIi() == tick) {
            return var3;
         }
      }

      return null;
   }

   public void IIlllIlliIll() {
      Arrays.fill(this.IIilIIlillIilIIlil, null);
      this.iIilIIlilIlilIIlil = 0;
      this.llilIIlilililIIlil = 0;
      this.IiilIIlilliilIIlil = -1;
      this.iiilIIlilIIIiIIlil = 0L;
      this.lIIiIIliliIIiIIlil = -1;
      this.IlIiIIlilllIiIIlil = 0.0F;
      this.ilIiIIlilIiIiIIlil = 0.0F;
      this.IIliIIlillIliIIlil.clear();
      this.iIliIIlilIlliIIlil = null;
   }

   private void Ililllililil(lIlilIlliIlilIll fromTick, int r) {
      long var11 = 7873108215537099560L;
      iiIiiiilIIliiiil var3 = null;
      float var4 = Float.NaN;
      float var5 = Float.NaN;

      for (iiIiiiilIIliiiil var7 : this.Illlllllilll()) {
         if (var7.IliIlllilIi() >= r) {
            if (var3 != null) {
               var11 ^= ((long)Math.max(1, var7.IliIlllilIi() - var3.IliIlllilIi()) << 32 ^ var11) & -1L << 32;
               float var9 = liillilliiillill.Ililllililil(var7.liiiIIllIl() - var3.liiiIIllIl()) / (float)((int)(var11 >>> 32));
               float var10 = liillilliiillill.Ililllililil(var7.iIlIlllllill() - var3.iIlIlllllill()) / (float)((int)(var11 >>> 32));
               fromTick.llIllIilll = Math.max(fromTick.llIllIilll, Math.abs(var9));
               fromTick.ilIllIilll = Math.max(fromTick.ilIllIilll, Math.abs(var10));
               if (!Float.isNaN(var4)) {
                  fromTick.IiIllIilll = Math.max(fromTick.IiIllIilll, Math.max(Math.abs(var9 - var4), Math.abs(var10 - var5)));
               }

               var4 = var9;
               var5 = var10;
            }

            var3 = var7;
         }
      }
   }

   public int IlIlllIlilIl() {
      return this.iIliIIlilIlliIIlil == null ? 0 : this.iIliIIlilIlliIIlil.IliIlIilll;
   }
}
