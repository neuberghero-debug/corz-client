package gg.corz;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

final class iiIillilIIlillil {
   final float llIIlIIlil;
   final String iiIIlIIlil;
   final String[] IIiiIIIlil;
   final float liiiIIIlil;
   final String lIlIlIIlil;
   final String ilIIlIIlil;
   final String IiIIlIIlil;
   final float iiiiIIIlil;
   final String[] iIiiIIIlil;
   final llililIlilililIl illiIIIlil;
   final String IllIlIIlil;
   final long liliIIIlil;
   final llililIlilililIl llliIIIlil;
   final long[] IiiiIIIlil;
   final String[] iliiIIIlil;
   final String iIlIlIIlil;
   final String liIIlIIlil;
   final llIIIIlilIIIIl IiliIIIlil;
   final float iIIIlIIlil;
   final int iiliIIIlil;
   final String[] IliiIIIlil;
   final float IIIIlIIlil;
   final float IlIIlIIlil;
   final String lllIlIIlil;
   final float lIIIlIIlil;
   final String[] lliiIIIlil;
   final String IIlIlIIlil;
   final String[] lIiiIIIlil;

   String IliIlllilIi(int secs, long i) {
      if (this.IiiiIIIlil[secs] != i || this.iliiIIIlil[secs] == null) {
         this.IiiiIIIlil[secs] = i;
         this.iliiIIIlil[secs] = iIIiIiilIlIiIiil.iIlIlllllill(i);
      }

      return this.iliiIIIlil[secs];
   }

   iiIillilIIlillil(llililIlilililIl sec, llililIlilililIl scan, llIIIIlilIIIIl nowMs, long raw, long rules) {
      long var18 = -1621513353287671581L;
      super();
      this.llliIIIlil = sec;
      this.illiIIIlil = scan;
      this.IiliIIIlil = nowMs;
      this.liliIIIlil = raw;
      List var8 = scan.iIlIlllllill();
      this.iiliIIIlil = var8.size();
      this.IIiiIIIlil = new String[this.iiliIIIlil];
      this.lIiiIIIlil = new String[this.iiliIIIlil];
      this.iIiiIIIlil = new String[this.iiliIIIlil];
      this.IliiIIIlil = new String[this.iiliIIIlil];
      this.lliiIIIlil = new String[this.iiliIIIlil];
      this.iliiIIIlil = new String[this.iiliIIIlil];
      this.IiiiIIIlil = new long[this.iiliIIIlil];
      Arrays.fill(this.IiiiIIIlil, -1L);
      float var9 = 0.82F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      float var13 = 0.0F;
      float var14 = 0.0F;
      float var15 = Math.max(
         lIlIIIliIlIIIl.IIlllIlliIll(liiiIIllIl<"liiiIIllIl","kU0IHbUyo9vsguiCBQI3TJg7uSX1iiW7IwYU+3NCTnB6QBQ=">(), var9),
         lIlIIIliIlIIIl.IIlllIlliIll(liiiIIllIl<"liiiIIllIl","LVvE2PLIJLrNjbQ/TlSyCYoua2W65WMlDIWscTidx+2xITE=">(), var9)
      );

      for (long var20 = var18 ^ (0L ^ var18) & -1L << 32; (int)(var20 >>> 32) < this.iiliIIIlil; var20 += 4294967296L) {
         IiIillIlliIillIl var17 = (IiIillIlliIillIl)var8.get((int)(var20 >>> 32));
         this.IIiiIIIlil[(int)(var20 >>> 32)] = Integer.toString((int)(var20 >>> 32) + 1);
         this.lIiiIIIlil[(int)(var20 >>> 32)] = llIIlIllilIIlIll.Illlilllli(var17.iliIiiliiiii());
         this.iIiiIIIlil[(int)(var20 >>> 32)] = iiiiiliIIIIIii.iliIiiliiiii(var17, scan.IIillIiliIil(), rules);
         this.IliiIIIlil[(int)(var20 >>> 32)] = Math.round(Math.max(0.0, Math.min(1.0, var17.IiIlliIliiIl())) * 100.0)
            + liiiIIllIl<"liiiIIllIl","83xgEgFISFvBFC4tlAnqcPYsIi2kgXI5uQhTE3U=">();
         this.lliiIIIlil[(int)(var20 >>> 32)] = Integer.toString(var17.iIlIlllllill());
         var10 = Math.max(var10, lIlIIIliIlIIIl.IIlllIlliIll(this.IIiiIIIlil[(int)(var20 >>> 32)], var9));
         var11 = Math.max(var11, lIlIIIliIlIIIl.IIlllIlliIll(this.lIiiIIIlil[(int)(var20 >>> 32)], var9));
         var12 = Math.max(var12, lIlIIIliIlIIIl.IIlllIlliIll(this.iIiiIIIlil[(int)(var20 >>> 32)], var9));
         var13 = Math.max(var13, lIlIIIliIlIIIl.IIlllIlliIll(this.IliiIIIlil[(int)(var20 >>> 32)], var9));
         var14 = Math.max(var14, lIlIIIliIlIIIl.IIlllIlliIll(this.lliiIIIlil[(int)(var20 >>> 32)], var9));
         var15 = Math.max(var15, lIlIIIliIlIIIl.IIlllIlliIll(iIIiIiilIlIiIiil.iIlIlllllill(var17.IlIlllIlilIl()), var9));
      }

      this.liiiIIIlil = (float)Math.ceil((double)var10);
      this.iiiiIIIlil = (float)Math.ceil((double)var11);
      this.IIIIlIIlil = (float)Math.ceil((double)var12);
      this.lIIIlIIlil = (float)Math.ceil((double)var13);
      this.iIIIlIIlil = (float)Math.ceil((double)var14);
      this.IlIIlIIlil = (float)Math.ceil((double)var15);
      IiIillIlliIillIl var16 = scan.IliIlllilIi();
      if (var16 != null) {
         this.ilIIlIIlil = liiiIIllIl<"liiiIIllIl","04efo3nX5RW82lLMY67P8Yg2NTrkhzc1YyrSndN1wEVZ">() + this.iIiiIIIlil[0];
      } else if (!scan.Iilllilliill()) {
         this.ilIIlIIlil = liiiIIllIl<"liiiIIllIl","PK16lFSTMn8T26mRnz/PILvI5aGQIqQBLv/x7YboQmFBU/Tuc8pO">();
      } else if (scan.lIiiIiIlilli() == 0 && scan.IIIllIIliIIl() > 0) {
         this.ilIIlIIlil = liiiIIllIl<"liiiIIllIl","77KLUSCUQdY0KiSshS1NN//KGx743jf2cZaHa1CLZFM6lRtQEx63UTE=">();
      } else if (scan.lIiiIiIlilli() == 0 && scan.iliIiiliiiii() > 0) {
         this.ilIIlIIlil = liiiIIllIl<"liiiIIllIl","DQb9/y/N8AOfVbT9dB8SlsQY3mjkFjr+gDcB45ujQLVW0W73rvg=">();
      } else if (scan.lIiiIiIlilli() == 0) {
         this.ilIIlIIlil = liiiIIllIl<"liiiIIllIl","PJjG+beOtsFkJMyz9YVliGD+X2o2DoFIuPgnPY0k1NSrH2nlEKmy">();
      } else {
         this.ilIIlIIlil = liiiIIllIl<"liiiIIllIl","A65sRV8oOW2PiJjoND4mXtiMHuGqALX9TL2k1g+A3Yv1aqP3crS60Q==">();
      }

      this.IiIIlIIlil = liiiIIllIl<"liiiIIllIl","q50qjDkIDzu8yPcK21HBIESxFbsVR1pCCdej8HF6yDAW">() + scan.liiiIIllIl().IliIlllilIi().toUpperCase(Locale.ROOT);
      this.liIIlIIlil = var16 == null ? "" : liiiIIllIl<"liiiIIllIl","cJgyXPbJnpufI8R3rb1LrREENcbbzse6hBKsJIiKXvqoRBQj">() + this.lIiiIIIlil[0];
      this.iiIIlIIlil = var16 == null ? "" : liiiIIllIl<"liiiIIllIl","mmo9EcezaTrjOY0Erdl6M86a8mzHcnDj2jM8/881Wg0XLWYZ">() + this.lIiiIIIlil[0];
      this.llIIlIIlil = var16 == null
         ? 0.0F
         : (float)Math.ceil(
               (double)Math.max(
                  Math.max(lIlIIIliIlIIIl.IIlllIlliIll(this.liIIlIIlil, var9), lIlIIIliIlIIIl.IIlllIlliIll(this.iiIIlIIlil, var9)),
                  lIlIIIliIlIIIl.IIlllIlliIll(liiiIIllIl<"liiiIIllIl","83n72VJi+hdYPm2MWFHMdre6/gmpnMCVTdGo0MRtMocZfgfncuBCfJuglAo=">(), var9)
               )
            )
            + 18.0F;
      this.IIlIlIIlil = Integer.toString(scan.iliIiiliiiii());
      this.lIlIlIIlil = Integer.toString(scan.IIIllIIliIIl());
      this.iIlIlIIlil = Integer.toString(scan.IlIlllIlilIl());
      this.IllIlIIlil = Integer.toString(scan.IiIlliIliiIl());
      this.lllIlIIlil = Integer.toString(scan.IIlllIlliIll());
   }
}
