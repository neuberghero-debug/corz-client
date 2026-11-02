package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.class_1041;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3675;
import org.joml.Matrix3x2fStack;
import org.joml.Vector2f;

public class IIIillIIil {
   private static final String[] lliilIiiliilIi = new String[]{
      liIlIliiIlIl<"liIlIliiIlIl","SytRrFFJosmDD8wXiIjazxzf4RoiXmFdUZQkixxEJNovMAE=">(),
      liIlIliiIlIl<"liIlIliiIlIl","SrcFX6uVRb+9xMS/WrxLytDRoLlIhZqs+8qNpxPQmhn6JTA=">(),
      liIlIliiIlIl<"liIlIliiIlIl","Q8VL9kBz1nimyuA/5elujRKJaPjQS09zRte12HIFb07pNqs=">(),
      liIlIliiIlIl<"liIlIliiIlIl","0xBznHaud3vDlpkxfTuCLnFFw0Rk3+CUGDccnAA/W3u5GAQ=">()
   };
   private static final float illilIiIililIi = 1.2E8F;
   private volatile String IllIIlilllIIli;
   private List<lliIiIliliIiIl> IliiiIilliiiIi;
   private Ilillillilli IIiIIlilIiIIli;
   private List<iiiliiiIIIiiii> iilIiIiIIiIiIi;
   private String IIllIlilIllIli;
   private static final int llIilIiilIilIi = 620756991;
   private static final int liIllIiiiIllIi = -2054070;
   private static final int iilllIiIIillIi = 6;
   private static final String iIiilIiIliilIi = "strip";
   private final IIllIIIllIllIIIl lliIIliiliIIli;
   private String iIliiIiIlliiIi;
   private final iIliililIlliilil iiiIIliIIIlIli;
   private static final int IIIilIilIIilIi = -45715;
   private String ilIiiIiIiIiiIi;
   private String lIilIliiIilIli;
   private static final int lilIlIiiilIlIi = 50;
   private boolean IlIiiIillIiiIi;
   private static final String lililIiiililIi = "Click again to delete";
   private static final String[] IIliIIilIliIIi = new String[]{
      liIlIliiIlIl<"liIlIliiIlIl","qFYuSLq85KynzgB1IiLlFy8jXSNLvOM/kVsFj7OVqJmOfYY=">(),
      liIlIliiIlIl<"liIlIliiIlIl","aJY843f5Mdf5X4fYiAJLX2HfrElg44rXYiauVGrW/0azwyQ09yDQL4PygQ==">(),
      liIlIliiIlIl<"liIlIliiIlIl","pyxCyykvumbUOoqzk38uX4sLZhT67GGunphTWa/5PgjP3A==">(),
      liIlIliiIlIl<"liIlIliiIlIl","69kQPLXnye4SaXCQ1IQtydBPYk5cToj4hZefT/6UOJyPZy6B">()
   };
   private static final long IiIilIiliIilIi = 2500L;
   private String IiiliIiliiliIi;
   private float ililIliIiilIli;
   private static final float iiIilIiIIlilIi = 190.0F;
   private float liilIliiiilIli;
   private static final Iilliiillilliiil[] ilIiIIiIiIiIIi = new Iilliiillilliiil[]{
      Iilliiillilliiil.lIIIilIiil, Iilliiillilliiil.iIIIilIiil, Iilliiillilliiil.IlIIilIiil
   };
   private String IIIIIlilIIIIli;
   private String iIIIIliIlIIIli;
   private static boolean iliiiIiIiiiiIi = false;
   private long llIliIiilIliIi;
   private volatile String IllliIilllliIi;
   private static final int ilIllIiIiIllIi = 10;
   private boolean lliliIiililiIi;
   private static final String[] iIliIIiIlliIIi = new String[]{
      liIlIliiIlIl<"liIlIliiIlIl","FfpPFfnTKGwTVCe38vFDzVSrXpsTPMNR4C8B33BPGs0LAeg=">(),
      liIlIliiIlIl<"liIlIliiIlIl","pN8iX1W2tZuroCVQR5YmFXux3pC/ZzNBBpUskSVEFiKuRVN6pKQvuZzIbw==">(),
      liIlIliiIlIl<"liIlIliiIlIl","SInzpDdCrhtgGTbSzO/asx2DYPn5vTGo5O6/q1EpvRVQ7g==">(),
      liIlIliiIlIl<"liIlIliiIlIl","zeMxBlm1uSHMu6Wbgu1k+vyApMbOzNzP2s4NuOL/WxM73Jum">()
   };
   private int IlIIiIillIIiIi;
   private static final int iliiIIiIiiiIIi = 36;
   private String IIliiIilIliiIi;
   private boolean llliiIiilliiIi;
   private static final int liillIiiiillIi = -11755009;
   private long IiIiIliliIiIli;
   private int IIlIiIilIlIiIi;
   private List<iiiliiiIIIiiii> lIiIiIiiIiIiIi;
   private final IIllIIIllIllIIIl IiiIIliliiIIli;
   private String iIIliIiIlIliIi;
   private int liIIiIiiiIIiIi;
   private List<String> iIiIIliIliIIli;
   private static final long lIlilIiiIlilIi = 400000000L;
   private final iliiIiIiIiiiIiIi iIiliIiIliliIi;
   private boolean llIiIliilIiIli;
   private static final long IllilIilllilIi = 350000000L;
   private String liIiiIiiiIiiIi;
   private float iIIiIliIlIiIli;
   private String IiliiIililiiIi;
   private static final int illIlIiIilIlIi = 3;
   private static final int lliIlIiiliIlIi = 62;
   private static final int IiIIlIiliIIlIi = 6;
   private String lilliIiiilliIi;
   private Iilliiillilliiil iIlIiIiIllIiIi = Iilliiillilliiil.lIIIilIiil;
   private int ilIlIliIiIlIli;
   private float IIIiIlilIIiIli;
   private static final String IIiilIilIiilIi = "i:";
   private static final int lllllIiillllIi = 56;
   private static final int lIiiIIiiIiiIIi = 60;
   private static final String[] liIiIIiiiIiIIi = new String[]{
      liIlIliiIlIl<"liIlIliiIlIl","Eq4QCpcIu6t3Pt1IU+WieYPfWCKUBkEkQR0sftFJRXp6">(),
      liIlIliiIlIl<"liIlIliiIlIl","iFZy+GvV/U8eXxGKjTakhrHTnxlZPkf1N1j/6Eqj5OOqjvDaww==">(),
      liIlIliiIlIl<"liIlIliiIlIl","JfVOED159viS3yk8u4sCS4D6EVBlX2DK//zxEz8QVCjnvOD1jA==">()
   };
   private int iliIiIiIiiIiIi;
   private static final int IIIIlIilIIIlIi = 10;
   private static final String[] IiliIIililiIIi = new String[]{
      liIlIliiIlIl<"liIlIliiIlIl","pf8Qrn+Yei8NEO3nEWr9/XFF80u0WVYPpEBx7XdRoDbu">(),
      liIlIliiIlIl<"liIlIliiIlIl","DhnK57LYYrt5XGuJxX5u6ExuKvk19h3YXMhtXtBsLEs/KA==">(),
      liIlIliiIlIl<"liIlIliiIlIl","cUABbclQLHAIFXhO1ujbhE8I1jV+jOTJjyurVzG1h+LpRrQ=">(),
      liIlIliiIlIl<"liIlIliiIlIl","FRDS9UyhZuDtB79NcQBj57BlBy2uIjTN3nUwiOXawTYGg05xFg==">()
   };
   private final iIIliiIiIlIliiIi lIIlIliiIIlIli;
   private static final int liiiIIiiiiiIIi = 3;
   private static final int lIIllIiiIIllIi = 20;
   private static final int llIIlIiilIIlIi = 48;
   private static final int IIlllIilIlllIi = 88;
   private final List<iiiliiiIIIiiii> IliIiIilliIiIi;
   private volatile Ilillillilli lIlIIliiIlIIli;
   private int ilIIiIiIiIIiIi;
   private long iillIliIIilIli;
   private static final int iiliIIiIIiiIIi = 2;
   private long iIllIliIlllIli;
   private static final int lIlIlIiiIlIlIi = 16;
   private boolean illliIiIilliIi;
   private List<IlIIillllIIill> IilIiIililIiIi;
   private String IlilIlillilIli;
   private static final int IlillIillillIi = 16;
   private final Vector2f llllIliilllIli;
   private final llIiliiilIilii lIIIiIiiIIIiIi;
   private static final int IliiIIilliiIIi = 3;
   private int liIlIliiiIlIli;
   private static final int IiiIlIiliiIlIi = 24;
   private static final int iIIilIiIlIilIi = -65990120;
   private static final long IiiilIiliiilIi = 1400L;
   private static final int IlIllIillIllIi = 120;
   private List<IlIIillllIIill> lllIiIiillIiIi = new ArrayList<>();
   private final iiiiilIiIIIIIiIi IiIIIliliIIIli;
   private static final int IilllIililllIi = 64;
   private static final int iIiIlIiIliIlIi = 4;
   private volatile String lIlliIiiIlliIi;
   private static final int iiIIlIiIIlIlIi = 4;
   private long IillIlilillIli;
   private long iiIliIiIIlliIi;
   private static final DateTimeFormatter iiiilIiIIIIiIi = DateTimeFormatter.ofPattern(
      liIlIliiIlIl<"liIlIliiIlIl","YFdH6slSPAIDEj7bZhQB5xPwbQLcxNBsaSghzPyeOwuEfwCLBorNj0rtEV4=">()
   );
   private static final int iIlllIiIllllIi = 124;
   private String IiIliIiliIliIi;
   private volatile boolean illIIliIilIIli;
   private static final int IllIlIilllIlIi = 10;
   private static final int lIillIiiIillIi = 16;
   private String IIiliIilIiliIi;
   private final iliiIiIiIiiiIiIi iiiliIiIIIiiIi;
   private boolean iiIIIliIIlIIli;
   private static final float ilillIiIiillIi = 0.45F;
   private long llIIIliilIIIli;
   private volatile long lilIIliiilIIli;
   private String lIiiiIiiIiiiIi;
   private boolean lIIiiIiiIIiiIi;
   private static final int IIiIlIilIiIlIi = 12;
   private int IlIlIlillIlIli;
   private volatile List<lliIiIliliIiIl> iiliiIiIIiiiIi;
   private int liiiiIiiiiiiIi;
   private static final Integer[] llliIIiilliIIi = new Integer[]{1, 5, 25, null};
   private static final int iIIIlIiIlIIlIi = 44;
   private static final int iiiIlIiIIIllIi = 14;
   private String IIIliIilIIliIi;
   private String liiIiIiiiiIiIi;

   private void iIIilIlIil(class_332 mx, IIllIIIllIllIIIl my, lliIiIliliIiIl cardX, int ctx, int target, int cardY, int sc, int cardW) {
      long var18 = 7040213303951764641L;
      IIliiIlllIliiIll var9 = llilliilililliil.IIiilIiiiIii();
      String var10 = cardX.lIillIilliIillIill;
      var18 ^= ((long)llilliilililliil.Iliilliiilii((double)sc, (double)cardW, (float)ctx, (float)target, (float)cardY, 36.0F) << 32 ^ var18) & -1L << 32;
      llilliilililliil.illilIilil(
         mx,
         (float)ctx,
         (float)target,
         (float)cardY,
         36.0F,
         this.iiiIIliIIIlIli
            .IIIllIIliIIl(IIlilIliiIli(var10, liIlIliiIlIl<"liIlIliiIlIl","sjIvKUUMBRzW/RU4ABUV+kUAjrGoRcBUet2eyhYXNsM=">()), (boolean)((int)(var18 >>> 32))),
         0.0F,
         0.0F
      );
      float var12 = (float)(ctx + 8);
      float var13 = (float)(ctx + cardY - 8);
      float var14 = (float)target + 10.0F;
      float var15 = var13 - 16.0F;
      llilliilililliil.IIllllIlll(
         mx,
         my,
         this.iiiIIliIIIlIli,
         IIlilIliiIli(var10, liIlIliiIlIl<"liIlIliiIlIl","NP22FCHVBcjXEzxE2NHerZPG1ji9E4VDQnIg3gH69eRoTw==">()),
         lIlIIiliIlIIil.iIlIlllllill(),
         var15,
         var14,
         16.0F,
         10.0F,
         sc,
         cardW,
         true,
         () -> this.IilIililIi(var10)
      );
      this.iliIiiliiiii(liIlIliiIlIl<"liIlIliiIlIl","0O+l7e2V+mX7YZnGY5FprCJWQQuz9Eis5+z5QAxp4IqonQ==">(), var15, var14, 16.0F, 16.0F, sc, cardW, false);
      float var16 = var15 - 6.0F;
      if (!cardX.liillIilliiillIill) {
         var18 ^= ((long)(var10.equals(this.IIllIlilIllIli) && System.currentTimeMillis() < this.iIllIliIlllIli ? 1 : 0) ^ var18) & -1L >>> 32;
         var16 = llilliilililliil.lIilliIill(
               mx,
               my,
               this.iiiIIliIIIlIli,
               IIlilIliiIli(var10, liIlIliiIlIl<"liIlIliiIlIl","AUbAr/m7WcJf5i6J8fukFTAfwDfCZdC5wbHO5cZkrkc=">()),
               (int)var18 != 0
                  ? liIlIliiIlIl<"liIlIliiIlIl","ARYBUGFczKx84Gzutg06dI9sgkGrTUXGKVy26TemTfW9Dw==">()
                  : liIlIliiIlIl<"liIlIliiIlIl","CuMkC93hrT5cThxfwMaABg28tQAs88OURHKAAmRriu0=">(),
               var15 - 3.0F,
               var14,
               16.0F,
               sc,
               cardW,
               false,
               () -> this.llIililIil(var10)
            )
            - 6.0F;
      }

      var18 ^= (
            (long)(
                  cardX.liillIilliiillIill
                     ? -7630437
                     : (var10.equals(this.lIiiiIiiIiiiIi) ? IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, 0.3) : -920587)
               )
               ^ var18
         )
         & -1L >>> 32;
      llilliilililliil.iiIIlIIlIl(var10, var12, llilliilililliil.IllIllllIl((float)target + 7.0F, 11.0F, 1.0F), (int)var18);
      if (cardX.liillIilliiillIill) {
         llilliilililliil.iiIilIIlil(
            mx,
            liIlIliiIlIl<"liIlIliiIlIl","nNgavVInPm7a26IOJzx3M+U9W5ZkS+ArIlSnvzNe6Xk1rGw=">(),
            var12 + llilliilililliil.llIIlilIIl(var10) + 5.0F,
            (float)target + 7.0F,
            -1750963
         );
      }

      llilliilililliil.lIlIliIlIl(
         var9.Iiilliiliiil(liIlIliiIlIl<"liIlIliiIlIl","jopN0flwDZwDy1fqZLJoGh5nwJKuq+FW+1XvKmPwmEaBPvU=">() + cardX.IliIlllilIi(), (var16 - var12) / 0.82F),
         var12,
         llilliilililliil.IllIllllIl((float)target + 18.0F, 11.0F, 0.82F),
         0.82F,
         -7630437
      );
   }

   private float liilliiill(class_332 xRight, IIllIIIllIllIIIl mx, lllililillilil my, float target, float ctx, int c, int by) {
      long var16 = -1290398737342229815L;
      String var8 = String.valueOf(Math.max(0L, my.llIlilIliilIlilIli));
      float var9 = 18.0F + (float)Math.ceil((double)llilliilililliil.IiIIlliIIl(var8, 0.82F)) + 6.0F;
      float var10 = target - var9;
      String var11 = IIlilIliiIli(my.IlIIilIlillIIilIli, liIlIliiIlIl<"liIlIliiIlIl","WjFfebAgweIIsURwPmnfY4hvkwRKrv+eGE/6fQUpAyM=">());
      float var12 = this.iiiIIliIIIlIli.IIIllIIliIIl(var11, llilliilililliil.Iliilliiilii((double)c, (double)by, var10, ctx, var9, 16.0F));
      float var13 = this.iiiIIliIIIlIli
         .iliIiiliiiii(var11 + liIlIliiIlIl<"liIlIliiIlIl","j/f5VinUWKXrYx66OrDSJyP9pzvsh09MwvnYWDb9zA==">(), my.lIllilIliiIllilIli ? 1.0F : 0.0F, 16.0F);
      var16 ^= ((long)llilliilililliil.IlIlllIlilIl(xRight, var10 + var9 / 2.0F, ctx + 8.0F, this.iiiIIliIIIlIli.IilliliilIIi(var11, 0.05F)) << 32 ^ var16)
         & -1L << 32;
      IIIiiIillIIiiIil.Ililllililil(
         xRight,
         var10,
         ctx,
         var9,
         16.0F,
         5.0F,
         IilIIIIililIIIIi.Illlllllilll(
            IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.iliIiiliiiii(), -1, 0.03 + 0.06 * (double)var12), -45715, 0.12 * (double)var13
         ),
         IilIIIIililIIIIi.Illlllllilll(
            IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.IIillIiliIil(), 1040187391, (double)var12), llilliilililliil.IIIIllIIIl(-45715, 0.5F), (double)var13
         )
      );
      var16 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(-7630437, -45715, (double)var12), -45715, (double)var13) ^ var16)
         & -1L >>> 32;
      iiIlilIlIIllilIl.IliIlllilIi(
         var10 + 5.0F, ctx + 3.0F, 10.0F, 10.0F, lIlIIiliIlIIil.Iilililiiili(), new Color((int)var16, true), IIIiiIillIIiiIil.liiiIIllIl()
      );
      llilliilililliil.lIlIliIlIl(
         var8,
         var10 + 5.0F + 10.0F + 3.0F,
         llilliilililliil.IllIllllIl(ctx, 16.0F, 0.82F),
         0.82F,
         IilIIIIililIIIIi.Illlllllilll(
            IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var12), IilIIIIililIIIIi.Illlllllilll(-45715, -1, 0.3), (double)var13
         )
      );
      llilliilililliil.IiIlliIliiIl(xRight, (boolean)((int)(var16 >>> 32)));
      mx.liiiIIllIl(var10 - 1.0F, ctx - 1.0F, var9 + 2.0F, 18.0F, () -> {
         if (my.lIllilIliiIllilIli) {
            this.iiiIIliIIIlIli.liiiIIllIl(var11);
         } else {
            this.iiiIIliIIIlIli.iIlIlllllill(var11);
         }

         this.liiIiiiiIi(my);
      });
      this.iliIiiliiiii(
         my.lIllilIliiIllilIli
            ? liIlIliiIlIl<"liIlIliiIlIl","/O/vL97PG7CbnXVmTzrinsnl15nOwqS0CotKgPgLsWM60A==">()
            : liIlIliiIlIl<"liIlIliiIlIl","prb520WcSqd6WZQI7JLnBqKBjXg13XD3ajdC01XRZxw=">(),
         var10,
         ctx,
         var9,
         16.0F,
         c,
         by,
         false
      );
      return var10;
   }

   public boolean illilIilil(int scan, int mod, int key) {
      long var5 = 462236683847912155L;
      var5 ^= ((long)(scan != 257 && scan != 335 ? 0 : 1) << 32 ^ var5) & -1L << 32;
      if ((this.illliIiIilliIi || this.lliliIiililiIi) && this.lIIiiIiiIIiiIi) {
         if (scan == 256) {
            this.IllIllllIl();
            return true;
         } else if (this.illliIiIilliIi) {
            if ((int)(var5 >>> 32) != 0) {
               this.lliililiil();
               return true;
            } else {
               if (scan == 259 && !this.IIiliIilIiliIi.isEmpty()) {
                  this.IIiliIilIiliIi = this.IIiliIilIiliIi.substring(0, this.IIiliIilIiliIi.length() - 1);
                  this.iIiliIiIliliIi.IliIlllilIi();
               }

               return true;
            }
         } else if ((int)(var5 >>> 32) != 0) {
            this.iilIiIIiIi();
            return true;
         } else {
            if (scan == 259 && !this.IiiliIiliiliIi.isEmpty()) {
               this.IiiliIiliiliIi = this.IiiliIiliiliIi.substring(0, this.IiiliIiliiliIi.length() - 1);
               this.iiiliIiIIIiiIi.IliIlllilIi();
            }

            return true;
         }
      } else if (this.liIiiIiiiIiiIi != null) {
         if (scan == 256) {
            this.IIlIilIlIi();
         }

         return true;
      } else if (this.IiIIIliliIIIli.IIlilIliiIli()) {
         if ((int)(var5 >>> 32) != 0) {
            if (this.iIlIiIiIllIiIi == Iilliiillilliiil.iIIIilIiil) {
               this.llIIIliilIIIli = 0L;
               this.Iilililiiili();
            }

            return true;
         } else {
            this.IiIIIliliIIIli.IIlllIlliIll(scan, mod, key);
            this.illIlIilIl();
            return true;
         }
      } else if ((this.illliIiIilliIi || this.lliliIiililiIi) && scan == 256) {
         this.IllIllllIl();
         return true;
      } else {
         return false;
      }
   }

   private void IIIlilIIli(lllililillilil c) {
      this.llIliilIli(liIlIliiIlIl<"liIlIliiIlIl","YNEHzSA559UYLVMvVcRoSaVa+UH7XG2ZBfbPxq4ToHCxYOxR9EGw">(), lIlliiIlli(c.ilIIilIliIiIIilIli), true);
      IlliIilllliIil.Iilllilliill(
         c.IlIIilIlillIIilIli,
         cx -> {
            if (cx.iiiIilIllIIIlilIll) {
               this.llIliilIli(
                  liIlIliiIlIl<"liIlIliiIlIl","MG+h7BUiYTFLrMrLA6ERTald92V7Te8mRSOgo7BizStPlp5M/p8j9duK">(),
                  lIlliiIlli(c.ilIIilIliIiIIilIli) + liIlIliiIlIl<"liIlIliiIlIl","IwENWMbHJLeBeH8Wc+u2vclZBT/Cf+jvMAaCOOoiRe+HArvPFiQkRllC6pw3SW9uOWes">(),
                  true
               );
               this.Iilililiiili();
            } else {
               this.llIliilIli(
                  liIlIliiIlIl<"liIlIliiIlIl","hbaqgXMKXahS1L98rcPuKAG3UMF18StlrrD6OYb6apaHyok6YJFSNXw=">(),
                  cx.ilIlilIllIiIlilIll != null ? cx.ilIlilIllIiIlilIll : cx.IlIlilIllllIlilIll,
                  false
               );
            }
         }
      );
   }

   private void IlIlllIlilIl() {
      if (!iliiiIiIiiiiIi && IIllliIilIllliIi.IliIlllilIi()) {
         iliiiIiIiiiiIi = true;
         IIllliIilIllliIi.iIlIlllllill(
            added -> {
               if (added != null && added > 0) {
                  this.IIIllIIliIIl();
                  this.llIliilIli(
                     liIlIliiIlIl<"liIlIliiIlIl","QJ2hcZsJK38LFFgvv35HsCEVpET72HMA8fK43UJZQMSqLp40y3Mr33Iv">(),
                     added
                        + (
                           added == 1
                              ? liIlIliiIlIl<"liIlIliiIlIl","bLiTKZbIfP+GXOkokrqH5MO4LftQ/6lfCHOW1RHOzUzGDu8=">()
                              : liIlIliiIlIl<"liIlIliiIlIl","fPm856ZE1Gs6KNoURBA9FoKZgVbBSd5uMuyPks4Ma/nt1p0w">()
                        )
                        + liIlIliiIlIl<"liIlIliiIlIl","CN1CSX1cxiHEToSWzS5tnuMVyxZ5dh+p68+GTkbZjDoZL/P1Cm0VWySpXkP4yQ==">(),
                     true
                  );
               }
            }
         );
      }
   }

   private float IIllllIlll(class_332 my, String mx, String loaded, float cardX, int cardY, int cardW, int id, int ctx, int name) {
      long var23 = -6467352818244384982L;
      var23 ^= (68719476736L ^ var23) & -1L << 32;
      float var11 = 30.0F;
      float var12 = (llilliilililliil.IiIilliIil(liIlIliiIlIl<"liIlIliiIlIl","ADVl2aM0EfHaWUPI8B9SBI4gc5VgsrYB2budqJEk+Q286w==">()) + 5.0F) * cardX;
      String var13 = llilliilililliil.IIiilIiiiIii().Iiilliiliiil(loaded, (float)(id - 48) - var11 - var12);
      float var14 = llilliilililliil.llIIlilIIl(var13);
      float var15 = Math.max(44.0F, (float)Math.ceil((double)((var11 + var14 + var12) * 2.0F)) / 2.0F);
      var23 ^= (
            (long)(
                  !llilliilililliil.Iliilliiilii(
                           (double)ctx, (double)name, (float)cardY, (float)(cardW + (int)(var23 >>> 32)), (float)id, (float)(60 - (int)(var23 >>> 32))
                        )
                        && !llilliilililliil.Iliilliiilii((double)ctx, (double)name, (float)cardY, (float)cardW, var15, (float)((int)(var23 >>> 32)))
                     ? 0
                     : 1
               )
               ^ var23
         )
         & -1L >>> 32;
      float var17 = llilliilililliil.lililiilil(
         my,
         (float)cardY,
         (float)cardW,
         (float)id,
         60.0F,
         var15,
         this.iiiIIliIIIlIli
            .IIIllIIliIIl(IIlilIliiIli(mx, liIlIliiIlIl<"liIlIliiIlIl","sjIvKUUMBRzW/RU4ABUV+kUAjrGoRcBUet2eyhYXNsM=">()), (boolean)((int)var23)),
         cardX
      );
      float var18 = (float)(cardY + 8);
      float var19 = var18 + 10.0F + 4.0F;
      iiIlilIlIIllilIl.IliIlllilIi(
         var18,
         (float)(cardW + 3) + 0.5F,
         10.0F,
         10.0F,
         lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<"liIlIliiIlIl","bbWbZhcg72+BdwugoVd/kbjaCMN9BT14LAGvl8KTO7r0TkWzIvE=">()),
         new Color(IilIIIIililIIIIi.Illlllllilll(-7630437, IlIIilIlllIIilIl.lliiIlliIl, (double)cardX), true),
         IIIiiIillIIiiIil.liiiIIllIl()
      );
      llilliilililliil.iiIIlIIlIl(var13, var19, llilliilililliil.IllIllllIl((float)(cardW + 3), 11.0F, 1.0F), -920587);
      float var20 = illliIilli((cardX - 0.8F) / 0.2F);
      if (var20 > 0.01F) {
         float var21 = IliiIilliiIi.IilliliilIIi(var20);

         try {
            llilliilililliil.lIliliIlil(
               my, liIlIliiIlIl<"liIlIliiIlIl","ADVl2aM0EfHaWUPI8B9SBI4gc5VgsrYB2budqJEk+Q286w==">(), var19 + var14 + 5.0F, (float)(cardW + 3)
            );
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var21);
         }
      }

      return var17;
   }

   private IlIIililllIIilil lIIIiiIIIi() {
      return llilIllililIll.iliIiiliiiii(IlIIililllIIilil.class) instanceof IlIIililllIIilil var2 ? var2 : null;
   }

   public boolean iiIilIIlil(double my, double mx, double amt) {
      return false;
   }

   private static String Iilllilliill(long seconds) {
      if (seconds <= 0L) {
         return null;
      } else {
         try {
            return Instant.ofEpochSecond(seconds).atZone(ZoneId.systemDefault()).format(iiiilIiIIIIiIi);
         } catch (RuntimeException var3) {
            return null;
         }
      }
   }

   public boolean IiIilliIil(double mx, double my, int btn) {
      long var8 = -5036283494299978456L;
      if (btn != 0) {
         return false;
      } else {
         var8 ^= ((long)(this.iiIIIliIIlIIli && this.IiIIIliliIIIli.Illillliilli(mx, my) ? 1 : 0) << 32 ^ var8) & -1L << 32;
         this.IiIIIliliIIIli.IiIlliIliiIl(mx, my, btn);
         if (!this.iiIIIliIIlIIli) {
            this.IiIIIliliIIIli.lIiiIiIlilli();
         }

         this.lIIiiIiiIIiiIi = false;
         if ((int)(var8 >>> 32) != 0) {
            return true;
         } else {
            var8 ^= ((long)this.lliIIliiliIIli.IilliliilIIi(mx, my) ^ var8) & -1L >>> 32;
            if (this.illliIiIilliIi || this.lliliIiililiIi) {
               this.iiIIlIIlIl();
            }

            return (int)var8 != 0 || this.illliIiIilliIi || this.lliliIiililiIi || this.liIiiIiiiIiiIi != null;
         }
      }
   }

   private void lIilliIill(class_332 top, int my, int now, int ctx, long mx) {
      long var32 = -6356961736865071157L;
      long var34 = 4106258180104746481L;
      long var36 = -8605192255021802568L;
      long var38 = -8269946151411879680L;
      long var40 = -5166627847589161287L;
      long var30 = 2674711317842308898L;
      if (this.lIlIIliiIlIIli == null && this.IllIIlilllIIli == null && !this.illIIliIilIIli) {
         this.Iilililiiili();
      }

      if (this.llIIIliilIIIli != 0L && mx - this.llIIIliilIIIli > 400L) {
         this.llIIIliilIIIli = 0L;
         this.Iilililiiili();
      }

      var30 ^= ((long)this.illIIliIilIIli << 32 ^ var30) & -1L << 32;
      String var8 = this.IllIIlilllIIli;
      Ilillillilli var9 = this.lIlIIliiIlIIli;
      if (var9 != this.IIiIIlilIiIIli) {
         this.IIiIIlilIiIIli = var9;
         HashSet var10 = new HashSet();
         ArrayList var11 = new ArrayList();
         if (var9 != null) {
            for (lllililillilil var13 : var9.ilillIlIlIiillIlIl) {
               var10.add(var13.IlIIilIlillIIilIli);
               String var14 = Iilllilliill(var13.IiIlilIliliIlilIli);
               var11.add(var14 != null ? var14 : Iilllilliill(var13.iiIlilIliIIllilIli));
            }
         }

         this.iIiIIliIliIIli = var11;
         this.Illillliilli(var10);
      }

      IIliiIlllIliiIll var48 = llilliilililliil.IIiilIiiiIii();
      this.ilillIiill(top, my, now, ctx, (int)(var30 >>> 32) == 0 && var8 == null ? var9 : null);
      var30 ^= ((long)(my + 20) ^ var30) & -1L >>> 32;
      if ((int)(var30 >>> 32) == 0) {
         if (var8 != null) {
            llilliilililliil.IilIililIi(
               top,
               this.lliIIliiliIIli,
               this.iiiIIliIIIlIli,
               liIlIliiIlIl<"liIlIliiIlIl","Nkdvsyfr7UOg0rRcCSFOnK9LqUXf8Rj98WCeJ+uGRy4Xso8QqaopcdQ=">(),
               (float)this.IlIIiIillIIiIi,
               (float)((int)var30),
               (float)this.liIIiIiiiIIiIi,
               120.0F,
               lIlIIiliIlIIil.IiIlliIliiIl(),
               liIlIliiIlIl<"liIlIliiIlIl","7LXQwlSfMdq0CaVO2CQH+cvQgO2s8pONsPPq1bpfJk6MjB8=">(),
               var48.Iiilliiliiil(var8, (float)this.liIIiIiiiIIiIi / 0.82F),
               liIlIliiIlIl<"liIlIliiIlIl","+kAtOIO3YMGoH9Nw8UR6AJqYgM6hE4VNNp4sIQY4kwM4">(),
               now,
               ctx,
               this::Iilililiiili
            );
         } else if (var9 != null && !var9.ilillIlIlIiillIlIl.isEmpty()) {
            this.Iliilliiilii(Iilliiillilliiil.iIIIilIiil.ordinal(), System.identityHashCode(var9), 0);
            float var49 = llilliilililliil.IiIilliIil(liIlIliiIlIl<"liIlIliiIlIl","8XSaEy7cNwoz7wjbjuIDCMop+ccVENaRcNfGLIYJDbYaYGfr">());
            float var50 = llilliilililliil.IiIilliIil(liIlIliiIlIl<"liIlIliiIlIl","wVKK56ocwR2vGwVRkcAKzHPjHn28gp6h40aE/iwO2zE8">());
            var34 ^= (4294967296L ^ var34) & -1L << 32;

            for (long var56 = var34 ^ (0L ^ var34) & -1L >>> 32; (int)var56 < var9.ilillIlIlIiillIlIl.size(); var56 ^= (var56 ^ var56 + (long)1) & -1L >>> 32) {
               long var57 = var36 ^ ((long)((int)var56 % 2) << 32 ^ var36) & -1L << 32;
               var36 = var57 ^ ((long)llilliilililliil.iIiIlIliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 2, 4, (int)(var57 >>> 32)) ^ var57) & -1L >>> 32;
               var38 ^= ((long)llilliilililliil.lliIliliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 2, 4, (int)(var36 >>> 32)) << 32 ^ var38) & -1L << 32;
               var38 ^= ((long)((int)var30 + (int)var56 / 2 * 64) ^ var38) & -1L >>> 32;
               if ((int)(var36 >>> 32) == 0) {
                  var56 ^= ((long)this.liIlliiIll(top, (int)var38, 60) << 32 ^ var56) & -1L << 32;
               }

               if ((int)(var56 >>> 32) != 0) {
                  iIIliiIiIlIliiIi var20 = this.lIIlIliiIIlIli.lIiiIiIlilli((int)var56);
                  if (!var20.iliIiiliiiii()) {
                     float var21 = var20.IiilIIIlIi;
                     float var22 = var20.liilIIIlIi;
                     IIllIIIllIllIIIl var23 = var20.lIIiIIIlIi ? this.lliIIliiliIIli : IIllIIIllIllIIIl.ililiiIlIl;
                     var40 ^= ((long)(var20.IIIiIIIlIi ? now : this.IlIIiIillIIiIi - 4000) << 32 ^ var40) & -1L << 32;
                     lllililillilil var25 = var9.ilillIlIlIiillIlIl.get((int)var56);
                     var40 ^= (
                           (long)llilliilililliil.IlIlllIlilIl(
                                 top, (float)((int)var36) + (float)((int)(var38 >>> 32)) / 2.0F, (float)((int)var38) + 30.0F, var20.iiilIIIlIi
                              )
                              ^ var40
                        )
                        & -1L >>> 32;

                     try {
                        this.Iiiiliiiiiii(top, lIlliiIlli(var25.ilIIilIliIiIIilIli), 0.0F, var21, (int)var36, (int)var38, (int)(var38 >>> 32));
                        if (var22 > 0.002F) {
                           float var27 = IliiIilliiIi.IilliliilIIi(var22);

                           try {
                              this.Ilillllill(
                                 top,
                                 var23,
                                 var25,
                                 (int)var56 < this.iIiIIliIliIIli.size() ? this.iIiIIliIliIIli.get((int)var56) : null,
                                 (int)var36,
                                 (int)var38,
                                 (int)(var38 >>> 32),
                                 (int)(var40 >>> 32),
                                 ctx,
                                 var49,
                                 var50
                              );
                           } finally {
                              IliiIilliiIi.lIiiIiIlilli(var27);
                           }
                        }
                     } finally {
                        llilliilililliil.IiIlliIliiIl(top, (boolean)((int)var40));
                     }
                  }
               }
            }
         } else {
            llilliilililliil.IilIililIi(
               top,
               this.lliIIliiliIIli,
               this.iiiIIliIIIlIli,
               liIlIliiIlIl<"liIlIliiIlIl","2njCgrmUCQ4bzpe6qAtOsbjT+cVgxvV4irCUkceotcGypM3zUzGYuS0=">(),
               (float)this.IlIIiIillIIiIi,
               (float)((int)var30),
               (float)this.liIIiIiiiIIiIi,
               120.0F,
               lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<"liIlIliiIlIl","+EDnmwfWj86hwSIcUIWu0CeeeOw9CN3vng689qe7Rxf0fg==">()),
               liIlIliiIlIl<"liIlIliiIlIl","5ozcZTktbff/dnq1BLmWlSdnRwinDWrL2CCuaT3e0D0J9DwFdIk=">(),
               liIlIliiIlIl<"liIlIliiIlIl","m8wM6x8UiobXPBQB7H/Rd333Y4WTFcMCm0wVMrwT/fx1wUuBYYH8fRRgBsUgQT7W8loYSnpK+CAMOpE=">(),
               null,
               now,
               ctx,
               null
            );
         }
      } else {
         var32 ^= (0L ^ var32) & -1L << 32;

         while ((int)(var32 >>> 32) < 6) {
            var32 ^= ((long)((int)(var32 >>> 32) % 2) ^ var32) & -1L >>> 32;
            llilliilililliil.iilIiIIiIi(
               top,
               (float)llilliilililliil.iIiIlIliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 2, 4, (int)var32),
               (float)((int)var30 + (int)(var32 >>> 32) / 2 * 64),
               (float)llilliilililliil.lliIliliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 2, 4, (int)var32),
               60.0F,
               64.0F + (float)((int)(var32 >>> 32) % 3) * 14.0F,
               (int)(var32 >>> 32)
            );
            var32 += 4294967296L;
         }
      }
   }

   public void lIliliIlil(double btn, double mx, int my) {
   }

   public boolean lililiilil(char chr, int mod) {
      if ((this.illliIiIilliIi || this.lliliIiililiIi) && this.lIIiiIiiIIiiIi) {
         if (this.illliIiIilliIi) {
            if (Illlilllli(chr) && this.IIiliIilIiliIi.length() < 64) {
               this.IIiliIilIiliIi = this.IIiliIilIiliIi + chr;
               this.iIiliIiIliliIi.IliIlllilIi();
            }
         } else if (IIiillIiil(chr) && this.IiiliIiliiliIi.length() < 12) {
            this.IiiliIiliiliIi = this.IiiliIiliiliIi + Character.toUpperCase(chr);
            this.iiiliIiIIIiiIi.IliIlllilIi();
         }

         return true;
      } else if (this.liIiiIiiiIiiIi == null && this.IiIIIliliIIIli.IIlilIliiIli()) {
         this.IiIIIliliIIIli.Illlllllilll(chr, mod);
         this.illIlIilIl();
         return true;
      } else {
         return false;
      }
   }

   private void iliIiiliiiii(String my, float text, float ah, float ay, float mx, int ax, int below, boolean aw) {
      if (llilliilililliil.Iliilliiilii((double)ax, (double)below, text, ah, ay, mx)) {
         this.lIilIliiIilIli = my;
         this.ililIliIiilIli = text + ay / 2.0F;
         this.liilIliiiilIli = aw ? ah + mx + 4.0F : ah - 4.0F;
         this.llIiIliilIiIli = aw;
      }
   }

   private int lIIlliIIll() {
      long var2 = 1237735979612850673L;
      var2 ^= ((long)this.iiiIlIIIll().size() << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) == 0 ? 0 : (int)(var2 >>> 32) * 10 + 6;
   }

   private void IllIllllIl() {
      this.illliIiIilliIi = false;
      this.IIiliIilIiliIi = "";
      this.lilliIiiilliIi = null;
      this.lliliIiililiIi = false;
      this.IiiliIiliiliIi = "";
      this.lIIiiIiiIIiiIi = false;
   }

   private void iliIiIiiIi() {
      Thread var1 = new Thread(
         () -> {
            try {
               FileDialog var1x = new FileDialog(
                  (Frame)null, liIlIliiIlIl<"liIlIliiIlIl","lTNWd0FkeWNK0QlUxK4UrE91uc9Um215ne3CIk92sgXQ6v8au8texdLmyFtW1A==">(), 0
               );
               var1x.setFile(liIlIliiIlIl<"liIlIliiIlIl","jPSn1mmOqKY1cckkIp4UO6NqTfR5O4nEcebEY6YHU1LP3Wxr0GC+xenyf0M0zA==">());
               var1x.setVisible(true);
               String var2 = var1x.getDirectory();
               String var3 = var1x.getFile();
               if (var2 == null || var3 == null) {
                  return;
               }

               byte[] var4 = Files.readAllBytes(Path.of(var2, var3));
               iliiIIllIiiiIIll[] var5 = new iliiIIllIiiiIIll[1];
               String[] var6 = new String[1];
               lIlIllIliIlIllIl var7 = lilllIiliilllIil.Iliilliiilii(var4, var5, var6);
               if (var7 == null) {
                  this.llIliilIli(
                     liIlIliiIlIl<"liIlIliiIlIl","LVwK3/CJkDStTcknmD6Hp6OpIMdqK0MoF5NNCD6yHXiJRW1AnL8DUks=">(),
                     var5[0] != null && var5[0].IilliliilIIi() != null
                        ? var5[0].IilliliilIIi()
                        : liIlIliiIlIl<"liIlIliiIlIl","inNAlIAbiZM332USnPZYbfsafBejmNbm3v17+EJTLeq+q1HhqyIQv+YJ">(),
                     false
                  );
                  return;
               }

               String var8 = var6[0];
               IillilIilillilIi var9 = new IillilIilillilIi();
               var9.lllIillIIi = ilIIIllIiIIIll.ilIIlIIilIiIIlIIil;

               try {
                  lilllIiliilllIil.iilllIIill(var8, var9);
               } catch (IOException var11) {
               }

               this.llIliilIli(liIlIliiIlIl<"liIlIliiIlIl","aPEm5HBBruyeqQs82xWm1o2rwE3n03KRxS0Ac3l4hcV7wvMnfYTISw3tlQ==">(), var7.iiililIiIl, true);
               this.IIIllIIliIIl();
            } catch (Throwable var12) {
               this.llIliilIli(
                  liIlIliiIlIl<"liIlIliiIlIl","LVwK3/CJkDStTcknmD6Hp6OpIMdqK0MoF5NNCD6yHXiJRW1AnL8DUks=">(),
                  liIlIliiIlIl<"liIlIliiIlIl","/8Kp7t9rxe05dFrj0i6ijSRLfvhoW9GC3oj5tTRkWdNKtcx9pehDopXJnd1usYTPIi65csyL9NK6">(),
                  false
               );
            }
         },
         liIlIliiIlIl<"liIlIliiIlIl","F4Lip5Cl3sRY8c6gKGJ1o1nsY+GgFwz4VRCK+QjJc1YDeDfFg7o6Eyj72rWvRQ==">()
      );
      var1.setDaemon(true);
      var1.start();
   }

   public void IliIlllilIi(int y, int w, int x, int h) {
      this.IlIIiIillIIiIi = y;
      this.ilIIiIiIiIIiIi = w;
      this.liIIiIiiiIIiIi = x;
      this.IIlIiIilIlIiIi = h;
   }

   private void IiIlliIliiIl(List<IlIIillllIIill> source) {
      long var11 = -2441814465492995253L;
      ArrayList var2 = new ArrayList(source.size());

      for (IlIIillllIIill var4 : source) {
         ilIIIllIiIIIll var5 = lilllIiliilllIil.lllllillll(var4.iIIIilIIiIlIIilIIi).lllIillIIi;
         String var6 = var4.IIIIilIIilIIIilIIi.iiililIiIl != null ? var4.IIIIilIIilIIIilIIi.iiililIiIl : var4.iIIIilIIiIlIIilIIi;
         var11 ^= ((long)IIlllIlliIll(var4.IIIIilIIilIIIilIIi.ilIiilIiIl) << 32 ^ var11) & -1L << 32;
         String var8 = lIlliiIlli(var4.IIIIilIIilIIIilIIi.lIIiilIiIl);
         String var9 = null;
         if (var5 == ilIIIllIiIIIll.ilIIlIIilIiIIlIIil) {
            var9 = liIlIliiIlIl<"liIlIliiIlIl","Eo7ADlzPxXQpAw/bN2zexAH2X5Zof0zgBka6SSqHwg6B3Nfw">();
         } else if (var5 == ilIIIllIiIIIll.liIIlIIiliiIIlIIil && !var8.isEmpty()) {
            var9 = liIlIliiIlIl<"liIlIliiIlIl","Bn6IlasD2WGlxSRWiP8gOQmudW+hsfbZeB5pxp0LQg==">() + var8;
         }

         String var10 = Illlllllilll(var4.IIIIilIIilIIIilIIi.IlIiilIiIl);
         if (var10 == null) {
            var10 = Illlllllilll(var4.IIIIilIIilIIIilIIi.iIIiilIiIl);
         }

         var2.add(
            new iiiliiiIIIiiii(
               var4.iIIIilIIiIlIIilIIi,
               var6,
               (var6 + liIlIliiIlIl<"liIlIliiIlIl","Hw6PGqXDkikTz3ymDU4Lmc2V8kegIRKAVHJD54M=">() + var8).toLowerCase(Locale.ROOT),
               (int)(var11 >>> 32)
                  + (
                     (int)(var11 >>> 32) == 1
                        ? liIlIliiIlIl<"liIlIliiIlIl","vjV0Zolz8HxnTRqet18qklpcfruOX2LsYR6jZcGTTJ9SzHw94TQ=">()
                        : liIlIliiIlIl<"liIlIliiIlIl","MnH1Sk+MvsJNaOg7WkQRSapt5d3K+YO8CKlxM8D/DwhsY1sqAVcl">()
                  ),
               var9,
               var10,
               var5 == ilIIIllIiIIIll.IlIIlIIilllIIlIIil,
               var5 == ilIIIllIiIIIll.liIIlIIiliiIIlIIil
            )
         );
      }

      this.iilIiIiIIiIiIi = var2;
      this.IilIiIililIiIi = source;
      this.liiIiIiiiiIiIi = lilllIiliilllIil.IIIIllIIIl();
   }

   private void IIlIilIlIi() {
      this.liIiiIiiiIiiIi = null;
      this.IIliiIilIliiIi = null;
      this.iIliiIiIlliiIi = null;
      this.IiliiIililiiIi = null;
      this.llliiIiilliiIi = false;
      this.iiliiIiIIiiiIi = new ArrayList<>();
      this.lIiiiIiiIiiiIi = null;
      this.IlIlIlillIlIli = -1;
      this.IIIllIIliIIl();
   }

   private void lliililiil() {
      String var1 = this.IIiliIilIiliIi.trim();
      if (var1.length() < 3) {
         this.llIliilIli(
            liIlIliiIlIl<"liIlIliiIlIl","S77te/XK+ZJKKr4jd76uyIF0vPDEGcvv1zmuRIgJ4d+M7X4=">(),
            liIlIliiIlIl<"liIlIliiIlIl","Bp3hxs7qLn9srxK2hZB5U9UkMxn95sCs48o28PwcCDK71AJcIEi/Bm3kFES91bdheGiR4oAvFsoMo+dNaf8=">(),
            false
         );
      } else {
         try {
            if (this.lilliIiiilliIi == null) {
               String var2 = iilIliIlIIiIliIl.iIlIlllllill(
                  var1, liIlIliiIlIl<"liIlIliiIlIl","cvXnrD6uMME/A8RbeiJDWqo3QL8H/hzbQv5zAx5zeekXXKk9QdFZElwg0IqSImDo9Pzd7a0=">(), IiIliliIli()
               );
               lilllIiliilllIil.Iiiiliiiiiii(var2);
               this.llIliilIli(
                  liIlIliiIlIl<"liIlIliiIlIl","Qap3Kqmm1f987aBUBVrIXmAPwCCwDgkBX/Nwi0QE/Qm2bqsSePkuyUeQ">(),
                  var1 + liIlIliiIlIl<"liIlIliiIlIl","l6rKMhAfN6qQ2JaDVIbO4d5XY+nUHz2A/OpmPEt9WpnfjA==">(),
                  true
               );
               if (IIllliIilIllliIi.IliIlllilIi()) {
                  IIllliIilIllliIi.liiiIIllIl(var2, r -> {
                  });
               }
            } else {
               lilllIiliilllIil.Illillliilli(this.lilliIiiilliIi, var1);
               this.llIliilIli(liIlIliiIlIl<"liIlIliiIlIl","S8LKGF1izIva2Q88z+3dD9Xt/VynBGE8w7Rkc0VtSpYc6HusMSoeurkO">(), var1, true);
            }

            this.IIIllIIliIIl();
         } catch (IOException var3) {
            this.llIliilIli(
               liIlIliiIlIl<"liIlIliiIlIl","S77te/XK+ZJKKr4jd76uyIF0vPDEGcvv1zmuRIgJ4d+M7X4=">(),
               liIlIliiIlIl<"liIlIliiIlIl","c72Zk7tG/O/YOMTPQ6utqGjRXAwOUHOx5EAzltQURNsZ0hSL3GWMJLI=">() + var3.getMessage(),
               false
            );
         }

         this.illliIiIilliIi = false;
         this.IIiliIilIiliIi = "";
         this.lilliIiiilliIi = null;
      }
   }

   private void IilIililIi(String code) {
      if (this.iIliiIiIlliiIi != null) {
         IlliIilllliIil.IIIilIIiiIIi(
            this.iIliiIiIlliiIi,
            code,
            res -> {
               if (res.iiiIilIllIIIlilIll) {
                  this.llIliilIli(
                     liIlIliiIlIl<"liIlIliiIlIl","NrOgeVqD/BWVCcJN035IuWtrmnF8T2Oagcwxj7F26tvfLfE6eGU=">(),
                     code + liIlIliiIlIl<"liIlIliiIlIl","wfvJ/nlIjzs5olRYe5hf1Dniuw5DDlTDOLqZS24wZMzkRdNK">(),
                     false
                  );
                  this.iIlIiIllIi();
               } else {
                  this.llIliilIli(
                     liIlIliiIlIl<"liIlIliiIlIl","vy9ApVINMArxzXasXzlmdDWV7S/smcCV+suREENuvnXe">(),
                     res.ilIlilIllIiIlilIll != null
                        ? res.ilIlilIllIiIlilIll
                        : liIlIliiIlIl<"liIlIliiIlIl","V1UgPlhEJbRgU45U+U2eChJ+oKM570B4B2cBkdm1pZOXYj3P+1LGahOQkw==">(),
                     false
                  );
               }
            }
         );
      }
   }

   private void iIlIiIllIi() {
      if (this.iIliiIiIlliiIi != null) {
         this.llliiIiilliiIi = true;
         IlliIilllliIil.Iiilliiliiil(
            this.iIliiIiIlliiIi,
            res -> {
               this.llliiIiilliiIi = false;
               if (res.iiiIilIllIIIlilIll) {
                  this.iiliiIiIIiiiIi = res.lIIlilIlliIIlilIll;
                  this.IiliiIililiiIi = null;
               } else {
                  this.IiliiIililiiIi = res.ilIlilIllIiIlilIll != null
                     ? res.ilIlilIllIiIlilIll
                     : liIlIliiIlIl<"liIlIliiIlIl","Ndw5sDgCCJ8SRLDpjkinQbyuEwthG3uiX3iTtUU/Nh8E5OK125c/rg7NUsFPj90z">();
               }
            }
         );
      }
   }

   private boolean liIlliiIll(class_332 rowY, int ctx, int rowH) {
      long var8 = -8242906262037441821L;
      Matrix3x2fStack var4 = rowY.method_51448();
      float var5 = (float)this.IlIIiIillIIiIi + (float)this.liIIiIiiiIIiIi / 2.0F;
      var8 ^= ((long)(rowH + 16) << 32 ^ var8) & -1L << 32;

      for (long var11 = var8 ^ (-16L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32) + 16; var11 ^= (var11 ^ var11 + (long)16) & -1L >>> 32) {
         var4.transformPosition(var5, (float)(ctx + Math.min((int)var11, (int)(var11 >>> 32))), this.llllIliilllIli);
         if (rowY.method_58135(Math.round(this.llllIliilllIli.x), Math.round(this.llllIliilllIli.y))) {
            return true;
         }
      }

      return false;
   }

   private void llIIlilIIl() {
      if (!this.illliIiIilliIi) {
         this.IIiliIilIiliIi = "";
      }

      this.illliIiIilliIi = true;
      this.lilliIiiilliIi = null;
      this.lliliIiililiIi = false;
      this.IiiliIiliiliIi = "";
      this.iiIIlIIlIl();
   }

   private static String Illlllllilll(String iso) {
      if (iso != null && !iso.isEmpty()) {
         try {
            return OffsetDateTime.parse(iso).atZoneSameInstant(ZoneId.systemDefault()).format(iiiilIiIIIIiIi);
         } catch (RuntimeException var2) {
            return null;
         }
      } else {
         return null;
      }
   }

   private void iIIIlIlIIl(int index) {
      this.IiIIIliliIIIli.lIiiIiIlilli();
      if (this.liiiiIiiiiiiIi != index) {
         this.liiiiIiiiiiiIi = index;
         this.Iilililiiili();
      }
   }

   private boolean Ililllililil() {
      return this.iIlIiIiIllIiIi == Iilliiillilliiil.lIIIilIiil && this.liIiiIiiiIiiIi != null;
   }

   private static String iiIliIIlli(String avail, float s) {
      String var2 = avail;

      while (var2.length() > 1 && llilliilililliil.llIIlilIIl(var2) > s) {
         var2 = var2.substring(1);
      }

      return var2;
   }

   private static float IIIIllIIIl(String cardW, float loaded, int name) {
      float var3 = 30.0F;
      float var4 = (llilliilililliil.IiIilliIil(liIlIliiIlIl<"liIlIliiIlIl","ADVl2aM0EfHaWUPI8B9SBI4gc5VgsrYB2budqJEk+Q286w==">()) + 5.0F) * loaded;
      String var5 = llilliilililliil.IIiilIiiiIii().Iiilliiliiil(cardW, (float)(name - 48) - var3 - var4);
      return Math.max(44.0F, (float)Math.ceil((double)((var3 + llilliilililliil.llIIlilIIl(var5) + var4) * 2.0F)) / 2.0F);
   }

   private void IIiilIiiiIii(Iilliiillilliiil t) {
      if (this.iIlIiIiIllIiIi != t) {
         if (this.iIlIiIiIllIiIi != Iilliiillilliiil.iIIIilIiil) {
            this.iIIIIliIlIIIli = this.IiIIIliliIIIli.IlIillIiilIi();
         }

         this.iIlIiIiIllIiIi = t;
         this.IillIlilillIli = System.currentTimeMillis();
         this.IiIIIliliIIIli.lIiiIiIlilli();
         this.IiIIIliliIIIli.IiIiliIiiiIi(t == Iilliiillilliiil.iIIIilIiil ? this.IIIIIlilIIIIli : this.iIIIIliIlIIIli);
         this.illliIiIilliIi = false;
         this.IIiliIilIiliIi = "";
         this.lilliIiiilliIi = null;
         this.lliliIiililiIi = false;
         this.IiiliIiliiliIi = "";
         this.lIIiiIiiIIiiIi = false;
         this.liIiiIiiiIiiIi = null;
         this.iiliiIiIIiiiIi = new ArrayList<>();
         this.iIliiIiIlliiIi = null;
         this.IiliiIililiiIi = null;
         this.llliiIiilliiIi = false;
         this.iiiIIliIIIlIli.IiIlliIliiIl(liIlIliiIlIl<"liIlIliiIlIl","IqYGNfJ3VvAJdy9RsB0kqPEgXZD8NhK+x7MpwYbQKjY+">(), 0.0F);
         this.Illillliilli(Set.of());
         this.lIiIiIiiIiIiIi = null;
         this.IIiIIlilIiIIli = null;
         this.IliiiIilliiiIi = null;
         this.IlIlIlillIlIli = -1;
         this.lIIlIliiIIlIli.IliIlllilIi();
         if (t != Iilliiillilliiil.iIIIilIiil) {
            this.IIIllIIliIIl();
         }
      }
   }

   public void IilliliilIIi() {
      this.IiIIIliliIIIli.lIiiIiIlilli();
      this.lIIiiIiiIIiiIi = false;
   }

   public boolean iIlIlllllill() {
      return false;
   }

   private static boolean Illlilllli(char c) {
      return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == ' ' || c == '_' || c == '-';
   }

   private void iIiIlIliIl(class_332 ctx, int mx, int my) {
      long var16 = -5912461915151671256L;
      long var12 = -5619900779122087141L;
      long var14 = -5046087940990572996L;
      float var4 = llilliilililliil.IiiIlliiIl(
         ctx, liIlIliiIlIl<"liIlIliiIlIl","S77te/XK+ZJKKr4jd76uyIF0vPDEGcvv1zmuRIgJ4d+M7X4=">(), (float)this.IlIIiIillIIiIi, (float)this.ilIIiIiIiIIiIi, 22.0F
      );
      float var5 = llilliilililliil.iiiIlIIIll(
         ctx,
         this.lliIIliiliIIli,
         this.iiiIIliIIIlIli,
         liIlIliiIlIl<"liIlIliiIlIl","0p97Jr4sBap+Lu/hXnYG2X2LiB+v1oAmo3ITOgUstZg=">(),
         liIiIIiiiIiIIi,
         this.iIlIiIiIllIiIi.ordinal(),
         var4 + 10.0F,
         (float)this.ilIIiIiIiIIiIi,
         22.0F,
         mx,
         my,
         i -> this.IIiilIiiiIii(ilIiIIiIiIiIIi[i])
      );
      var12 ^= ((long)this.Ililllililil() << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)(this.iIlIiIiIllIiIi == Iilliiillilliiil.lIIIilIiil && (int)(var12 >>> 32) == 0 ? 1 : 0) ^ var12) & -1L >>> 32;
      float var8 = (float)(this.IlIIiIillIIiIi + this.liIIiIiiiIIiIi);
      if ((int)var12 != 0) {
         var8 = llilliilililliil.lllllillll(
               ctx,
               this.lliIIliiliIIli,
               this.iiiIIliIIIlIli,
               liIlIliiIlIl<"liIlIliiIlIl","SEEu/0dURIq/mITz43K9M1I7mN0cbQacptVV908i2g==">(),
               liIlIliiIlIl<"liIlIliiIlIl","mV3r+4BSBBWL1/1x/x40wiigED2bWJIlpJhvg243qQ==">(),
               lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<"liIlIliiIlIl","m84phVvAHpN9e5MteIkJUt6d0xUamqhHIPVWqjY/rWI=">()),
               (float)(this.IlIIiIillIIiIi + this.liIIiIiiiIIiIi),
               (float)this.ilIIiIiIiIIiIi + 2.0F,
               18.0F,
               mx,
               my,
               true,
               this::llIIlilIIl
            )
            - 8.0F
            - 62.0F;
      }

      var14 ^= ((long)((int)Math.ceil((double)(var5 + 8.0F))) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)((int)var12 != 0 ? (int)Math.floor((double)(var8 - 6.0F)) : this.IlIIiIillIIiIi + this.liIIiIiiiIIiIi) ^ var14) & -1L >>> 32;
      var16 ^= ((long)Math.min(124, (int)var14 - (int)(var14 >>> 32)) << 32 ^ var16) & -1L << 32;
      this.iiIIIliIIlIIli = (int)(var12 >>> 32) == 0 && (int)(var16 >>> 32) >= 56;
      if (this.iiIIIliIIlIIli) {
         this.IiIIIliliIIIli.IliIlllilIi((int)(var14 >>> 32), this.ilIIiIiIiIIiIi + 2, (int)(var16 >>> 32), 18);
         this.IiIIIliliIIIli.iliIiiliiiii(ctx, mx, my, 0.0F);
      } else {
         this.IiIIIliliIIIli.lIiiIiIlilli();
      }

      if ((int)var12 != 0) {
         this.lliIliliIl(ctx, Math.min(var8, this.iiIIIliIIlIIli ? (float)((int)(var14 >>> 32) + (int)(var16 >>> 32)) + 6.0F : var5 + 8.0F), mx, my);
      }
   }

   private void lllllillll(class_332 now, IIllIIIllIllIIIl my, int mx, int top, int ctx, long mine, boolean target) {
      long var33 = 4545264821476725441L;
      long var35 = 1167180545334837699L;
      long var27 = -1218889613783728125L;
      long var29 = 3781226040320356815L;
      long var31 = 3061683258839680421L;
      var27 ^= (4294967296L ^ var27) & -1L << 32;
      var27 ^= (0L ^ var27) & -1L >>> 32;

      while ((int)var27 < this.IliIiIilliIiIi.size()) {
         var27 ^= ((long)((int)(var27 >>> 32) * 31 + this.IliIiIilliIiIi.get((int)var27).IliIlllilIi().hashCode()) << 32 ^ var27) & -1L << 32;
         var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32;
      }

      this.Iliilliiilii(this.iIlIiIiIllIiIi.ordinal(), (int)(var27 >>> 32), this.IliIiIilliIiIi.size());
      var27 ^= (1L ^ var27) & -1L >>> 32;
      var29 ^= (0L ^ var29) & -1L << 32;

      while ((int)(var29 >>> 32) < this.IliIiIilliIiIi.size()) {
         var29 ^= ((long)((int)(var29 >>> 32) % 2) ^ var29) & -1L >>> 32;
         var31 ^= ((long)llilliilililliil.iIiIlIliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 2, 4, (int)var29) << 32 ^ var31) & -1L << 32;
         var31 ^= ((long)llilliilililliil.lliIliliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 2, 4, (int)var29) ^ var31) & -1L >>> 32;
         var33 ^= ((long)(mx + (int)(var29 >>> 32) / 2 * 64) << 32 ^ var33) & -1L << 32;
         if ((int)var29 == 0) {
            var27 ^= ((long)this.liIlliiIll(now, (int)(var33 >>> 32), 60) ^ var27) & -1L >>> 32;
         }

         if ((int)var27 != 0) {
            iIIliiIiIlIliiIi var16 = this.lIIlIliiIIlIli.lIiiIiIlilli((int)(var29 >>> 32));
            if (!var16.iliIiiliiiii()) {
               float var17 = var16.IiilIIIlIi;
               float var18 = var16.liilIIIlIi;
               IIllIIIllIllIIIl var19 = var16.lIIiIIIlIi ? my : IIllIIIllIllIIIl.ililiiIlIl;
               var33 ^= ((long)(var16.IIIiIIIlIi ? top : this.IlIIiIillIIiIi - 4000) ^ var33) & -1L >>> 32;
               iiiliiiIIIiiii var21 = this.IliIiIilliIiIi.get((int)(var29 >>> 32));
               float var22 = this.iiiIIliIIIlIli
                  .iliIiiliiiii(
                     IIlilIliiIli(var21.IliIlllilIi(), liIlIliiIlIl<"liIlIliiIlIl","LUEwPA766RAZIlVLwSflQEQSLBvjbVT2ZbIQF09iPEUwdQ==">()),
                     var21.IliIlllilIi().equals(this.liiIiIiiiiIiIi) ? 1.0F : 0.0F,
                     14.0F
                  );
               var35 ^= (
                     (long)llilliilililliil.IlIlllIlilIl(
                              now, (float)((int)(var31 >>> 32)) + (float)((int)var31) / 2.0F, (float)((int)(var33 >>> 32)) + 30.0F, var16.iiilIIIlIi
                           )
                           << 32
                        ^ var35
                  )
                  & -1L << 32;

               try {
                  this.Iiiiliiiiiii(now, var21.liiiIIllIl(), var22, var17, (int)(var31 >>> 32), (int)(var33 >>> 32), (int)var31);
                  if (var18 > 0.002F) {
                     float var24 = IliiIilliiIi.IilliliilIIi(var18);

                     try {
                        this.Iillllilll(now, var19, var21, var22, (int)(var31 >>> 32), (int)(var33 >>> 32), (int)var31, (int)var33, ctx, mine, target);
                     } finally {
                        IliiIilliiIi.lIiiIiIlilli(var24);
                     }
                  }
               } finally {
                  llilliilililliil.IiIlliIliiIl(now, (boolean)((int)(var35 >>> 32)));
               }
            }
         }

         var29 += 4294967296L;
      }
   }

   private void lIlIliIlIl() {
      if (this.illliIiIilliIi) {
         this.lliililiil();
      } else {
         this.iilIiIIiIi();
      }

      if (this.illliIiIilliIi || this.lliliIiililiIi) {
         this.iiIIlIIlIl();
      }
   }

   public int liiiIIllIl() {
      return 28 + this.IiIiliIiiiIi();
   }

   private int IIIilIIiiIIi() {
      return Math.round(this.iiiIIliIIIlIli.IlIlllIlilIl(liIlIliiIlIl<"liIlIliiIlIl","IqYGNfJ3VvAJdy9RsB0kqPEgXZD8NhK+x7MpwYbQKjY+">()) * 24.0F);
   }

   private static float lilliiilli(float t) {
      t = illliIilli(t);
      float var1 = 1.0F - t;
      return 1.0F - var1 * var1 * var1;
   }

   private void IIIllIIliIIl() {
      this.lllIiIiillIiIi = lilllIiliilllIil.lIiiIiIlilli();
   }

   private void Ilillllill(
      class_332 cardX, IIllIIIllIllIIIl ctx, lllililillilil stamp, String target, int verifiedW, int c, int my, int cardY, int yoursW, float cardW, float mx
   ) {
      float var12 = this.IIllllIlll(cardX, stamp.IlIIilIlillIIilIli, lIlliiIlli(stamp.ilIIilIliIiIIilIli), 0.0F, verifiedW, c, my, cardY, yoursW);
      float var13 = (float)(verifiedW + 8);
      float var14 = (float)(verifiedW + my - 8);
      float var15 = var13;
      float var16 = var12 + 6.0F;
      String var17 = stamp.iIIlilIliIlIlilIli
         + (
            stamp.iIIlilIliIlIlilIli == 1L
               ? liIlIliiIlIl<"liIlIliiIlIl","Elrra3UX9tpm0VcEtWMPjJu6DMcKyIARlsME/aMpzHGsYYRb4g==">()
               : liIlIliiIlIl<"liIlIliiIlIl","iziH5MjpRUPtyrOhOsCka1m2H2gmTq3WafFcVe13bxrbuB57znw=">()
         );
      float var18 = llilliilililliil.IiIilliIil(var17) + (stamp.iliIilIliIiiIilIli ? 4.0F + cardW : 0.0F) + (stamp.IlllilIlillllilIli ? 4.0F + mx : 0.0F);
      String var19 = lIlliiIlli(stamp.IIlIilIlilIlIilIli);
      if (!var19.isEmpty()) {
         var15 = var13
            + llilliilililliil.Illillllil(
               cardX, liIlIliiIlIl<"liIlIliiIlIl","Bn6IlasD2WGlxSRWiP8gOQmudW+hsfbZeB5pxp0LQg==">() + var19, var13, var16, var14 - var13 - var18 - 4.0F
            )
            + 4.0F;
      }

      var15 += llilliilililliil.Illillllil(cardX, var17, var15, var16, var14 - var15) + 4.0F;
      if (stamp.iliIilIliIiiIilIli) {
         var15 += llilliilililliil.iiIilIIlil(cardX, liIlIliiIlIl<"liIlIliiIlIl","8XSaEy7cNwoz7wjbjuIDCMop+ccVENaRcNfGLIYJDbYaYGfr">(), var15, var16, -11755009)
            + 4.0F;
      }

      if (stamp.IlllilIlillllilIli) {
         llilliilililliil.iiIilIIlil(
            cardX, liIlIliiIlIl<"liIlIliiIlIl","wVKK56ocwR2vGwVRkcAKzHPjHn28gp6h40aE/iwO2zE8">(), var15, var16, IlIIilIlllIIilIl.lliiIlliIl
         );
      }

      float var20 = (float)(c + 60) - 6.0F - 16.0F;
      float var21 = llilliilililliil.lllllillll(
         cardX,
         ctx,
         this.iiiIIliIIIlIli,
         IIlilIliiIli(stamp.IlIIilIlillIIilIli, liIlIliiIlIl<"liIlIliiIlIl","UmJviPZ7nxUOdQ2SLHYYw4Z3r+e2rMqW/yOzyUCFYg==">()),
         liIlIliiIlIl<"liIlIliiIlIl","41G/3Oh6XOYHIdXcVCu8dafvgPjlI4hcH1lxbOy49Q==">(),
         lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<"liIlIliiIlIl","9Zsm4kLJHD7Diz5F0CWxRP6cymYMkuYXz1nadfm5fZEuAfnV">()),
         var14,
         var20,
         16.0F,
         cardY,
         yoursW,
         true,
         () -> this.iIIliIlIli(stamp)
      );
      if (stamp.IlllilIlillllilIli) {
         var21 -= 19.0F;
         this.iilllIIill(
            cardX,
            ctx,
            IIlilIliiIli(stamp.IlIIilIlillIIilIli, liIlIliiIlIl<"liIlIliiIlIl","IXVE2gD1lXR/NTCqSVcxdOesx7LhS7Gx3T03doDXoIGBdg==">()),
            var21,
            var20,
            stamp.IlIIilIlillIIilIli != null
               && stamp.IlIIilIlillIIilIli.equals(this.IIIliIilIIliIi)
               && liIlIliiIlIl<"liIlIliiIlIl","wfusejjC4t1b0S/SxpRoayRoeAFuRWeT2NletOltr0gWFtg=">().equals(this.iIIliIiIlIliIi),
            cardY,
            yoursW,
            () -> this.iIiilIliil(
                  stamp.IlIIilIlillIIilIli, liIlIliiIlIl<"liIlIliiIlIl","wfusejjC4t1b0S/SxpRoayRoeAFuRWeT2NletOltr0gWFtg=">(), () -> this.IIIlilIIli(stamp)
               )
         );
      }

      var21 = this.liilliiill(cardX, ctx, stamp, var21 - 3.0F, var20, cardY, yoursW);
      this.iIlllIllll(cardX, target, var13, var20, var21 - 6.0F);
   }

   private void liIIiiiIIi(String slug) {
      lIlIllIliIlIllIl var2;
      try {
         var2 = lilllIiliilllIil.iliIiiliiiii(slug);
      } catch (IOException var4) {
         var2 = null;
      }

      this.liIiiIiiiIiiIi = slug;
      this.IIliiIilIliiIi = var2 != null && var2.iiililIiIl != null ? var2.iiililIiIl : slug;
      this.IlIlIlillIlIli = -1;
      this.iiiIIliIIIlIli.IiIlliIliiIl(liIlIliiIlIl<"liIlIliiIlIl","IqYGNfJ3VvAJdy9RsB0kqPEgXZD8NhK+x7MpwYbQKjY+">(), 0.0F);
      this.iIliiIiIlliiIi = null;
      this.IiliiIililiiIi = null;
      this.llliiIiilliiIi = true;
      this.lIiiiIiiIiiiIi = null;
      this.iiliiIiIIiiiIi = new ArrayList<>();
      if (!IIllliIilIllliIi.IliIlllilIi()) {
         this.llliiIiilliiIi = false;
         this.IiliiIililiiIi = liIlIliiIlIl<"liIlIliiIlIl","Y9fHrP8K+OK/we6h07OuspHM96fASIdxN48ZbNepUXg36hnMGDhPY65LeDo3eVrVrpY+pCg=">();
      } else {
         IIllliIilIllliIi.liiiIIllIl(
            slug,
            res -> {
               if (!res.IllililIllllililIl) {
                  this.llliiIiilliiIi = false;
                  this.IiliiIililiiIi = res.lilililIliilililIl != null
                     ? res.lilililIliilililIl
                     : liIlIliiIlIl<"liIlIliiIlIl","ywTMVd1HxyUQX3SkKZ0ZinOL+9HOu4Lt9Q+GNoHRM8uJXSlyz4aia3y1Ls6/nd14g2PY2nxebyEx">();
               } else {
                  this.iIliiIiIlliiIi = res.illililIlIilililIl;
                  this.iIlIiIllIi();
               }
            }
         );
      }
   }

   private void llIliilIli(String sub, String title, boolean good) {
      Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(sub, title, good);
   }

   private void Iilililiiili() {
      this.illIIliIilIIli = true;
      this.IllIIlilllIIli = null;
      this.lIlIIliiIlIIli = null;
      long var1 = ++this.lilIIliiilIIli;
      LinkedHashMap var3 = new LinkedHashMap();
      var3.put(liIlIliiIlIl<"liIlIliiIlIl","2j9XwmxBJsM2CoSwwuxEKR9ay6u86oNms1Yxecg8PLA=">(), IIliIIilIliIIi[this.liiiiIiiiiiiIi]);
      if (!this.IIIIIlilIIIIli.isBlank()) {
         var3.put(liIlIliiIlIl<"liIlIliiIlIl","+EDnmwfWj86hwSIcUIWu0CeeeOw9CN3vng689qe7Rxf0fg==">(), this.IIIIIlilIIIIli.trim());
      }

      var3.put(
         liIlIliiIlIl<"liIlIliiIlIl","rIBmnvX/UGOd2L/6MHXcKzDflUi/FkGQx8imOn5rwyQkXyER">(),
         liIlIliiIlIl<"liIlIliiIlIl","kmhD2uu4jxh9JB6ZcgfADI7wTjdYcTMQ0dytP/tG">()
      );
      IlliIilllliIil.iIlIlllllill(
         var3,
         req -> {
            if (var1 == this.lilIIliiilIIli) {
               this.illIIliIilIIli = false;
               if (req.iiiIilIllIIIlilIll) {
                  this.lIlIIliiIlIIli = req.lIIlilIlliIIlilIll;
                  this.IllIIlilllIIli = null;
               } else {
                  this.IllIIlilllIIli = req.ilIlilIllIiIlilIll != null
                     ? req.ilIlilIllIiIlilIll
                     : liIlIliiIlIl<"liIlIliiIlIl","9PUfyKFzpNu0o0WZw+gznfCSAh7AgUsGdH6aFb2uV9rxnjWE1owPldf+xfGnTsQULM0=">();
               }
            }
         }
      );
   }

   private void Iliilliiilii(int count, int kind, int sig) {
      if (count != this.IlIlIlillIlIli || kind != this.ilIlIliIiIlIli) {
         if (count == this.IlIlIlillIlIli && sig > 0 && sig <= this.liIlIliiiIlIli) {
            this.lIIlIliiIIlIli.liiiIIllIl();
         } else {
            this.lIIlIliiIIlIli.IliIlllilIi();
         }

         this.IlIlIlillIlIli = count;
         this.ilIlIliIiIlIli = kind;
         this.liIlIliiiIlIli = sig;
      }
   }

   private static String IIlilIliiIli(String kind, String id) {
      return liIlIliiIlIl<"liIlIliiIlIl","NWPgNHc13Cx01o6jMUIHMoAxp+xQcseQCpzKWvOG">() + kind + '|' + id;
   }

   public void lIiiIiIlilli(class_332 ctx) {
      long var2 = System.nanoTime();
      if (this.lIilIliiIilIli != null && var2 - this.iillIliIIilIli <= 400000000L) {
         if (!this.lIilIliiIilIli.equals(this.IlilIlillilIli)) {
            this.IlilIlillilIli = this.lIilIliiIilIli;
            this.IiIiIliliIiIli = liIlIliiIlIl<"liIlIliiIlIl","aWaCiwjEpWGr1nvpjgY5s4CStRHiWLd7+ZCdRG7BRh7PtfU24HeeC63ucSLvhDbOCA==">()
                  .equals(this.lIilIliiIilIli)
               ? var2 - 350000000L
               : var2;
         }

         float var4 = illliIilli((float)(var2 - this.IiIiIliliIiIli - 350000000L) / 1.2E8F);
         if (!(var4 <= 0.0F)) {
            float var5 = (float)Math.ceil((double)llilliilililliil.IiIIlliIIl(this.lIilIliiIilIli, 0.82F)) + 12.0F;
            float var6 = 15.0F;
            float var7 = Math.max(this.IIIiIlilIIiIli, Math.min(this.iIIiIliIlIiIli - var5, this.ililIliIiilIli - var5 / 2.0F));
            float var8 = this.llIiIliilIiIli ? this.liilIliiiilIli : this.liilIliiiilIli - var6;
            float var9 = IliiIilliiIi.IilliliilIIi(var4);

            try {
               IIIiiIillIIiiIil.Ililllililil(ctx, var7, var8, var5, var6, 5.0F, -65990120, 620756991);
               llilliilililliil.lIlIliIlIl(this.lIilIliiIilIli, var7 + 6.0F, llilliilililliil.IllIllllIl(var8, var6, 0.82F), 0.82F, -920587);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var9);
            }
         }
      } else {
         this.IlilIlillilIli = null;
      }
   }

   private void illIlIilIl() {
      if (this.iIlIiIiIllIiIi == Iilliiillilliiil.iIIIilIiil) {
         String var1 = this.IiIIIliliIIIli.IlIillIiilIi();
         if (var1.length() > 64) {
            var1 = var1.substring(0, 64);
            this.IiIIIliliIIIli.IiIiliIiiiIi(var1);
         }

         if (!var1.equals(this.IIIIIlilIIIIli)) {
            this.IIIIIlilIIIIli = var1;
            this.llIIIliilIIIli = System.currentTimeMillis();
         }
      }
   }

   private void lliIliliIl(class_332 left, float my, int mx, int ctx) {
      long var11 = 4956105561221413613L;
      float var5 = 18.0F;
      float var6 = (float)this.ilIIiIiIiIIiIi + (22.0F - var5) / 2.0F;
      float var7 = var5 + 4.0F;
      llilliilililliil.IIllllIlll(
         left,
         this.lliIIliiliIIli,
         this.iiiIIliIIIlIli,
         liIlIliiIlIl<"liIlIliiIlIl","eetiUxxWXlDa+pPWg8aH59vr0WQmAGRKZgvzzT+4R/3w6g==">(),
         lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<"liIlIliiIlIl","9Zsm4kLJHD7Diz5F0CWxRP6cymYMkuYXz1nadfm5fZEuAfnV">()),
         my,
         var6,
         var5,
         12.0F,
         mx,
         ctx,
         false,
         this::iliIiIiiIi
      );
      this.iliIiiliiiii(liIlIliiIlIl<"liIlIliiIlIl","bwyXehicPcJJCIE6VGHXiAd7E1m6D+rnSkgxXkL8QRoejHcm+IR29gKfWK0=">(), my, var6, var5, var5, mx, ctx, true);
      float var8 = my + var7;
      llilliilililliil.IIllllIlll(
         left,
         this.lliIIliiliIIli,
         this.iiiIIliIIIlIli,
         liIlIliiIlIl<"liIlIliiIlIl","r4YcWamAOgjywhjiGart5aQXu8ykSeBnxLlmDGRtb7GXTw==">(),
         lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<"liIlIliiIlIl","VTRtj8N2hHhDN9dJ9VxDBLHmt5pJ7s6+nlGczvI30PScTQ==">()),
         var8,
         var6,
         var5,
         12.0F,
         mx,
         ctx,
         false,
         this::IiIIlliIIl
      );
      this.iliIiiliiiii(liIlIliiIlIl<"liIlIliiIlIl","s779oCqRWfqS1hEcHEBMbuGPV0xA3ieMJl3XQ8a+vAm3hLvlBgLSBVU6p2c5">(), var8, var6, var5, var5, mx, ctx, true);
      var11 ^= ((long)this.IlIIillIIi() << 32 ^ var11) & -1L << 32;
      float var10 = var8 + var7;
      llilliilililliil.iIlllIllll(
         left,
         this.lliIIliiliIIli,
         this.iiiIIliIIIlIli,
         liIlIliiIlIl<"liIlIliiIlIl","/RJlGOEdlNL3MOwVBrrn7XyDiiiTMC0Tj7XZa4WS7BQ3uab+">(),
         lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<"liIlIliiIlIl","krG2llLhWATJariHR6+7YCQcHRh8doQNiSCT2+jPArY=">()),
         var10,
         var6,
         var5,
         12.0F,
         mx,
         ctx,
         false,
         this.iiiIIliIIIlIli
            .iliIiiliiiii(liIlIliiIlIl<"liIlIliiIlIl","3N2grB49BBkeTHxMQhh2/6mBk3dYIwMZT7ywIjnKcuSjJsmCjQCy">(), (int)(var11 >>> 32) != 0 ? 1.0F : 0.0F, 16.0F),
         this::ilIIiIiIIi
      );
      this.iliIiiliiiii(
         (int)(var11 >>> 32) != 0
            ? liIlIliiIlIl<"liIlIliiIlIl","8LhCLWf+BE3Aiz7qrm0DC7P6kkCrxs4lXoZIFkjuCW5l0vNFsSla5N2Q">()
            : liIlIliiIlIl<"liIlIliiIlIl","Aqo4qn8mugiTWHb2pVdSAuq64s6dj7A0d6truWQhmPu2JyA2Q6NRigrJgw==">(),
         var10,
         var6,
         var5,
         var5,
         mx,
         ctx,
         true
      );
   }

   public void Illillllil(double my, double mx, int btn) {
   }

   private void liiIiiiiIi(lllililillilil c) {
      long var3 = -3656010351205146548L;
      var3 ^= ((long)(!c.lIllilIliiIllilIli ? 1 : 0) << 32 ^ var3) & -1L << 32;
      c.lIllilIliiIllilIli = (boolean)((int)(var3 >>> 32));
      c.llIlilIliilIlilIli = Math.max(0L, c.llIlilIliilIlilIli + (long)((int)(var3 >>> 32) != 0 ? 1 : -1));
      IlliIilllliIil.Illlllllilll(
         c.IlIIilIlillIIilIli,
         (boolean)((int)(var3 >>> 32)),
         cx -> {
            if (cx.iiiIilIllIIIlilIll) {
               c.lIllilIliiIllilIli = want;
               c.llIlilIliilIlilIli = cx.lIIlilIlliIIlilIll;
            } else {
               c.lIllilIliiIllilIli = !want;
               c.llIlilIliilIlilIli = Math.max(0L, c.llIlilIliilIlilIli + (long)(want ? -1 : 1));
               this.llIliilIli(
                  liIlIliiIlIl<"liIlIliiIlIl","prb520WcSqd6WZQI7JLnBqKBjXg13XD3ajdC01XRZxw=">(),
                  cx.ilIlilIllIiIlilIll != null
                     ? cx.ilIlilIllIiIlilIll
                     : liIlIliiIlIl<"liIlIliiIlIl","I00/Bkxh5DhbH87m/t+aAZ38ejjS3SOYaVRshVth3av2WWLeBtALDZSKgHrMSn8f">(),
                  false
               );
            }
         }
      );
   }

   private void IliIilliIi(String slug) {
      if (!IIllliIilIllliIi.IliIlllilIi()) {
         this.llIliilIli(
            liIlIliiIlIl<"liIlIliiIlIl","IThErKS7LbBimLcnV3sKYLNUPMISkV0vXKEcprotqjdykVQ=">(),
            liIlIliiIlIl<"liIlIliiIlIl","1fys+igwvkZKqCCfsTCYp9yM+mqJjtEyh10qg4eiim7nSS99QK7IMCY05c1ObYc1PHe/7S8vMqZzEYDdHLEkadkf">(),
            false
         );
      } else {
         lIlIllIliIlIllIl var2;
         try {
            var2 = lilllIiliilllIil.iliIiiliiiii(slug);
         } catch (IOException var4) {
            var2 = null;
         }

         if (var2 == null) {
            this.llIliilIli(
               liIlIliiIlIl<"liIlIliiIlIl","IThErKS7LbBimLcnV3sKYLNUPMISkV0vXKEcprotqjdykVQ=">(),
               liIlIliiIlIl<"liIlIliiIlIl","K2fMSWM05CTeU1OuC7dV1xLkyBaM9z/fsNn0302y9dpBUA0AknRQEWIFMoQ=">(),
               false
            );
         } else {
            lIlIllIliIlIllIl var3 = var2;
            this.llIliilIli(liIlIliiIlIl<"liIlIliiIlIl","j33jso0MyjMtzgE7KHaZnjMX0FDEEnEX4ykq7mULcZdRZbn/PwDd/4w=">(), var3.iiililIiIl, true);
            IIllliIilIllliIi.liiiIIllIl(
               slug,
               local -> {
                  if (!local.IllililIllllililIl) {
                     this.llIliilIli(
                        liIlIliiIlIl<"liIlIliiIlIl","dqMYu7GsHEOEQXSiO3SAnn18qLDJAhM6mgMQC3PbKra4WlpBoPozjIiC">(),
                        local.lilililIliilililIl != null
                           ? local.lilililIliilililIl
                           : liIlIliiIlIl<"liIlIliiIlIl","5Gm2yLe1/ymaKry37521uimibHA+9O42hXN2YN2/mW+D8iwh5supTwTs6mSEewrMStrRMKA=">(),
                        false
                     );
                  } else {
                     String var3x = local.illililIlIilililIl;
                     Runnable var4x = () -> IlliIilllliIil.IIlllIlliIll(
                           var3x,
                           liIlIliiIlIl<"liIlIliiIlIl","e8cdp5GOrtaSaFa1FrFbBcexM+m6usablHMZeliGKniKag==">(),
                           localxx -> {
                              if (localxx.iiiIilIllIIIlilIll) {
                                 this.llIliilIli(
                                    liIlIliiIlIl<"liIlIliiIlIl","Vk/aaLNUwYOlZ5kPCW1uBLM+9Tx2zShtika29WdEwKMkB9EwzQ==">(),
                                    var3.iiililIiIl
                                       + liIlIliiIlIl<"liIlIliiIlIl","m1milb36fPWHGj1dvQIMOFEZUNVm0/y81HK/hrgbkcLYxWO5JEK4GCJHT6YGLH/2Usmo/ZVoj04DOnaz">(),
                                    true
                                 );
                              } else {
                                 this.llIliilIli(
                                    liIlIliiIlIl<"liIlIliiIlIl","dqMYu7GsHEOEQXSiO3SAnn18qLDJAhM6mgMQC3PbKra4WlpBoPozjIiC">(),
                                    localxx.ilIlilIllIiIlilIll != null ? localxx.ilIlilIllIiIlilIll : localxx.IlIlilIllllIlilIll,
                                    false
                                 );
                              }
                           }
                        );
                     IlliIilllliIil.IilliliilIIi(
                        var3x,
                        got -> {
                           String var5 = got.iiiIilIllIIIlilIll && got.lIIlilIlliIIlilIll != null ? got.lIIlilIlliIIlilIll.lIiIilIliiIiIilIli : null;
                           lIlIllIliIlIllIl var6 = IlliIilllliIil.IliIlllilIi(var3);
                           if (var5 != null && var6 != null && var5.equalsIgnoreCase(var6.IIIllIIliIIl())) {
                              var4x.run();
                           } else {
                              IlliIilllliIil.IiIlliIliiIl(
                                 var3x,
                                 var3,
                                 liIlIliiIlIl<"liIlIliiIlIl","IThErKS7LbBimLcnV3sKYLNUPMISkV0vXKEcprotqjdykVQ=">(),
                                 promotex -> {
                                    if (!promotex.iiiIilIllIIIlilIll) {
                                       this.llIliilIli(
                                          liIlIliiIlIl<"liIlIliiIlIl","dqMYu7GsHEOEQXSiO3SAnn18qLDJAhM6mgMQC3PbKra4WlpBoPozjIiC">(),
                                          promotex.ilIlilIllIiIlilIll != null ? promotex.ilIlilIllIiIlilIll : promotex.IlIlilIllllIlilIll,
                                          false
                                       );
                                    } else {
                                       var4x.run();
                                    }
                                 }
                              );
                           }
                        }
                     );
                  }
               }
            );
         }
      }
   }

   private void IlIllllIll(class_332 my, IIllIIIllIllIIIl top, int mx, int ctx, int target) {
      long var10 = 5062537017062007419L;
      List var6 = this.iiiIlIIIll();
      if (!var6.isEmpty()) {
         float var7 = llilliilililliil.iIlIiIllIi("");

         for (long var12 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var12 >>> 32) < var6.size(); var12 += 4294967296L) {
            float var9 = (float)(mx + (int)(var12 >>> 32) * 10);
            if ((int)(var12 >>> 32) == 0) {
               llilliilililliil.liIIiiiIIi(my, -2054070, -5854026, (String)var6.get((int)(var12 >>> 32)), (float)this.IlIIiIillIIiIi, var9);
            } else {
               llilliilililliil.lIlIliIlIl((String)var6.get((int)(var12 >>> 32)), (float)this.IlIIiIillIIiIi + var7, var9, 0.82F, -5854026);
            }
         }

         float var8 = (float)(var6.size() * 10);
         top.liiiIIllIl((float)this.IlIIiIillIIiIi, (float)mx, (float)this.liIIiIiiiIIiIi, var8, () -> {
            this.lIlliIiiIlliIi = null;
            this.IllliIilllliIi = null;
         });
         this.iliIiiliiiii(
            liIlIliiIlIl<"liIlIliiIlIl","08nnfEJIA/KgiQpFvGyq9m7NIuBGUBl9qeinCZXWQP7Xf6nSVdGB1qA0e1k=">(),
            (float)this.IlIIiIillIIiIi,
            (float)mx,
            (float)this.liIIiIiiiIIiIi,
            var8,
            ctx,
            target,
            true
         );
      }
   }

   private void Iillllilll(
      class_332 now, IIllIIIllIllIIIl mine, iiiliiiIIIiiii cardX, float my, int target, int mx, int loaded, int cardW, int cardY, long ctx, boolean v
   ) {
      long var23 = -5600851324314754793L;
      long var25 = -3955765849478444949L;
      String var13 = cardX.IliIlllilIi();
      float var14 = this.IIllllIlll(now, var13, cardX.liiiIIllIl(), my, target, mx, loaded, cardW, cardY);
      float var15 = (float)(target + 8);
      float var16 = (float)(target + loaded - 8);
      float var17 = var15 + llilliilililliil.Illillllil(now, cardX.IilliliilIIi(), var15, var14 + 6.0F, var16 - var15) + 4.0F;
      if (cardX.lIiiIiIlilli() != null) {
         llilliilililliil.Illillllil(now, cardX.lIiiIiIlilli(), var17, var14 + 6.0F, var16 - var17);
      }

      float var18 = (float)(mx + 60) - 6.0F - 16.0F;
      var23 ^= ((long)var13.equals(this.IIIliIilIIliIi) << 32 ^ var23) & -1L << 32;
      var23 ^= (
            (long)(
                  (int)(var23 >>> 32) != 0 && liIlIliiIlIl<"liIlIliiIlIl","F8WbpdNN292xlUS2VU+nINFHp6ZVpLpdsLTryPTOoUuM">().equals(this.iIIliIiIlIliIi) ? 1 : 0
               )
               ^ var23
         )
         & -1L >>> 32;
      var25 ^= ((long)(var13.equals(this.IiIliIiliIliIi) && ctx < this.iiIliIiIIlliIi ? 1 : 0) << 32 ^ var25) & -1L << 32;
      float var22 = llilliilililliil.iilllIIill(
         now,
         mine,
         this.iiiIIliIIIlIli,
         IIlilIliiIli(var13, liIlIliiIlIl<"liIlIliiIlIl","Clirc6jU5JbAE+pq1Hi27SdcNzrlfiC/A5DIEmWcjD4=">()),
         (int)var23 != 0
            ? liIlIliiIlIl<"liIlIliiIlIl","KGZhpJ7duzb6B9EBoHmzYxrxfCxLpq7M/BHkxLXhbpPrY0I=">()
            : (
               (int)(var25 >>> 32) != 0
                  ? liIlIliiIlIl<"liIlIliiIlIl","AFbMpvgVxYJS73qETVnNBlQmGgjlXN3J76eMymjc5MDzP58=">()
                  : liIlIliiIlIl<"liIlIliiIlIl","B6ixvjiOyCfMN7b7Xrsn9taBEBiUkWiwG/T2jagDoMQ=">()
            ),
         (int)var23 == 0 && (int)(var25 >>> 32) == 0 ? lIlIIiliIlIIil.IIillIiliIil() : null,
         var16,
         var18,
         16.0F,
         50.0F,
         cardW,
         cardY,
         true,
         this.iiiIIliIIIlIli
            .iliIiiliiiii(
               IIlilIliiIli(var13, liIlIliiIlIl<"liIlIliiIlIl","ayWctboJk5q+QL2wljk+mqbFZRylt44KCmpE2C8IK4YA">()), (int)var23 != 0 ? 1.0F : 0.0F, 16.0F
            ),
         () -> this.iIiilIliil(var13, liIlIliiIlIl<"liIlIliiIlIl","F8WbpdNN292xlUS2VU+nINFHp6ZVpLpdsLTryPTOoUuM">(), () -> this.Iiiilliiil(var13))
      );
      var22 -= 19.0F;
      this.iilllIIill(
         now,
         mine,
         IIlilIliiIli(var13, liIlIliiIlIl<"liIlIliiIlIl","IXVE2gD1lXR/NTCqSVcxdOesx7LhS7Gx3T03doDXoIGBdg==">()),
         var22,
         var18,
         (int)(var23 >>> 32) != 0 && liIlIliiIlIl<"liIlIliiIlIl","IXVE2gD1lXR/NTCqSVcxdOesx7LhS7Gx3T03doDXoIGBdg==">().equals(this.iIIliIiIlIliIi),
         cardW,
         cardY,
         () -> this.iIiilIliil(var13, liIlIliiIlIl<"liIlIliiIlIl","IXVE2gD1lXR/NTCqSVcxdOesx7LhS7Gx3T03doDXoIGBdg==">(), () -> this.iiiilIIIIi(var13))
      );
      if (v && cardX.IIIllIIliIIl()) {
         var22 -= 19.0F;
         llilliilililliil.IIllllIlll(
            now,
            mine,
            this.iiiIIliIIIlIli,
            IIlilIliiIli(var13, liIlIliiIlIl<"liIlIliiIlIl","TTMhvSnK60rQNdMljCsRS4L0gjZtJnHD6Rn+2czfBJJCbJc=">()),
            lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<"liIlIliiIlIl","jHkRhmfHQ+YtFoXCXMdBpyIxJvc8v6tZFetDIEeBBewk">()),
            var22,
            var18,
            16.0F,
            10.0F,
            cardW,
            cardY,
            false,
            () -> this.IliIilliIi(var13)
         );
         this.iliIiiliiiii(
            liIlIliiIlIl<"liIlIliiIlIl","FW7gZMRgZn74f/ElqVVUWNQZlPVZLWDRNX9XabfB5G9LK7lsnPsqQFzj8SSupZ7a">(), var22, var18, 16.0F, 16.0F, cardW, cardY, false
         );
      }

      if (v) {
         var22 -= 19.0F;
         llilliilililliil.IIllllIlll(
            now,
            mine,
            this.iiiIIliIIIlIli,
            IIlilIliiIli(var13, liIlIliiIlIl<"liIlIliiIlIl","nySNAE5+sA3oJUJHWCzZpQ/aIi90nX1/GwJXZg/6t1J3">()),
            lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<"liIlIliiIlIl","nySNAE5+sA3oJUJHWCzZpQ/aIi90nX1/GwJXZg/6t1J3">()),
            var22,
            var18,
            16.0F,
            10.0F,
            cardW,
            cardY,
            false,
            () -> this.liIIiiiIIi(var13)
         );
         this.iliIiiliiiii(
            liIlIliiIlIl<"liIlIliiIlIl","R2iHpQvIECaJSaoQ6Rma5oPneK5Vs1jAH2OLfwV/ag3z+a6fvxnZayM6S+ca">(), var22, var18, 16.0F, 16.0F, cardW, cardY, false
         );
      }

      this.iIlllIllll(now, cardX.iliIiiliiiii(), var15, var18, var22 - 6.0F);
   }

   private static boolean lilIliilIl() {
      class_1041 var0 = class_310.method_1551().method_22683();
      return !class_3675.method_15987(var0, 75)
         ? false
         : class_3675.method_15987(var0, 341) || class_3675.method_15987(var0, 345) || class_3675.method_15987(var0, 343) || class_3675.method_15987(var0, 347);
   }

   private void ilIIiIiIIi() {
      IlIIililllIIilil var1 = this.lIIIiiIIIi();
      if (var1 != null) {
         var1.IlIliIIlil.IIillIiliIil(!var1.IlIliIIlil.Iilllilliill());
         this.llIliilIli(
            liIlIliiIlIl<"liIlIliiIlIl","lFEgP9spVS+i7uBtG5fZ/dgBjfJBv0h8cVkRRb8k6/nHK/I9">(),
            var1.IlIliIIlil.Iilllilliill()
               ? liIlIliiIlIl<"liIlIliiIlIl","RPdPPnBru19jUxY6zlc4oPaIH8OIW85C/vYrp3Ts+Im/5aMwfKYe9GVqeHtUDxK7m/Rqsw3VuMBMV7+idgo=">()
               : liIlIliiIlIl<"liIlIliiIlIl","DhQvI9RoZw7ViWGtp/bPZQt6mlW2wwLtPTU333yZvA==">(),
            var1.IlIliIIlil.Iilllilliill()
         );
      }
   }

   private static String IiIliliIli() {
      try {
         return class_310.method_1551().method_1548().method_1676();
      } catch (Throwable var1) {
         return liIlIliiIlIl<"liIlIliiIlIl","RSxjyqDeaq143ljZo4wc8JHUESBQXn6rcKys3Y+zHA==">();
      }
   }

   private List<String> iiiIlIIIll() {
      long var13 = 4571850143875956019L;
      long var15 = 1718225387105255069L;
      ArrayList var1 = new ArrayList();
      if (this.iIlIiIiIllIiIi != Iilliiillilliiil.iIIIilIiil && !this.Ililllililil()) {
         float var2 = Math.max(40.0F, (float)this.liIIiIiiiIIiIi - llilliilililliil.iIlIiIllIi("") - 2.0F);
         String[] var3 = new String[]{this.lIlliIiiIlliIi, this.IllliIilllliIi};
         var13 ^= ((long)var3.length << 32 ^ var13) & -1L << 32;

         for (long var18 = var13 ^ (0L ^ var13) & -1L >>> 32; (int)var18 < (int)(var18 >>> 32); var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
            String var6 = var3[(int)var18];
            if (var6 != null) {
               StringBuilder var7 = new StringBuilder();
               String[] var8 = var6.split(liIlIliiIlIl<"liIlIliiIlIl","Hw6PGqXDkikTz3ymDU4Lmc2V8kegIRKAVHJD54M=">());
               var15 ^= ((long)var8.length << 32 ^ var15) & -1L << 32;

               for (var15 ^= (0L ^ var15) & -1L >>> 32; (int)var15 < (int)(var15 >>> 32); var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
                  String var11 = var8[(int)var15];
                  String var12 = var7.length() == 0 ? var11 : var7 + liIlIliiIlIl<"liIlIliiIlIl","Hw6PGqXDkikTz3ymDU4Lmc2V8kegIRKAVHJD54M=">() + var11;
                  if (var7.length() > 0 && llilliilililliil.IiIIlliIIl(var12, 0.82F) > var2) {
                     var1.add(var7.toString());
                     var7 = new StringBuilder(var11);
                  } else {
                     var7 = new StringBuilder(var12);
                  }
               }

               if (var7.length() > 0) {
                  var1.add(var7.toString());
               }
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   private void IIillIiliIil() {
      List var1 = this.lllIiIiillIiIi;
      if (var1 != this.IilIiIililIiIi) {
         this.IiIlliIliiIl(var1);
      }

      String var2 = this.IiIIIliliIIIli.IlIillIiilIi().trim().toLowerCase(Locale.ROOT);
      this.IliIiIilliIiIi.clear();
      this.iliIiIiIiiIiIi = 0;

      for (iiiliiiIIIiiii var4 : this.iilIiIiIIiIiIi) {
         if (this.iIlIiIiIllIiIi != Iilliiillilliiil.IlIIilIiil || var4.IlIlllIlilIl()) {
            this.iliIiIiIiiIiIi++;
            if (var2.isEmpty() || var4.iIlIlllllill().contains(var2)) {
               this.IliIiIilliIiIi.add(var4);
            }
         }
      }
   }

   private void Iiiiliiiiiii(class_332 ghost, String name, float loaded, float cardW, int cardX, int cardY, int ctx) {
      if (!(cardW <= 0.004F)) {
         float var8 = IliiIilliiIi.IilliliilIIi(cardW);

         try {
            llilliilililliil.lililiilil(ghost, (float)cardX, (float)cardY, (float)ctx, 60.0F, IIIIllIIIl(name, loaded, ctx), 0.0F, 0.0F);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var8);
         }
      }
   }

   private boolean Iiilliiliiil(List<lliIiIliliIiIl> codes) {
      return this.llliiIiilliiIi && this.iIliiIiIlliiIi == null || this.IiliiIililiiIi != null || codes.isEmpty();
   }

   private void llIililIil(String code) {
      this.lIiIiiIiIi(code);
      this.IIllIlilIllIli = code;
      this.iIllIliIlllIli = System.currentTimeMillis() + 1400L;
      this.llIliilIli(
         liIlIliiIlIl<"liIlIliiIlIl","NrOgeVqD/BWVCcJN035IuWtrmnF8T2Oagcwxj7F26tvfLfE6eGU=">(),
         code + liIlIliiIlIl<"liIlIliiIlIl","VdsuPCTmGyvb/Kxgh7H/6QASJDEwHaL2VX6zV6m2inJPPvQ=">(),
         true
      );
   }

   private void Illillliilli(Set<String> live) {
      this.iiiIIliIIIlIli
         .IIlllIlliIll(
            livex -> {
               long var3 = -1950159481534097398L;
               if (!livex.startsWith(liIlIliiIlIl<"liIlIliiIlIl","NWPgNHc13Cx01o6jMUIHMoAxp+xQcseQCpzKWvOG">())) {
                  return true;
               } else {
                  var3 ^= ((long)livex.indexOf(124) << 32 ^ var3) & -1L << 32;
                  return (int)(var3 >>> 32) > 0
                     && live.contains(livex.substring(liIlIliiIlIl<"liIlIliiIlIl","NWPgNHc13Cx01o6jMUIHMoAxp+xQcseQCpzKWvOG">().length(), (int)(var3 >>> 32)));
               }
            }
         );
   }

   private void iilllIIill(class_332 armed, IIllIIIllIllIIIl by, String mx, float act, float bx, boolean id, int my, int target, Runnable ctx) {
      llilliilililliil.iIlllIllll(
         armed,
         by,
         this.iiiIIliIIIlIli,
         mx,
         lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<"liIlIliiIlIl","Q15H6nappOxsyiUKmUpGB2De7jCkd/pLQNGwkXIPckGz">()),
         act,
         bx,
         16.0F,
         10.0F,
         my,
         target,
         true,
         this.iiiIIliIIIlIli.iliIiiliiiii(mx + liIlIliiIlIl<"liIlIliiIlIl","Y9EgoZOrLBkzTRFTlT2xaUk1OjjuSbTkq7BJLy606ts=">(), id ? 1.0F : 0.0F, 18.0F),
         ctx
      );
      this.iliIiiliiiii(
         id
            ? liIlIliiIlIl<"liIlIliiIlIl","aWaCiwjEpWGr1nvpjgY5s4CStRHiWLd7+ZCdRG7BRh7PtfU24HeeC63ucSLvhDbOCA==">()
            : liIlIliiIlIl<"liIlIliiIlIl","l0YxvJq8vUO8VO8S6EJn9lTAMaMwaU5es15xA5VI2YlGEw==">(),
         act,
         bx,
         16.0F,
         16.0F,
         my,
         target,
         false
      );
   }

   private void ilillIiill(class_332 mx, int top, int my, int l, Ilillillilli ctx) {
      long var16 = -4906185497188315026L;
      long var18 = -4751987771066033289L;
      long var20 = -1943741861820451028L;
      float var6 = (float)this.IlIIiIillIIiIi;
      var16 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, 0.3) << 32 ^ var16) & -1L << 32;

      for (var16 ^= (0L ^ var16) & -1L >>> 32; (int)var16 < iIliIIiIlliIIi.length; var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
         String var9 = iIliIIiIlliIIi[(int)var16];
         float var10 = (float)Math.ceil((double)llilliilililliil.IiIIlliIIl(var9, 0.82F)) + 14.0F;
         var18 ^= ((long)(this.liiiiIiiiiiiIi == (int)var16 ? 1 : 0) << 32 ^ var18) & -1L << 32;
         float var12 = this.iiiIIliIIIlIli
            .IIIllIIliIIl(
               liIlIliiIlIl<"liIlIliiIlIl","tXmRh5eKMYYhSMfzm8eB8BjfGmhpHfSkBMwwG6XGVGN+VQ==">() + (int)var16,
               (int)(var18 >>> 32) == 0 && llilliilililliil.Iliilliiilii((double)my, (double)l, var6, (float)top, var10, 14.0F)
            );
         float var13 = this.iiiIIliIIIlIli
            .iliIiiliiiii(
               liIlIliiIlIl<"liIlIliiIlIl","fCiG2A2ORTKMK7RMhUobceQERdz2plZJQelUSK8ns5HcWWE=">() + (int)var16, (int)(var18 >>> 32) != 0 ? 1.0F : 0.0F, 16.0F
            );
         var18 ^= (
               (long)llilliilililliil.IlIlllIlilIl(
                     mx, var6 + var10 / 2.0F, (float)top + 7.0F, this.iiiIIliIIIlIli.IilliliilIIi(lliilIiiliilIi[(int)var16], 0.07F)
                  )
                  ^ var18
            )
            & -1L >>> 32;
         if (var13 > 0.01F) {
            IIIiiIillIIiiIil.Ililllililil(
               mx,
               var6,
               (float)top,
               var10,
               14.0F,
               5.0F,
               llilliilililliil.IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.16F * var13),
               llilliilililliil.IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.42F * var13)
            );
         } else if (var12 > 0.01F) {
            IIIiiIillIIiiIil.IlIlllIlilIl(mx, var6, (float)top, var10, 14.0F, 5.0F, llilliilililliil.IIIIllIIIl(-1, 0.06F * var12));
         }

         llilliilililliil.lIlIliIlIl(
            var9,
            var6 + 7.0F,
            llilliilililliil.IllIllllIl((float)top, 14.0F, 0.82F),
            0.82F,
            IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var12), (int)(var16 >>> 32), (double)var13)
         );
         llilliilililliil.IiIlliIliiIl(mx, (boolean)((int)var18));
         var20 ^= ((long)((int)var16) << 32 ^ var20) & -1L << 32;
         this.lliIIliiliIIli.iIlIlllllill(var6, (float)top - 1.0F, var10, 16.0F, () -> this.iIIIlIlIIl(index), this.iiiIIliIIIlIli, lliilIiiliilIi[(int)var16]);
         var6 += var10 + 3.0F;
      }

      if (ctx != null && !ctx.ilillIlIlIiillIlIl.isEmpty()) {
         var16 ^= ((long)ctx.ilillIlIlIiillIlIl.size() ^ var16) & -1L >>> 32;
         String var22 = ctx.llIilIlIlilIilIlIl > (int)var16
            ? liIlIliiIlIl<"liIlIliiIlIl","zzsOKj7xU/WNLigl4mme2pifiLH6Hkt2y8owNThQ1HGnTyaq">()
               + (int)var16
               + liIlIliiIlIl<"liIlIliiIlIl","4ZwnlSUrks5O8EeHRMpJHmFzVMXc5pBhoq7l7BXleNU=">()
               + ctx.llIilIlIlilIilIlIl
            : (int)var16
               + (
                  (int)var16 == 1
                     ? liIlIliiIlIl<"liIlIliiIlIl","bLiTKZbIfP+GXOkokrqH5MO4LftQ/6lfCHOW1RHOzUzGDu8=">()
                     : liIlIliiIlIl<"liIlIliiIlIl","fPm856ZE1Gs6KNoURBA9FoKZgVbBSd5uMuyPks4Ma/nt1p0w">()
               );
         llilliilililliil.lIlIliIlIl(
            var22,
            (float)(this.IlIIiIillIIiIi + this.liIIiIiiiIIiIi) - llilliilililliil.IiIIlliIIl(var22, 0.82F),
            llilliilililliil.IllIllllIl((float)top, 14.0F, 0.82F),
            0.82F,
            -11117467
         );
      }
   }

   private void iIiilIliil(String action, String run, Runnable slug) {
      long var4 = System.currentTimeMillis();
      if (action.equals(this.IIIliIilIIliIi) && run.equals(this.iIIliIiIlIliIi) && var4 <= this.llIliIiilIliIi) {
         this.IIIliIilIIliIi = null;
         this.iIIliIiIlIliIi = null;
         slug.run();
      } else {
         this.IIIliIilIIliIi = action;
         this.iIIliIiIlIliIi = run;
         this.llIliIiilIliIi = var4 + 2500L;
      }
   }

   private void iilIiIIiIi() {
      String var1 = this.IiiliIiliiliIi.trim();
      if (var1.length() < 4) {
         this.llIliilIli(
            liIlIliiIlIl<"liIlIliiIlIl","Pg3dpBAPd04dJzyWjoN9Ei65jdX44wgK2aRORwVUbUT0hA==">(),
            liIlIliiIlIl<"liIlIliiIlIl","6KBlGI3OQB/pVNATT4iCm5auZMKFAMCsXJA5FfCnsBLkmWrwUvQaF3yiUuzvZoic8K7IxQ==">(),
            false
         );
      } else {
         this.lliliIiililiIi = false;
         this.IiiliIiliiliIi = "";
         this.llIliilIli(liIlIliiIlIl<"liIlIliiIlIl","TaPAo4gciVcIB4fFoWMAU2PxqAm2EavTzm71XKUmgXCQNKQjP3fdFg==">(), var1, true);
         IlliIilllliIil.IlIillIiilIi(
            var1,
            res -> {
               if (!res.iiiIilIllIIIlilIll) {
                  this.llIliilIli(
                     liIlIliiIlIl<"liIlIliiIlIl","xyNUowEi8FslysNnFYfb04yWRQUCeLuFbcQCtPrCavxftAFsTqMFgBQ=">(),
                     res.ilIlilIllIiIlilIll != null ? res.ilIlilIllIiIlilIll : res.IlIlilIllllIlilIll,
                     false
                  );
               } else {
                  try {
                     iliiIIllIiiiIIll[] var2 = new iliiIIllIiiiIIll[1];
                     lIlIllIliIlIllIl var3 = lIlIllIliIlIllIl.lIiiIiIlilli(res.lIIlilIlliIIlilIll.iIIliliill, var2);
                     if (var3 == null) {
                        this.llIliilIli(
                           liIlIliiIlIl<"liIlIliiIlIl","xyNUowEi8FslysNnFYfb04yWRQUCeLuFbcQCtPrCavxftAFsTqMFgBQ=">(),
                           liIlIliiIlIl<"liIlIliiIlIl","y2o0u93KYsiEPgTPzi77EIxTvxufPkKX8Uz4OfkZKe0qZEF859t9+Ry8rKahI9PAFnzRJA==">(),
                           false
                        );
                        return;
                     }

                     String var4 = lilllIiliilllIil.IIlllIlliIll(var3);
                     IillilIilillilIi var5 = new IillilIilillilIi();
                     var5.lllIillIIi = ilIIIllIiIIIll.ilIIlIIilIiIIlIIil;

                     try {
                        lilllIiliilllIil.iilllIIill(var4, var5);
                     } catch (IOException var7) {
                     }

                     this.llIliilIli(
                        liIlIliiIlIl<"liIlIliiIlIl","SsYCRJPdyPWWdeXxnvi2xbs9WT9KG9qpcb3n0RZhPQSlpO9IP7QWxA==">(),
                        lIlliiIlli(var3.iiililIiIl) + liIlIliiIlIl<"liIlIliiIlIl","RkQG3XJIZYH7KBfzUylOw/bB6svTrH2HtAdMdm+PgEX3LZMvMvE7LZ4fX37BIVIX3oTH">(),
                        true
                     );
                     this.IIIllIIliIIl();
                  } catch (IOException var8) {
                     this.llIliilIli(liIlIliiIlIl<"liIlIliiIlIl","xyNUowEi8FslysNnFYfb04yWRQUCeLuFbcQCtPrCavxftAFsTqMFgBQ=">(), var8.getMessage(), false);
                  }
               }
            }
         );
      }
   }

   private static int IIlllIlliIll(JsonObject content) {
      long var7 = 6924861682645180842L;
      if (content != null
         && content.has(liIlIliiIlIl<"liIlIliiIlIl","1qzMB1Dxer5u8snH+zi6W9cv0cvA9IIH90td82K++igjXHE=">())
         && content.get(liIlIliiIlIl<"liIlIliiIlIl","1qzMB1Dxer5u8snH+zi6W9cv0cvA9IIH90td82K++igjXHE=">()).isJsonObject()) {
         lIiIiIlliIiIiIll var1 = lIiIiIlliIiIiIll.IliIlllilIi();
         var7 ^= (0L ^ var7) & -1L << 32;

         for (Entry var4 : content.getAsJsonObject(liIlIliiIlIl<"liIlIliiIlIl","1qzMB1Dxer5u8snH+zi6W9cv0cvA9IIH90td82K++igjXHE=">()).entrySet()) {
            if (((JsonElement)var4.getValue()).isJsonObject() && !IIiiIllIiiIl.iIlIlllllill((String)var4.getKey())) {
               String var5 = IIiiIllIiiIl.liiiIIllIl((String)var4.getKey());
               if (!var1.IIiilIiiiIii(var5) && var1.IiIiliIiiiIi(var1.Ililllililil(var5, false), true)) {
                  JsonElement var6 = ((JsonElement)var4.getValue())
                     .getAsJsonObject()
                     .get(liIlIliiIlIl<"liIlIliiIlIl","+Gp8AVh+lHOi9n7Caw5/HCUOW+3AFW7DLJt7EEPev4tJcvk=">());
                  if (var6 != null && var6.isJsonPrimitive() && var6.getAsJsonPrimitive().isBoolean() && var6.getAsBoolean()) {
                     var7 += 4294967296L;
                  }
               }
            }
         }

         return (int)(var7 >>> 32);
      } else {
         return 0;
      }
   }

   private boolean IlIIillIIi() {
      IlIIililllIIilil var1 = this.lIIIiiIIIi();
      return var1 != null && var1.IlIliIIlil.Iilllilliill();
   }

   private static int IlIillIiilIi(int count, int cols, int cardH) {
      long var4 = -2515102648741470009L;
      var4 ^= ((long)((count + cols - 1) / cols) << 32 ^ var4) & -1L << 32;
      return (int)(var4 >>> 32) * cardH + Math.max(0, (int)(var4 >>> 32) - 1) * 4;
   }

   private void lllIiillIi(Integer maxUses) {
      if (this.iIliiIiIlliiIi == null) {
         this.IiliiIililiiIi = liIlIliiIlIl<"liIlIliiIlIl","WjmI+9HNS0bORCEGuso4J28JugWGHaWbGCa+n1JMsXLWTavyA6fjs4cSLI4xUw==">();
      } else {
         this.llliiIiilliiIi = true;
         IlliIilllliIil.Ililllililil(
            this.iIliiIiIlliiIi,
            maxUses,
            res -> {
               this.llliiIiilliiIi = false;
               if (res.iiiIilIllIIIlilIll) {
                  this.lIiiiIiiIiiiIi = res.lIIlilIlliIIlilIll.lIillIilliIillIill;
                  this.lIiIiiIiIi(res.lIIlilIlliIIlilIll.lIillIilliIillIill);
                  this.llIliilIli(
                     liIlIliiIlIl<"liIlIliiIlIl","NrOgeVqD/BWVCcJN035IuWtrmnF8T2Oagcwxj7F26tvfLfE6eGU=">(),
                     res.lIIlilIlliIIlilIll.lIillIilliIillIill
                        + liIlIliiIlIl<"liIlIliiIlIl","U/C9AD4ggHad7AF7DvJ+EhxoN7fvCpm0WF863ug1OQ/NjZc3uCYeyDmsKSkJEA==">()
                        + res.lIIlilIlliIIlilIll.IliIlllilIi(),
                     true
                  );
                  this.iIlIiIllIi();
               } else {
                  this.llIliilIli(
                     liIlIliiIlIl<"liIlIliiIlIl","vy9ApVINMArxzXasXzlmdDWV7S/smcCV+suREENuvnXe">(),
                     res.ilIlilIllIiIlilIll != null
                        ? res.ilIlilIllIiIlilIll
                        : liIlIliiIlIl<"liIlIliiIlIl","8G0otRKqblgEXyy/ckiVGGo6JrI88mm+JyDRnGSYfcfasyJxjoYsrpH8HrmAWVrX">(),
                     false
                  );
               }
            }
         );
      }
   }

   private void IiiIlliiIl(class_332 mx, int ctx, int my, int now, long top) {
      long var16 = -1744234445934120378L;
      long var18 = 7442654222770969704L;
      long var20 = -1282822255608868847L;
      this.IIillIiliIil();
      if (this.iilIiIiIIiIiIi != this.lIiIiIiiIiIiIi) {
         this.lIiIiIiiIiIiIi = this.iilIiIiIIiIiIi;
         HashSet var7 = new HashSet();

         for (iiiliiiIIIiiii var9 : this.iilIiIiIIiIiIi) {
            var7.add(var9.IliIlllilIi());
         }

         this.Illillliilli(var7);
      }

      var16 ^= ((long)(this.iIlIiIiIllIiIi == Iilliiillilliiil.lIIIilIiil ? 1 : 0) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)((int)(var16 >>> 32) == 0 || !this.illliIiIilliIi && !this.lliliIiililiIi ? 0 : 1) ^ var16) & -1L >>> 32;
      float var24 = (int)(var16 >>> 32) != 0
         ? this.iiiIIliIIIlIli
            .iliIiiliiiii(liIlIliiIlIl<"liIlIliiIlIl","IqYGNfJ3VvAJdy9RsB0kqPEgXZD8NhK+x7MpwYbQKjY+">(), (int)var16 != 0 ? 1.0F : 0.0F, 20.0F)
         : 0.0F;
      if ((int)var16 != 0) {
         this.IlIiiIillIiiIi = this.illliIiIilliIi;
         this.ilIiiIiIiIiiIi = this.illliIiIilliIi ? this.IIiliIilIiliIi : this.IiiliIiliiliIi;
      }

      if ((int)var16 != 0 || var24 > 0.01F) {
         this.ilIllIiIll(mx, ctx, my, now, var24, (boolean)((int)var16));
      }

      var18 ^= ((long)(ctx + ((int)(var16 >>> 32) != 0 ? this.IIIilIIiiIIi() : 0)) << 32 ^ var18) & -1L << 32;
      this.IlIllllIll(
         mx, (int)var16 != 0 ? this.IiiIIliliiIIli : this.lliIIliiliIIli, (int)(var18 >>> 32), (int)var16 != 0 ? this.IlIIiIillIIiIi - 4000 : my, now
      );
      var18 ^= ((long)((int)(var18 >>> 32) + this.lIIlliIIll()) ^ var18) & -1L >>> 32;
      IIllIIIllIllIIIl var12 = (int)var16 != 0 ? this.IiiIIliliiIIli : this.lliIIliiliIIli;
      var20 ^= ((long)((int)var16 != 0 ? this.IlIIiIillIIiIi - 4000 : my) << 32 ^ var20) & -1L << 32;
      float var14 = IliiIilliiIi.IilliliilIIi(1.0F - 0.45F * var24);

      try {
         if (this.IliIiIilliIiIi.isEmpty()) {
            this.IlIlIlillIlIli = -1;
         }

         if (this.iliIiIiIiiIiIi == 0) {
            if ((int)(var16 >>> 32) != 0) {
               llilliilililliil.IilIililIi(
                  mx,
                  var12,
                  this.iiiIIliIIIlIli,
                  liIlIliiIlIl<"liIlIliiIlIl","cu6zZMYegNNSla2PIfa7hT/AYdI3dISIdAhqqrl6o5pq2NP+/lo=">(),
                  (float)this.IlIIiIillIIiIi,
                  (float)((int)var18),
                  (float)this.liIIiIiiiIIiIi,
                  120.0F,
                  lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<"liIlIliiIlIl","ybKNWFv8j0se/Qs+gnaLnSU0J5dXD4EIWhH6RtpMf6q3Ew==">()),
                  liIlIliiIlIl<"liIlIliiIlIl","1SpXXjN00jp0un8JWz7Ypm/ZEB8Vr4EvUA/Ze0x928nqSAiSMQXpUrLxv5Y=">(),
                  liIlIliiIlIl<"liIlIliiIlIl","U5/tuLPMfPUpMHbCCTn3xbNj++pL7+/bpdpYl+FtPtWSTfhJK4/1sabx4OHA8Bcg8JbnSLA846ADm/Zu2JfRHtzKrA==">(),
                  liIlIliiIlIl<"liIlIliiIlIl","h/qW7L3Lkc08yzzgiDwrWZJyhgPMGzmiN06RGz0u0gcytFtZ0B4=">(),
                  (int)(var20 >>> 32),
                  now,
                  this::llIIlilIIl
               );
            } else {
               llilliilililliil.IilIililIi(
                  mx,
                  var12,
                  this.iiiIIliIIIlIli,
                  liIlIliiIlIl<"liIlIliiIlIl","fO/65cljAY/u+MOps07JTrjIVQKl286sTBJFbcQ9vo0QQqaMcryuMw5zxw==">(),
                  (float)this.IlIIiIillIIiIi,
                  (float)((int)var18),
                  (float)this.liIIiIiiiIIiIi,
                  120.0F,
                  lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<"liIlIliiIlIl","9Zsm4kLJHD7Diz5F0CWxRP6cymYMkuYXz1nadfm5fZEuAfnV">()),
                  liIlIliiIlIl<"liIlIliiIlIl","dTF0IGBn5KHbWOMxWKGlqwLP8jeZQcK16q77oq1/PwBLntGURVP94metdT8=">(),
                  liIlIliiIlIl<"liIlIliiIlIl","7n5r4LJjzOsLxet3RhAG/t2y95eFKy2PlMHQCpCTWDYEtqxBmmZ/7rPhF2kBENBIyem+Y4rhQuN87Edn/rJmmobK6kun">(),
                  liIlIliiIlIl<"liIlIliiIlIl","+10/OTb/eV5v6rFQ8vR7YfPBsMHWBhzl/6iuXocRk0mjIVwiWueedxL3QVM=">(),
                  (int)(var20 >>> 32),
                  now,
                  () -> this.IIiilIiiiIii(Iilliiillilliiil.iIIIilIiil)
               );
            }
         } else if (this.IliIiIilliIiIi.isEmpty()) {
            llilliilililliil.IilIililIi(
               mx,
               var12,
               this.iiiIIliIIIlIli,
               liIlIliiIlIl<"liIlIliiIlIl","UqU/4i4jpw1aLHjs2s9Su4+BgCKTLE88z+Fwm9uiCXUOzBZHokE=">(),
               (float)this.IlIIiIillIIiIi,
               (float)((int)var18),
               (float)this.liIIiIiiiIIiIi,
               88.0F,
               lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<"liIlIliiIlIl","+EDnmwfWj86hwSIcUIWu0CeeeOw9CN3vng689qe7Rxf0fg==">()),
               liIlIliiIlIl<"liIlIliiIlIl","7DyVS9GciZbTfAN6D1kyh9yVm7OsJaCjiMSfcEl1RyruEo1CtOLoL4hFNFU=">(),
               liIlIliiIlIl<"liIlIliiIlIl","8yxdU0SLMou8OljMUt1Iccvfqsw9dBl6USNzWvxZd3CemDawRJeMcK9jZuQ3FMJ1bw==">(),
               null,
               (int)(var20 >>> 32),
               now,
               null
            );
         } else {
            this.lllllillll(mx, var12, (int)var18, (int)(var20 >>> 32), now, top, (boolean)((int)(var16 >>> 32)));
         }
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var14);
      }
   }

   private void iiiilIIIIi(String slug) {
      try {
         IIllliIilIllliIi.IilliliilIIi(slug);
         lilllIiliilllIil.IIlilIliiIli(slug);
         this.llIliilIli(liIlIliiIlIl<"liIlIliiIlIl","MG+h7BUiYTFLrMrLA6ERTald92V7Te8mRSOgo7BizStPlp5M/p8j9duK">(), slug, false);
         this.IIIllIIliIIl();
      } catch (IOException var3) {
         this.llIliilIli(
            liIlIliiIlIl<"liIlIliiIlIl","S77te/XK+ZJKKr4jd76uyIF0vPDEGcvv1zmuRIgJ4d+M7X4=">(),
            liIlIliiIlIl<"liIlIliiIlIl","9qrwt//crBGyH47oPbfHrvTJOianQgCg2hsJCHyK0U26QUXHwgTVdEE=">(),
            false
         );
      }
   }

   private int IiIiliIiiiIi() {
      long var2 = 1445913721830183528L;
      if (this.iIlIiIiIllIiIi == Iilliiillilliiil.iIIIilIiil) {
         Ilillillilli var4 = this.lIlIIliiIlIIli;
         if (this.illIIliIilIIli) {
            return 20 + IlIillIiilIi(6, 2, 60);
         } else {
            return this.IllIIlilllIIli == null && var4 != null && !var4.ilillIlIlIiillIlIl.isEmpty()
               ? 20 + IlIillIiilIi(var4.ilillIlIlIiillIlIl.size(), 2, 60)
               : 140;
         }
      } else if (this.Ililllililil()) {
         List var1 = this.iiliiIiIIiiiIi;
         return 24 + (this.Iiilliiliiil(var1) ? 88 : IlIillIiilIi(var1.size(), 3, 36));
      } else {
         this.IIillIiliIil();
         var2 ^= ((long)((this.iIlIiIiIllIiIi == Iilliiillilliiil.lIIIilIiil ? this.IIIilIIiiIIi() : 0) + this.lIIlliIIll()) << 32 ^ var2) & -1L << 32;
         if (this.iliIiIiIiiIiIi == 0) {
            return (int)(var2 >>> 32) + 120;
         } else {
            return this.IliIiIilliIiIi.isEmpty() ? (int)(var2 >>> 32) + 88 : (int)(var2 >>> 32) + IlIillIiilIi(this.IliIiIilliIiIi.size(), 2, 60);
         }
      }
   }

   private void IIIillIIil(class_332 my, int top, int mx, int ctx) {
      long var33 = 2730291110589199411L;
      long var35 = -2851996927560037154L;
      long var37 = -1790644986952489178L;
      long var39 = 5118657640849508110L;
      long var29 = -1624066584067087177L;
      long var31 = -5223782259762822124L;
      IIliiIlllIliiIll var5 = llilliilililliil.IIiilIiiiIii();
      float var6 = llilliilililliil.lIilliIill(
            my,
            this.lliIIliiliIIli,
            this.iiiIIliIIIlIli,
            liIlIliiIlIl<"liIlIliiIlIl","l9WOV9+63zjyI5JxYvfTuI5ADJMhJpjCaekoWwRe5Ff+d0dnUFQ=">(),
            liIlIliiIlIl<"liIlIliiIlIl","CAj56bWKFK1WNiALIOfxw5VH2jr15zFCLae6REP1ZuY=">(),
            (float)this.IlIIiIillIIiIi + 40.0F,
            (float)top,
            18.0F,
            mx,
            ctx,
            false,
            this::IIlIilIlIi
         )
         + 48.0F;
      float var7 = (float)(this.IlIIiIillIIiIi + this.liIIiIiiiIIiIi);

      for (var29 ^= ((long)(IiliIIililiIIi.length - 1) << 32 ^ var29) & -1L << 32; (int)(var29 >>> 32) >= 0; var29 += -4294967296L) {
         Integer var9 = llliIIiilliIIi[(int)(var29 >>> 32)];
         var7 = llilliilililliil.lIilliIill(
               my,
               this.lliIIliiliIIli,
               this.iiiIIliIIIlIli,
               liIlIliiIlIl<"liIlIliiIlIl","67zOPP9/JzRrONMlnamCCf8qFhoF+5jsnKYvieVNFqL+jqANcgM=">() + (int)(var29 >>> 32),
               IiliIIililiIIi[(int)(var29 >>> 32)],
               var7,
               (float)top,
               18.0F,
               mx,
               ctx,
               false,
               () -> this.lllIiillIi(var9)
            )
            - 4.0F;
      }

      String var8 = liIlIliiIlIl<"liIlIliiIlIl","YAUOXeLLo3iWzZSVfIk+EPhL8ms1khYWL6M7FEBZznxatmQV">();
      float var53 = var7 - 4.0F - llilliilililliil.IiIIlliIIl(var8, 0.82F);
      llilliilililliil.lIlIliIlIl(var8, var53, llilliilililliil.IllIllllIl((float)top, 18.0F, 0.82F), 0.82F, -7630437);
      llilliilililliil.iiIIlIIlIl(var5.Iiilliiliiil(lIlliiIlli(this.IIliiIilIliiIi), var53 - 8.0F - var6), var6, (float)var5.IlIillIiilIi(top, 18), -920587);
      var29 ^= ((long)(top + 24) ^ var29) & -1L >>> 32;
      List var11 = this.iiliiIiIIiiiIi;
      if (this.llliiIiilliiIi && this.iIliiIiIlliiIi == null) {
         llilliilililliil.IilIililIi(
            my,
            this.lliIIliiliIIli,
            this.iiiIIliIIIlIli,
            liIlIliiIlIl<"liIlIliiIlIl","8ZVCh+bdoOy3lBVGV0Nn7rrotjc8EU81H8G2gYeqYA5gGObznAU=">(),
            (float)this.IlIIiIillIIiIi,
            (float)((int)var29),
            (float)this.liIIiIiiiIIiIi,
            88.0F,
            lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<"liIlIliiIlIl","nySNAE5+sA3oJUJHWCzZpQ/aIi90nX1/GwJXZg/6t1J3">()),
            liIlIliiIlIl<"liIlIliiIlIl","ZUH+jTgeuudoXzVzZxgBT0analv9MDLnLJB1/LeUbmIaJezREVUPYbsF32fcL3ki4MQb/L658v5gog==">(),
            liIlIliiIlIl<"liIlIliiIlIl","9unWkej0oMyLe+B0LI8gA/hOlOLFx8olooEeKsXWpY4F/s2JxVor7L07kErqHLMu2IreWSE=">(),
            null,
            mx,
            ctx,
            null
         );
      } else if (this.IiliiIililiiIi != null) {
         llilliilililliil.IilIililIi(
            my,
            this.lliIIliiliIIli,
            this.iiiIIliIIIlIli,
            liIlIliiIlIl<"liIlIliiIlIl","W/pBKQ5dMgsDL1xLCI2/40Bdo9650/Dla8fPK3iKF4bHNUtuIOlN">(),
            (float)this.IlIIiIillIIiIi,
            (float)((int)var29),
            (float)this.liIIiIiiiIIiIi,
            88.0F,
            lIlIIiliIlIIil.IiIlliIliiIl(),
            liIlIliiIlIl<"liIlIliiIlIl","WpgP3SgX+3vDO0BFD4+G7AII079s9c0UFSODjBm1f3DcR/gq0fB7exswgXIrKMQ=">(),
            var5.Iiilliiliiil(this.IiliiIililiiIi, (float)this.liIIiIiiiIIiIi / 0.82F),
            null,
            mx,
            ctx,
            null
         );
      } else if (var11.isEmpty()) {
         llilliilililliil.IilIililIi(
            my,
            this.lliIIliiliIIli,
            this.iiiIIliIIIlIli,
            liIlIliiIlIl<"liIlIliiIlIl","V8mI8ZVQPTOByzGeRhIqpyD1cmp7mshuh61sYp+ERTxNfxLcQTs=">(),
            (float)this.IlIIiIillIIiIi,
            (float)((int)var29),
            (float)this.liIIiIiiiIIiIi,
            88.0F,
            lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<"liIlIliiIlIl","VTRtj8N2hHhDN9dJ9VxDBLHmt5pJ7s6+nlGczvI30PScTQ==">()),
            liIlIliiIlIl<"liIlIliiIlIl","ubL9PcXoJXO75fRNDtYqQm3DzqJw6+qeSYqJ3fM7aZInhwQYBwkGBw==">(),
            liIlIliiIlIl<"liIlIliiIlIl","KeI2S/87Hm9IHHxEbYH6jpfG8dsIjfU1rW5L0NT2qHgvEsXvXWRg30cy++y4lcYVhMCI7FsnZzFgUO0QiBcg3+Q+CGLO9e9jaCMCJh8kdiuyMXBqsH18fQ==">(),
            null,
            mx,
            ctx,
            null
         );
      } else {
         if (var11 != this.IliiiIilliiiIi) {
            this.IliiiIilliiiIi = var11;
            HashSet var12 = new HashSet();

            for (lliIiIliliIiIl var14 : var11) {
               var12.add(var14.lIillIilliIillIill);
            }

            this.Illillliilli(var12);
         }

         var31 ^= (4294967296L ^ var31) & -1L << 32;
         var31 ^= (0L ^ var31) & -1L >>> 32;

         while ((int)var31 < var11.size()) {
            var31 ^= ((long)((int)(var31 >>> 32) * 31 + String.valueOf(((lliIiIliliIiIl)var11.get((int)var31)).lIillIilliIillIill).hashCode()) << 32 ^ var31)
               & -1L << 32;
            var31 ^= (var31 ^ var31 + (long)1) & -1L >>> 32;
         }

         this.Iliilliiilii(ilIiIIiIiIiIIi.length, (int)(var31 >>> 32), var11.size());
         var31 ^= (1L ^ var31) & -1L >>> 32;
         var33 ^= (0L ^ var33) & -1L << 32;

         while ((int)(var33 >>> 32) < var11.size()) {
            var33 ^= ((long)((int)(var33 >>> 32) % 3) ^ var33) & -1L >>> 32;
            var35 ^= ((long)llilliilililliil.iIiIlIliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 3, 4, (int)var33) << 32 ^ var35) & -1L << 32;
            var35 ^= ((long)llilliilililliil.lliIliliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 3, 4, (int)var33) ^ var35) & -1L >>> 32;
            var37 ^= ((long)((int)var29 + (int)(var33 >>> 32) / 3 * 40) << 32 ^ var37) & -1L << 32;
            if ((int)var33 == 0) {
               var31 ^= ((long)this.liIlliiIll(my, (int)(var37 >>> 32), 36) ^ var31) & -1L >>> 32;
            }

            if ((int)var31 != 0) {
               iIIliiIiIlIliiIi var19 = this.lIIlIliiIIlIli.lIiiIiIlilli((int)(var33 >>> 32));
               if (!var19.iliIiiliiiii()) {
                  float var20 = var19.IiilIIIlIi;
                  float var21 = var19.liilIIIlIi;
                  IIllIIIllIllIIIl var22 = var19.lIIiIIIlIi ? this.lliIIliiliIIli : IIllIIIllIllIIIl.ililiiIlIl;
                  var37 ^= ((long)(var19.IIIiIIIlIi ? mx : this.IlIIiIillIIiIi - 4000) ^ var37) & -1L >>> 32;
                  var39 ^= (
                        (long)llilliilililliil.IlIlllIlilIl(
                                 my, (float)((int)(var35 >>> 32)) + (float)((int)var35) / 2.0F, (float)((int)(var37 >>> 32)) + 18.0F, var19.iiilIIIlIi
                              )
                              << 32
                           ^ var39
                     )
                     & -1L << 32;

                  try {
                     if (var20 > 0.004F) {
                        float var25 = IliiIilliiIi.IilliliilIIi(var20);

                        try {
                           llilliilililliil.illilIilil(
                              my, (float)((int)(var35 >>> 32)), (float)((int)(var37 >>> 32)), (float)((int)var35), 36.0F, 0.0F, 0.0F, 0.0F
                           );
                        } finally {
                           IliiIilliiIi.lIiiIiIlilli(var25);
                        }
                     }

                     if (var21 > 0.002F) {
                        float var54 = IliiIilliiIi.IilliliilIIi(var21);

                        try {
                           this.iIIilIlIil(
                              my, var22, (lliIiIliliIiIl)var11.get((int)(var33 >>> 32)), (int)(var35 >>> 32), (int)(var37 >>> 32), (int)var35, (int)var37, ctx
                           );
                        } finally {
                           IliiIilliiIi.lIiiIiIlilli(var54);
                        }
                     }
                  } finally {
                     llilliilililliil.IiIlliIliiIl(my, (boolean)((int)(var39 >>> 32)));
                  }
               }
            }

            var33 += 4294967296L;
         }
      }
   }

   private void ilIllIiIll(class_332 ctx, int live, int my, int mx, float top, boolean alpha) {
      long var32 = 3571969759001434802L;
      long var28 = 7053695538875337051L;
      long var30 = 2920648567966560940L;
      IIliiIlllIliiIll var7 = llilliilililliil.IIiilIiiiIii();
      var28 ^= ((long)this.IlIiiIillIiiIi << 32 ^ var28) & -1L << 32;
      String var9 = this.ilIiiIiIiIiiIi;
      var28 ^= ((long)(var9.trim().length() >= ((int)(var28 >>> 32) != 0 ? 3 : 4) ? 1 : 0) ^ var28) & -1L >>> 32;
      Runnable var11 = this::lIlIliIlIl;
      String var12 = (int)(var28 >>> 32) != 0
         ? (
            this.lilliIiiilliIi == null
               ? liIlIliiIlIl<"liIlIliiIlIl","kD0V5V7RYDF90D1l+qjSgS9GJ6YX/brQOPzUjgH2JTS4SxjZrhJU+QbUq5rtbqg=">()
               : liIlIliiIlIl<"liIlIliiIlIl","NtZU7OOVZVXLlLfTuRLdJBpPDfHJtZv39NSWAuhAot8qUWIJxn9W">()
         )
         : liIlIliiIlIl<"liIlIliiIlIl","Q/7V/ryAB4O8CDAQec8gFd5jOAmoYj2gvnx4/DMM/0piyL/sniIpfx3a4/oMWvc=">();
      iliiIiIiIiiiIiIi var13 = (int)(var28 >>> 32) != 0 ? this.iIiliIiIliliIi : this.iiiliIiIIIiiIi;
      IIllIIIllIllIIIl var14 = alpha ? this.lliIIliiliIIli : this.IiiIIliliiIIli;
      var30 ^= ((long)(alpha ? my : this.IlIIiIillIIiIi - 4000) << 32 ^ var30) & -1L << 32;
      float var16 = IliiIilliiIi.IilliliilIIi(top);

      try {
         float var17 = (float)(this.IlIIiIillIIiIi + this.liIIiIiiiIIiIi);
         float var18 = llilliilililliil.lllllillll(
            ctx,
            var14,
            this.iiiIIliIIIlIli,
            liIlIliiIlIl<"liIlIliiIlIl","fPCZKcuR4Oih0XVs8iFCSA79iIsNrHzeUzheqyVsoor8hDWO">(),
            (int)(var28 >>> 32) != 0
               ? liIlIliiIlIl<"liIlIliiIlIl","j5qmbwrsUsmVKUrv8cn1rJLruoTjilNMwG9+jTggx74=">()
               : liIlIliiIlIl<"liIlIliiIlIl","Pg3dpBAPd04dJzyWjoN9Ei65jdX44wgK2aRORwVUbUT0hA==">(),
            null,
            var17,
            (float)live,
            18.0F,
            (int)(var30 >>> 32),
            mx,
            (boolean)((int)var28),
            var11
         );
         if ((int)var28 == 0) {
            var14.liiiIIllIl(var18, (float)live - 1.0F, var17 - var18, 20.0F, var11);
         }

         float var19 = llilliilililliil.lIilliIill(
            ctx,
            var14,
            this.iiiIIliIIIlIli,
            liIlIliiIlIl<"liIlIliiIlIl","bAQmRGaHeDPuhfYYAX0M+rbxUjdan3TOvWNJVuHQ4CMMb3jm4CSJzA==">(),
            liIlIliiIlIl<"liIlIliiIlIl","tFVmjY2OTiV40SNRFFKbVaZsXluEoYie7qTJWBldiRTZwA==">(),
            var18 - 4.0F,
            (float)live,
            18.0F,
            (int)(var30 >>> 32),
            mx,
            false,
            this::IllIllllIl
         );
         float var20 = var19 - 6.0F - (float)this.IlIIiIillIIiIi;
         float var21 = alpha
            ? this.iiiIIliIIIlIli
               .iliIiiliiiii(liIlIliiIlIl<"liIlIliiIlIl","4WQZ+b7kI0jCH0gf1E/pK+T/0BcoS2lhMJAHjA4vEc5yh+Sv/qve">(), this.lIIiiIiiIIiiIi ? 1.0F : 0.0F, 16.0F)
            : this.iiiIIliIIIlIli.IlIlllIlilIl(liIlIliiIlIl<"liIlIliiIlIl","4WQZ+b7kI0jCH0gf1E/pK+T/0BcoS2lhMJAHjA4vEc5yh+Sv/qve">());
         IIIiiIillIIiiIil.Ililllililil(
            ctx, (float)this.IlIIiIillIIiIi, (float)live, var20, 18.0F, 5.0F, IilIIIIililIIIIi.IlIlllIlilIl(), IIIiiIillIIiiIil.IlIillIiilIi((double)var21)
         );
         iiIlilIlIIllilIl.IliIlllilIi(
            (float)this.IlIIiIillIIiIi + 6.0F,
            (float)live + 3.0F,
            12.0F,
            12.0F,
            lIlIIiliIlIIil.IIIIllIIIl(
               (int)(var28 >>> 32) != 0
                  ? liIlIliiIlIl<"liIlIliiIlIl","tzG+qnOW35i5ZHeXrj/MN4a7ktlEoyxIvg6WZKoeEupMnw==">()
                  : liIlIliiIlIl<"liIlIliiIlIl","VTRtj8N2hHhDN9dJ9VxDBLHmt5pJ7s6+nlGczvI30PScTQ==">()
            ),
            new Color(IilIIIIililIIIIi.Illlllllilll(-10722709, -920587, (double)var21), true),
            IIIiiIillIIiiIil.liiiIIllIl()
         );
         float var22 = (float)this.IlIIiIillIIiIi + 24.0F;
         float var23 = var20 - 24.0F - 8.0F;
         var30 ^= ((long)var7.IlIillIiilIi(live, 18) ^ var30) & -1L >>> 32;
         String var25 = iiIliIIlli(var9, var23);
         if (var9.isEmpty()) {
            llilliilililliil.iiIIlIIlIl(var12, var22, (float)((int)var30), -7630437);
         } else {
            llilliilililliil.iiIIlIIlIl(var25, var22, (float)((int)var30), -920587);
         }

         if (alpha && this.lIIiiIiiIIiiIi) {
            var32 ^= ((long)((int)var7.IilliliilIIi() - 2) << 32 ^ var32) & -1L << 32;
            var13.iIlIlllllill(
               ctx,
               var22 + llilliilililliil.llIIlilIIl(var25) + 1.0F,
               live + (18 - (int)(var32 >>> 32)) / 2,
               (int)(var32 >>> 32),
               IlIIilIlllIIilIl.lliiIlliIl,
               llIilillilIilill.liiiIIllIl()
            );
         }

         var14.liiiIIllIl((float)this.IlIIiIillIIiIi, (float)live - 1.0F, var20, 20.0F, this::iiIIlIIlIl);
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var16);
      }
   }

   private void iIIliIlIli(lllililillilil c) {
      this.llIliilIli(liIlIliiIlIl<"liIlIliiIlIl","QzRp0YRXtVPyF59YwzIN5wXHJfjLmETJl5zQqzZfxqVlHt11ZfCwLShr">(), lIlliiIlli(c.ilIIilIliIiIIilIli), true);
      IlliIilllliIil.iliIiiliiiii(
         c.IlIIilIlillIIilIli,
         null,
         cx -> {
            if (!cx.iiiIilIllIIIlilIll) {
               this.llIliilIli(
                  liIlIliiIlIl<"liIlIliiIlIl","LTC3F8H2EKURVldC5LEGfqznVuj80XJ70dua2L7sJL3Ao4SVpHK525AoMQ==">(),
                  cx.ilIlilIllIiIlilIll != null ? cx.ilIlilIllIiIlilIll : cx.IlIlilIllllIlilIll,
                  false
               );
            } else {
               try {
                  iliiIIllIiiiIIll[] var3 = new iliiIIllIiiiIIll[1];
                  lIlIllIliIlIllIl var4 = lIlIllIliIlIllIl.lIiiIiIlilli(cx.lIIlilIlliIIlilIll.iIIliliill, var3);
                  if (var4 == null) {
                     this.llIliilIli(
                        liIlIliiIlIl<"liIlIliiIlIl","LTC3F8H2EKURVldC5LEGfqznVuj80XJ70dua2L7sJL3Ao4SVpHK525AoMQ==">(),
                        liIlIliiIlIl<"liIlIliiIlIl","y2o0u93KYsiEPgTPzi77EIxTvxufPkKX8Uz4OfkZKe0qZEF859t9+Ry8rKahI9PAFnzRJA==">(),
                        false
                     );
                     return;
                  }

                  String var5 = lilllIiliilllIil.Illlllllilll(var4, c.IlIIilIlillIIilIli);
                  IillilIilillilIi var6 = new IillilIilillilIi();
                  var6.lllIillIIi = ilIIIllIiIIIll.liIIlIIiliiIIlIIil;
                  var6.illIillIIi = c.IlIIilIlillIIilIli;
                  var6.lilIillIIi = cx.lIIlilIlliIIlilIll.IlIliliill.has(liIlIliiIlIl<"liIlIliiIlIl","6fY28jgc9dBkhPCod4qsow7LduPPCbJC3cNRl4lJf0x+CQ==">())
                     ? cx.lIIlilIlliIIlilIll.IlIliliill.get(liIlIliiIlIl<"liIlIliiIlIl","6fY28jgc9dBkhPCod4qsow7LduPPCbJC3cNRl4lJf0x+CQ==">()).getAsString()
                     : null;
                  var6.IilIillIIi = cx.lIIlilIlliIIlilIll.IlIliliill.has(liIlIliiIlIl<"liIlIliiIlIl","hrzuKwAtwJbHbsWQhYhcvL7xf62BlW+Q4XhdKXGTAfQqGnR/iw==">())
                     ? cx.lIIlilIlliIIlilIll
                        .IlIliliill
                        .get(liIlIliiIlIl<"liIlIliiIlIl","hrzuKwAtwJbHbsWQhYhcvL7xf62BlW+Q4XhdKXGTAfQqGnR/iw==">())
                        .getAsString()
                     : null;
                  var6.iilIillIIi = OffsetDateTime.now(ZoneOffset.UTC).toString();
                  lilllIiliilllIil.iilllIIill(var5, var6);
                  this.llIliilIli(
                     liIlIliiIlIl<"liIlIliiIlIl","2YaUgsFDsfYLrjptG2NMSBC9UiqTCLsfha3FbX3qhl0yL4px6XpacSDobQnU">(),
                     lIlliiIlli(c.ilIIilIliIiIIilIli) + liIlIliiIlIl<"liIlIliiIlIl","O4tWlHTsnRSzl9L6+WhshZRF5zJVVwFsDdFwvewYBKx0mfoMh9utTDn8nJwmV1DUtJA/">(),
                     true
                  );
                  this.IIIllIIliIIl();
               } catch (IOException var7) {
                  this.llIliilIli(liIlIliiIlIl<"liIlIliiIlIl","LTC3F8H2EKURVldC5LEGfqznVuj80XJ70dua2L7sJL3Ao4SVpHK525AoMQ==">(), var7.getMessage(), false);
               }
            }
         }
      );
   }

   private void IiIIlliIIl() {
      if (!this.lliliIiililiIi) {
         this.IiiliIiliiliIi = "";
      }

      this.lliliIiililiIi = true;
      this.illliIiIilliIi = false;
      this.IIiliIilIiliIi = "";
      this.lilliIiiilliIi = null;
      this.iiIIlIIlIl();
   }

   private static float illliIilli(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   private void iIlllIllll(class_332 ctx, String left, float limit, float rowY, float stamp) {
      if (left != null) {
         float var6 = limit + 12.0F;
         if (!(var6 + llilliilililliil.IiIIlliIIl(left, 0.82F) > stamp)) {
            iiIlilIlIIllilIl.IliIlllilIi(
               limit, rowY + 3.5F, 9.0F, 9.0F, lIlIIiliIlIIil.IIiilIiiiIii(), new Color(-10722709, true), IIIiiIillIIiiIil.liiiIIllIl()
            );
            llilliilililliil.lIlIliIlIl(left, var6, llilliilililliil.IllIllllIl(rowY, 16.0F, 0.82F), 0.82F, -7630437);
         }
      }
   }

   public IIIillIIil(llIiliiilIilii y, int w, int x, int setting, int h) {
      this.IilIiIililIiIi = null;
      this.iilIiIiIIiIiIi = new ArrayList<>();
      this.lIiIiIiiIiIiIi = null;
      this.IliIiIilliIiIi = new ArrayList<>();
      this.iliIiIiIiiIiIi = 0;
      this.liiIiIiiiiIiIi = null;
      this.IIIliIilIIliIi = null;
      this.iIIliIiIlIliIi = null;
      this.llIliIiilIliIi = 0L;
      this.IiIliIiliIliIi = null;
      this.iiIliIiIIlliIi = 0L;
      this.lIlliIiiIlliIi = null;
      this.IllliIilllliIi = null;
      this.illliIiIilliIi = false;
      this.lilliIiiilliIi = null;
      this.IIiliIilIiliIi = "";
      this.iIiliIiIliliIi = new iliiIiIiIiiiIiIi();
      this.lliliIiililiIi = false;
      this.IiiliIiliiliIi = "";
      this.iiiliIiIIIiiIi = new iliiIiIiIiiiIiIi();
      this.lIIiiIiiIIiiIi = false;
      this.IlIiiIillIiiIi = true;
      this.ilIiiIiIiIiiIi = "";
      this.liIiiIiiiIiiIi = null;
      this.IIliiIilIliiIi = null;
      this.iIliiIiIlliiIi = null;
      this.llliiIiilliiIi = false;
      this.IiliiIililiiIi = null;
      this.iiliiIiIIiiiIi = new ArrayList<>();
      this.lIiiiIiiIiiiIi = null;
      this.IliiiIilliiiIi = null;
      this.liiiiIiiiiiiIi = 0;
      this.IIIIIlilIIIIli = "";
      this.iIIIIliIlIIIli = "";
      this.llIIIliilIIIli = 0L;
      this.IiIIIliliIIIli = new iiiiilIiIIIIIiIi(0, 0, 0, 18);
      this.iiIIIliIIlIIli = false;
      this.lIlIIliiIlIIli = null;
      this.IllIIlilllIIli = null;
      this.illIIliIilIIli = false;
      this.lilIIliiilIIli = 0L;
      this.IIiIIlilIiIIli = null;
      this.iIiIIliIliIIli = new ArrayList<>();
      this.lliIIliiliIIli = new IIllIIIllIllIIIl();
      this.IiiIIliliiIIli = new IIllIIIllIllIIIl();
      this.iiiIIliIIIlIli = new iIliililIlliilil();
      this.lIIlIliiIIlIli = new iIIliiIiIlIliiIi();
      this.IlIlIlillIlIli = -1;
      this.ilIlIliIiIlIli = 0;
      this.liIlIliiiIlIli = 0;
      this.IIllIlilIllIli = null;
      this.iIllIliIlllIli = 0L;
      this.llllIliilllIli = new Vector2f();
      this.IillIlilillIli = 0L;
      this.iillIliIIilIli = 0L;
      this.lIilIliiIilIli = null;
      this.IlilIlillilIli = null;
      this.llIiIliilIiIli = false;
      this.IiIiIliliIiIli = 0L;
      this.lIIIiIiiIIIiIi = y;
      this.IlIIiIillIIiIi = w;
      this.ilIIiIiIiIIiIi = x;
      this.liIIiIiiiIIiIi = setting;
      this.IIlIiIilIlIiIi = h;
      this.IiIIIliliIIIli.liiiIIllIl(liIlIliiIlIl<"liIlIliiIlIl","6dKxmePiUGnoIgengBjMOIff/peqoGmmJVBXIQTTjXLwtGrZlbAv5PxqapgP">());
      this.IiIIIliliIIIli.iIlIlllllill(false);
      this.IiIIIliliIIIli.IilliliilIIi(6);
      this.IIIllIIliIIl();
      this.IlIlllIlilIl();
   }

   private void lIiIiiIiIi(String s) {
      try {
         class_310.method_1551().field_1774.method_1455(s);
      } catch (Throwable var3) {
      }
   }

   private static boolean IIiillIiil(char c) {
      return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9';
   }

   private static String lIlliiIlli(String s) {
      return s == null ? "" : s;
   }

   private void Iiiilliiil(String slug) {
      try {
         liiilIliiiilIl var2 = lilllIiliilllIil.IIIllIIliIIl(slug);
         if (var2 == null) {
            this.llIliilIli(
               liIlIliiIlIl<"liIlIliiIlIl","S77te/XK+ZJKKr4jd76uyIF0vPDEGcvv1zmuRIgJ4d+M7X4=">(),
               liIlIliiIlIl<"liIlIliiIlIl","K2fMSWM05CTeU1OuC7dV1xLkyBaM9z/fsNn0302y9dpBUA0AknRQEWIFMoQ=">(),
               false
            );
            return;
         }

         lIlIllIliIlIllIl var3 = var2.IIIillllllIIilllll;
         IIIllllllIIlllll var4 = iilIliIlIIiIliIl.IIiilIiiiIii(var2);
         lilllIiliilllIil.Iiiiliiiiiii(slug);
         if (var4.IlllilIill) {
            this.IiIliIiliIliIi = slug;
            this.iiIliIiIIlliIi = System.currentTimeMillis() + 1800L;
            String var5 = var4.illlilIill
               + liIlIliiIlIl<"liIlIliiIlIl","kMqzxuRrfZa+s1LJwCf54dTylpke2YQMO2QiZ05rJR8zddrGwSbz">()
               + (var4.lillilIill > 0 ? var4.lillilIill + liIlIliiIlIl<"liIlIliiIlIl","SSoxdt+GqaLRO8aIhpvju473VGC8tsjQWbK/SIXu4qLYo4e45Kk=">() : "")
               + liIlIliiIlIl<"liIlIliiIlIl","5S/WZUvSSUyZup6TalbmV3A/8z6uGt8rMq22knN37MrKbk4=">();
            this.llIliilIli(
               liIlIliiIlIl<"liIlIliiIlIl","oRn+hYzU9qXBiMXP3SlC3JXe0lzwE8mpaZanr4WMIKGnJUhYMQhuwJD3">(),
               var3.iiililIiIl + liIlIliiIlIl<"liIlIliiIlIl","GOV6R47Y7Z+vmneSxR4CDTPnBQXMAwyGQ7LzX0pVNjyY">() + var5,
               true
            );
            this.lIlliIiiIlliIi = var4.IliIlllilIi();
            this.IllliIilllliIi = var4.liiiIIllIl();
            if (this.lIlliIiiIlliIi != null) {
               this.llIliilIli(liIlIliiIlIl<"liIlIliiIlIl","usCnc+TRR6NnlwX+NSgRBh3p/ln+VaavZl+AfNKiKhA50kytdlr705sTNw==">(), this.lIlliIiiIlliIi, false);
            }

            if (this.IllliIilllliIi != null) {
               this.llIliilIli(liIlIliiIlIl<"liIlIliiIlIl","cr1giMF9shYJFz2+Q7Bk9G1EqsZ4Da2RxeKInKq2qwr4lwAGYVKNYq4=">(), this.IllliIilllliIi, false);
            }

            if (this.lIlliIiiIlliIi == null && this.IllliIilllliIi == null && !var4.iIililIill.isEmpty()) {
               this.llIliilIli(liIlIliiIlIl<"liIlIliiIlIl","fDcAVh7Vs6GeXq3d4NDi5hQ8hFy2NLBaBuTLjQOmuBF4XJEWhu2QpQ==">(), var4.iIililIill.get(0), false);
            }
         } else if (var4.llllilIill) {
            this.llIliilIli(
               liIlIliiIlIl<"liIlIliiIlIl","xb0JH2TeeC33Suf+0rv9Jqwtdw2JNcs/QQtM9Z09bk0OzRnH5FMTUQ==">(),
               liIlIliiIlIl<"liIlIliiIlIl","IJiQzruXVhB9AZUKEGBYpk0Hqpx9Jv4S1qJz1TmiuBmbjMS/NgIOrtxqSIATVQ==">(),
               false
            );
         } else {
            this.llIliilIli(
               liIlIliiIlIl<"liIlIliiIlIl","xb0JH2TeeC33Suf+0rv9Jqwtdw2JNcs/QQtM9Z09bk0OzRnH5FMTUQ==">(),
               var4.IlililIill != null ? var4.IlililIill : liIlIliiIlIl<"liIlIliiIlIl","+pAAhFJNPWqVKDbZl+oj9fxRYiQPQcClgqC0yV3OcYi9Y0c8EjnsIDQ=">(),
               false
            );
         }

         this.IIIllIIliIIl();
      } catch (IOException var6) {
         this.llIliilIli(
            liIlIliiIlIl<"liIlIliiIlIl","S77te/XK+ZJKKr4jd76uyIF0vPDEGcvv1zmuRIgJ4d+M7X4=">(),
            liIlIliiIlIl<"liIlIliiIlIl","85F9gTfRD1g+DCYFXZteeYho8zW3mkn3htlgZLWGnDZq55/Qe9/91Mqq">() + var6.getMessage(),
            false
         );
      }
   }

   public void IIiIllIiIl(class_332 my, int mx, int ctx) {
      long var12 = 3658145291828588819L;
      long var4 = System.nanoTime();
      if (this.iillIliIIilIli != 0L && var4 - this.iillIliIIilIli > 400000000L) {
         this.IilliliilIIi();
         if (!this.illliIiIilliIi && !this.lliliIiililiIi) {
            this.iiiIIliIIIlIli.IiIlliIliiIl(liIlIliiIlIl<"liIlIliiIlIl","IqYGNfJ3VvAJdy9RsB0kqPEgXZD8NhK+x7MpwYbQKjY+">(), 0.0F);
         }
      }

      this.iillIliIIilIli = var4;
      if (this.lIIlIliiIIlIli.iIlIlllllill()) {
         this.IlIlIlillIlIli = -1;
         this.lIIlIliiIIlIli.IliIlllilIi();
      }

      if ((this.IiIIIliliIIIli.IIlilIliiIli() || this.lIIiiIiiIIiiIi) && lilIliilIl()) {
         this.IilliliilIIi();
      }

      long var6 = System.currentTimeMillis();
      if (this.IIIliIilIIliIi != null && var6 > this.llIliIiilIliIi) {
         this.IIIliIilIIliIi = null;
         this.iIIliIiIlIliIi = null;
      }

      this.lliIIliiliIIli.IliIlllilIi();
      this.IiiIIliliiIIli.IliIlllilIi();
      this.lIilIliiIilIli = null;
      this.IIIiIlilIIiIli = (float)this.IlIIiIillIIiIi + 1.0F;
      this.iIIiIliIlIiIli = (float)(this.IlIIiIillIIiIi + this.liIIiIiiiIIiIi) - 1.0F;
      this.iIiIlIliIl(my, mx, ctx);
      var12 ^= ((long)(this.ilIIiIiIiIIiIi + 22 + 6) << 32 ^ var12) & -1L << 32;
      float var9 = lilliiilli((float)(var6 - this.IillIlilillIli) / 190.0F);
      float var10 = IliiIilliiIi.IilliliilIIi(Math.max(1.0E-4F, var9));

      try {
         if (this.iIlIiIiIllIiIi == Iilliiillilliiil.iIIIilIiil) {
            this.lIilliIill(my, (int)(var12 >>> 32), mx, ctx, var6);
         } else if (this.Ililllililil()) {
            this.IIIillIIil(my, (int)(var12 >>> 32), mx, ctx);
         } else {
            this.IiiIlliiIl(my, (int)(var12 >>> 32), mx, ctx, var6);
         }
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var10);
      }
   }

   private void iiIIlIIlIl() {
      this.lIIiiIiiIIiiIi = true;
      this.IiIIIliliIIIli.lIiiIiIlilli();
      (this.illliIiIilliIi ? this.iIiliIiIliliIi : this.iiiliIiIIIiiIi).IliIlllilIi();
   }
}
