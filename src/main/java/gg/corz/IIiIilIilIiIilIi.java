package gg.corz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class IIiIilIilIiIilIi {
   public static final int lIilIllIIi = 3;
   public static final int lIIiIllIIi = 16;
   public static final int iIllIllIIi = 16;
   public static final int IIilIllIIi = 12;
   public static final int lIllIllIIi = 12;
   public static final int iillIllIIi = 6;
   public static final int iIilIllIIi = 9;
   public static final int IlilIllIIi = 3;
   public static final int IlllIllIIi = 20;
   public static final int iIIiIllIIi = 3;
   public static final int IlIlIllIIi = 28;
   public static final int llllIllIIi = 6;
   public static final int IiIiIllIIi = 8;
   public static final int illlIllIIi = 8;
   public static final int liIlIllIIi = 8;
   public static final int IIliIllIIi = 10;
   public static final int IiilIllIIi = 15;
   public static final int IlIiIllIIi = 12;
   public static final int iIliIllIIi = 8;
   public static final int llliIllIIi = 3;
   public static final int iiIlIllIIi = 22;
   public static final int llIlIllIIi = 28;
   public static final int liilIllIIi = 40;
   public static final int illiIllIIi = 10;
   public static final int liIiIllIIi = 8;
   public static final int IillIllIIi = 5;
   public static final int ililIllIIi = 6;
   public static final int liliIllIIi = 25;
   public static final int ilIlIllIIi = 14;
   public static final int IiIlIllIIi = 18;
   public static final int iiIiIllIIi = 8;
   public static final int llilIllIIi = 3;
   public static final int IIllIllIIi = 18;
   public static final int lillIllIIi = 20;
   public static final int lIliIllIIi = 8;
   public static final int IiliIllIIi = 5;
   public static final int iiilIllIIi = 32;
   public static final int ilIiIllIIi = 12;
   public static final int llIiIllIIi = 6;
   public static final int IlliIllIIi = 30;
   public static final int IIIiIllIIi = 4;

   public static IllIiIIllllIiIIl IliIlllilIi(lIiiIIIiiIiiIIIi e, Illiilllllliilll sig, lIIillIiiIIillIi cfg) {
      long var69 = 1984304419855768607L;
      long var71 = 394988685248820826L;
      long var73 = 2638532338466376231L;
      long var75 = -3785145256232137615L;
      long var77 = 783588530191503764L;
      long var79 = 4484328613229181486L;
      long var81 = 6148581010535219237L;
      long var83 = -7754853740509344920L;
      long var85 = -1157626500232424131L;
      long var87 = 7780998743275401743L;
      long var89 = -3084284325572596450L;
      long var91 = 2195643071383422593L;
      long var93 = -5606779449290609834L;
      long var95 = 8496372460788119835L;
      long var97 = -6221672060008900488L;
      long var99 = -289887014423181039L;
      long var101 = -3745525313999952113L;
      long var103 = 4650936806399546498L;
      long var105 = -3902235843132075056L;
      long var107 = -6365623821881682490L;
      long var109 = -5135616532646587122L;
      long var111 = -6139812670570913270L;
      long var113 = 6922674178215660914L;
      long var115 = -4457919698547245793L;
      long var117 = -7499586180884417046L;
      long var119 = 458093988471543438L;
      long var121 = -9199200839565397279L;
      long var123 = -3157113445609552913L;
      long var125 = 3436495889762109617L;
      long var127 = 9172158920950467706L;
      if (sig == null) {
         sig = new Illiilllllliilll();
      }

      var69 ^= ((long)sig.iIlIlllllill() << 32 ^ var69) & -1L << 32;
      var69 ^= ((long)(sig.ililIllill ? 0 : 1) ^ var69) & -1L >>> 32;
      var71 ^= (0L ^ var71) & -1L << 32;
      var71 ^= (0L ^ var71) & -1L >>> 32;
      var73 ^= (0L ^ var73) & -1L << 32;
      var73 ^= (0L ^ var73) & -1L >>> 32;
      var75 ^= (0L ^ var75) & -1L << 32;
      var75 ^= (0L ^ var75) & -1L >>> 32;
      var77 ^= (0L ^ var77) & -1L << 32;
      var77 ^= (0L ^ var77) & -1L >>> 32;
      var79 ^= (0L ^ var79) & -1L << 32;
      var79 ^= (0L ^ var79) & -1L >>> 32;
      var81 ^= (0L ^ var81) & -1L << 32;
      HashSet var16 = new HashSet();
      Object var17 = (int)(var69 >>> 32) != 0 ? new ArrayList() : e.IIIllIIliIIl();
      boolean[] var18 = new boolean[148];

      for (ilIlIIilIiIlIIil var20 : e.IIIllIIliIIl()) {
         var81 ^= ((long)((int)(var69 >>> 32) != 0 && sig.IilliliilIIi(var20.IlliIlIIil) ? 1 : 0) ^ var81) & -1L >>> 32;
         var83 ^= ((long)((int)var81 != 0 ? (int)var69 : 4) << 32 ^ var83) & -1L << 32;
         if ((int)var81 != 0) {
            var81 += 4294967296L;
         } else {
            var79 ^= (var79 ^ var79 + (long)1) & -1L >>> 32;
            if ((int)(var69 >>> 32) != 0) {
               var17.add(var20);
            }
         }

         switch (var20.IiIiIlIIil) {
            case IIiilliiil:
               var71 ^= ((long)((int)(var71 >>> 32) + (int)(var83 >>> 32)) << 32 ^ var71) & -1L << 32;
               break;
            case lIiilliiil:
               var71 ^= ((long)((int)var71 + (int)(var83 >>> 32)) ^ var71) & -1L >>> 32;
               break;
            case iIiilliiil:
               var73 ^= ((long)((int)(var73 >>> 32) + (int)(var83 >>> 32)) << 32 ^ var73) & -1L << 32;
               break;
            case Iliilliiil:
               var73 ^= ((long)((int)var73 + (int)(var83 >>> 32)) ^ var73) & -1L >>> 32;
               break;
            case lliilliiil:
               var75 ^= ((long)((int)(var75 >>> 32) + (int)(var83 >>> 32)) << 32 ^ var75) & -1L << 32;
               break;
            case iiiilliiil:
               var75 ^= ((long)((int)var75 + (int)(var83 >>> 32)) ^ var75) & -1L >>> 32;
               break;
            case IIIIiliiil:
               var77 ^= ((long)((int)(var77 >>> 32) + (int)(var83 >>> 32)) << 32 ^ var77) & -1L << 32;
               break;
            case liiilliiil:
               var77 ^= (var77 ^ var77 + (long)1) & -1L >>> 32;
               if (var20.iliIiiliiiii(8)) {
                  var79 += 4294967296L;
               }
         }

         if ((int)var81 == 0) {
            if (var20.iIliIlIIil != 0) {
               var16.add(var20.iIliIlIIil);
            }

            if (iliiIllIiiiIll.liiiIIllIl(var20.IlliIlIIil)) {
               var18[var20.IlliIlIIil] = true;
            }
         }
      }

      var83 ^= ((long)((int)(var79 >>> 32) + ((int)var77 >= 2 ? (int)var77 - (int)(var79 >>> 32) : 0)) ^ var83) & -1L >>> 32;
      var71 ^= ((long)((int)var71 + (int)var83 * 4) ^ var71) & -1L >>> 32;
      var85 ^= ((long)((int)(var71 >>> 32) / 4) << 32 ^ var85) & -1L << 32;
      var81 ^= ((long)((int)var71 / 4) ^ var81) & -1L >>> 32;
      var83 ^= ((long)(cfg.IiiiiiIIIi ? (int)(var73 >>> 32) / 4 : 0) << 32 ^ var83) & -1L << 32;
      var85 ^= ((long)(cfg.liiiiiIIIi ? (int)var73 / 4 : 0) ^ var85) & -1L >>> 32;
      var87 ^= ((long)((int)(var75 >>> 32) / 4) << 32 ^ var87) & -1L << 32;
      var87 ^= ((long)(cfg.lIIIIIlIIi ? (int)var75 / 4 : 0) ^ var87) & -1L >>> 32;
      var89 ^= ((long)(cfg.IlIIIIlIIi ? (int)(var77 >>> 32) / 4 : 0) << 32 ^ var89) & -1L << 32;
      var89 ^= ((long)(cfg.IIIIIIlIIi ? iIIIlillIlIIlill.liiiIIllIl((List<ilIlIIilIiIlIIil>)var17) : 0) ^ var89) & -1L >>> 32;
      var91 ^= ((long)(cfg.iiiiiiIIIi ? var16.size() : 0) << 32 ^ var91) & -1L << 32;
      var91 ^= ((long)(cfg.liiiiiIIIi && iIlIlllllill((List<ilIlIIilIiIlIIil>)var17) ? 1 : 0) ^ var91) & -1L >>> 32;
      var93 ^= (0L ^ var93) & -1L << 32;
      boolean[] var31 = var18;
      var93 ^= ((long)var18.length ^ var93) & -1L >>> 32;
      var95 ^= (0L ^ var95) & -1L << 32;

      while ((int)(var95 >>> 32) < (int)var93) {
         var95 ^= ((long)var31[(int)(var95 >>> 32)] ^ var95) & -1L >>> 32;
         if ((int)var95 != 0) {
            var93 += 4294967296L;
         }

         var95 += 4294967296L;
      }

      var97 ^= ((long)Math.min((int)(var85 >>> 32) * 5, 28) << 32 ^ var97) & -1L << 32;
      var93 ^= ((long)Math.min((int)var81 * 8, 28) ^ var93) & -1L >>> 32;
      var95 ^= ((long)Math.min((int)(var83 >>> 32) * 2, 14) << 32 ^ var95) & -1L << 32;
      var95 ^= ((long)(Math.min((int)var85 * 3, 18) + ((int)var91 != 0 ? 8 : 0)) ^ var95) & -1L >>> 32;
      var97 ^= ((long)Math.min((int)(var87 >>> 32), 22) ^ var97) & -1L >>> 32;
      var99 ^= ((long)Math.min((int)var89, 18) << 32 ^ var99) & -1L << 32;
      var99 ^= ((long)Math.min((int)(var91 >>> 32) * 4, 12) ^ var99) & -1L >>> 32;
      var101 ^= ((long)(Math.min((int)var87 * 2, 16) + Math.min(Math.max((int)var87 - 16, 0) / 4, 8)) << 32 ^ var101) & -1L << 32;
      var101 ^= ((long)Math.min((int)(var89 >>> 32) * 2, 16) ^ var101) & -1L >>> 32;
      var103 ^= ((long)Math.min(Math.max((int)(var85 >>> 32) - 8, 0), 20) << 32 ^ var103) & -1L << 32;
      var103 ^= ((long)((int)(var83 >>> 32) > 0 ? Math.min(Math.max((int)(var83 >>> 32) - 10, 0) / 2, 6) : 0) ^ var103) & -1L >>> 32;
      var105 ^= ((long)Math.min((int)(var93 >>> 32) * 5, 20) << 32 ^ var105) & -1L << 32;
      if ((int)(var93 >>> 32) >= 2 && (int)var89 >= 12) {
         var105 += 25769803776L;
      }

      var105 ^= ((long)Math.min(e.Iiilliiliiil() * 3, 9) ^ var105) & -1L >>> 32;
      var107 ^= ((long)(cfg.ilIIIIlIIi && e.IiIiliIiiiIi() > 0 ? 1 : 0) << 32 ^ var107) & -1L << 32;
      var107 ^= ((long)((int)(var107 >>> 32) != 0 ? 10 : 0) ^ var107) & -1L >>> 32;
      var109 ^= ((long)e.Illlllllilll(146) << 32 ^ var109) & -1L << 32;
      var109 ^= ((long)((int)(var109 >>> 32) > 0 ? 1 : 0) ^ var109) & -1L >>> 32;
      var111 ^= ((long)Math.min((int)(var109 >>> 32) * 5, 25) << 32 ^ var111) & -1L << 32;
      var111 ^= ((long)((int)(var107 >>> 32) == 0 && (int)var109 == 0 ? 0 : 1) ^ var111) & -1L >>> 32;
      var113 ^= (0L ^ var113) & -1L << 32;
      if ((int)(var85 >>> 32) > 0) {
         var113 += 4294967296L;
      }

      if ((int)var81 > 0) {
         var113 += 4294967296L;
      }

      if ((int)(var83 >>> 32) > 0) {
         var113 += 4294967296L;
      }

      if ((int)var85 > 0) {
         var113 += 4294967296L;
      }

      if ((int)(var87 >>> 32) > 0) {
         var113 += 4294967296L;
      }

      if ((int)var89 > 0) {
         var113 += 4294967296L;
      }

      if ((int)var87 >= 4) {
         var113 += 4294967296L;
      }

      if ((int)(var89 >>> 32) >= 3) {
         var113 += 4294967296L;
      }

      if ((int)var111 != 0) {
         var113 += 4294967296L;
      }

      var113 ^= ((long)((int)(var113 >>> 32) - ((int)var87 >= 4 ? 1 : 0) - ((int)(var89 >>> 32) >= 3 ? 1 : 0)) ^ var113) & -1L >>> 32;
      var115 ^= (0L ^ var115) & -1L << 32;
      if (cfg.lIIIIIlIIi && (int)var113 >= 1 && (int)var87 >= 8 && e.Ililllililil() * 2 >= (int)var87) {
         var115 += 12884901888L;
      }

      if (cfg.iIIIIIlIIi && (int)var113 >= 2) {
         if (e.IIIIllIIIl() >= 16) {
            var115 += 25769803776L;
         } else if (e.IIIIllIIIl() >= 8) {
            var115 += 12884901888L;
         }
      }

      var115 ^= ((long)((int)(var89 >>> 32) >= 3 ? 1 : 0) ^ var115) & -1L >>> 32;
      var117 ^= ((long)(e.Illlllllilll(139) > 0 ? 1 : 0) << 32 ^ var117) & -1L << 32;
      var117 ^= (0L ^ var117) & -1L >>> 32;
      if ((int)var115 != 0 && (int)var111 != 0) {
         var117 ^= (var117 ^ var117 + (long)12) & -1L >>> 32;
      }

      if ((int)var115 != 0 && (int)(var109 >>> 32) >= 2) {
         var117 ^= (var117 ^ var117 + (long)6) & -1L >>> 32;
      }

      if ((int)var115 != 0 && e.Illillliilli() > 0) {
         var117 ^= (var117 ^ var117 + (long)12) & -1L >>> 32;
      }

      if ((int)var89 >= 8 && (int)var85 >= 3) {
         var117 ^= (var117 ^ var117 + (long)8) & -1L >>> 32;
      }

      if ((int)(var85 >>> 32) > 0 && (int)var81 > 0 && (int)(var83 >>> 32) > 0) {
         var117 ^= (var117 ^ var117 + (long)8) & -1L >>> 32;
      }

      if ((int)(var93 >>> 32) >= 2 && (int)(var117 >>> 32) != 0) {
         var117 ^= (var117 ^ var117 + (long)8) & -1L >>> 32;
      }

      if ((int)(var107 >>> 32) != 0 && (int)var115 != 0 && (int)(var83 >>> 32) > 0) {
         var117 ^= (var117 ^ var117 + (long)10) & -1L >>> 32;
      }

      if (cfg.IlIIIIlIIi && e.Iilililiiili() >= 2) {
         var117 ^= (var117 ^ var117 + (long)8) & -1L >>> 32;
      }

      if ((int)var115 != 0 && ((int)(var85 >>> 32) > 0 || (int)var81 > 0 || (int)var85 > 0)) {
         var117 ^= (var117 ^ var117 + (long)8) & -1L >>> 32;
      }

      var117 ^= ((long)Math.min((int)var117, 30) ^ var117) & -1L >>> 32;
      var119 ^= (
            (long)(
                     (int)(var97 >>> 32)
                        + (int)var93
                        + (int)(var95 >>> 32)
                        + (int)var95
                        + (int)var97
                        + (int)(var99 >>> 32)
                        + (int)var99
                        + (int)(var103 >>> 32)
                        + (int)var103
                        + (int)(var101 >>> 32)
                        + (int)var101
                        + (int)(var105 >>> 32)
                        + (int)var105
                        + (int)var107
                        + (int)(var111 >>> 32)
                        + (int)var117
                        + (int)(var115 >>> 32)
                  )
                  << 32
               ^ var119
         )
         & -1L << 32;
      lIiiIilliIiiIill var57 = cfg.IiIIIIlIIi
         ? llIlIIiilIlIIi.IliIlllilIi(sig.lIIlIllill, sig.iIIlIllill, (int)(var119 >>> 32), cfg.iiIIIIlIIi)
         : lIiiIilliIiiIill.Illililill;
      var119 ^= ((long)((int)Math.round(e.lIIlliIIll() * 15.0)) ^ var119) & -1L >>> 32;
      if ((int)(var93 >>> 32) >= 1 || (int)var111 != 0 || e.IIIilIIiiIIi() > 0 || (int)var115 != 0) {
         var119 ^= (0L ^ var119) & -1L >>> 32;
      }

      var121 ^= (0L ^ var121) & -1L << 32;
      if (e.lIlIliIlIl() <= 40 && (int)(var113 >>> 32) >= 2 && ((int)(var85 >>> 32) > 0 || (int)var81 > 0 || (int)var85 > 0 || (int)var111 != 0)) {
         var121 ^= ((long)cfg.iliiiiIIIi << 32 ^ var121) & -1L << 32;
      }

      var121 ^= (0L ^ var121) & -1L >>> 32;
      var123 ^= (0L ^ var123) & -1L << 32;
      if (var57 == lIiiIilliIiiIill.iIlililill) {
         var121 ^= (40L ^ var121) & -1L >>> 32;
      } else if (cfg.liIIIIlIIi && sig.lIiiIiIlilli() && !sig.liilIllill) {
         if ((int)(var119 >>> 32) < 60 && (int)(var93 >>> 32) < 3) {
            var123 ^= (4294967296L ^ var123) & -1L << 32;
         } else {
            var121 ^= (32L ^ var121) & -1L >>> 32;
         }
      }

      var123 ^= ((long)lIiiIiIlilli((int)(var119 >>> 32) - (int)var119 - (int)var121 + (int)(var121 >>> 32), 0, 100) ^ var123) & -1L >>> 32;
      var125 ^= ((long)(var57 == lIiiIilliIiiIill.lIlililill ? 1 : 0) << 32 ^ var125) & -1L << 32;
      var125 ^= ((long)((int)(var85 >>> 32) < cfg.lliiiiIIIi && (int)var111 == 0 && e.IIIilIIiiIIi() <= 0 ? 0 : 1) ^ var125) & -1L >>> 32;
      var127 ^= (
            (long)((int)(var113 >>> 32) >= cfg.iIiiiiIIIi && e.IlIlllIlilIl() >= cfg.IliiiiIIIi && (int)var125 != 0 && (int)var123 >= cfg.lIiiiiIIIi ? 1 : 0)
                  << 32
               ^ var127
         )
         & -1L << 32;
      var127 ^= ((long)((int)(var127 >>> 32) != 0 && (int)(var125 >>> 32) == 0 && (int)(var123 >>> 32) == 0 ? 1 : 0) ^ var127) & -1L >>> 32;
      String var67 = IilliliilIIi(
         (int)(var97 >>> 32), (int)var93, (int)(var95 >>> 32), (int)var95, (int)var97, (int)(var99 >>> 32), (int)(var101 >>> 32), (int)var101
      );
      String var68 = iliIiiliiiii<"iliIiiliiiii","y7vCj+/FAaOeiYVkMVwAzu+aaU7KVYZjfxRTRXQA6EA=">()
         + (int)(var119 >>> 32)
         + iliIiiliiiii<"iliIiiliiiii","RRGFbhO9jj+rWXr8Unr7xVLS16dhYh1eOC1+blTVdiI=">()
         + (int)(var85 >>> 32)
         + iliIiiliiiii<"iliIiiliiiii","W04gRfGXdwwjS9oxZgFcDJS+AP+K+JAVbPb7tkl4tW8=">()
         + (int)var81
         + iliIiiliiiii<"iliIiiliiiii","xXMEmL4jX0r1vTexs4DgP6r7xeP/xXkkhN58y8x972g=">()
         + (int)(var83 >>> 32)
         + iliIiiliiiii<"iliIiiliiiii","fkz2Eg+H/wYaOTw6Reor7D5bj+/koF09DiYfIlij1Xk=">()
         + (int)var85
         + iliIiiliiiii<"iliIiiliiiii","13zlAJD7GqXPyt+GCV2RKJsbTo39VTb3U0pan5BwL2k=">()
         + (int)(var87 >>> 32)
         + iliIiiliiiii<"iliIiiliiiii","CgI0s962aVrf4NiGxoP3prJ9yaGAFC3ztOONop4Gk5E=">()
         + (int)var87
         + iliIiiliiiii<"iliIiiliiiii","TcWBHSPlCk30pcV2ARW601MBIteZ/DF8G9/4OznlL3E=">()
         + (int)(var89 >>> 32)
         + iliIiiliiiii<"iliIiiliiiii","hCUGdU/Y386zRu4rPONklX1sDecrdJTXK2Q1W3ijj0Np">()
         + (int)var89
         + iliIiiliiiii<"iliIiiliiiii","qAdrSmbnDP4LbL5TxaMbt1QmRKl+PlYocc8W6WxtofVPAWs=">()
         + (int)(var91 >>> 32)
         + iliIiiliiiii<"iliIiiliiiii","V38t/bvBT2fu++HG/ujs22uwnzFypbNt/NrYDc0/1/3oKw==">()
         + (int)var91
         + iliIiiliiiii<"iliIiiliiiii","7I6op1V2tqFDxLWXw0rJrQdHD6pZ8Nj5Xrde3/oyd7GfBQ==">()
         + (int)(var103 >>> 32)
         + iliIiiliiiii<"iliIiiliiiii","UA7mQFvylkOFxtCXU2ovcd6QL0cMI02aM4pyrIQNiwYnsg==">()
         + (int)var103
         + iliIiiliiiii<"iliIiiliiiii","mF4rJe+mPG1TUDgQPImIAOy/14zoSN+9CcfzzAeT/6E=">()
         + (int)(var93 >>> 32)
         + iliIiiliiiii<"iliIiiliiiii","Zhup9eI1P9h/HEgkI4VH5usywPBJ/1BzHBBs6JECL22Q">()
         + e.Iiilliiliiil()
         + iliIiiliiiii<"iliIiiliiiii","nOrI5GMFBFRL9E7k2KU3r0JX7gLwXilg1/9xBqWxlvv1iC/SMp6d">()
         + (int)(var115 >>> 32)
         + iliIiiliiiii<"iliIiiliiiii","ZPc67juR8iRIL62LBB51AQKaiW4jKAngiYuO26GCwahln4B1TCI=">()
         + (int)var77
         + iliIiiliiiii<"iliIiiliiiii","DvhDNIRjq/uXZ0Abw6SCF+9fIGPJKWYX9zlyklo=">()
         + (int)(var79 >>> 32)
         + iliIiiliiiii<"iliIiiliiiii","tyt2Y/ApryD/78zJf2ATNgSTrw/FMOPsOXSRHXPFKsKa">()
         + e.IIIilIIiiIIi()
         + iliIiiliiiii<"iliIiiliiiii","ySdq+fpFyT1r34UbWZXDZf/lWYPHzjPBFwa+U9Wx/GV8">()
         + e.IlIillIiilIi()
         + iliIiiliiiii<"iliIiiliiiii","19QHDN4H6vkOTI2a9vn47vZtSpZCW1adl55XBuN/xlvd1w==">()
         + e.IiIiliIiiiIi()
         + iliIiiliiiii<"iliIiiliiiii","ZUqpvkiOV2R71lbyY+wxnb/N3RC/kUNEjCfwjxCNL7Q=">()
         + (int)(var109 >>> 32)
         + iliIiiliiiii<"iliIiiliiiii","jrjaSbTJvfkswk1GyZ+b4Tz4mW0/vD01DvOqVuZ68ZAgpTU=">()
         + (int)var117
         + iliIiiliiiii<"iliIiiliiiii","JNg+j7XN5eA5F9GgYCVPktZ6DGTzSaiH15WytSKSpg3eHJ8=">()
         + e.Iilililiiili()
         + iliIiiliiiii<"iliIiiliiiii","wtPVbJGz3YMPJaE4v3VBz30DuL8M35ZX0/OY7yBrXF+k/4Xi9A==">()
         + e.IIlilIliiIli()
         + iliIiiliiiii<"iliIiiliiiii","7WJSf5dxYAPmWMZhC9zfOTOuDYHFPeKpd9yU5fKVGNBgIBi4COdV">()
         + (int)var125
         + iliIiiliiiii<"iliIiiliiiii","MwOnxXm1M0pCenBP6iHCKmaJy3iKprf7j3ej+UNZ1mOAg2Xnfw==">()
         + (int)var79
         + iliIiiliiiii<"iliIiiliiiii","uJn75itsOqg4/Tq8zDRP+0OkKtYxD8FrrKLPWjdCa/Vmu0Nf">()
         + (int)(var81 >>> 32)
         + (sig.ililIllill ? iliIiiliiiii<"iliIiiliiiii","1FH5/bquVBEHgZXaQhIYaIFbrYFGHFpXclp0JIkK1teC">() : "")
         + iliIiiliiiii<"iliIiiliiiii","MB6X6ZH+1wblWXhTXYfdvfuyf+kovJ3qhPKKXLU14K6VXkdX">()
         + (int)var119
         + iliIiiliiiii<"iliIiiliiiii","w11671viCYNySo4XBqWkqfLC0znfo96DgYSyhklvHWhGViVpa4c=">()
         + (int)var121
         + iliIiiliiiii<"iliIiiliiiii","KPls667M1Ko7TDImbPYPsgErlolxaNhq9K6A11+qkaFA+sNe">()
         + (int)(var121 >>> 32)
         + iliIiiliiiii<"iliIiiliiiii","9vS6sOufY+Y4Zocr9QlDWD1oqcXiUd60ErDqgxQw6pa+">()
         + (int)(var113 >>> 32);
      return new IllIiIIllllIiIIl(
         (int)var123,
         (int)(var119 >>> 32),
         (int)(var113 >>> 32),
         (boolean)((int)var127),
         var57,
         (boolean)((int)(var123 >>> 32)),
         var67,
         var68,
         (int)var79,
         (int)(var81 >>> 32),
         (int)(var93 >>> 32),
         (int)var87,
         (int)(var89 >>> 32)
      );
   }

   private static int lIiiIiIlilli(int lo, int hi, int v) {
      return lo < hi ? hi : Math.min(lo, v);
   }

   static boolean iIlIlllllill(List<ilIlIIilIiIlIIil> cells) {
      long var6 = 7095772897311777621L;
      long var8 = 4896131933686585822L;
      var6 ^= (0L ^ var6) & -1L << 32;
      var6 ^= (0L ^ var6) & -1L >>> 32;
      var8 ^= (0L ^ var8) & -1L << 32;

      for (ilIlIIilIiIlIIil var5 : cells) {
         if (var5.IiIiIlIIil == lIlliIIiiIlliIIi.Iliilliiil) {
            var8 += 4294967296L;
            if (var5.lIliIlIIil == 8) {
               var6 += 4294967296L;
            }

            if (var5.lIliIlIIil == 9 || var5.lIliIlIIil == 10 || var5.lIliIlIIil == 12) {
               var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32;
            }
         }
      }

      return (int)(var6 >>> 32) >= 3 || (int)var6 >= 1 && (int)(var8 >>> 32) >= 3;
   }

   static boolean liiiIIllIl(lIiiIIIiiIiiIIIi e) {
      return iIlIlllllill(e.IIIllIIliIIl());
   }

   private static String IilliliilIIi(int pLT, int pRS, int pGEO, int pEX, int pCR, int pUT, int pFA, int pST) {
      long var10 = 8307683585627022691L;
      var10 ^= ((long)pLT << 32 ^ var10) & -1L << 32;
      String var9 = iliIiiliiiii<"iliIiiliiiii","9GSZYlLnFo8EAPiqquFTY+s44rvDjuOvvF5m8/NKoZ7tH9E=">();
      if (pRS > (int)(var10 >>> 32)) {
         var10 ^= ((long)pRS << 32 ^ var10) & -1L << 32;
         var9 = iliIiiliiiii<"iliIiiliiiii","9xfLqZKQngRF33ACljIEUYpYO8/A7T3jDHZl3W/PeSVjLVE=">();
      }

      if (pEX > (int)(var10 >>> 32)) {
         var10 ^= ((long)pEX << 32 ^ var10) & -1L << 32;
         var9 = iliIiiliiiii<"iliIiiliiiii","BOatrX+S3c+tvZfNLVtY42n0rkGTsFQ8c+ojn0jX+Wvq8DYK">();
      }

      if (pCR > (int)(var10 >>> 32)) {
         var10 ^= ((long)pCR << 32 ^ var10) & -1L << 32;
         var9 = iliIiiliiiii<"iliIiiliiiii","cqZ29AdfQ0iEwTZ/A5N8EioBovmkTUQaqcHBWvysKKxhl/4=">();
      }

      if (pUT > (int)(var10 >>> 32)) {
         var10 ^= ((long)pUT << 32 ^ var10) & -1L << 32;
         var9 = iliIiiliiiii<"iliIiiliiiii","TOIbWY8Zn/dFmxkRdqgokKK1QG9ScZd6mDTTah1iJ3ejzDZ6">();
      }

      if (pGEO > (int)(var10 >>> 32)) {
         var10 ^= ((long)pGEO << 32 ^ var10) & -1L << 32;
         var9 = iliIiiliiiii<"iliIiiliiiii","iJI10XxeYuSG1TOvVZsr00YV0hvTGMPT7r5Wv3Nebvcv2HJE">();
      }

      if (pFA > (int)(var10 >>> 32)) {
         var10 ^= ((long)pFA << 32 ^ var10) & -1L << 32;
         var9 = iliIiiliiiii<"iliIiiliiiii","l9g00BgfXspBZlcuiacgZ5Ts20NS4+UO377ZokeHHnk=">();
      }

      if (pST > (int)(var10 >>> 32)) {
         var10 ^= ((long)pST << 32 ^ var10) & -1L << 32;
         var9 = iliIiiliiiii<"iliIiiliiiii","ITjkjLb4+eZyOTueTDMhPuKNmt/wDoMe/JIyee8bJxW78hHaAq4=">();
      }

      return (int)(var10 >>> 32) == 0 ? iliIiiliiiii<"iliIiiliiiii","BBT5eWwGopk/+kAAldJ/I6ZIOlYN2aUisHd2TqXTK1Q=">() : var9;
   }

   private IIiIilIilIiIilIi() {
   }
}
