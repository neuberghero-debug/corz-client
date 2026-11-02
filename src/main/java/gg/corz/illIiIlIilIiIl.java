package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.Load;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.Unload;
import net.minecraft.class_1923;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_4588;
import net.minecraft.class_638;
import org.joml.Matrix4f;

public class illIiIlIilIiIl extends ilIllIiIll {
   private static final long IliIIIilllliIIIill = 260000000L;
   private ilIIlIIlIiIIlIIl[] lIIiIIilliIIiIIill;
   private final ArrayList<ilIIlIIlIiIIlIIl> IiliIIillliliIIill;
   private final LongArrayList IIliIIilllIliIIill;
   private final iilliIlIIiliIl IlIIIIillllIIIIill;
   private static final long iilIIIillIIiIIIill = 300L;
   private final Long2ObjectOpenHashMap<ilIIlIIlIiIIlIIl> IIilIIilllIilIIill;
   private final liillIIiiiillIIi illlIIillIillIIill;
   private long iiliIIillIIiiIIill;
   private int iiIIlIillIIlIlIill;
   private int llIIlIillilIIlIill;
   private final iiIiiilIIliiil IIlIIIilllIlIIIill;
   private static final int IiIlIIillliIlIIill = 40;
   private final Long2ObjectOpenHashMap<LongArrayList> iIilIIillIlilIIill;
   private final iiIiiilIIliiil iIlIIIillIllIIIill;
   private static final float iliIIIillIiiIIIill = 1.5F;
   private boolean illIlIillIilIlIill;
   private class_638 IiIIlIillliIIlIill;
   private final ArrayList<ilIIlIIlIiIIlIIl> iIliIIillIlliIIill;
   private final ArrayList<ilIIlIIlIiIIlIIl> iiilIIillIIIiIIill;
   private final iilliIlIIiliIl lIIIIIilliIIIIIill = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","2l7WWQQx5Er0KKkgRnY9stxj+Rk1co7zPFMDCaR4APRV">(),
      IliIlllilIi<"IliIlllilIi","tF8ebQECf07Bt35GbhHDYJrmTO447vL1NIOKKyBcSV4g654XDwbW/lYQe8b/Msjv9aRciMTdI0XyQ/YLNFvDCj/tpIwSsxyTw6hK50uBry079GCF/SJ0jnEMsD5rXFL+oocLtw==">(),
      64,
      16,
      128
   );
   private int IlIiIIillllIiIIill;
   private static final int lllIIIillillIIIill = 450;
   private int iliiIIillIiiiIIill;
   private IiIiliIiliIiliIi lillIIilliillIIill;
   private static illIiIlIilIiIl iiIlIIillIIllIIill;
   private static final float iIIlIIillIlIlIIill = 0.35F;
   private final lIlIIllliIlIIlll IlllIIillllllIIill;
   private static final float IIIlIIilllIIlIIill = 0.075F;
   private final Long2LongOpenHashMap IiilIIillliilIIill;
   private final iiIiiilIIliiil ilIIIIillIiIIIIill;
   private long IliiIIilllliiIIill;
   private static final float llIlIIillilIlIIill = 12.0F;
   private static final float liiIIIilliiiIIIill = 0.9F;
   private static final long IilIIIilllilIIIill = 30000L;
   private boolean ilIiIIillIiIiIIill;
   private final iIIlIIIiIlIlIIIi lIllIIilliIllIIill;
   private final LongOpenHashSet liIiIIilliiIiIIill;
   private int lIlIlIilliIlIlIill;
   private final iiIiiilIIliiil liIIIIilliiIIIIill;
   private final Long2ObjectOpenHashMap<LongArrayList> llilIIillililIIill;
   private static final long lIiIIIilliIiIIIill = 320000000L;
   private boolean IllIlIilllllIlIill;
   private final ArrayList<ilIIlIIlIiIIlIIl> llliIIillilliIIill;
   private long lIiiIIilliIiiIIill;
   private int liiiIIilliiiiIIill;
   private int IIIIlIilllIIIlIill;
   private int iIIIlIillIlIIlIill;

   private static float Illillllil(ilIIlIIlIiIIlIIl e, long now) {
      float var3 = Math.min(1.0F, Math.max(0.0F, (float)(now - e.IiiiilllIl) / 3.2E8F));
      float var4 = 1.0F - var3;
      float var5 = 1.0F - var4 * var4 * var4;
      if (e.liiiilllIl != (-5266342993085832951L ^ -5266342993085832951L)) {
         float var6 = Math.min(1.0F, Math.max(0.0F, (float)(now - e.liiiilllIl) / 2.6E8F));
         var5 *= 1.0F - var6 * var6 * (3.0F - 2.0F * var6);
      }

      return var5;
   }

   private static float lIliliIlil(float v) {
      return v * v;
   }

   @Override
   protected void Illillliilli() {
      this.iiiIlIIIll();
   }

   public static void Ilillllill(class_2338 pos, class_2680 oldState, class_2680 newState) {
      illIiIlIilIiIl var3 = iiIlIIillIIllIIill;
      if (var3 != null && oldState != newState && !var3.IllIlIilllllIlIill && var3.IliIlllilIi() && var3.IiIIlIillliIIlIill != null) {
         try {
            var3.ilillIiill(pos.method_10263(), pos.method_10264(), pos.method_10260(), oldState, newState);
         } catch (Throwable var5) {
            var3.ilIllIiIll(var5);
         }
      }
   }

   private void lIilliIill(int chunkZ, int chunkX) {
      long var3 = iiIIIlllIIlIIlll.iliIiiliiiii(chunkZ, chunkX);
      this.IlllIIillllllIIill.IIillIiliIil(chunkZ, chunkX);
      this.lIllIIilliIllIIill.iIlIlllllill(var3);
      LongArrayList var5 = (LongArrayList)this.iIilIIillIlilIIill.get(var3);
      if (var5 != null) {
         this.IIliIIilllIliIIill.clear();
         this.IIliIIilllIliIIill.addAll(var5);
         long var6 = System.nanoTime();
         int var8 = 0;

         for (int var9 = this.IIliIIilllIliIIill.size(); var8 < var9; var8++) {
            ilIIlIIlIiIIlIIl var10 = (ilIIlIIlIiIIlIIl)this.IIilIIilllIilIIill.get(this.IIliIIilllIliIIill.getLong(var8));
            if (var10 != null) {
               this.lllllillll(var10);
               var10.liiiilllIl = var6;
               this.iiilIIillIIIiIIill.add(var10);
               this.ilIiIIillIiIiIIill = true;
            }
         }
      }
   }

   private void iiIilIIlil() {
      boolean var1 = this.ilIIIIillIiIIIIill.Iilllilliill();
      boolean var2 = this.liIIIIilliiIIIIill.Iilllilliill();
      if (var1 || var2) {
         Matrix4f var3 = iIiiIIilIliiIIil.IIillIiliIil();
         class_243 var4 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         double var5 = var4.field_1352;
         double var7 = var4.field_1351;
         double var9 = var4.field_1350;
         int var11 = (int)Math.floor(var5);
         int var12 = (int)Math.floor(var7);
         int var13 = (int)Math.floor(var9);
         long var14 = System.nanoTime();
         float var16 = (float)this.lIIIIIilliIIIIIill.Iilllilliill();
         int var17 = IlIIilIlllIIilIl.lliiIlliIl & 16777215;
         boolean var18 = this.IIlIIIilllIlIIIill.Iilllilliill();
         boolean var19 = this.iIlIIIillIllIIIill.Iilllilliill();
         class_4588 var20 = var18 ? iIiiIIilIliiIIil.IilliliilIIi() : null;
         class_4588 var21 = iIiiIIilIliiIIil.IIlllIlliIll();

         for (int var22 = 0; var22 < this.IlIiIIillllIiIIill; var22++) {
            ilIIlIIlIiIIlIIl var23 = this.lIIiIIilliIIiIIill[var22];
            iIIiliIlIili var24 = var23.iliiilllIl;
            if (var24.iilIiIlIlIIiIiIlIl == 1 ? var2 : var1) {
               double var25 = Math.max(Math.max((double)var24.lIiIiIlIliIiIiIlIl - var5, var5 - (double)(var24.liiIiIlIliiiIiIlIl + 1)), 0.0);
               double var27 = Math.max(Math.max((double)var24.iliIiIlIlIiiIiIlIl - var9, var9 - (double)(var24.iIIliIlIlIlIliIlIl + 1)), 0.0);
               double var29 = Math.sqrt(var25 * var25 + var27 * var27);
               if (!(var29 >= (double)var16)) {
                  float var31 = Illillllil(var23, var14) * illilIilil((float)var29, var16);
                  if (var24.IliIlllilIi(var11, var12, var13)) {
                     var31 *= 0.35F;
                  }

                  if (!(var31 <= 0.004F)) {
                     double var32 = (double)(var24.lIiIiIlIliIiIiIlIl + var24.liiIiIlIliiiIiIlIl + 1) * 0.5;
                     double var34 = (double)(var24.IliIiIlIllliIiIlIl + var24.IIIliIlIllIIliIlIl + 1) * 0.5;
                     double var36 = (double)(var24.iliIiIlIlIiiIiIlIl + var24.iIIliIlIlIlIliIlIl + 1) * 0.5;
                     float var38 = 0.5F
                        * (float)Math.sqrt(
                           (double)(
                              lIliliIlil((float)(var24.liiIiIlIliiiIiIlIl - var24.lIiIiIlIliIiIiIlIl + 1))
                                 + lIliliIlil((float)(var24.IIIliIlIllIIliIlIl - var24.IliIiIlIllliIiIlIl + 1))
                                 + lIliliIlil((float)(var24.iIIliIlIlIlIliIlIl - var24.iliIiIlIlIiiIiIlIl + 1))
                           )
                        );
                     if (!iIiiIIilIliiIIil.IlIillIiilIi(var32, var34, var36, var38)) {
                        float var39 = iIiiIIilIliiIIil.Ililllililil((double)var24.lIiIiIlIliIiIiIlIl);
                        float var40 = iIiiIIilIliiIIil.Iiilliiliiil((double)var24.IliIiIlIllliIiIlIl);
                        float var41 = iIiiIIilIliiIIil.IIIilIIiiIIi((double)var24.iliIiIlIlIiiIiIlIl);
                        if (var20 != null) {
                           int var42 = lililiilil(var31 * 0.075F, var17);
                           float[] var43 = var24.IIiliIlIllIiliIlIl;

                           for (byte var44 = 0; var44 < var43.length; var44 += 3) {
                              var20.method_22918(var3, var39 + var43[var44], var40 + var43[var44 + 1], var41 + var43[var44 + 2]).method_39415(var42);
                           }
                        }

                        int var48 = lililiilil(var31 * 0.9F, var17);
                        float[] var49 = var24.lilliIlIliilliIlIl;

                        for (byte var50 = 0; var50 < var49.length; var50 += 6) {
                           float var45 = var49[var50 + 3] != var49[var50] ? 1.0F : 0.0F;
                           float var46 = var49[var50 + 4] != var49[var50 + 1] ? 1.0F : 0.0F;
                           float var47 = var49[var50 + 5] != var49[var50 + 2] ? 1.0F : 0.0F;
                           var21.method_22918(var3, var39 + var49[var50], var40 + var49[var50 + 1], var41 + var49[var50 + 2])
                              .method_39415(var48)
                              .method_22914(var45, var46, var47)
                              .method_75298(1.5F);
                           var21.method_22918(var3, var39 + var49[var50 + 3], var40 + var49[var50 + 4], var41 + var49[var50 + 5])
                              .method_39415(var48)
                              .method_22914(var45, var46, var47)
                              .method_75298(1.5F);
                        }

                        if (var19) {
                           Iillllilll.Illlllllilll(
                              (double)var24.lIlliIlIliIlliIlIl + 0.5,
                              (double)var24.IllliIlIllllliIlIl + 0.5,
                              (double)var24.illliIlIlIilliIlIl + 0.5,
                              lililiilil(var31 * 0.35F, var17),
                              lililiilil(var31 * 0.85F, var17),
                              1.2F
                           );
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void IIIillIIil() {
      if (!this.IiilIIillliilIIill.isEmpty()) {
         long var1 = System.currentTimeMillis();
         ObjectIterator var3 = this.IiilIIillliilIIill.long2LongEntrySet().fastIterator();

         while (var3.hasNext()) {
            it.unimi.dsi.fastutil.longs.Long2LongMap.Entry var4 = (it.unimi.dsi.fastutil.longs.Long2LongMap.Entry)var3.next();
            if (var4.getLongValue() <= var1) {
               long var5 = var4.getLongKey();
               var3.remove();
               this.lIllIIilliIllIIill.iIlIlllllill(var5);
            }
         }
      }
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (!this.illIlIillIilIlIill && this.IlIiIIillllIiIIill != 0 && Iiiilllliiilll.field_1724 != null) {
         try {
            this.iiIilIIlil();
         } catch (Throwable var3) {
            this.illIlIillIilIlIill = true;
         }
      }
   }

   public static String iIiilIliil() {
      illIiIlIilIiIl var0 = iiIlIIillIIllIIill;
      if (var0 == null) {
         return IliIlllilIi<"IliIlllilIi","nXKPMyX4VlUrNVr/9CIOsOOA+kPVwkCW2MQYocUdy+7xm36UHD8Ljh34">();
      } else {
         StringBuilder var1 = new StringBuilder();
         var1.append(IliIlllilIi<"IliIlllilIi","dDZJEyUkSMv7eRDqfN1yda5fsLGGoV26+KQRArxiVzMlI8G3">())
            .append(var0.IliIlllilIi())
            .append(IliIlllilIi<"IliIlllilIi","L0BrcAzItrlx4AOzhn/Fc8bpcc5HVnsgasfm87+VnRmLe4bcaA==">())
            .append(var0.IllIlIilllllIlIill)
            .append(IliIlllilIi<"IliIlllilIi","xa6eTd4BuI9EQu7qdWmsLwu9f7e3ei74+hL8u+wcBAnwGAf02JRJ">())
            .append(var0.illIlIillIilIlIill)
            .append(IliIlllilIi<"IliIlllilIi","7kEsWpoYK+tmIpBw6BQ1xSCXNVb28k+KS+kFkmx8g2B8dvCc">())
            .append(var0.lIllIIilliIllIIill.IlIlllIlilIl())
            .append(IliIlllilIi<"IliIlllilIi","EBhMFECuQ+1VWV+tdndvKdiriMSc5ykpUFD0nI+0NfFYPkZzk2o=">())
            .append(var0.IlllIIillllllIIill.Ililllililil())
            .append(IliIlllilIi<"IliIlllilIi","hcZrDLooJdnBksJh75nrb677fdL6Pa8dx0WKsSszS00lVw==">())
            .append(var0.IIilIIilllIilIIill.size())
            .append(
               String.format(
                  Locale.ROOT,
                  IliIlllilIi<"IliIlllilIi","LkCdbP1sNr0RSSDXT7ZlEBswo1EcRaRpOw6FJw+N6YHnoB3Mezkjx6pbjOXHnaDX1xPESH8RWodG9qDUTAz8fkozyq7v18DmWQcAQp4gbfnvJ0We3JBaCgH1OvvUNvgurm8/YWF79y/NDJs=">(),
                  var0.iliiIIillIiiiIIill,
                  var0.iliiIIillIiiiIIill == 0 ? 0.0 : (double)var0.iiliIIillIIiiIIill / 1000000.0 / (double)var0.iliiIIillIiiiIIill,
                  (double)var0.lIiiIIilliIiiIIill / 1000000.0,
                  var0.liiiIIilliiiiIIill,
                  var0.IIIIlIilllIIIlIill,
                  var0.iIIIlIillIlIIlIill,
                  var0.llIIlIillilIIlIill,
                  (double)var0.IliiIIilllliiIIill / 1000000.0
               )
            );
         ObjectIterator var2 = var0.IIilIIilllIilIIill.values().iterator();

         while (var2.hasNext()) {
            ilIIlIIlIiIIlIIl var3 = (ilIIlIIlIiIIlIIl)var2.next();
            iIIiliIlIili var4 = var3.iliiilllIl;
            var1.append(IliIlllilIi<"IliIlllilIi","T2/JCM5y2JzIAolcFSnGQWIKhSu07d4ZvcOHk1kqEQ==">())
               .append(
                  var4.iilIiIlIlIIiIiIlIl == 1
                     ? IliIlllilIi<"IliIlllilIi","zPcdK9TcgzuIqkkWqKDU2L9ow2AfeFBQ112nhB5668SK">()
                     : IliIlllilIi<"IliIlllilIi","J71wv0m7amEEfLfgwWAGyeJfhAcrq3eDQDEFai8yUDJ1OQ==">()
               )
               .append(IliIlllilIi<"IliIlllilIi","Y93WAPtLBhC6oiQbaGKY5P55lrOBBXLrOezF+Kjiy3EB">())
               .append(var4.IiIliIlIlliIliIlIl)
               .append(IliIlllilIi<"IliIlllilIi","xNxtVYWuejhQbd7pbRIJcEdEoa+3bvLb+ZyYmqnHeC2vkBY=">())
               .append(var4.llIliIlIlilIliIlIl)
               .append(String.format(Locale.ROOT, IliIlllilIi<"IliIlllilIi","V8o7/89ITJsxBtRpRRPWf6Vl61rtZ5AnaEE6In/vwXsqAqAX56n5">(), var4.iiIliIlIlIIlliIlIl))
               .append(IliIlllilIi<"IliIlllilIi","ekp0S8unETUaMrqXyeZljODG1IeVUQpAdllX3PMPKVw8">())
               .append(var4.lIiIiIlIliIiIiIlIl)
               .append(',')
               .append(var4.IliIiIlIllliIiIlIl)
               .append(',')
               .append(var4.iliIiIlIlIiiIiIlIl)
               .append(IliIlllilIi<"IliIlllilIi","XpWGUatIT3WvON92+oikIF3hxsutIZKbTMMhK74Q">())
               .append(var4.liiIiIlIliiiIiIlIl)
               .append(',')
               .append(var4.IIIliIlIllIIliIlIl)
               .append(',')
               .append(var4.iIIliIlIlIlIliIlIl)
               .append(IliIlllilIi<"IliIlllilIi","yLFsrn/OWVBlhASod69J9UyJDp1lRdTnVJf9afg3gAvHU8I=">())
               .append(var4.lIiiIiIlilli())
               .append(IliIlllilIi<"IliIlllilIi","IVzqURmpXGQn4o3+/WRjw0xo0/MbdYd0lpLBryZVmZdQmv0=">())
               .append(var4.iliIiiliiiii());
         }

         var1.append(IliIlllilIi<"IliIlllilIi","fNNDLgnSNedK/oMD1wTorr4KdLGXQ+NFKYIuK55P5YvEsgkHBA==">());

         for (int var5 = 0; var5 < 16; var5++) {
            int var6 = var0.illlIIillIillIIill.iliIiiliiiii(var5);
            if (var6 > 0) {
               var1.append(' ').append(IIIiiIIllIIiiIIl.iIlIlllllill(var5)).append('=').append(var6);
            }
         }

         return var1.toString();
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null && !this.IllIlIilllllIlIill) {
         long var1 = System.nanoTime();

         try {
            class_638 var3 = Iiiilllliiilll.field_1687;
            if (var3 != this.IiIIlIillliIIlIill) {
               this.lIIlliIIll(false);
               this.iiilIIillIIIiIIill.clear();
               this.IiIIlIillliIIlIill = var3;
            }

            this.IlllIIillllllIIill.IIlllIlliIll(var3);
            int var4 = this.IlIIIIillllIIIIill.Iilllilliill();
            if (var4 != this.iiIIlIillIIlIlIill) {
               if (this.iiIIlIillIIlIlIill != -1) {
                  this.lIIlliIIll(true);
               }

               this.iiIIlIillIIlIlIill = var4;
               this.lillIIilliillIIill = IiIiliIiliIiliIi.IliIlllilIi(var4);
            }

            class_1923 var5 = Iiiilllliiilll.field_1724.method_31476();
            int var6 = this.IlIllllIll();
            this.IIIillIIil();
            this.lIllIIilliIllIIill.IIlllIlliIll(var3, var5.field_9181, var5.field_9180, var6, 30000L, iIIlIIIiIlIlIIIi.IliIlllilIi(450), this::liIlliiIll);
            if (++this.lIlIlIilliIlIlIill >= 40) {
               this.lIlIlIilliIlIlIill = 0;
               this.iIIilIlIil(var5.field_9181, var5.field_9180, var6);
            }

            this.llIililIil();
            if (this.ilIiIIillIiIiIIill) {
               this.IiIilliIil();
            }
         } catch (Throwable var7) {
            this.ilIllIiIll(var7);
         }

         long var8 = System.nanoTime() - var1;
         if (var8 > this.IliiIIilllliiIIill) {
            this.IliiIIilllliiIIill = var8;
         }
      }
   }

   private void iiiIlIIIll() {
      this.IIilIIilllIilIIill.clear();
      this.iIilIIillIlilIIill.clear();
      this.llilIIillililIIill.clear();
      this.IiilIIillliilIIill.clear();
      this.iiilIIillIIIiIIill.clear();
      this.lIllIIilliIllIIill.liiiIIllIl();
      this.IlllIIillllllIIill.Illlllllilll();
      this.illlIIillIillIIill.IIIllIIliIIl();
      this.IlIiIIillllIiIIill = 0;
      this.ilIiIIillIiIiIIill = false;
      this.IiIIlIillliIIlIill = null;
      this.iiIIlIillIIlIlIill = -1;
      this.lIlIlIilliIlIlIill = 0;
      this.iiliIIillIIiiIIill = this.lIiiIIilliIiiIIill = this.IliiIIilllliiIIill = 0L;
      this.iliiIIillIiiiIIill = this.iIIIlIillIlIIlIill = this.llIIlIillilIIlIill = 0;
   }

   @Override
   protected void Iilililiiili() {
      this.iiiIlIIIll();
   }

   private void IiIilliIil() {
      this.ilIiIIillIiIiIIill = false;
      int var1 = this.IIilIIilllIilIIill.size() + this.iiilIIillIIIiIIill.size();
      if (this.lIIiIIilliIIiIIill.length < var1) {
         this.lIIiIIilliIIiIIill = new ilIIlIIlIiIIlIIl[Math.max(var1, this.lIIiIIilliIIiIIill.length * 2)];
      }

      int var2 = 0;
      ObjectIterator var3 = this.IIilIIilllIilIIill.values().iterator();

      while (var3.hasNext()) {
         ilIIlIIlIiIIlIIl var4 = (ilIIlIIlIiIIlIIl)var3.next();
         this.lIIiIIilliIIiIIill[var2++] = var4;
      }

      for (ilIIlIIlIiIIlIIl var7 : this.iiilIIillIIIiIIill) {
         this.lIIiIIilliIIiIIill[var2++] = var7;
      }

      for (int var6 = var2; var6 < this.IlIiIIillllIiIIill; var6++) {
         this.lIIiIIilliIIiIIill[var6] = null;
      }

      this.IlIiIIillllIiIIill = var2;
   }

   private void iIlllIllll(ilIIlIIlIiIIlIIl e) {
      this.IIilIIilllIilIIill.put(e.iliiilllIl.lllIiIlIlillIiIlIl, e);

      for (long var5 : e.iliiilllIl.iIiliIlIlIliliIlIl) {
         LongArrayList var7 = (LongArrayList)this.iIilIIillIlilIIill.get(var5);
         if (var7 == null) {
            var7 = new LongArrayList(4);
            this.iIilIIillIlilIIill.put(var5, var7);
         }

         if (!var7.contains(e.iliiilllIl.lllIiIlIlillIiIlIl)) {
            var7.add(e.iliiilllIl.lllIiIlIlillIiIlIl);
         }
      }
   }

   private int IlIllllIll() {
      long var2 = 5286673669401855340L;
      var2 ^= (
            (long)(
                     (this.lIIIIIilliIIIIIill.Iilllilliill() + (121228763 * -724452315 ^ -85 ^ 363686659))
                           / ((1222637681 * 97 * -954437177 << 19 | 1222637681 * 97 * -954437177 >>> 13) ^ -1950445294)
                        + 1
                  )
                  << 32
               ^ var2
         )
         & -1L << 32;
      return Math.max(1, Math.min((int)(var2 >>> 32), Iiiilllliiilll.field_1690.method_38521() + 1));
   }

   private void liilliiill(long chunkKey, long due) {
      if (!this.IiilIIillliilIIill.containsKey(chunkKey)) {
         this.IiilIIillliilIIill.put(chunkKey, due);
      }
   }

   private void IIllllIlll(long chunkKey) {
      long var3 = System.nanoTime();
      this.liIiIIilliiIiIIill.clear();
      this.iIliIIillIlliIIill.clear();
      this.llliIIillilliIIill.clear();
      List var5 = this.illlIIillIillIIill.IliIlllilIi();
      int var6 = 0;

      for (int var7 = var5.size(); var6 < var7; var6++) {
         iIIiliIlIili var8 = (iIIiliIlIili)var5.get(var6);
         if (this.liIiIIilliiIiIIill.add(var8.lllIiIlIlillIiIlIl)) {
            ilIIlIIlIiIIlIIl var9 = (ilIIlIIlIiIIlIIl)this.IIilIIilllIilIIill.get(var8.lllIiIlIlillIiIlIl);
            if (var9 == null || var9.iliiilllIl.IilIiIlIllilIiIlIl != var8.IilIiIlIllilIiIlIl) {
               ilIIlIIlIiIIlIIl var10 = new ilIIlIIlIiIIlIIl(var8, var9 != null ? var9.IiiiilllIl : var3);
               if (var9 != null) {
                  this.lllllillll(var9);
               }

               this.iIlllIllll(var10);
               this.iIliIIillIlliIIill.add(var10);
               this.ilIiIIillIiIiIIill = true;
            }
         }
      }

      LongArrayList var12 = (LongArrayList)this.iIilIIillIlilIIill.get(chunkKey);
      if (var12 != null) {
         this.IIliIIilllIliIIill.clear();
         this.IIliIIilllIliIIill.addAll(var12);
         int var13 = 0;

         for (int var17 = this.IIliIIilllIliIIill.size(); var13 < var17; var13++) {
            long var21 = this.IIliIIilllIliIIill.getLong(var13);
            if (!this.liIiIIilliiIiIIill.contains(var21)) {
               ilIIlIIlIiIIlIIl var11 = (ilIIlIIlIiIIlIIl)this.IIilIIilllIilIIill.get(var21);
               if (var11 != null) {
                  this.lllllillll(var11);
                  this.llliIIillilliIIill.add(var11);
               }
            }
         }
      }

      int var14 = 0;

      for (int var18 = this.iIliIIillIlliIIill.size(); var14 < var18; var14++) {
         ilIIlIIlIiIIlIIl var22 = this.iIliIIillIlliIIill.get(var14);
         this.IiliIIillliliIIill.clear();
         ObjectIterator var23 = this.IIilIIilllIilIIill.values().iterator();

         while (var23.hasNext()) {
            ilIIlIIlIiIIlIIl var26 = (ilIIlIIlIiIIlIIl)var23.next();
            if (var26 != var22 && var22.iliiilllIl.iIlIlllllill(var26.iliiilllIl)) {
               this.IiliIIillliliIIill.add(var26);
            }
         }

         for (ilIIlIIlIiIIlIIl var27 : this.IiliIIillliliIIill) {
            this.lllllillll(var27);
            this.llliIIillilliIIill.add(var27);
         }

         for (ilIIlIIlIiIIlIIl var28 : this.llliIIillilliIIill) {
            if (!var28.iiiiilllIl && var28.iliiilllIl.iIlIlllllill(var22.iliiilllIl)) {
               var22.IiiiilllIl = Math.min(var22.IiiiilllIl, var28.IiiiilllIl);
               var28.iiiiilllIl = true;
            }
         }
      }

      for (ilIIlIIlIiIIlIIl var19 : this.llliIIillilliIIill) {
         if (!var19.iiiiilllIl) {
            var19.liiiilllIl = var3;
            this.iiilIIillIIIiIIill.add(var19);
         }
      }

      if (!this.llliIIillilliIIill.isEmpty()) {
         this.ilIiIIillIiIiIIill = true;
      }

      var14 = 0;

      for (int var20 = this.illlIIillIillIIill.liiiIIllIl(); var14 < var20; var14++) {
         this.Iillllilll(this.illlIIillIillIIill.iIlIlllllill(var14), chunkKey);
      }
   }

   private void iIIilIlIil(int centerX, int radius, int centerZ) {
      int var4 = centerZ + 2;
      this.IiliIIillliliIIill.clear();
      ObjectIterator var5 = this.IIilIIilllIilIIill.values().iterator();

      while (var5.hasNext()) {
         ilIIlIIlIiIIlIIl var6 = (ilIIlIIlIiIIlIIl)var5.next();
         int var7 = var6.iliiilllIl.lIiIiIlIliIiIiIlIl + var6.iliiilllIl.liiIiIlIliiiIiIlIl >> 1 >> 4;
         int var8 = var6.iliiilllIl.iliIiIlIlIiiIiIlIl + var6.iliiilllIl.iIIliIlIlIlIliIlIl >> 1 >> 4;
         if (Math.abs(var7 - centerX) > var4 || Math.abs(var8 - radius) > var4) {
            this.IiliIIillliliIIill.add(var6);
         }
      }

      long var14 = System.nanoTime();

      for (ilIIlIIlIiIIlIIl var17 : this.IiliIIillliliIIill) {
         this.lllllillll(var17);

         for (long var12 : var17.iliiilllIl.iIiliIlIlIliliIlIl) {
            this.lIllIIilliIllIIill.iIlIlllllill(var12);
         }

         var17.liiiilllIl = var14;
         this.iiilIIillIIIiIIill.add(var17);
         this.ilIiIIillIiIiIIill = true;
      }

      this.lIllIIilliIllIIill.IiIlliIliiIl(centerX, radius, var4 + 1);
      ObjectIterator var16 = this.llilIIillililIIill.long2ObjectEntrySet().fastIterator();

      while (var16.hasNext()) {
         long var18 = ((it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry)var16.next()).getLongKey();
         if (Math.abs(iiIIIlllIIlIIlll.IIIllIIliIIl(var18) - centerX) > var4 + 2 || Math.abs(iiIIIlllIIlIIlll.IlIlllIlilIl(var18) - radius) > var4 + 2) {
            var16.remove();
         }
      }
   }

   private void lllllillll(ilIIlIIlIiIIlIIl e) {
      if (this.IIilIIilllIilIIill.get(e.iliiilllIl.lllIiIlIlillIiIlIl) == e) {
         this.IIilIIilllIilIIill.remove(e.iliiilllIl.lllIiIlIlillIiIlIl);
      }

      for (long var5 : e.iliiilllIl.iIiliIlIlIliliIlIl) {
         LongArrayList var7 = (LongArrayList)this.iIilIIillIlilIIill.get(var5);
         if (var7 != null) {
            var7.rem(e.iliiilllIl.lllIiIlIlillIiIlIl);
            if (var7.isEmpty()) {
               this.iIilIIillIlilIIill.remove(var5);
            }
         }
      }
   }

   public illIiIlIilIiIl() {
      super(IliIlllilIi<"IliIlllilIi","XSF6BliTn5xUcmNBMPNqBzLxFIK0Sv8qjqyLHhtX7NNRpkd4">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIIIIillllIIIIill = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","BlS3jso0JF2eQK384MeL/qAUBqb8+3AFxYBDbSGTkp3dnSQ0nd8=">(),
         IliIlllilIi<"IliIlllilIi","WHy/NVC3LbBiXB/qu4m+15HTtHwQb3R727NR55MGbK9rbTFUaGsdAngYTusyw/IR5Bb7QAtqU5B6ktBswl7vr8FWA3QhlfknR5PyWU+GYWNG7TxRwlNugu4Q0tL7LmtgEiBqVCnELmHU5UElQb3gSPBeEgIjQp0YGjTk9conmfuwVgQ10anvxIwJY6dC">(),
         8,
         5,
         32
      );
      this.ilIIIIillIiIIIIill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","PgTPZuna0ZAlRnCRDGRQVaYiWwf8dfcNI75YpQktSSKZZUQ=">(),
         IliIlllilIi<"IliIlllilIi","h0RLQoOuxdTAAnm6q86tErwZykmzzaW9bgMcNIjGFhQKAOssYzGaLYrjxo2Uk1r1tlYpqDwKkh0UiJL/H9al07THrshUGPdhvlT6byQpz9A2bHjxXZB4MOMHyOGI2WmEusZPC87TOMZiGYVt29UR/G/6xv3ZtTHFHwjP">(),
         true
      );
      this.liIIIIilliiIIIIill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","qW1jk7zoERePpDlWJo1U0l64EQ4f+xEdqwr2jvPAAnpBuA==">(),
         IliIlllilIi<"IliIlllilIi","ZWgFG9ALn8krwh6nqYMOozf3TmldHODfVE6h6vUaPZzbSc0W/KJyKAetNAinDUxjkRCIWLVG2vUgJMvZF3nnI6AdnGCr0tWz/zAiIPLHq9lZBw==">(),
         true
      );
      this.IIlIIIilllIlIIIill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","M/dl26jpW3bKAuysEGc3xbxQF1dVbudLIM5+AJrY6qI=">(),
         IliIlllilIi<"IliIlllilIi","qJzywFheZyI7yVkdc/845KKrw698h+wUyRcIX8qXqB8fOmaDY89sM6SmZNCQqkNESim2cdGtXoVX1sE=">(),
         true
      );
      this.iIlIIIillIllIIIill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","ltfUSu9BLPKPOqQZaas2oBHwdz0cGwTuT9dPdSvEZ8twJLQ=">(),
         IliIlllilIi<"IliIlllilIi","+PV+RpBZfFT4GthDT3Ngnk1TaW6XWOG5Aw75nbzJePWueVnFpJnX43R64D/qt2lNV2F+ihNhJOxD4J5ls5UZufzFJ0zqDsSbNyHW">(),
         false
      );
      this.lIllIIilliIllIIill = new iIIlIIIiIlIlIIIi();
      this.IlllIIillllllIIill = new lIlIIllliIlIIlll();
      this.illlIIillIillIIill = new liillIIiiiillIIi();
      this.lillIIilliillIIill = IiIiliIiliIiliIi.IliIlllilIi(8);
      this.IIilIIilllIilIIill = new Long2ObjectOpenHashMap();
      this.iIilIIillIlilIIill = new Long2ObjectOpenHashMap();
      this.llilIIillililIIill = new Long2ObjectOpenHashMap();
      this.IiilIIillliilIIill = new Long2LongOpenHashMap();
      this.iiilIIillIIIiIIill = new ArrayList<>();
      this.lIIiIIilliIIiIIill = new ilIIlIIlIiIIlIIl[16];
      this.liIiIIilliiIiIIill = new LongOpenHashSet();
      this.IIliIIilllIliIIill = new LongArrayList();
      this.iIliIIillIlliIIill = new ArrayList<>();
      this.llliIIillilliIIill = new ArrayList<>();
      this.IiliIIillliliIIill = new ArrayList<>();
      this.iiIIlIillIIlIlIill = -1;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.lIIIIIilliIIIIIill,
            this.IlIIIIillllIIIIill,
            this.ilIIIIillIiIIIIill,
            this.liIIIIilliiIIIIill,
            this.IIlIIIilllIlIIIill,
            this.iIlIIIillIllIIIill
         }
      );
      iiIlIIillIIllIIill = this;
      ClientChunkEvents.CHUNK_LOAD.register((Load)(chunk, world) -> {
         if (this.IliIlllilIi() && chunk == this.IiIIlIillliIIlIill && !this.IllIlIilllllIlIill) {
            try {
               this.iilllIIill(world.method_12004().field_9181, world.method_12004().field_9180);
            } catch (Throwable var4) {
               this.ilIllIiIll(var4);
            }
         }
      });
      ClientChunkEvents.CHUNK_UNLOAD.register((Unload)(chunk, world) -> {
         if (this.IliIlllilIi() && chunk == this.IiIIlIillliIIlIill && !this.IllIlIilllllIlIill) {
            try {
               this.lIilliIill(world.method_12004().field_9181, world.method_12004().field_9180);
            } catch (Throwable var4) {
               this.ilIllIiIll(var4);
            }
         }
      });
   }

   private static int lililiilil(float alpha, int rgb) {
      long var3 = 4944532842588996945L;
      var3 ^= ((long)Math.round(Math.max(0.0F, Math.min(1.0F, alpha)) * 255.0F) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << (-((-1449329863 + 11) * -2014922929 + 17) ^ -707208725) | rgb;
   }

   private void iilllIIill(int chunkX, int chunkZ) {
      long var3 = iiIIIlllIIlIIlll.iliIiiliiiii(chunkX, chunkZ);
      this.IlllIIillllllIIill.IIillIiliIil(chunkX, chunkZ);
      this.lIllIIilliIllIIill.iIlIlllllill(var3);
      LongArrayList var5 = (LongArrayList)this.llilIIillililIIill.remove(var3);
      if (var5 != null) {
         int var6 = 0;

         for (int var7 = var5.size(); var6 < var7; var6++) {
            this.lIllIIilliIllIIill.iIlIlllllill(var5.getLong(var6));
         }
      }
   }

   public int IIiillIiil() {
      return this.IIilIIilllIilIIill.size();
   }

   private void ilIllIiIll(Throwable t) {
      if (!this.IllIlIilllllIlIill) {
         this.IllIlIilllllIlIill = true;
      }
   }

   private static float illilIilil(float distance, float maxDistance) {
      float var2 = maxDistance - 12.0F;
      if (distance <= var2) {
         return 1.0F;
      } else {
         float var3 = Math.min(1.0F, (distance - var2) / 12.0F);
         return 1.0F - var3 * var3 * (3.0F - 2.0F * var3);
      }
   }

   private void lIIlliIIll(boolean fade) {
      long var2 = System.nanoTime();
      if (fade) {
         ObjectIterator var4 = this.IIilIIilllIilIIill.values().iterator();

         while (var4.hasNext()) {
            ilIIlIIlIiIIlIIl var5 = (ilIIlIIlIiIIlIIl)var4.next();
            var5.liiiilllIl = var2;
            this.iiilIIillIIIiIIill.add(var5);
         }
      }

      this.IIilIIilllIilIIill.clear();
      this.iIilIIillIlilIIill.clear();
      this.llilIIillililIIill.clear();
      this.IiilIIillliilIIill.clear();
      this.lIllIIilliIllIIill.liiiIIllIl();
      this.IlllIIillllllIIill.Illlllllilll();
      this.ilIiIIillIiIiIIill = true;
   }

   private void liIlliiIll(class_2818 chunk, long key) {
      if (!this.IllIlIilllllIlIill) {
         class_1923 var4 = chunk.method_12004();
         long var6 = System.nanoTime();

         boolean var5;
         try {
            var5 = this.illlIIillIillIIill.IiIlliIliiIl(this.IlllIIillllllIIill, var4.field_9181, var4.field_9180, this.lillIIilliillIIill);
         } catch (Throwable var10) {
            this.ilIllIiIll(var10);
            return;
         }

         long var8 = System.nanoTime() - var6;
         this.iliiIIillIiiiIIill++;
         this.iiliIIillIIiiIIill += var8;
         if (var8 > this.lIiiIIilliIiiIIill) {
            this.lIiiIIilliIiiIIill = var8;
            this.liiiIIilliiiiIIill = var4.field_9181;
            this.IIIIlIilllIIIlIill = var4.field_9180;
            this.iIIIlIillIlIIlIill = this.illlIIillIillIIill.IilliliilIIi();
            this.llIIlIillilIIlIill = this.illlIIillIillIIill.lIiiIiIlilli();
         }

         if (var5) {
            this.IIllllIlll(key);
         }
      }
   }

   private void ilillIiill(int y, int oldState, int z, class_2680 x, class_2680 newState) {
      if (iiiliIIiIIIiiIIi.IliIlllilIi(x) != iiiliIIiIIIiiIIi.IliIlllilIi(newState)) {
         this.IlllIIillllllIIill.Iilllilliill(y, oldState, z);
         long var6 = System.currentTimeMillis() + 300L;
         this.liilliiill(iiIIIlllIIlIIlll.iliIiiliiiii(y >> 4, z >> 4), var6);

         for (int var8 = 0; var8 < this.IlIiIIillllIiIIill; var8++) {
            ilIIlIIlIiIIlIIl var9 = this.lIIiIIilliIIiIIill[var8];
            if (var9.liiiilllIl == 0L && var9.iliiilllIl.liiiIIllIl(y, oldState, z, 1)) {
               for (long var13 : var9.iliiilllIl.iIiliIlIlIliliIlIl) {
                  this.liilliiill(var13, var6);
               }
            }
         }
      }
   }

   private void llIililIil() {
      if (!this.iiilIIillIIIiIIill.isEmpty()) {
         long var1 = System.nanoTime();
         if (this.iiilIIillIIIiIIill.removeIf(e -> var1 - e.liiiilllIl >= (5754868043915451631L ^ 5754868043694773743L))) {
            this.ilIiIIillIiIiIIill = true;
         }
      }
   }

   private void Iillllilll(long unknownChunk, long owner) {
      LongArrayList var5 = (LongArrayList)this.llilIIillililIIill.get(unknownChunk);
      if (var5 == null) {
         var5 = new LongArrayList(2);
         this.llilIIillililIIill.put(unknownChunk, var5);
      }

      if (!var5.contains(owner)) {
         var5.add(owner);
      }
   }
}
