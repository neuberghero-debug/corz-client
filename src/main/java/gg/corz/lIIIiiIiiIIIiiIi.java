package gg.corz;

import java.util.List;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_342;
import net.minecraft.class_4185;
import net.minecraft.class_437;

public class lIIIiiIiiIIIiiIi extends class_437 implements Illillliilli {
   private int IlIIiiiIIi;
   private int ilIIiiiIIi;
   private int llIIiiiIIi;
   private int lliiliiIIi;
   private class_342 IiiiliiIIi;
   private final llIIIlIiilIIIlIi IliiliiIIi;
   private int iiiiliiIIi;
   private String liiiliiIIi = "";
   private int iIIIiiiIIi = 14;
   private int IIIIiiiIIi;
   private final class_437 iIiiliiIIi;
   private String iliiliiIIi;
   private int lIIIiiiIIi;

   private String IliIlllilIi() {
      return Ililllililil<"Ililllililil","HM8Jz017l1YjWhCXQzmyER0XoXXh/fAMQMAtKhdOXSXZDwQR9y+wEQ==">()
         + (
            this.IliiliiIIi.IilliliilIIi()
               ? Ililllililil<"Ililllililil","M1+CQPir73yT5JzmDJhqerllQkrNl1Em1jxokJwB">()
               : Ililllililil<"Ililllililil","NkFcGuEbsXRHW49kuZBZaVqGRM0beQAiOJqI4XtJnA==">()
         );
   }

   public boolean method_25402(class_11909 doubled, boolean click) {
      long var9 = 1653179984757662088L;
      long var11 = 6054274100870845218L;
      long var13 = 6946099761352225652L;
      var9 ^= ((long)((int)doubled.comp_4798()) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)((int)doubled.comp_4799()) ^ var9) & -1L >>> 32;
      var11 ^= (0L ^ var11) & -1L << 32;

      while ((int)(var11 >>> 32) < 9) {
         var11 ^= ((long)(this.IlIIiiiIIi + (int)(var11 >>> 32) % 3 * this.ilIIiiiIIi) ^ var11) & -1L >>> 32;
         var13 ^= ((long)(this.llIIiiiIIi + (int)(var11 >>> 32) / 3 * this.ilIIiiiIIi) << 32 ^ var13) & -1L << 32;
         if ((int)(var9 >>> 32) >= (int)var11
            && (int)(var9 >>> 32) < (int)var11 + this.ilIIiiiIIi - 2
            && (int)var9 >= (int)(var13 >>> 32)
            && (int)var9 < (int)(var13 >>> 32) + this.ilIIiiiIIi - 2) {
            this.lliiliiIIi ^= 1 << (int)(var11 >>> 32);
            return true;
         }

         var11 += 4294967296L;
      }

      List var5 = this.IliiliiIIi.IliIlllilIi();

      for (long var19 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var19 < var5.size() && (int)var19 < 12; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
         var13 ^= ((long)(this.IIIIiiiIIi + (int)var19 * this.iIIIiiiIIi) << 32 ^ var13) & -1L << 32;
         if ((int)(var9 >>> 32) >= this.iiiiliiIIi
            && (int)(var9 >>> 32) <= this.iiiiliiIIi + this.lIIIiiiIIi
            && (int)var9 >= (int)(var13 >>> 32)
            && (int)var9 < (int)(var13 >>> 32) + this.iIIIiiiIIi) {
            illiiIIlIiliiIIl var8 = (illiiIIlIiliiIIl)var5.get((int)var19);
            this.iliiliiIIi = var8.liiiIIllIl();
            this.lliiliiIIi = var8.iIlIlllllill();
            this.IiiiliiIIi.method_1852(var8.liiiIIllIl());
            if (click) {
               this.IliiliiIIi.IIillIiliIil(var8.liiiIIllIl());
               this.liiiliiIIi = Ililllililil<"Ililllililil","KUGiC93oAhlRiVCCYE31Y5nFOEjns6H5xlVPaGqpM4SHWnY3V18=">()
                  + var8.liiiIIllIl()
                  + Ililllililil<"Ililllililil","iTKJoe/C9WoVksFYuvkzmeCdV/lj59EkQUpAzpo=">();
               liiiIIllIl();
            }

            return true;
         }
      }

      return super.method_25402(doubled, click);
   }

   public boolean method_25404(class_11908 input) {
      if (input.comp_4795() == 256) {
         this.method_25419();
         return true;
      } else {
         return super.method_25404(input);
      }
   }

   private void IilliliilIIi() {
      if (this.iliiliiIIi == null) {
         this.liiiliiIIi = Ililllililil<"Ililllililil","y4s3NG1CAgq60YBxbWfsyOW9BVmFZwpbnPYL/GevJjgdIiKsHA+KLOUtmnFU">();
      } else {
         String var1 = this.IiiiliiIIi.method_1882();
         if (this.IliiliiIIi.Illlllllilll(this.iliiliiIIi, var1)) {
            this.iliiliiIIi = llIIIlIiilIIIlIi.IiIlliIliiIl(var1);
            this.liiiliiIIi = Ililllililil<"Ililllililil","iMA3WhUCHL9gpgLA1fEM4IbueGITwCn5SlUKDKnRy7+yYVTKxgvKRA==">()
               + this.iliiliiIIi
               + Ililllililil<"Ililllililil","iTKJoe/C9WoVksFYuvkzmeCdV/lj59EkQUpAzpo=">();
            liiiIIllIl();
         } else {
            this.liiiliiIIi = Ililllililil<"Ililllililil","83KXnk7ZmsZcwUJR1ed9cf3gXqoMtSlg8cEzwhTxgLIJsOSn+lIPpr5PCtvvaSV+kcvqoVMfLLotKdrd6OQ=">();
         }
      }
   }

   public void method_25394(class_332 ctx, int my, int delta, float mx) {
      long var17 = 5741981383860788817L;
      long var19 = 6201737395639266459L;
      long var21 = -9050327703977132373L;
      long var23 = -459754142332618833L;
      long var25 = -8152973975469996185L;
      var17 ^= ((long)Math.min(400, this.field_22789 - 20) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)Math.min(230, this.field_22790 - 20) ^ var17) & -1L >>> 32;
      var19 ^= ((long)((this.field_22789 - (int)(var17 >>> 32)) / 2) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)((this.field_22790 - (int)var17) / 2) ^ var19) & -1L >>> 32;
      ctx.method_25294(0, 0, this.field_22789, this.field_22790, -1610612736);
      ctx.method_25294((int)(var19 >>> 32), (int)var19, (int)(var19 >>> 32) + (int)(var17 >>> 32), (int)var19 + (int)var17, -267119072);
      ctx.method_25294((int)(var19 >>> 32), (int)var19, (int)(var19 >>> 32) + (int)(var17 >>> 32), (int)var19 + 1, 1090519039);
      ctx.method_51433(
         this.field_22793,
         Ililllililil<"Ililllililil","XbA9+z4fwWkQfxe4/cqJFj2L1tVtcMWzwXruf4QGfws6voCvuQgFAFDk2MtO">() + this.IliiliiIIi.IlIillIiilIi(),
         (int)(var19 >>> 32) + 10,
         (int)var19 + 9,
         -1,
         false
      );
      List var9 = this.IliiliiIIi.IliIlllilIi();
      String var10 = this.IliiliiIIi.iIlIlllllill();
      var21 ^= (0L ^ var21) & -1L << 32;

      while ((int)(var21 >>> 32) < var9.size() && (int)(var21 >>> 32) < 12) {
         illiiIIlIiliiIIl var12 = (illiiIIlIiliiIIl)var9.get((int)(var21 >>> 32));
         var21 ^= ((long)(this.IIIIiiiIIi + (int)(var21 >>> 32) * this.iIIIiiiIIi) ^ var21) & -1L >>> 32;
         var23 ^= (
               (long)(my >= this.iiiiliiIIi && my <= this.iiiiliiIIi + this.lIIIiiiIIi && delta >= (int)var21 && delta < (int)var21 + this.iIIIiiiIIi ? 1 : 0)
                     << 32
                  ^ var23
            )
            & -1L << 32;
         var23 ^= ((long)var12.liiiIIllIl().equalsIgnoreCase(this.iliiliiIIi) ^ var23) & -1L >>> 32;
         var25 ^= ((long)var12.liiiIIllIl().equalsIgnoreCase(var10) << 32 ^ var25) & -1L << 32;
         if ((int)(var23 >>> 32) != 0 || (int)var23 != 0) {
            ctx.method_25294(
               this.iiiiliiIIi - 2,
               (int)var21 - 1,
               this.iiiiliiIIi + this.lIIIiiiIIi,
               (int)var21 + this.iIIIiiiIIi - 1,
               (int)var23 != 0 ? 1346412799 : 822083583
            );
         }

         ctx.method_51433(
            this.field_22793,
            (
                  (int)(var25 >>> 32) != 0
                     ? Ililllililil<"Ililllililil","b1wXUqR9tUwl5ikTNqsSQTEPO5LjRonCRJ9pCTOXuG4=">()
                     : Ililllililil<"Ililllililil","Chhjs8qMjWtwVm0SEEkl4rBDcb+MnhxAGRZi6PQM">()
               )
               + var12.liiiIIllIl(),
            this.iiiiliiIIi,
            (int)var21 + 2,
            (int)(var25 >>> 32) != 0 ? -10406 : -1644826,
            false
         );
         ctx.method_51433(
            this.field_22793, IiliIIllliliIIll.iliIiiliiiii(var12.iIlIlllllill()), this.iiiiliiIIi + this.lIIIiiiIIi - 60, (int)var21 + 2, -6643540, false
         );
         var21 += 4294967296L;
      }

      if (var9.isEmpty()) {
         ctx.method_51433(
            this.field_22793,
            Ililllililil<"Ililllililil","Nmdk4tE5Xs7Sxqg3YsnYO0F14LOzzlXcv9Cm3LCzo6Te1zCOUJR/C4s3">(),
            this.iiiiliiIIi,
            this.IIIIiiiIIi + 2,
            -6643540,
            false
         );
      }

      var21 ^= (0L ^ var21) & -1L << 32;

      while ((int)(var21 >>> 32) < 9) {
         var25 ^= ((long)(this.IlIIiiiIIi + (int)(var21 >>> 32) % 3 * this.ilIIiiiIIi) ^ var25) & -1L >>> 32;
         var21 ^= ((long)(this.llIIiiiIIi + (int)(var21 >>> 32) / 3 * this.ilIIiiiIIi) ^ var21) & -1L >>> 32;
         long var36 = var23 ^ ((long)IiliIIllliliIIll.IilliliilIIi(this.lliiliiIIi, (int)(var21 >>> 32)) << 32 ^ var23) & -1L << 32;
         var23 = var36
            ^ (
                  (long)(my >= (int)var25 && my < (int)var25 + this.ilIIiiiIIi - 2 && delta >= (int)var21 && delta < (int)var21 + this.ilIIiiiIIi - 2 ? 1 : 0)
                     ^ var36
               )
               & -1L >>> 32;
         ctx.method_25294(
            (int)var25, (int)var21, (int)var25 + this.ilIIiiiIIi - 2, (int)var21 + this.ilIIiiiIIi - 2, (int)(var23 >>> 32) != 0 ? -8376272 : -12957126
         );
         if ((int)var23 != 0) {
            ctx.method_25294((int)var25, (int)var21, (int)var25 + this.ilIIiiiIIi - 2, (int)var21 + this.ilIIiiiIIi - 2, 822083583);
         }

         ctx.method_51433(
            this.field_22793,
            (int)(var23 >>> 32) != 0 ? Ililllililil<"Ililllililil","5Cb3MI6L3NmtgpK3yIMyv1+e7YBTnlBGq8fiNMc=">() : "" + ((int)(var21 >>> 32) + 1),
            (int)var25 + 7,
            (int)var21 + 6,
            -1,
            false
         );
         var21 += 4294967296L;
      }

      ctx.method_51433(
         this.field_22793,
         Ililllililil<"Ililllililil","ZKtiXBW6vA9ucPPR8SXwmEnewLLIxTkYKMdqk0dDNMoRgV2jwl3zv5pVz7w=">()
            + IiliIIllliliIIll.iliIiiliiiii(this.lliiliiIIi)
            + (
               this.iliiliiIIi == null
                  ? Ililllililil<"Ililllililil","cuVkZtXDHFRuDU87h0eEJ9MI1op63OXDqDm3vcGjR/dnj9g=">()
                  : Ililllililil<"Ililllililil","JSWy5pj9w9mZNOiMDy0L504RTj2mvE/aNG3Zr3wq2w==">()
                     + this.iliiliiIIi
                     + Ililllililil<"Ililllililil","esXOH5ew6UZOdbX7UNkZAh3cC1y9ixHzXwE6Fkg=">()
            ),
         this.IlIIiiiIIi + 3 * this.ilIIiiiIIi + 8,
         this.llIIiiiIIi + 2,
         -5195576,
         false
      );
      ctx.method_51433(
         this.field_22793,
         Ililllililil<"Ililllililil","IL1QTEFsp5wb+dsQy1IgY4UE7/PRxQ3LBWd+gpGEJrkxLRAHZ+Ey/ldb1o0c97WFaKg=">(),
         this.IlIIiiiIIi + 3 * this.ilIIiiiIIi + 8,
         this.llIIiiiIIi + 14,
         -6643540,
         false
      );
      ctx.method_51433(this.field_22793, this.liiiliiIIi, (int)(var19 >>> 32) + 10, (int)var19 + (int)var17 - 38, -6631169, false);
      super.method_25394(ctx, my, delta, mx);
   }

   private static void liiiIIllIl() {
      try {
         iiiIIIlIIIlIIl.liiiIIllIl();
      } catch (Throwable var1) {
      }
   }

   public boolean method_25421() {
      return false;
   }

   protected void method_25426() {
      long var8 = -2427348078423106355L;
      long var10 = 8658904147719162622L;
      long var12 = 7521798151508172128L;
      long var14 = -8165021954923506830L;
      var8 ^= ((long)Math.min(400, this.field_22789 - 20) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)Math.min(230, this.field_22790 - 20) ^ var8) & -1L >>> 32;
      var10 ^= ((long)((this.field_22789 - (int)(var8 >>> 32)) / 2) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)((this.field_22790 - (int)var8) / 2) ^ var10) & -1L >>> 32;
      this.iiiiliiIIi = (int)(var10 >>> 32) + 10;
      this.IIIIiiiIIi = (int)var10 + 28;
      this.lIIIiiiIIi = 150;
      this.IlIIiiiIIi = (int)(var10 >>> 32) + 190;
      this.llIIiiiIIi = (int)var10 + 28;
      this.IiiiliiIIi = new class_342(
         this.field_22793,
         this.IlIIiiiIIi,
         this.llIIiiiIIi + 3 * this.ilIIiiiIIi + 8,
         190,
         16,
         class_2561.method_43470(Ililllililil<"Ililllililil","wk34MQZyVT7dzKG2Knl7koaG42C4HF3n7gVTiwl7A51HdGOIBaRG">())
      );
      this.IiiiliiIIi.method_1880(24);
      if (this.iliiliiIIi != null) {
         this.IiiiliiIIi.method_1852(this.iliiliiIIi);
      }

      this.method_37063(this.IiiiliiIIi);
      var12 ^= ((long)(this.llIIiiiIIi + 3 * this.ilIIiiiIIi + 30) << 32 ^ var12) & -1L << 32;
      var12 ^= (60L ^ var12) & -1L >>> 32;
      var14 ^= (68719476736L ^ var14) & -1L << 32;
      this.method_37063(
         class_4185.method_46430(
               class_2561.method_43470(Ililllililil<"Ililllililil","Jro5kpv3yihtksSOzlpxHLYbZCdI78ZYgi5CKAK6+Tg=">()), b -> this.iIlIlllllill()
            )
            .method_46434(this.IlIIiiiIIi, (int)(var12 >>> 32), (int)var12, (int)(var14 >>> 32))
            .method_46431()
      );
      this.method_37063(
         class_4185.method_46430(
               class_2561.method_43470(Ililllililil<"Ililllililil","d9QpK7r+dltDmEL3pvjn0loqPF+SOsFFddsXNL+jy6s2hg==">()), b -> this.IilliliilIIi()
            )
            .method_46434(this.IlIIiiiIIi + 65, (int)(var12 >>> 32), (int)var12, (int)(var14 >>> 32))
            .method_46431()
      );
      this.method_37063(
         class_4185.method_46430(
               class_2561.method_43470(Ililllililil<"Ililllililil","1sCMPdpu+aOzWQfF6lcVmjqmAFBrd7Q8MGtMXTis9nZ40A==">()), b -> this.lIiiIiIlilli()
            )
            .method_46434(this.IlIIiiiIIi + 130, (int)(var12 >>> 32), (int)var12, (int)(var14 >>> 32))
            .method_46431()
      );
      this.method_37063(
         class_4185.method_46430(
               class_2561.method_43470(Ililllililil<"Ililllililil","H85qmYUf2nJEgPQXKs+rr9LuMY+Nixq8PZ8JXhtVjwJmhQ==">()), b -> this.iliIiiliiiii()
            )
            .method_46434(this.IlIIiiiIIi, (int)(var12 >>> 32) + 20, (int)var12, (int)(var14 >>> 32))
            .method_46431()
      );
      this.method_37063(class_4185.method_46430(class_2561.method_43470(this.IliIlllilIi()), b -> {
         this.IliiliiIIi.lIiiIiIlilli(!this.IliiliiIIi.IilliliilIIi());
         b.method_25355(class_2561.method_43470(this.IliIlllilIi()));
         liiiIIllIl();
      }).method_46434(this.IlIIiiiIIi + 65, (int)(var12 >>> 32) + 20, 90, (int)(var14 >>> 32)).method_46431());
      this.method_37063(
         class_4185.method_46430(
               class_2561.method_43470(Ililllililil<"Ililllililil","DicfZuQGeDnKWkK+b1e/tiKMSrfRZw3TLhbUmhjxwr8M">()), b -> this.method_25419()
            )
            .method_46434((int)(var10 >>> 32) + (int)(var8 >>> 32) - 60, (int)var10 + (int)var8 - 24, 50, (int)(var14 >>> 32))
            .method_46431()
      );
      this.method_37063(class_4185.method_46430(class_2561.method_43470(Ililllililil<"Ililllililil","6a2JE3O0mzEo6fzaKGpEOICbJEspy7jbrZWSpHzoyg==">()), b -> {
         this.iliiliiIIi = null;
         this.lliiliiIIi = 0;
         this.IiiiliiIIi.method_1852("");
         this.liiiliiIIi = Ililllililil<"Ililllililil","syHVOGCwV2RTMnycY+Av4W9CCrAWMUO8X13UEH+VFdnkJ5IgQ1g=">();
      }).method_46434(this.iiiiliiIIi, (int)var10 + (int)var8 - 24, 50, (int)(var14 >>> 32)).method_46431());
   }

   public lIIIiiIiiIIIiiIi(class_437 initialMask, llIIIlIiilIIIlIi parent, Integer lib) {
      super(class_2561.method_43470(Ililllililil<"Ililllililil","v1a57ERaKLki7AX9GRBcPzUa1M87SRi8kpIDrfEkUXUIZkNgd1XxmSy0Fw==">()));
      this.ilIIiiiIIi = 22;
      this.iIiiliiIIi = initialMask;
      this.IliiliiIIi = parent;
      illiiIIlIiliiIIl var4 = parent.IIIllIIliIIl();
      if (lib != null) {
         this.lliiliiIIi = lib & 511;
         this.iliiliiIIi = null;
      } else if (var4 != null) {
         this.lliiliiIIi = var4.iIlIlllllill();
         this.iliiliiIIi = var4.liiiIIllIl();
      }
   }

   private void iIlIlllllill() {
      String var1 = this.IiiiliiIIi.method_1882();
      if (this.IliiliiIIi.IIlllIlliIll(var1, this.lliiliiIIi)) {
         this.iliiliiIIi = llIIIlIiilIIIlIi.IiIlliIliiIl(var1);
         this.liiiliiIIi = Ililllililil<"Ililllililil","wsdvDTsoY9nx7uK8TIpET2XlYNM7XiqsmKT2FneJ9qwMVBg=">()
            + this.iliiliiIIi
            + Ililllililil<"Ililllililil","iTKJoe/C9WoVksFYuvkzmeCdV/lj59EkQUpAzpo=">();
         liiiIIllIl();
      } else {
         this.liiiliiIIi = Ililllililil<"Ililllililil","xuRAxcwj6yPexnxjXNQcDUZ8iGt4uqZmXqbT3QCCAiQLvGQaNK3DNCOe5dC0Va6oWvRjp2gB">();
      }
   }

   private void iliIiiliiiii() {
      if (this.iliiliiIIi == null) {
         this.liiiliiIIi = Ililllililil<"Ililllililil","YjG8RLSBnou9v0m6V0fRpCIWwSclNwI4/geMbKu8R9uwoqpFgf8eWOlsgv4FNb0mOw==">();
      } else {
         if (this.IliiliiIIi.IIillIiliIil(this.iliiliiIIi)) {
            this.liiiliiIIi = Ililllililil<"Ililllililil","KUGiC93oAhlRiVCCYE31Y5nFOEjns6H5xlVPaGqpM4SHWnY3V18=">()
               + this.iliiliiIIi
               + Ililllililil<"Ililllililil","iTKJoe/C9WoVksFYuvkzmeCdV/lj59EkQUpAzpo=">();
            liiiIIllIl();
         }
      }
   }

   private void lIiiIiIlilli() {
      if (this.iliiliiIIi == null) {
         this.liiiliiIIi = Ililllililil<"Ililllililil","vdXYmLeeSIBnZie7VxGsLw+y8btBZg82SjTRER42IXKwHFAPMVH5Gvj7vMfM">();
      } else {
         if (this.IliiliiIIi.Iilllilliill(this.iliiliiIIi)) {
            this.liiiliiIIi = Ililllililil<"Ililllililil","CVC+tRSta+pIwGv9zEyn2DV1t7L1Vk0pBq85251tB9Paa3QZlA==">()
               + this.iliiliiIIi
               + Ililllililil<"Ililllililil","iTKJoe/C9WoVksFYuvkzmeCdV/lj59EkQUpAzpo=">();
            this.iliiliiIIi = null;
            this.IiiiliiIIi.method_1852("");
            this.lliiliiIIi = 0;
            liiiIIllIl();
         }
      }
   }

   public void method_25419() {
      class_310.method_1551().method_1507(this.iIiiliiIIi);
   }
}
