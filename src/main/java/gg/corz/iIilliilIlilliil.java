package gg.corz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_640;
import net.minecraft.class_746;

public final class iIilliilIlilliil {
   private static final int[][] iiIiliilil = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
   static final float liIiliilil = 8.0F;
   private double Iliiliilil;
   private final List<double[]> llliliilil;
   static final long iIIiliilil = 25000L;
   private double lIiiliilil;
   private long iliiliilil;
   private long liiiliilil;
   private double ilIIiiilil;
   public static final double Iiilliilil = 640.0;
   private lliiIIliliiIIl Iililiilil;
   private class_638 lliiliilil;
   private final iliIIlilIiiIIlil lIliliilil = new iliIIlilIiiIIlil();
   private IIIIiIIllIIIiIIl illiliilil;
   private int IiIIiiilil;
   private final liiilllliiiillll IIliliilil;
   private final ConcurrentLinkedQueue<String> Illiliilil;
   static final int llIiliilil = 80;
   private double iIiiliilil;
   private int lIIIiiilil;
   public static final double ililliilil = 320.0;
   public static final double liilliilil = 24.0;
   public static final double llilliilil = 64.0;
   static final int IiIiliilil = 64;
   private iiliIiiIIiiIii iiIIiiilil;
   private long liIIiiilil;
   private long Iiiiliilil;
   public static final double IIIiliilil = 200.0;
   private double llIIiiilil;
   private int iIIIiiilil;
   private String IlIIiiilil;
   static final long lIIiliilil = 10000L;
   private final iiiIIIIlIIIlIIIl iIliliilil = new iiiIIIIlIIIlIIIl();
   private long iiiiliilil;
   private String iililiilil;
   static final long IlIiliilil = 30000L;
   private double IIiiliilil;
   private int IIIIiiilil;
   static final int ilIiliilil = 40;
   public static final double iiilliilil = 6000.0;

   private boolean IiIlliIliiIl(iiliIiiIIiiIii s) {
      double var2 = 576.0;

      for (double[] var5 : this.llliliilil) {
         double var6 = var5[0] - s.IliIlllilIi();
         double var8 = var5[1] - s.iIlIlllllill();
         if (var6 * var6 + var8 * var8 <= var2) {
            return true;
         }
      }

      return false;
   }

   private static lIIIlIIliIIIlIIl Iiiiliiiiiii() {
      return llilIllililIll.iliIiiliiiii(lIIIlIIliIIIlIIl.class) instanceof lIIIlIIliIIIlIIl var1 ? var1 : null;
   }

   private void Iilllilliill(class_310 s, iiliIiiIIiiIii mc) {
      long var5 = -1501975570383099875L;
      String var3 = lilIIiiliilIIiil.iIlIlllllill(mc.IliIlllilIi(), mc.liiiIIllIl(), mc.iIlIlllllill());
      if (this.illiliilil == IIIIiIIllIIIiIIl.lIllIIilIl) {
         var5 ^= ((long)IIiilIiiiIii(s, mc.IliIlllilIi(), mc.iIlIlllllill()) << 32 ^ var5) & -1L << 32;
         this.IIIllIIliIIl(
            iiIIlIIlIl<"iiIIlIIlIl","cumxmYX0doGS4p4aP3hY2G1cVRbpSOQEcXmer3kQd3Kd8h/3KkGcdjYk">()
               + mc.IilliliilIIi()
               + iiIIlIIlIl<"iiIIlIIlIl","d+dkl52TrUeGlhWKJHs7tk5KTQMaYHnMbzZI4B3JH1kf9w==">()
               + var3
               + (
                  (int)(var5 >>> 32) != 0
                     ? iiIIlIIlIl<"iiIIlIIlIl","GdtdXkHI1C94A9WTUTSoErYe3olf50obF1dIqDA4x381pU62eld1FQ8OZUNCsjU=">()
                     : iiIIlIIlIl<"iiIIlIIlIl","f5j22Qm01armFih3WasHk/xFxUFa6rYhCU5UWKV3iAddEEkO+nbt0w7gL3wagNmHz8zwosCmXMgARPf2XOgjAmZIG7qo+LHUV/lAfILreADeMlWBIG7fry0MCzI8+o0TEN/wXPlCSQuebPsHTT/2s79FWEwVCPQnheXdRsieStawTF8ZmtTv">()
               )
         );
      } else {
         this.IIIllIIliIIl(
            iiIIlIIlIl<"iiIIlIIlIl","cumxmYX0doGS4p4aP3hY2G1cVRbpSOQEcXmer3kQd3Kd8h/3KkGcdjYk">()
               + mc.IilliliilIIi()
               + iiIIlIIlIl<"iiIIlIIlIl","d+dkl52TrUeGlhWKJHs7tk5KTQMaYHnMbzZI4B3JH1kf9w==">()
               + var3
               + iiIIlIIlIl<"iiIIlIIlIl","kNkNDjVM0XBOL3WfDi9PUw6Y1VBpUYz9doDxzkQr++u7Le5RFWGPTe03anokxKm9">()
         );
      }
   }

   private static Set<String> IlIillIiilIi(class_310 mc) {
      HashSet var1 = new HashSet();
      if (mc.method_1562() == null) {
         return var1;
      } else {
         for (class_640 var3 : mc.method_1562().method_2880()) {
            var1.add(var3.method_2966().name().toLowerCase(Locale.ROOT));
         }

         return var1;
      }
   }

   public void IilliliilIIi(String line) {
      if (this.illiliilil == IIIIiIIllIIIiIIl.IIllIIilIl
         && line != null
         && this.Illiliilil.size() < ((-868002305 * -95 * -1057222719 << 7 | -868002305 * -95 * -1057222719 >>> 25) ^ -1816703052)) {
         this.Illiliilil.offer(line);
      }
   }

   private boolean Illillliilli(class_310 mc) {
      int[] var2 = iiIiliilil[this.IiIIiiilil % 4];
      long var3 = this.liIIiiilil * (long)(this.IiIIiiilil / 2 + 1);
      return IIiilIiiiIii(
         mc,
         this.llIIiiilil + (double)var2[0] * ((double)var3 + Double.longBitsToDouble(-5778417967811507081L ^ -1190745283334747017L)),
         this.ilIIiiilil + (double)var2[1] * ((double)var3 + Double.longBitsToDouble(-7198576717182059747L ^ -2544827781922473187L))
      );
   }

   private void IIIllIIliIIl(String why) {
      this.illiliilil = IIIIiIIllIIIiIIl.iiIlIIilIl;
      this.Iililiilil = lliiIIliliiIIl.IIlliiiIllIlliiiIl;
      this.iililiilil = "";
      this.iiIIiiilil = null;
      this.IIliliilil.IIIllIIliIIl(why);
   }

   public boolean liiiIIllIl() {
      return this.illiliilil != IIIIiIIllIIIiIIl.iiIlIIilIl
         && this.Iililiilil != lliiIIliliiIIl.IIlliiiIllIlliiiIl
         && this.Iililiilil != lliiIIliliiIIl.iiiIiiiIlIIIliiiIl;
   }

   private void IIlilIliiIli(class_310 p, class_746 mc) {
      lIIIlIIliIIIlIIl var3 = Iiiiliiiiiii();
      if (var3 != null && var3.IliIlllilIi()) {
         int[] var4 = iiIiliilil[this.IiIIiiilil % 4];
         long var5 = this.liIIiiilil * (long)(this.IiIIiiilil / 2 + 1);
         double var7 = (mc.method_23317() - this.llIIiiilil) * (double)var4[0] + (mc.method_23321() - this.ilIIiiilil) * (double)var4[1];
         this.iililiilil = iiIIlIIlIl<"iiIIlIIlIl","1UhXabtW4ZrfX1+GT7Zudf8nFYfrMN/O5HgpF5RdNDSHInnze/34">()
            + (this.IiIIiiilil + 1)
            + iiIIlIIlIl<"iiIIlIIlIl","35qADL8J2NhY3M9fhH8ipYf9Hzz4ITZnp+OXd6w+pyU=">()
            + lilIIiiliilIIiil.IliIlllilIi(Math.max(0.0, (double)var5 - var7))
            + iiIIlIIlIl<"iiIIlIIlIl","WSL1MfkJ4V+MSZVTpBOQ33E15sRa4XQi9P3ezCHxY3OmwHyH">();
         if (!(var7 < (double)var5)) {
            if (this.iIIIiiilil + 1 >= 40) {
               double var17 = Math.toRadians((double)mc.method_36454());
               IIiilIiiiIii(p, mc.method_23317() - Math.sin(var17) * 200.0, mc.method_23321() + Math.cos(var17) * 200.0);
               this.IIIllIIliIIl(
                  iiIIlIIlIl<"iiIIlIIlIl","6pDmcd/id2ajLvBbk5eovHrSDqTwRs+7XV6WHGpMk5nCM3nHhGQiDA+nR12ydR+7VYKCYds0rt2nMUcR5SshZZJJt17otOpIUKOKh9/+1Q==">()
               );
            } else {
               double var9 = this.llIIiiilil + (double)((long)var4[0] * var5);
               double var11 = this.ilIIiiilil + (double)((long)var4[1] * var5);
               int var13 = this.IiIIiiilil + 1;
               int[] var14 = iiIiliilil[var13 % 4];
               long var15 = this.liIIiiilil * (long)(var13 / 2 + 1);
               if (!var3.lllllillll(
                  (int)Math.round(var9 + (double)var14[0] * ((double)var15 + 6000.0)), (int)Math.round(var11 + (double)var14[1] * ((double)var15 + 6000.0))
               )) {
                  this.iililiilil = iiIIlIIlIl<"iiIIlIIlIl","BpKkz2QeZWaORz0gzoj4MjV+40hf7vjy3YfnnzMZr/UgOk5edx2dAQ==">();
               } else {
                  this.llIIiiilil = var9;
                  this.ilIIiiilil = var11;
                  this.IiIIiiilil = var13;
                  this.iIIIiiilil++;
               }
            }
         }
      } else {
         this.illiliilil = IIIIiIIllIIIiIIl.iiIlIIilIl;
         this.IIIllIIliIIl(
            iiIIlIIlIl<"iiIIlIIlIl","OQeIKlQHa/P3H1vIOY8aDXNfpqQ4qqZmTgHqkP1J65bKxIhRASYl2aiw4LQ90GJn2EYmTkxKN6zmsHuKy21Jc2rYJ4t0wiyRl8Z6ywk=">()
         );
      }
   }

   public iIilliilIlilliil(liiilllliiiillll host) {
      this.Illiliilil = new ConcurrentLinkedQueue<>();
      this.llliliilil = new ArrayList<>();
      this.illiliilil = IIIIiIIllIIIiIIl.iiIlIIilIl;
      this.Iililiilil = lliiIIliliiIIl.iiiIiiiIlIIIliiiIl;
      this.iililiilil = "";
      this.IlIIiiilil = iiIIlIIlIl<"iiIIlIIlIl","SoeV7cb4VpAbU5gDVnEuzV8I8Ih9OMNs2RUU8LSOnjk=">();
      this.IIliliilil = host;
   }

   private iiliIiiIIiiIii Illlllllilll(class_746 p) {
      iiliIiiIIiiIii var2 = null;
      int var3 = this.IIliliilil.liiiIIllIl();
      double var4 = this.illiliilil == IIIIiIIllIIIiIIl.lIllIIilIl ? 640.0 : 320.0;

      for (iiliIiiIIiiIii var7 : this.IIliliilil.IliIlllilIi().iIlIlllllill()) {
         if (!var7.lIlllIiIIl
            && var7.lIiiIiIlilli() >= var3
            && !(var7.IIlilIliiIli(p.method_23317(), p.method_23321()) > var4 * var4)
            && !this.IiIlliIliiIl(var7)
            && (var2 == null || var7.IilliliilIIi() > var2.IilliliilIIi())) {
            var2 = var7;
         }
      }

      return var2;
   }

   public IIIIiIIllIIIiIIl IliIlllilIi() {
      return this.illiliilil;
   }

   private static boolean IiIiliIiiiIi(class_310 self, class_746 mc) {
      for (class_1657 var3 : self.field_1687.method_18456()) {
         if (var3 != mc && !var3.method_7325() && !iIIiIiIlIlIiIiIl.liiiIIllIl(var3) && var3.method_5858(mc) <= 576.0) {
            return true;
         }
      }

      return false;
   }

   public String iIlIlllllill() {
      return this.iililiilil;
   }

   private void Iiilliiliiil(class_310 now, class_746 mc, long p) {
      if (now.method_1562() != null) {
         String var5 = this.iIliliilil.IilliliilIIi(this.IIliliilil.IilliliilIIi());
         if (!iiiIIIIlIIIlIIIl.liiiIIllIl(var5)) {
            var5 = iiIIlIIlIl<"iiIIlIIlIl","SoeV7cb4VpAbU5gDVnEuzV8I8Ih9OMNs2RUU8LSOnjk=">();
         }

         this.IlIIiiilil = var5;
         now.method_1562().method_45730(iiIIlIIlIl<"iiIIlIIlIl","z8mo60nEwS383xSzSlIhd4TsfCJvrn0fDMZ7Ptfcxbk=">() + var5);
         this.lIliliilil.IlIlllIlilIl(p);
         this.iliiliilil = p;
         this.IIiiliilil = mc.method_23317();
         this.lIiiliilil = mc.method_23321();
         this.lliiliilil = now.field_1687;
         this.liiiliilil = p + (-1328361449969117077L ^ -1328361449969095333L);
         this.Iililiilil = lliiIIliliiIIl.IlIliiiIlllIliiiIl;
         this.iililiilil = iiIIlIIlIl<"iiIIlIIlIl","U7ypvn2NrNwfPzAmfyob4a2U95iJdjq2LN64gisugbNvZuypBxUUG8T7Yq9wBg==">()
            + var5
            + iiIIlIIlIl<"iiIIlIIlIl","32AkAagBNLLPIEu3fQ3lMyV/Lh97UaCzcAEDS6I=">();
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void IIIilIIiiIIi(class_310 mc, long now) {
      Set var4 = null;

      String var5;
      while ((var5 = this.Illiliilil.poll()) != null) {
         if (var4 == null) {
            var4 = IlIillIiilIi(mc);
         }

         Set var6 = var4;
         IllIIIIllllIIIIl var7 = iiilIllIIIiIll.IliIlllilIi(
            var5, this.iliiliilil > 0L ? now - this.iliiliilil : -1L, names -> var6.contains(names.toLowerCase(Locale.ROOT))
         );
         switch (<unrepresentable>.llllIlIiil[var7.liiiIIllIl().ordinal()]) {
            case 1:
               this.lIliliilil.IiIlliIliiIl(now);
               break;
            case 2:
               if (this.lIliliilil.liiiIIllIl()) {
                  this.lIliliilil.Illlllllilll(now, var7.iIlIlllllill());
                  if (this.Iililiilil == lliiIIliliiIIl.IlIliiiIlllIliiiIl) {
                     this.Iililiilil = lliiIIliliiIIl.lIIliiiIliIIliiiIl;
                  }
               }
               break;
            case 3:
               if (this.lIliliilil.liiiIIllIl()) {
                  this.lIliliilil.Iilllilliill(now);
                  if (this.Iililiilil == lliiIIliliiIIl.IlIliiiIlllIliiiIl) {
                     this.Iililiilil = lliiIIliliiIIl.lIIliiiIliIIliiiIl;
                  }
               }
               break;
            case 4:
               if (this.lIliliilil.liiiIIllIl() && now - this.iliiliilil < 2000L) {
                  this.lIliliilil.IIillIiliIil(now);
                  if (this.Iililiilil == lliiIIliliiIIl.IlIliiiIlllIliiiIl) {
                     this.Iililiilil = lliiIIliliiIIl.lIIliiiIliIIliiiIl;
                  }
               }
               break;
            case 5:
               if (this.lIliliilil.liiiIIllIl()) {
                  this.iliIiiliiiii(iiIIlIIlIl<"iiIIlIIlIl","XXKUfWUjFXac31cAIqcxtq1yIGt8QgnIPvsbP5ptbiU8FE4/9a3sPCvUxSvAzhWJi/JuTu8+5c+60kX/g8Ifi9nk">());
                  return;
               }
               break;
            case 6:
               if (this.lIliliilil.liiiIIllIl()) {
                  this.lIliliilil.Ililllililil(now);
                  if (this.Iililiilil == lliiIIliliiIIl.IlIliiiIlllIliiiIl) {
                     this.Iililiilil = lliiIIliliiIIl.lIIliiiIliIIliiiIl;
                  }
               }
         }
      }
   }

   private void IlIlllIlilIl(iiliIiiIIiiIii s) {
      if (!this.IiIlliIliiIl(s)) {
         this.llliliilil.add(new double[]{s.IliIlllilIi(), s.iIlIlllllill()});
      }
   }

   public void lIiiIiIlilli(IIIIiIIllIIIiIIl now, class_310 radiusChunks, int mc, long m) {
      boolean var6 = this.illiliilil == IIIIiIIllIIIiIIl.lIllIIilIl;
      this.iliIiiliiiii(null);
      if (var6 && now != IIIIiIIllIIIiIIl.lIllIIilIl) {
         Iilililiiili(radiusChunks);
      }

      if (now != IIIIiIIllIIIiIIl.iiIlIIilIl && radiusChunks.field_1724 != null && radiusChunks.field_1687 != null) {
         this.illiliilil = now;
         this.lIIIiiilil = 0;
         this.iIIIiiilil = 0;
         this.iiIIiiilil = null;
         this.llliliilil.clear();

         for (iiliIiiIIiiIii var8 : this.IIliliilil.IliIlllilIi().iIlIlllllill()) {
            this.IlIlllIlilIl(var8);
         }

         this.lIliliilil.IliIlllilIi();
         this.iIliliilil.IliIlllilIi();
         this.Illiliilil.clear();
         if (now == IIIIiIIllIIIiIIl.IIllIIilIl) {
            if (radiusChunks.field_1687.method_27983() != class_1937.field_25179) {
               this.IIIllIIliIIl(iiIIlIIlIl<"iiIIlIIlIl","9PxZCfbwhdis/QZ0HxmLuaEH50i0DxbFGoayVnw8nQcN5G5Nn26sZClPbT0ilHOa4ARgCaaeQcOfv1OZgqbifiL2">());
               return;
            }

            this.Iililiilil = lliiIIliliiIIl.lIIliiiIliIIliiiIl;
            this.IIliliilil
               .IIIllIIliIIl(
                  iiIIlIIlIl<"iiIIlIIlIl","utSFmhPcj5E1kT9h/NdJTE+GL2koe8oTbkXf4pDAwccXv/QLRoX9SEv//aXg4+kkp0+hHiKU3QTzitkM+I46FFF7MvOc1a3cUUejiuRmEytwZQJDwYo5hb0kjZZPZVpdjQAgii2/xHUl">()
               );
         } else {
            if (Iiiiliiiiiii() == null) {
               this.IIIllIIliIIl(iiIIlIIlIl<"iiIIlIIlIl","iFT4NRDF2jkVFjgf0AxDLKd7SOsfAndU3Ui4tTPiZcHRL6frBheJhCN685IwAiuaCAHtfz5BmT7iaRn5+owfzzFtdu7gV0qG">());
               return;
            }

            this.liIIiiilil = Math.max(160L, 2L * (long)mc * 16L - 32L);
            this.llIIiiilil = radiusChunks.field_1724.method_23317();
            this.ilIIiiilil = radiusChunks.field_1724.method_23321();
            this.IiIIiiilil = 0;
            this.Iililiilil = lliiIIliliiIIl.liIliiiIliiIliiiIl;
            this.IIliliilil
               .IIIllIIliIIl(
                  iiIIlIIlIl<"iiIIlIIlIl","zrLGnlzrFTgs7aHtMgThFV7qEOm6vEPLrh+zozJAgwTPO58b59xJcNpk+r+vtr288xQO8mopNY7Snu5pUnMAL2F4q/StPYxJ/Wfd">()
                     + this.liIIiiilil
                     + iiIIlIIlIl<"iiIIlIIlIl","mRRd8ukLn2K7pkYD0w/k+9xEcjkwrvoSwEjBBZ1glR0JzFF7">()
               );
            if (!this.Illillliilli(radiusChunks)) {
               this.IIIllIIliIIl(
                  iiIIlIIlIl<"iiIIlIIlIl","69xzgeOVOL4VmnBg6HLvC/mKtsZmgiWFq8LTUX1p9MPSChfePx4mhDnXUEWYQeaV9v1e+aM92zqfNqhIyuvGrNWrvK1dpCjVKxuBuxNGKXf2pHmVHaapEtsHd6IvgKmP56YYejZolfhYwQ==">()
               );
            }
         }
      }
   }

   public static boolean IIiilIiiiIii(class_310 x, double z, double mc) {
      lIIIlIIliIIIlIIl var5 = Iiiiliiiiiii();
      if (var5 != null && x.field_1724 != null) {
         int var6 = (int)Math.round(z);
         int var7 = (int)Math.round(mc);
         if (var5.IliIlllilIi() && var5.lllllillll(var6, var7)) {
            var5.IlIllllIll(true);
            return true;
         } else {
            IIiiIIIllIiiIIIl var8 = null;

            for (IilliIllilliIl var10 : var5.IiIlliIliiIl()) {
               if (var10 instanceof IIiiIIIllIiiIIIl) {
                  IIiiIIIllIiiIIIl var11 = (IIiiIIIllIiiIIIl)var10;
                  if (iiIIlIIlIl<"iiIIlIIlIl","nTsSYuyDRc+pOtBLQZf7VfUOz5mX0+bl3rb0awohrv5dx+GBV0UK">().equals(var10.IliIlllilIi())) {
                     var8 = var11;
                  }
               }
            }

            if (var8 == null) {
               return false;
            } else {
               IIiiIIIllIiiIIIl var12 = var8;
               Iliilliiilii(() -> {
                  if (var5.IliIlllilIi()) {
                     var5.IIillIiliIil(false);
                  }

                  String var4 = var12.Iilllilliill();
                  var12.IIillIiliIil(var6 + iiIIlIIlIl<"iiIIlIIlIl","FQZq0E8mnaAUxuLbkW43HdLjBC9obwD4Pm20Kbw=">() + var7);

                  try {
                     var5.IIillIiliIil(true);
                     var5.IlIllllIll(true);
                  } finally {
                     var12.IIillIiliIil(var4);
                  }
               });
               return var5.IliIlllilIi() && !var5.IIllllIlll();
            }
         }
      } else {
         return false;
      }
   }

   private static String IIIIllIIIl(long ms) {
      return (ms + (8485667420105192968L ^ 8485667420105192943L)) / (-6292160433269239163L ^ -6292160433269239443L)
         + iiIIlIIlIl<"iiIIlIIlIl","edLmiuT9ciiXUIO5g1hb6Gxy0QchpWU+QsLwl9g=">();
   }

   private boolean Ililllililil() {
      for (iiliIiiIIiiIii var2 : this.IIliliilil.IliIlllilIi().iIlIlllllill()) {
         if (var2.lIlllIiIIl && !(var2.IIlilIliiIli(this.iIiiliilil, this.Iliiliilil) > 102400.0)) {
            for (IiIlililliIlilil var4 : var2.IIIilIIiiIIi()) {
               if (var4.IiIiIlIlil.iIlIIIIIiIllIIIIIi) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private static void Iliilliiilii(Runnable r) {
      AutoCloseable var1 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl();

      try {
         r.run();
      } finally {
         try {
            var1.close();
         } catch (Exception var8) {
         }
      }
   }

   private static void Iilililiiili(class_310 mc) {
      long var6 = -7318183047023204507L;
      lIIIlIIliIIIlIIl var1 = Iiiiliiiiiii();
      if (var1 != null && var1.IliIlllilIi() && mc.field_1724 != null) {
         if (!mc.field_1724.method_6128()) {
            Iliilliiilii(() -> var1.IIillIiliIil(false));
         } else {
            var1.IlIllllIll(true);
            var1.ilIllIiIll();
            if (!var1.iIlllIllll()) {
               double var2 = Math.toRadians((double)mc.field_1724.method_36454());
               var6 ^= (
                     (long)(
                              (int)Math.round(
                                 mc.field_1724.method_23317() - Math.sin(var2) * Double.longBitsToDouble(4517438867483571923L ^ 9140102410002675411L)
                              )
                           )
                           << 32
                        ^ var6
                  )
                  & -1L << 32;
               var6 ^= (
                     (long)(
                           (int)Math.round(mc.field_1724.method_23321() + Math.cos(var2) * Double.longBitsToDouble(4929669485219721004L ^ 288428594237714220L))
                        )
                        ^ var6
                  )
                  & -1L >>> 32;
               if (!var1.lllllillll((int)(var6 >>> 32), (int)var6)) {
                  IIiilIiiiIii(mc, (double)((int)(var6 >>> 32)), (double)((int)var6));
               }
            }
         }
      }
   }

   public void iliIiiliiiii(String why) {
      long var4 = 3577943705991206884L;
      var4 ^= ((long)(this.illiliilil != IIIIiIIllIIIiIIl.iiIlIIilIl ? 1 : 0) << 32 ^ var4) & -1L << 32;
      IIIIiIIllIIIiIIl var3 = this.illiliilil;
      this.illiliilil = IIIIiIIllIIIiIIl.iiIlIIilIl;
      this.Iililiilil = lliiIIliliiIIl.iiiIiiiIlIIIliiiIl;
      this.iililiilil = "";
      this.iiIIiiilil = null;
      this.Illiliilil.clear();
      this.lliiliilil = null;
      this.liiiliilil = 0L;
      this.IIiiliilil = 0.0;
      this.lIiiliilil = 0.0;
      if (var3 == IIIIiIIllIIIiIIl.lIllIIilIl && why != null) {
         Iilililiiili(class_310.method_1551());
      }

      if ((int)(var4 >>> 32) != 0 && why != null) {
         this.IIliliilil.IIIllIIliIIl(why);
      }
   }

   private void IIillIiliIil(class_310 p, class_746 mc, long now) {
      this.IIIilIIiiIIi(p, now);
      if (this.illiliilil != IIIIiIIllIIIiIIl.iiIlIIilIl && this.Iililiilil != lliiIIliliiIIl.IIlliiiIllIlliiiIl) {
         if (this.Iililiilil != lliiIIliliiIIl.ilIliiiIlIiIliiiIl && this.lliiliilil != null && now <= this.liiiliilil) {
            boolean var5 = p.field_1687 != this.lliiliilil;
            double var6 = mc.method_23317() - this.IIiiliilil;
            double var8 = mc.method_23321() - this.lIiiliilil;
            if (var5 || var6 * var6 + var8 * var8 > 4096.0) {
               this.liiiliilil = 0L;
               if (this.iiIIiiilil != null) {
                  iiliIiiIIiiIii var20 = this.iiIIiiilil;
                  this.IIIllIIliIIl(
                     iiIIlIIlIl<"iiIIlIIlIl","cumxmYX0doGS4p4aP3hY2G1cVRbpSOQEcXmer3kQd3Kd8h/3KkGcdjYk">()
                        + var20.IilliliilIIi()
                        + iiIIlIIlIl<"iiIIlIIlIl","d+dkl52TrUeGlhWKJHs7tk5KTQMaYHnMbzZI4B3JH1kf9w==">()
                        + lilIIiiliilIIiil.iIlIlllllill(var20.IliIlllilIi(), var20.liiiIIllIl(), var20.iIlIlllllill())
                        + iiIIlIIlIl<"iiIIlIIlIl","NoXVwD6HdKXl8urbWA0LH1V9PxGixWmwe6UD6tZN413sFYCSVHZEiz5PTzeSIwWXW0429m66uYUBRwM/O5lffmdejpoKagNN/pBEGnowXqlTp255UPESqM8=">()
                  );
                  return;
               }

               this.lIliliilil.Iiilliiliiil(now);
               this.iIliliilil.iliIiiliiiii(this.IlIIiiilil);
               this.Iiiiliilil = now;
               this.iIiiliilil = mc.method_23317();
               this.Iliiliilil = mc.method_23321();
               this.IIIIiiilil = this.IIliliilil.lIiiIiIlilli();
               this.iiiiliilil = 0L;
               this.lIIIiiilil++;
               this.Iililiilil = lliiIIliliiIIl.ilIliiiIlIiIliiiIl;
            }
         }

         if (this.iiIIiiilil != null && this.Iililiilil != lliiIIliliiIIl.IlIliiiIlllIliiiIl) {
            iiliIiiIIiiIii var18 = this.iiIIiiilil;
            this.iiIIiiilil = null;
            this.Iilllilliill(p, var18);
         } else {
            switch (this.Iililiilil) {
               case liIliiiIliiIliiiIl:
                  lIIIlIIliIIIlIIl var17 = Iiiiliiiiiii();
                  if (var17 != null && var17.IliIlllilIi()) {
                     this.iililiilil = iiIIlIIlIl<"iiIIlIIlIl","4CtKnCGuia17M71tGAZ6PCvSbJcGoFw4BdsAXvYIOGNnDpCrydYe6bMeey/icMzQNDK/E1COeivhGguM5C1b2A==">();
                  } else if (this.lIliliilil.iIlIlllllill(now)) {
                     this.Iiilliiliiil(p, mc, now);
                  } else {
                     this.iililiilil = iiIIlIIlIl<"iiIIlIIlIl","nfEpchk6Fwfy80GuvYsT72S8wWCyaaQDL8d5WuCXbUah/3dxn7nZyaM=">()
                        + IIIIllIIIl(this.lIliliilil.IIIllIIliIIl(now));
                  }
                  break;
               case lIIliiiIliIIliiiIl:
                  if (this.lIliliilil.IIlllIlliIll(now)) {
                     this.iIliliilil.lIiiIiIlilli(this.IlIIiiilil);
                     if (this.lIliliilil.IIIilIIiiIIi(now)) {
                        this.iliIiiliiiii(
                           iiIIlIIlIl<"iiIIlIIlIl","FyPhmAF11ikvV/P1bhOLY523YQLdyrbBAv9BoDqOn3InLdTxWiVa7QqUjaZHFuX3/L9ABizOtJ5JzvWgpij9adbtChp1vA==">()
                        );
                        return;
                     }

                     this.Iililiilil = lliiIIliliiIIl.lIIliiiIliIIliiiIl;
                  } else {
                     this.iililiilil = iiIIlIIlIl<"iiIIlIIlIl","U7ypvn2NrNwfPzAmfyob4a2U95iJdjq2LN64gisugbNvZuypBxUUG8T7Yq9wBg==">()
                        + this.IlIIiiilil
                        + iiIIlIIlIl<"iiIIlIIlIl","32AkAagBNLLPIEu3fQ3lMyV/Lh97UaCzcAEDS6I=">();
                  }
                  break;
               case ilIliiiIlIiIliiiIl:
                  long var16 = now - this.Iiiiliilil;
                  int var7 = this.IIliliilil.lIiiIiIlilli() - this.IIIIiiilil;
                  this.iililiilil = iiIIlIIlIl<"iiIIlIIlIl","n2w/N0hTkG79dsF+dDgPypZgX1cRPQh6LcKZxUbL5+6SPbx+gJ4HJ9ih">()
                     + this.lIIIiiilil
                     + iiIIlIIlIl<"iiIIlIIlIl","35qADL8J2NhY3M9fhH8ipYf9Hzz4ITZnp+OXd6w+pyU=">()
                     + var7
                     + iiIIlIIlIl<"iiIIlIIlIl","M/s4HIZgJMfYFO2gWWitKQ4b6fu2gGPVIh8ewl4W5YfRIaE=">();
                  boolean var19 = IiIiliIiiiIi(p, mc);
                  if (this.iiiiliilil == 0L && var16 >= 10000L && var7 >= 80) {
                     this.iiiiliilil = now;
                  }

                  boolean var9 = this.iiiiliilil != 0L && this.IIliliilil.iliIiiliiiii(this.iiiiliilil) && !this.Ililllililil();
                  if (var19 || var16 >= 25000L || var9) {
                     for (iiliIiiIIiiIii var11 : this.IIliliilil.IliIlllilIi().iIlIlllllill()) {
                        double var12 = var11.IliIlllilIi() - this.iIiiliilil;
                        double var14 = var11.iIlIlllllill() - this.Iliiliilil;
                        if (var12 * var12 + var14 * var14 <= 102400.0) {
                           this.IlIlllIlilIl(var11);
                        }
                     }

                     if (var19) {
                        this.IIliliilil.IIIllIIliIIl(iiIIlIIlIl<"iiIIlIIlIl","hRtthhrYlMpyeAu9QfHowpx1nqoV5DMyo+/0kYCLeJrD6yQXQtHvQvsuulAq63vbflVylJW1X6aA">());
                     }

                     this.Iililiilil = lliiIIliliiIIl.lIIliiiIliIIliiiIl;
                  }
            }
         }
      }
   }

   public void IIlllIlliIll(class_310 now, long mc) {
      if (this.illiliilil != IIIIiIIllIIIiIIl.iiIlIIilIl
         && this.Iililiilil != lliiIIliliiIIl.IIlliiiIllIlliiiIl
         && now.field_1724 != null
         && now.field_1687 != null) {
         class_746 var4 = now.field_1724;
         if (var4.method_6032() > 0.0F && var4.method_6032() < 8.0F) {
            this.iliIiiliiiii(iiIIlIIlIl<"iiIIlIIlIl","TCruuINfwJPqou5nEyQ3lKVpLlGXxEQCM6Gg1XPS01p2tAIExDSgS5Wj2ee/nozLceLgxYM=">());
         } else {
            iiliIiiIIiiIii var5 = this.Illlllllilll(var4);
            if (var5 != null && this.IIliliilil.iIlIlllllill()) {
               if (this.illiliilil != IIIIiIIllIIIiIIl.IIllIIilIl || this.Iililiilil != lliiIIliliiIIl.IlIliiiIlllIliiiIl || !this.lIliliilil.liiiIIllIl()) {
                  this.Iilllilliill(now, var5);
                  return;
               }

               this.iiIIiiilil = var5;
            }

            if (this.illiliilil == IIIIiIIllIIIiIIl.IIllIIilIl) {
               this.IIillIiliIil(now, var4, mc);
            } else {
               this.IIlilIliiIli(now, var4);
            }
         }
      }
   }
}
