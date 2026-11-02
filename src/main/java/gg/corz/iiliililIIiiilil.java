package gg.corz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2561;
import net.minecraft.class_3965;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_239.class_240;

public class iiliililIIiiilil extends ilIllIiIll {
   private final iiIiiilIIliiil IIIIilllil;
   private final ililliIiIiilliIi Iilillllil;
   private final iiIiiilIIliiil llIIilllil;
   private class_2338 ilIlilllil;
   private final ililliIiIiilliIi lilillllil;
   private final iilliIlIIiliIl lIiillllil;
   private boolean liiIilllil;
   private int lIiIilllil;
   private final ililliIiIiilliIi illillllil;
   private final iilliIlIIiliIl iIiillllil;
   private final iiIiiilIIliiil ilIIilllil;
   private final iiIiiilIIliiil liiillllil;
   private int iIiIilllil;
   private final IIIIlilllIIIlill Iliillllil;
   private final IIiiIIIllIiiIIIl lllillllil;
   private final lllIiiillIii IIIlilllil;
   private static boolean iiIIilllil;
   private int iilIilllil;
   private boolean IllIilllil;
   private boolean IiiIilllil;
   private boolean iliIilllil;
   private static final int IiIIilllil = 4;
   private final IIiiIIIllIiiIIIl iIlillllil = new IIiiIIIllIiiIIIl(
      IliIlllilIi<"IliIlllilIi","JaCHTHjOKzTxgcG1MTOU4ARC4OlWQsPmAhoUlHGJTeDEXHTw">(),
      IliIlllilIi<"IliIlllilIi","XXCz9YTeKzVs+IC2qu+EYSG1gG7IMupLJMjFGjbGARKCcWK2zz9qLZyUuBAvByOVA5IdhVUFAP9kNgvp15yzb2tocyCl8ih4L+oTxezl">(),
      ""
   );
   private List<class_2338> llIlilllil;
   private int lilIilllil;
   private final llilIIIiililIIIi lIlIilllil;
   private final List<class_2338> lliIilllil;
   private long iIIlilllil;
   private iIiIlIliIl iIlIilllil;
   private iIiiiIIlIliiiIIl lIIlilllil;
   private final iiIiiilIIliiil lliillllil;
   private int IlIlilllil;
   private static final long liIIilllil = 160000000L;
   private final iiIiiilIIliiil iliillllil;
   private final ilIIIIiIiIIIIi IIlIilllil;
   private final iiIiiilIIliiil iIIIilllil;
   private Object lllIilllil;
   private final iilliIlIIiliIl lIIIilllil;
   private final iilliIlIIiliIl iiiillllil;
   private final iiIiiilIIliiil IlIIilllil;
   private Object illIilllil;
   private final iiIiiilIIliiil Iiiillllil;
   private final ililliIiIiilliIi iilillllil;
   private final IIiiIIIllIiiIIIl IIiillllil;
   private boolean IliIilllil;
   private int IIiIilllil;
   private String iiiIilllil;
   private int IilIilllil;

   private void iIIilIlIil(IiiIIiilliiIIiil f) {
      f.IliIlllilIi();
      f.iIIilillil = this.iIIIilllil.Iilllilliill();
      f.IlIilillil = this.IlIIilllil.Iilllilliill();
      if (this.IliIilllil) {
         f.liiiIIllIl(this.IilIilllil, this.lilIilllil, this.iilIilllil, this.IIiIilllil, this.lIiIilllil, this.iIiIilllil);
      }

      if (this.iIlIilllil != null && this.iIlIilllil.liiiIIllIl()) {
         iIiiiIIlIliiiIIl var2 = this.iIlIilllil.IilliliilIIi();
         if (var2 != null && !var2.Iilililiiili() && this.lIlIilllil.IIIllIIliIIl()) {
            this.llIililIil(f, var2);
         } else {
            class_2338 var3 = this.iIlIilllil.lIiiIiIlilli();
            if (var3 != null) {
               f.iIlIlllllill(var3.method_10263(), var3.method_10264(), var3.method_10260(), var3.method_10263(), var3.method_10264(), var3.method_10260());
            }
         }

         f.iliilillil = this.iIlIilllil.iliIiiliiiii();
         lllIlIIlillIlIIl var5 = this.iIlIilllil.IlIlllIlilIl();
         if (var5 != null && var5.IlIillIiilIi() != null && System.nanoTime() - var5.IiIiliIiiiIi() < (2783479109299109451L ^ 2783479109156017739L)) {
            f.liiilillil = var5.IlIillIiilIi();
            f.iiiilillil = true;
            List var4 = var5.Iiilliiliiil();
            if (var4 != null && f.liiilillil.equals(var5.IIIilIIiiIIi())) {
               f.Iiiilillil = var4;
            }
         }
      }

      if (iiIIilllil) {
         this.IiIilliIil(f);
      } else {
         this.llIlilllil = null;
      }
   }

   public void iiiIlIIIll(Collection<class_2338> source, String cells) {
      this.Ilillllill();
      this.Iillllilll().iIlIlllllill();
      this.iiiIilllil = cells;
      this.iliIilllil = true;
      this.lliIilllil.clear();
      if (source != null) {
         for (class_2338 var4 : source) {
            this.lliIilllil.add(var4.method_10062());
         }
      }

      this.IiiIilllil = this.lliIilllil.isEmpty();
      this.liiIilllil = false;
      this.lllllillll();
   }

   private void Ilillllill() {
      if (this.iIlIilllil != null && this.iIlIilllil.liiiIIllIl()) {
         this.iIlIilllil.lilIliilIl();
      }

      this.IllIilllil = false;
   }

   private void lIilliIill() {
      this.iilllIIill();
      iIiIlIliIl var1 = this.Iillllilll();
      if (!var1.liiiIIllIl()
         || Iiiilllliiilll.field_1687 == this.lllIilllil && Iiiilllliiilll.field_1724 == this.illIilllil && Iiiilllliiilll.field_1724.method_5805()) {
         if (!var1.liiiIIllIl()) {
            if (this.IllIilllil) {
               this.IllIilllil = false;
               boolean var3 = var1.IliIlllilIi() == lilIIliiilIIli.IIiIliiiilIiIliiii;
               if (this.iliIilllil) {
                  this.iIlllIllll(!var3);
               } else if (var3 && this.ilIIilllil.Iilllilliill()) {
                  Iliiiiilliiiii.IliIlllilIi()
                     .iIlIlllllill(
                        IliIlllilIi<"IliIlllilIi","po+pa5xoFqNEy9PHOSBwfDOd0Crm/3d3L6toER3jR6GJHr/rdLZvc1fn9Q==">(),
                        IliIlllilIi<"IliIlllilIi","5Gzu0ixxRRoVOaPrEupLCpy1PXFpOcBRfYJra6ErltUa3cW85fGVJA==">(),
                        true
                     );
               }

               this.IIillIiliIil(false);
            } else if (this.IliIilllil) {
               this.ilillIiill();
               this.lIlIilllil
                  .IliIlllilIi(
                     new class_2338(this.IilIilllil, this.lilIilllil, this.iilIilllil), new class_2338(this.IIiIilllil, this.lIiIilllil, this.iIiIilllil)
                  );
               if (this.iliIilllil) {
                  this.lIlIilllil.iIlIlllllill(this.lliIilllil);
               } else {
                  this.lIlIilllil.IilliliilIIi();
               }

               String var2 = var1.llIIlilIIl();
               if (var2 != null) {
                  this.liilliiill(IliIlllilIi<"IliIlllilIi","zApAYRvsIDzUmFqR7P3gXhyn0E2147mnahTMTHWRoQCl7Wi/iWtTtSDRsrI3">() + var2);
                  this.iIlllIllll(true);
                  this.IIillIiliIil(false);
               } else {
                  this.IllIilllil = true;
                  this.lllIilllil = Iiiilllliiilll.field_1687;
                  this.illIilllil = Iiiilllliiilll.field_1724;
               }
            }
         } else if (this.llIIilllil.Iilllilliill() && Iiiilllliiilll.field_1755 != null) {
            var1.IiiIlliiIl();
         } else {
            var1.lliIliliIl();
         }
      } else {
         var1.lilIliilIl();
         this.IllIilllil = false;
         this.liilliiill(
            IliIlllilIi<"IliIlllilIi","3VkhBMvZ9g0ko5vAH6lXZHaBQw8U2EiEXjCGt8gavgUO1qZgo6mWmNBm6sa7GziYLKVOdtVLFCIOwBRSC5nEzBFFZmRFwNfBvn2K4d65e6kCvcL5p8bsevUK0ZdOSBSyinTzG7A08TdG12xLOflLHb21vFDrKpg0ERM=">()
         );
         this.iIlllIllll(true);
         this.IIillIiliIil(false);
      }
   }

   public void lIIlliIIll(String source) {
      if (this.iliIilllil && (this.iiiIilllil == null || this.iiiIilllil.equals(source))) {
         this.Ilillllill();
         this.lIlIilllil.IilliliilIIi();
         this.Iillllilll().iIlIlllllill();
         this.iliIilllil = false;
         this.IiiIilllil = false;
         this.liiIilllil = false;
         this.iiiIilllil = null;
         this.lliIilllil.clear();
         this.iIiilIliil();
      }
   }

   private static int[] lliililiil(String s) {
      if (s == null) {
         return null;
      } else {
         String[] var1 = s.trim()
            .replace(
               IliIlllilIi<"IliIlllilIi","2sQRQUR8j7RsIqJy1pfFJ3j0CWk6kVF/G82ryFw=">(), IliIlllilIi<"IliIlllilIi","zNKkfjPDBQGoWdNvHJHoFj3X3DKjUD4PvfVvCaQ=">()
            )
            .split(IliIlllilIi<"IliIlllilIi","VYpAV6XFkKp5oqym+jBQdthWsDCkeBLUPmiVWVUeWw==">());
         if (var1.length != ((--602496691 + -59 >>> 17 | --602496691 + -59 << 15) ^ -45 ^ 1355017764)) {
            return null;
         } else {
            try {
               return new int[]{Integer.parseInt(var1[0]), Integer.parseInt(var1[1]), Integer.parseInt(var1[2])};
            } catch (NumberFormatException var3) {
               return null;
            }
         }
      }
   }

   private void iIiilIliil() {
      int[] var1 = lliililiil(this.iIlillllil.Iilllilliill());
      int[] var2 = lliililiil(this.lllillllil.Iilllilliill());
      this.IliIilllil = var1 != null && var2 != null;
      if (this.IliIilllil) {
         this.IilIilllil = Math.min(var1[0], var2[0]);
         this.IIiIilllil = Math.max(var1[0], var2[0]);
         this.lilIilllil = Math.min(var1[1], var2[1]);
         this.lIiIilllil = Math.max(var1[1], var2[1]);
         this.iilIilllil = Math.min(var1[2], var2[2]);
         this.iIiIilllil = Math.max(var1[2], var2[2]);
      }
   }

   private void llIililIil(IiiIIiilliiIIiil plan, iIiiiIIlIliiiIIl f) {
      long var16 = -9148204812385270313L;
      long var18 = 2727330678900732380L;
      long var12 = -3084893573839547991L;
      long var14 = -3323577626923321034L;
      var12 ^= ((long)f.IiIlliIliiIl() << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)f.Iiilliiliiil() ^ var12) & -1L >>> 32;
      long var5 = (
               ((long)f.iiIIlIIlIl() * (7442685556297008003L ^ 7442685556297012096L) + (long)f.IllIllllIl()) * (-9085220896879305640L ^ -9085220896880009701L)
                  + (long)((int)(var12 >>> 32))
            )
            * (-2783436121980460629L ^ -2783436121981164598L)
         + (long)((int)var12);
      if (f != this.lIIlilllil || var5 != this.iIIlilllil) {
         this.lIIlilllil = f;
         this.iIIlilllil = var5;
         this.IlIlilllil = f.Ililllililil().method_10264();
      }

      var14 ^= ((long)Math.max((int)var12 - 1, f.llIIlilIIl()) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)Math.min((int)var12 + 1, f.IiIIlliIIl()) ^ var14) & -1L >>> 32;
      var16 ^= ((long)Math.max(this.IlIlilllil - 1, this.lIlIilllil.IiIlliIliiIl()) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)Math.min(this.IlIlilllil + 1, this.lIlIilllil.Iilllilliill()) ^ var16) & -1L >>> 32;
      if ((int)(var14 >>> 32) <= (int)var14 && (int)(var16 >>> 32) <= (int)var16) {
         var18 ^= ((long)(f.lIIlllilIl == class_2351.field_11048 ? 1 : 0) << 32 ^ var18) & -1L << 32;
         if ((int)(var18 >>> 32) != 0) {
            plan.iIlIlllllill((int)(var12 >>> 32), (int)(var16 >>> 32), (int)(var14 >>> 32), (int)(var12 >>> 32), (int)var16, (int)var14);
         } else {
            plan.iIlIlllllill((int)(var14 >>> 32), (int)(var16 >>> 32), (int)(var12 >>> 32), (int)var14, (int)var16, (int)(var12 >>> 32));
         }

         plan.IilliliilIIi((int)(var18 >>> 32) != 0 ? 0 : 2, f.IlIlllIlilIl(), 4, f.IIIIllIIIl(), f.iIIIlIlIIl());
      }
   }

   public iiliililIIiiilil() {
      super(IliIlllilIi<"IliIlllilIi","po+pa5xoFqNEy9PHOSBwfDOd0Crm/3d3L6toER3jR6GJHr/rdLZvc1fn9Q==">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.lllillllil = new IIiiIIIllIiiIIIl(
         IliIlllilIi<"IliIlllilIi","MkYZi7fSse06Zfk26D1smJvG680qJ3vNdEpctRDbSQQvAu76">(),
         IliIlllilIi<"IliIlllilIi","r22sFa3MYvfPyoLveRgJOGQtkUnRlkcTIt0+5XXLpF8mE2Kxdd1sNPHOl/BrdrciBjWFasv9A/EbNfBrFTux22lBPhUJvvG70FxYdJQbzA==">(),
         ""
      );
      this.illillllil = new ililliIiIiilliIi(
         IliIlllilIi<"IliIlllilIi","DIQRL6mRhwk0ylCfQ5rnZyhYMLtTay0lF/DeJ6R9+r3L1XAZ4O+6ZnQOCCKP">(),
         IliIlllilIi<"IliIlllilIi","6Fdq/8yUYD1bbLjlzsVhPONbVvE+rNy3WvKG2MB1wDaJsOJawvterWrFnwZxRoPtx1lFYQUCwX4w/rGg5o47pLnEmXQp7LYZ">(),
         IliIlllilIi<"IliIlllilIi","M5B/V3jYufgGXkOYu6yv68o9GTkOiyEruB4Frh5ylg==">(),
         () -> this.lililiilil(1, false)
      );
      this.Iilillllil = new ililliIiIiilliIi(
         IliIlllilIi<"IliIlllilIi","R5BTYXwcLCFEnCpag83LDzsBcEqRCG9siu4q/cQ/2aYuHKUQmYLDdnH9ZUcrYfDH">(),
         IliIlllilIi<"IliIlllilIi","2GqxoZUzftN9uXjvZ7pTc5xyg27rOcQOV5m7pZx08drxrS7s/1N0mlOpkcY5qUkuiW9Ls1ycbgJTQaCObGPighCDSrijB28=">(),
         IliIlllilIi<"IliIlllilIi","M5B/V3jYufgGXkOYu6yv68o9GTkOiyEruB4Frh5ylg==">(),
         () -> this.lililiilil(1, true)
      );
      this.lilillllil = new ililliIiIiilliIi(
         IliIlllilIi<"IliIlllilIi","0tiLjL60VbLQRJe2t1W87zbMoD4HT01seC1ZQeqUdTv/VNHo1MlftSGtOLNi">(),
         IliIlllilIi<"IliIlllilIi","iHZ0etWFcOmEYNpWfL4ksYa/5WfzrN4AbJGtWinnly0GqOIuZPguVEBfQS6wt+Qdvbq32vsOuY6De9+pu/GFzUQJzyqDZzPn">(),
         IliIlllilIi<"IliIlllilIi","M5B/V3jYufgGXkOYu6yv68o9GTkOiyEruB4Frh5ylg==">(),
         () -> this.lililiilil(2, false)
      );
      this.iilillllil = new ililliIiIiilliIi(
         IliIlllilIi<"IliIlllilIi","Qv+TUZxeZthJawiytVuCxlugCK4oJnC+pXH3DjWwUhDPr3PIF9vKS+wOD+tKD34D">(),
         IliIlllilIi<"IliIlllilIi","Sfmls1AyzbbIrqXaMz79oX0V5916Ol8i+H3zF8izpeqBS/a+lcWL7IciMj44BzBpvczZq7FBSXrB2+xgbol4Y0fAmO1p15s=">(),
         IliIlllilIi<"IliIlllilIi","M5B/V3jYufgGXkOYu6yv68o9GTkOiyEruB4Frh5ylg==">(),
         () -> this.lililiilil(2, true)
      );
      this.IIiillllil = new IIiiIIIllIiiIIIl(
         IliIlllilIi<"IliIlllilIi","NC4+BqCTPs011ZtM5wF+kTGuAjjTtwgeRGz2hbpCnZJi35SiHG0=">(),
         IliIlllilIi<"IliIlllilIi","nWRAGXUItzaGrL5LaZBiKEZysUXrpErUqZ1bv3+zJjgseCgZboyLR40MhDjeVqC6XD60lPyWv10c46+osBm0WsZc7NIY/gx9M7w7YnTbKYmRjtLBCUPcKeeBK5728lPydbTona2V1F8WI72TEyDJMvEVB8rWQgm9aA3L1UYQ91g8lDjl/wO4JNQscg8z4F7pqJRg4KI=">(),
         IliIlllilIi<"IliIlllilIi","wNNh8odT+cW9smo3qAUQP6uqwP1EGaFrzJovGgW/zmbX">()
      );
      this.lIiillllil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","4Nxw1eY46xmUC9OTLzzrtQ5pgO7l7kLlGAuzCKTa0ln9OkLi9ydqOA==">(),
         IliIlllilIi<"IliIlllilIi","rTmyyKm0WHSBR5D//Pal/DeTSbYl6uHY1EwtaAF5sdY96OPimeHX0L0TtM+lubN69TtbXvOyDwBFIswXmoaF2JqjtUz7xUlbjuVM6Pl8nt3trLUJb7m5h+n32q8lf0VwY/Ev54bowMBW+lNLiyw=">(),
         3,
         1,
         6
      );
      this.iIiillllil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","ih79B/yUBjeqrFtCqfnstsxnu6d4CyzDQXKAQMrmM5UwWdmWRHs=">(),
         IliIlllilIi<"IliIlllilIi","+t1cXC3iXmPpNG84chtyxzn0cZPc2tkkMDg9ohuBos8hfOTTUjNAk+ZzVcC1svgI8r5O/yAmLZ1R5Uk=">(),
         3,
         1,
         5
      );
      this.Iliillllil = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","L/BBoFaBlzhbkrkkB9h8DS3txx0+BjvpCi+0zz1wiESM">(),
         IliIlllilIi<"IliIlllilIi","Nx7ZvNnhZUZW1DVj6CaocLVeJXjGh/Rm4R/qylFa3u/pEpt7CUsBVD4PdY1s2G+8d2fu513T6/dODQZWVMcQxMiwybzX/7VTgAbKRfjfbKtbBrFNBMAMckQQqkP4GKWYY5EtyEQ=">(),
         4.5,
         3.0,
         6.0,
         0.5
      );
      this.lliillllil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","+/bRdaD6UC8Wb6E283h/MZu58Z1ihLyIdNfaK4IQ0nYSHOILPzwFQEoebA==">(),
         IliIlllilIi<"IliIlllilIi","RaO+AQuUFOx0e5on8sv6Fb1UmsEJJ95g9gTaeO+6hS/CTR+ncsNAJNjvhamI5BBwPDDE43DDZOR8W/YdCARvTuAXtwrSgYuRxw0QfrdZyO2f5UmxMsPWHlGSThl6s4MIFWUN9+1cMgw=">(),
         true
      );
      this.iliillllil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","zWF+nBOMmrIFtFHpXqBu3EK1050wH565Sv8z6AmKUfPw4g==">(),
         IliIlllilIi<"IliIlllilIi","2OfNVRiuHdMNW7VMIVarJIJl2DQ4xYG5RccsKMdC2ZWPgQn5Pcqk8+jlSlZcsEvD">(),
         true
      );
      this.Iiiillllil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","UATWTXCKYo73FW2aaN9V+fNCY9/5gI5LoobJ5xSyB0OqDqhoAGmjuw==">(),
         IliIlllilIi<"IliIlllilIi","tyLC23i/76EHOCZZNH84Fm5CtHcWVxR1MLq+JjxF0eOhALNzI2Hq9iWK9Sq4HRC7g7StFKvTgaGc+cjZvorfe2Rhk8raPGHIrOibC2KO0YLhshkvPW6aimrrQukzeYY1/+wShdf0Rohu3Yk7">(),
         true
      );
      this.liiillllil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","w36Wz3WwXijY/8cD/7tdxZvRR2b1L9wUCyY5rkqleu37ovmv">(),
         IliIlllilIi<"IliIlllilIi","ZB5J9ROxPeMGzZZS5XZqFUxejNjYv3Us8r+x3RFyf+ByLmo85BZ8pQDlsHPP4JX8l3lEF9Rgi0703OQ6XQDIQlsQUvRSDbwbiz99SmlFo+N88r2LmvNZq89XKgVUhEgJvBfJCipz5e1UWxk=">(),
         true
      );
      this.iiiillllil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","9NPSelKWArlzuJb0rBu08JSMNSKtALftUQKTda+Gsy8WMkX7zTAogh1pIRejpwA=">(),
         IliIlllilIi<"IliIlllilIi","Rc6VHWTIxUEadB7/0JMxEcAcFz4Q9GdnVbHUQdf/BGqxf1MOztGg71nxUdyos9WJRA/LZ4DyefvDJa+uAauzuZ57BfdSYQUxo/DQrnyNGWUSLzu5Sb30TCUvss4=">(),
         2,
         1,
         10
      );
      this.IIIIilllil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","rCkX0Epkxuj/AWlb5+8cyVn3Bbp+Ds9U4JfUtZhK3gnSuEbQng==">(),
         IliIlllilIi<"IliIlllilIi","UssDNT7dEIYfYvdLrLJPWLre2M5AzVkv0pXWWhOBn2VjWCP444ZzbkyER67OxnoIeMXrcCyUsdX/Xm30tgg+WrFsFMdmENKsttHl+kzRaB4QpXeBeFvLR5JrRDW75RrLg9M/PA==">(),
         true
      );
      this.lIIIilllil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","NTyNWBG6xNruZDEdEWTbEf0bLkbppJIoCUOG/JhF0V17X5MQlw==">(),
         IliIlllilIi<"IliIlllilIi","Kvl03blIKxubgr9aroi5/HsOvD2y5iGq1u02R9QdK6BN5WPtytfOrOreY5akUOW7ntPBkUyKXO+I+cv6o6NinzirNrpPlnuaah5/egE=">(),
         50,
         1,
         1000
      );
      this.iIIIilllil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","PntQGNRZsmwoEwuLYrjn+4cPT1yqkjz/GotzOSDFif0I+4dNkA==">(),
         IliIlllilIi<"IliIlllilIi","2jpQq4Zierz8Qznbi024n0WEWIrFpIQxop/Ro3gY5aBW1A7ephanpGLiqP1f9U+1NdeYqLlkGqzHvHDFKov8J8japwxWCuHx+1M=">(),
         true
      );
      this.IlIIilllil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","O1UifywJSq2GdwZAQZpwQM3MwzuBt4IN87gthOmtuc65okKGDg==">(),
         IliIlllilIi<"IliIlllilIi","lUB5zv/GBpho+K5uZUgkzPm4z0DHo9qGC1mZsrlBfguZrUNjJynfGf/TBvnZVyTIUHUN3n/qQ1eM5fBOhcciRR3Z8ILkrR2/jOuH6rprIJs+SIJwnDvL">(),
         true
      );
      this.llIIilllil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","UIauXzocoO2SKy+ryB6Qh59WXgvMhmei7WdbYdBrXUiap5bVOMWScA==">(),
         IliIlllilIi<"IliIlllilIi","xRkt9n/ktFt6phUE+KkQl+efUYADR+jv5ibA4mWYzw+6ZdIxnp1zeoObArs/wwhl34Ya9WzRpA==">(),
         true
      );
      this.ilIIilllil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","k7ZZFjz5OLJbJPBatvGUW6Cg7+h4+GVVr5To8NBNjJMHhdDcRPpnm8jkDTc=">(),
         IliIlllilIi<"IliIlllilIi","n0oQyJSYjg+91787Oi4l3E9JcHAVYaIdieDAv+CeJnr6P3x6H3yv3TmWFPYNeislCOc/UIPMUbq7RLbpFIVYL9k5yA==">(),
         true
      );
      this.IIlIilllil = new ilIIIIiIiIIIIi();
      this.lIlIilllil = new llilIIIiililIIIi();
      this.lliIilllil = new ArrayList<>();
      this.IIIlilllil = new lllIiiillIii();
      this.iIIlilllil = Long.MIN_VALUE;
      this.IIiillllil.iIlIlllllill(IliIlllilIi<"IliIlllilIi","uc9Lvq/fmi8C9q2wtlLdnjXzTj2IkNL0pRNdtk5HcuV2og==">());
      this.lIiillllil.iIlIlllllill(IliIlllilIi<"IliIlllilIi","uc9Lvq/fmi8C9q2wtlLdnjXzTj2IkNL0pRNdtk5HcuV2og==">());
      this.iIiillllil.iIlIlllllill(IliIlllilIi<"IliIlllilIi","uc9Lvq/fmi8C9q2wtlLdnjXzTj2IkNL0pRNdtk5HcuV2og==">());
      this.Iliillllil.iIlIlllllill(IliIlllilIi<"IliIlllilIi","uc9Lvq/fmi8C9q2wtlLdnjXzTj2IkNL0pRNdtk5HcuV2og==">());
      this.lliillllil.iIlIlllllill(IliIlllilIi<"IliIlllilIi","uc9Lvq/fmi8C9q2wtlLdnjXzTj2IkNL0pRNdtk5HcuV2og==">());
      this.iliillllil.iIlIlllllill(IliIlllilIi<"IliIlllilIi","QhbtZTsPyktVAkj8ZjlJvAAnKdK8wHSs5zTYF1hglzPmsuPy">());
      this.Iiiillllil.iIlIlllllill(IliIlllilIi<"IliIlllilIi","QhbtZTsPyktVAkj8ZjlJvAAnKdK8wHSs5zTYF1hglzPmsuPy">());
      this.liiillllil.iIlIlllllill(IliIlllilIi<"IliIlllilIi","QHPOQe/DPSi79krEMGG6yD4Ec2PNEQK4zqU9SxQh4++bBXa5">());
      this.iiiillllil.iIlIlllllill(IliIlllilIi<"IliIlllilIi","QHPOQe/DPSi79krEMGG6yD4Ec2PNEQK4zqU9SxQh4++bBXa5">());
      this.IIIIilllil.iIlIlllllill(IliIlllilIi<"IliIlllilIi","QHPOQe/DPSi79krEMGG6yD4Ec2PNEQK4zqU9SxQh4++bBXa5">());
      this.lIIIilllil.iIlIlllllill(IliIlllilIi<"IliIlllilIi","QHPOQe/DPSi79krEMGG6yD4Ec2PNEQK4zqU9SxQh4++bBXa5">());
      this.iIIIilllil.iIlIlllllill(IliIlllilIi<"IliIlllilIi","LLvK8NhoZe+zkR5DILPrI1x1m2VHjMTfgLOpezurQGaDf5A=">());
      this.IlIIilllil.iIlIlllllill(IliIlllilIi<"IliIlllilIi","LLvK8NhoZe+zkR5DILPrI1x1m2VHjMTfgLOpezurQGaDf5A=">());
      this.llIIilllil.iIlIlllllill(IliIlllilIi<"IliIlllilIi","LLvK8NhoZe+zkR5DILPrI1x1m2VHjMTfgLOpezurQGaDf5A=">());
      this.ilIIilllil.iIlIlllllill(IliIlllilIi<"IliIlllilIi","LLvK8NhoZe+zkR5DILPrI1x1m2VHjMTfgLOpezurQGaDf5A=">());
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.iIlillllil,
            this.lllillllil,
            this.illillllil,
            this.Iilillllil,
            this.lilillllil,
            this.iilillllil,
            this.IIiillllil,
            this.lIiillllil,
            this.iIiillllil,
            this.Iliillllil,
            this.lliillllil,
            this.iliillllil,
            this.Iiiillllil,
            this.liiillllil,
            this.iiiillllil,
            this.IIIIilllil,
            this.lIIIilllil,
            this.iIIIilllil,
            this.IlIIilllil,
            this.llIIilllil,
            this.ilIIilllil,
            new iiIliIllIIlliIll(IliIlllilIi<"IliIlllilIi","hvcp4U90VfjeJhWk35K49w/2Ur8jjuVhgxwFGRBrfNFwmcydcQNjfa47nA==">(), this.lIiillllil),
            new iiIliIllIIlliIll(IliIlllilIi<"IliIlllilIi","8y5zYtEjUgNEj+E00R9XN8QcnJYS6zIBWmpBWZQMQyAFq4bhPBA1D9A=">(), this.iIiillllil),
            new iiIliIllIIlliIll(IliIlllilIi<"IliIlllilIi","buEW14vhf0Uf/OgMcd/u76iQ00fggBkgDcH/rSBOPipqEoQX">(), this.Iliillllil),
            new iiIliIllIIlliIll(IliIlllilIi<"IliIlllilIi","TVCxuR9bG6hoY788Xm5KbW2+23Q48km6CcNhTM8pcMri/Oy+Kg==">(), this.iliillllil),
            new iiIliIllIIlliIll(IliIlllilIi<"IliIlllilIi","fXPvdZ7faR2/cHU2KZwmvQd3/r2eW1hSiGgFxS/DWIn8ChyK04V8NsDCFQ==">(), this.Iiiillllil),
            new iiIliIllIIlliIll(IliIlllilIi<"IliIlllilIi","DBCEZxuFqQS0U1mRuIU+m0n6RxQWYOUR5fiD3LsnJzFXJHyn98jtNV8oYzBuMw==">(), this.lliillllil),
            new iiIliIllIIlliIll(IliIlllilIi<"IliIlllilIi","4MzBHdw9Bu09rUyoCIqXnQrjLDCSFjSJU4Vtq7QIYc1syYz7hsFN">(), this.liiillllil),
            new iiIliIllIIlliIll(IliIlllilIi<"IliIlllilIi","/5AL6zz4hosYtZDVO9b9uZSImR3RXbBS2gmYEk9eBH4IKG//bviiaeshvkzmxbJCZA0=">(), this.iiiillllil),
            new iiIliIllIIlliIll(IliIlllilIi<"IliIlllilIi","dvRA7RRCanVaP9ua0DXW6a3v1hMn4AHclVhyZDv0pgrE57UrUCP8HA==">(), this.IIIIilllil),
            new iiIliIllIIlliIll(IliIlllilIi<"IliIlllilIi","3AwPeVylDCuhma3B4Ztv/UHQn5KsiXVvVc6qIaLLbu3ChPSoi3sqAA==">(), this.lIIIilllil)
         }
      );
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      this.iIIilIlIil(this.IIIlilllil.IliIlllilIi());
      this.IIIlilllil.liiiIIllIl(true, event.liiiiIIiiiiiiIIi);
   }

   public boolean liIlliiIll() {
      return this.iliIilllil && this.IiiIilllil && this.liiIilllil;
   }

   public boolean IlIllllIll() {
      return this.iliIilllil;
   }

   private void iilllIIill() {
      this.IIlIilllil.lIliIIiliiIliIIili = this.lIiillllil.Iilllilliill();
      this.IIlIilllil.IlliIIilillliIIili = this.iIiillllil.Iilllilliill();
      this.IIlIilllil.iIiiIIiliIliiIIili = this.Iliillllil.Iilllilliill();
      this.IIlIilllil.illiIIiliIiliIIili = this.iliillllil.Iilllilliill();
      this.IIlIilllil.liliIIiliiiliIIili = this.Iiiillllil.Iilllilliill();
      this.IIlIilllil.IIiiIIililIiiIIili = this.lliillllil.Iilllilliill();
      this.IIlIilllil.lliiIIiliiliiIIili = this.liiillllil.Iilllilliill();
      this.IIlIilllil.IiiiIIililiiiIIili = this.iiiillllil.Iilllilliill();
      this.IIlIilllil.iiiiIIiliIIIIlIili = this.IIIIilllil.Iilllilliill();
      this.IIlIilllil.lIIIlIiliiIIIlIili = this.lIIIilllil.Iilllilliill();
      this.IIlIilllil.IlIIlIilillIIlIili = this.IIiillllil.Iilllilliill();
      this.IIlIilllil.ilIIlIiliIiIIlIili = this.iliIilllil;
   }

   @Override
   protected void Illillliilli() {
      if (this.iliIilllil) {
         this.lllllillll();
      } else {
         this.iIiilIliil();
      }

      if (!this.IliIilllil && !this.iliIilllil) {
         Iliiiiilliiiii.IliIlllilIi()
            .iIlIlllllill(
               IliIlllilIi<"IliIlllilIi","po+pa5xoFqNEy9PHOSBwfDOd0Crm/3d3L6toER3jR6GJHr/rdLZvc1fn9Q==">(),
               IliIlllilIi<"IliIlllilIi","KfLS56T7Qx4QKUKARUDkeghsAVq6H24EsNn1okcVz2ubPRpexn8m4kZhsdwQNb2yt+U=">(),
               false
            );
      }

      this.IllIilllil = false;
   }

   private void ilillIiill() {
      Iiiilllliiilll.field_1690.field_1894.method_23481(false);
      illIilIilIil.IliIlllilIi(Iiiilllliiilll.field_1690.field_1867, false);
      illIilIilIil.IliIlllilIi(Iiiilllliiilll.field_1690.field_1832, false);
      Iiiilllliiilll.field_1690.field_1903.method_23481(false);
      Iiiilllliiilll.field_1690.field_1904.method_23481(false);
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         if (!this.iliIilllil || !this.IiiIilllil) {
            this.lIilliIill();
         }
      }
   }

   private void lililiilil(int looking, boolean which) {
      if (Iiiilllliiilll.field_1724 != null) {
         class_2338 var3 = Iiiilllliiilll.field_1724.method_24515();
         if (which) {
            if (!(Iiiilllliiilll.field_1765 instanceof class_3965 var4) || var4.method_17783() != class_240.field_1332) {
               Iliiiiilliiiii.IliIlllilIi()
                  .iIlIlllllill(
                     IliIlllilIi<"IliIlllilIi","po+pa5xoFqNEy9PHOSBwfDOd0Crm/3d3L6toER3jR6GJHr/rdLZvc1fn9Q==">(),
                     IliIlllilIi<"IliIlllilIi","HHXSko9TqVCBtw5Oeol1DaADc2y88odI+BhC1+qhMtgWFhlFMNBCXbirhpF2FsnW4A==">(),
                     false
                  );
               return;
            }

            var3 = var4.method_17777();
         }

         String var6 = var3.method_10263()
            + IliIlllilIi<"IliIlllilIi","zNKkfjPDBQGoWdNvHJHoFj3X3DKjUD4PvfVvCaQ=">()
            + var3.method_10264()
            + IliIlllilIi<"IliIlllilIi","zNKkfjPDBQGoWdNvHJHoFj3X3DKjUD4PvfVvCaQ=">()
            + var3.method_10260();
         if (looking == (-(~1624395272 * -1556147571) * -33 ^ 1650705514)) {
            this.iIlillllil.IIillIiliIil(var6);
         } else {
            this.lllillllil.IIillIiliIil(var6);
         }

         iiiIIIlIIIlIIl.IilliliilIIi();
         if (!this.iliIilllil) {
            this.iIiilIliil();
         }

         if (this.IliIilllil && !this.iliIilllil) {
            Iliiiiilliiiii.IliIlllilIi()
               .iIlIlllllill(
                  IliIlllilIi<"IliIlllilIi","po+pa5xoFqNEy9PHOSBwfDOd0Crm/3d3L6toER3jR6GJHr/rdLZvc1fn9Q==">(),
                  IliIlllilIi<"IliIlllilIi","p39NCR+SWAA6I1MRs5FPz0MIghEJjJTE3QmGBaF5ySLMtr76754=">()
                     + (long)this.IIiillIiil()
                     + IliIlllilIi<"IliIlllilIi","XBh8RijR682+4vMO2V8IOa0w0qUmbTXkeJ6FzxU/bIuliH0=">(),
                  true
               );
         } else {
            Iliiiiilliiiii.IliIlllilIi()
               .iIlIlllllill(
                  IliIlllilIi<"IliIlllilIi","po+pa5xoFqNEy9PHOSBwfDOd0Crm/3d3L6toER3jR6GJHr/rdLZvc1fn9Q==">(),
                  IliIlllilIi<"IliIlllilIi","WwckXgnqX0PO1n8z5roUXUbTwqmTc3HBOtS2BW7QIDzkmIw=">()
                     + looking
                     + IliIlllilIi<"IliIlllilIi","K639c51K+HE4v+DEHu5Pi53W+TfGRQF4DsC0u/VKAsk=">(),
                  true
               );
         }
      }
   }

   private void lllllillll() {
      this.IliIilllil = !this.lliIilllil.isEmpty();
      if (this.IliIilllil) {
         this.IilIilllil = this.lilIilllil = this.iilIilllil = Integer.MAX_VALUE;
         this.IIiIilllil = this.lIiIilllil = this.iIiIilllil = Integer.MIN_VALUE;

         for (class_2338 var2 : this.lliIilllil) {
            this.IilIilllil = Math.min(this.IilIilllil, var2.method_10263());
            this.lilIilllil = Math.min(this.lilIilllil, var2.method_10264());
            this.iilIilllil = Math.min(this.iilIilllil, var2.method_10260());
            this.IIiIilllil = Math.max(this.IIiIilllil, var2.method_10263());
            this.lIiIilllil = Math.max(this.lIiIilllil, var2.method_10264());
            this.iIiIilllil = Math.max(this.iIiIilllil, var2.method_10260());
         }
      }
   }

   private void iIlllIllll(boolean failed) {
      if (this.iliIilllil) {
         this.IiiIilllil = true;
         this.liiIilllil = failed;
      }
   }

   public boolean ilIllIiIll(String source) {
      return this.iliIilllil && this.IiiIilllil && (this.iiiIilllil == null || this.iiiIilllil.equals(source));
   }

   @Override
   protected void Iilililiiili() {
      this.Ilillllill();
      this.ilillIiill();
      if (Iiiilllliiilll.field_1761 != null) {
         Iiiilllliiilll.field_1761.method_2925();
      }
   }

   private void IiIilliIil(IiiIIiilliiIIiil f) {
      if (Iiiilllliiilll.field_1724 != null) {
         if (this.llIlilllil == null) {
            class_2338 var2 = Iiiilllliiilll.field_1724.method_24515();
            class_2350 var3 = Iiiilllliiilll.field_1724.method_5735();
            class_2350 var4 = var3.method_10170();
            ArrayList var5 = new ArrayList();
            class_2338 var6 = var2;

            for (int var7 = 0; var7 < 6; var7++) {
               var5.add(var6 = var6.method_10093(var3));
            }

            for (int var8 = 0; var8 < 4; var8++) {
               var5.add(var6 = var6.method_10093(var4));
            }

            this.llIlilllil = var5;
            this.ilIlilllil = var6;
         }

         f.IlIilillil = true;
         f.Iiiilillil = this.llIlilllil;
         f.liiilillil = this.ilIlilllil;
         f.iiiilillil = true;
      }
   }

   private iIiIlIliIl Iillllilll() {
      if (this.iIlIilllil == null) {
         this.iIlIilllil = new iIiIlIliIl(Iiiilllliiilll, this.IIlIilllil, this.lIlIilllil);
      }

      return this.iIlIilllil;
   }

   public String Illillllil() {
      return this.iIlIilllil == null ? IliIlllilIi<"IliIlllilIi","nUw90Y7NrdDJ8ujor+M/Bp9gxmt+v+1YziplwrKDMfzmJGRC/w==">() : this.iIlIilllil.Iilililiiili();
   }

   public void IIIillIIil(illlllIillll event) {
      this.IIIlilllil.liiiIIllIl(false, event.liiiiIIiiiiiiIIi);
   }

   private double IIiillIiil() {
      return (double)(this.IIiIilllil - this.IilIilllil + 1)
         * (double)(this.lIiIilllil - this.lilIilllil + 1)
         * (double)(this.iIiIilllil - this.iilIilllil + 1);
   }

   public String lIliliIlil() {
      return this.iIlIilllil == null
         ? IliIlllilIi<"IliIlllilIi","ToBV5iI43WZK8oeoS92aGNAU9deyZdLDpYHcaBfmT5m+9auIGUw=">()
         : IliIlllilIi<"IliIlllilIi","UZYXmdpH6FRbGtl2ijSxMB2sk9CXHb3MhAESChOKeLePCQ==">()
            + this.iIlIilllil.IliIlllilIi()
            + IliIlllilIi<"IliIlllilIi","zNKkfjPDBQGoWdNvHJHoFj3X3DKjUD4PvfVvCaQ=">()
            + this.iIlIilllil.IIillIiliIil()
            + (this.iIlIilllil.liiiIIllIl() ? IliIlllilIi<"IliIlllilIi","2vffnygYs1RY+M9ansOVF6T44r9guO9BucEfMUlyqQ==">() + this.iIlIilllil.Illillliilli() : "");
   }

   private void liilliiill(String msg) {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(msg), false);
      }
   }

   public boolean IIllllIlll() {
      return this.IliIlllilIi() && this.iIlIilllil != null && this.iIlIilllil.Ililllililil();
   }

   public static void iiIilIIlil(boolean on) {
      iiIIilllil = on;
   }

   public static void illilIilil(String spec) {
      if (llilIllililIll.iliIiiliiiii(iiliililIIiiilil.class) instanceof iiliililIIiiilil var1 && Iiiilllliiilll.field_1724 != null) {
         String[] var11 = spec.trim().split(IliIlllilIi<"IliIlllilIi","VYpAV6XFkKp5oqym+jBQdthWsDCkeBLUPmiVWVUeWw==">());
         if (var11.length != 6) {
            return;
         }

         class_2338 var3 = Iiiilllliiilll.field_1724.method_24515();
         int[] var4 = new int[]{var3.method_10263(), var3.method_10264(), var3.method_10260(), var3.method_10263(), var3.method_10264(), var3.method_10260()};
         int[] var5 = new int[6];

         for (int var6 = 0; var6 < 6; var6++) {
            String var7 = var11[var6];
            boolean var8 = var7.startsWith(IliIlllilIi<"IliIlllilIi","1V22aEVbsA2NVhPq2ZRNEt9YRq6hnxFIhdou/Pg=">());
            String var9 = var8 ? var7.substring(1) : var7;
            int var10 = var9.isEmpty() ? 0 : Integer.parseInt(var9);
            var5[var6] = var8 ? var4[var6] + var10 : var10;
         }

         var1.iIlillllil
            .IIillIiliIil(
               var5[0]
                  + IliIlllilIi<"IliIlllilIi","zNKkfjPDBQGoWdNvHJHoFj3X3DKjUD4PvfVvCaQ=">()
                  + var5[1]
                  + IliIlllilIi<"IliIlllilIi","zNKkfjPDBQGoWdNvHJHoFj3X3DKjUD4PvfVvCaQ=">()
                  + var5[2]
            );
         var1.lllillllil
            .IIillIiliIil(
               var5[3]
                  + IliIlllilIi<"IliIlllilIi","zNKkfjPDBQGoWdNvHJHoFj3X3DKjUD4PvfVvCaQ=">()
                  + var5[4]
                  + IliIlllilIi<"IliIlllilIi","zNKkfjPDBQGoWdNvHJHoFj3X3DKjUD4PvfVvCaQ=">()
                  + var5[5]
            );
         if (!var1.iliIilllil) {
            var1.iIiilIliil();
         }

         return;
      }
   }
}
