package gg.corz;

import com.corz.client.mixins.AccessorInput;
import java.lang.ref.WeakReference;
import java.util.Random;
import net.minecraft.class_10185;
import net.minecraft.class_241;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_7172;
import net.minecraft.class_746;

public final class lIIIililiIIIilil {
   private static int[] IiiIiIIlil = lIIIililiIIIilil.illIiIIlil;
   private static final int IilIiIIlil = 7;
   public static final long iilIiIIlil = 120L;
   private static boolean IIIliIIlil;
   private static final illIliiIilIlii lIiIiIIlil = new illIliiIilIlii(new Random());
   public static final int lilIiIIlil = 2;
   public static final long IIiIiIIlil = 1000L;
   private static liIiIIiiiIiIIi iIIliIIlil = liIiIIiiiIiIIi.lIiliiiliiIiliiili;
   private static boolean iiiIiIIlil;
   private static final int[] illIiIIlil = new int[]{0, 0};
   private static final lilIIIIliilIIIIl IliIiIIlil = new lilIIIIliilIIIIl();
   private static long liiIiIIlil = Long.MIN_VALUE;
   private static IiiIlIllliiIlIll lliIiIIlil;
   private static boolean lIIliIIlil;
   private static WeakReference<class_746> iliIiIIlil = new WeakReference<>(null);
   private static final iIliliilIlliliil iIiIiIIlil = new iIliliilIlliliil();

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static void iIlIlllllill(AccessorInput in, class_746 p) {
      long var33 = 4430509449851018555L;
      long var35 = -4380571256311947497L;
      long var37 = -4829644189294772779L;
      long var39 = -2434379518051020814L;
      long var41 = -9135404434372701176L;
      long var43 = -1916298945185796681L;
      long var45 = -3721787845382461520L;
      long var47 = -5009815962421574673L;
      iiiIiIIlil = false;
      IIIliIIlil = false;
      lIIliIIlil = false;
      if (in != null && p != null) {
         if (iliIiIIlil.get() != p) {
            lIiIiIIlil.IliIlllilIi(liIiIIiiiIiIIi.lIiliiiliiIiliiili);
            iIiIiIIlil.IliIlllilIi();
            IliIiIIlil.IliIlllilIi();
            iliIiIIlil = new WeakReference<>(p);
            IiiIiIIlil = illIiIIlil;
            liiIiIIlil = Long.MIN_VALUE;
         }

         IiiIlIllliiIlIll var2 = lliIiIIlil;
         lliIiIIlil = null;
         long var3 = IIllIIlilIllIIli.IlIlllIlilIl();
         var33 ^= ((long)IliIiIIlil.liiiIIllIl(var3, IIIiillllIIiilll.iIlIlllllill(), IIIiillllIIiilll.IliIlllilIi()) << 32 ^ var33) & -1L << 32;
         if (var2 != null && var2.IilliliilIIi() == var3) {
            class_310 var6 = class_310.method_1551();
            if (var6 != null && var6.field_1690 != null) {
               if (var6.field_1755 == null && p.method_5805() && !p.method_5765() && !p.method_7325() && !p.method_31549().field_7479 && !p.method_6128()) {
                  lIIliIIlil = IIlllIlliIll(var6.field_1690);
                  if (!lIIliIIlil) {
                     if (!ilIiiIiIii.IiIlliIliiIl() || ilIiiIiIii.IIlllIlliIll()) {
                        class_10185 var15 = in.getPlayerInput();
                        if (var15 instanceof class_10185) {
                           class_10185 var10000 = var15;

                           label308: {
                              try {
                                 var93 = var10000.comp_3159();
                              } catch (Throwable var62) {
                                 var92 = var62;
                                 boolean var10001 = false;
                                 break label308;
                              }

                              var33 ^= ((long)var93 ^ var33) & -1L >>> 32;
                              var35 ^= ((long)((int)var33) << 32 ^ var35) & -1L << 32;
                              var10000 = var15;

                              try {
                                 var95 = var10000.comp_3160();
                              } catch (Throwable var61) {
                                 var92 = var61;
                                 boolean var120 = false;
                                 break label308;
                              }

                              var33 ^= ((long)var95 ^ var33) & -1L >>> 32;
                              var35 ^= ((long)((int)var33) ^ var35) & -1L >>> 32;
                              var10000 = var15;

                              try {
                                 var97 = var10000.comp_3161();
                              } catch (Throwable var60) {
                                 var92 = var60;
                                 boolean var121 = false;
                                 break label308;
                              }

                              var33 ^= ((long)var97 ^ var33) & -1L >>> 32;
                              var37 ^= ((long)((int)var33) << 32 ^ var37) & -1L << 32;
                              var10000 = var15;

                              try {
                                 var99 = var10000.comp_3162();
                              } catch (Throwable var59) {
                                 var92 = var59;
                                 boolean var122 = false;
                                 break label308;
                              }

                              var33 ^= ((long)var99 ^ var33) & -1L >>> 32;
                              var37 ^= ((long)((int)var33) ^ var37) & -1L >>> 32;
                              var10000 = var15;

                              try {
                                 var101 = var10000.comp_3163();
                              } catch (Throwable var58) {
                                 var92 = var58;
                                 boolean var123 = false;
                                 break label308;
                              }

                              var33 ^= ((long)var101 ^ var33) & -1L >>> 32;
                              var39 ^= ((long)((int)var33) << 32 ^ var39) & -1L << 32;
                              var10000 = var15;

                              try {
                                 var103 = var10000.comp_3164();
                              } catch (Throwable var57) {
                                 var92 = var57;
                                 boolean var124 = false;
                                 break label308;
                              }

                              var33 ^= ((long)var103 ^ var33) & -1L >>> 32;
                              var39 ^= ((long)((int)var33) ^ var39) & -1L >>> 32;
                              var10000 = var15;

                              try {
                                 var105 = var10000.comp_3165();
                              } catch (Throwable var56) {
                                 var92 = var56;
                                 boolean var125 = false;
                                 break label308;
                              }

                              var33 ^= ((long)var105 ^ var33) & -1L >>> 32;
                              var41 ^= ((long)((int)var33) << 32 ^ var41) & -1L << 32;
                              iIllllIlIlllllIl var24 = var2.liiiIIllIl();
                              if (!(var24 instanceof iIllllIlIlllllIl)) {
                                 return;
                              }

                              iIllllIlIlllllIl var106 = var24;

                              try {
                                 var107 = var106.IlIlllIlilIl();
                              } catch (Throwable var55) {
                                 var92 = var55;
                                 boolean var126 = false;
                                 break label308;
                              }

                              var41 ^= ((long)var107 ^ var41) & -1L >>> 32;
                              var43 ^= ((long)((int)var41) << 32 ^ var43) & -1L << 32;
                              iIllllIlIlllllIl var108 = var24;

                              try {
                                 var109 = var108.IiIlliIliiIl();
                              } catch (Throwable var54) {
                                 var92 = var54;
                                 boolean var127 = false;
                                 break label308;
                              }

                              double var25 = var109;
                              iIllllIlIlllllIl var110 = var24;

                              try {
                                 var111 = var110.IIlllIlliIll();
                              } catch (Throwable var53) {
                                 var92 = var53;
                                 boolean var128 = false;
                                 break label308;
                              }

                              var25 = var111;
                              iIllllIlIlllllIl var112 = var24;

                              try {
                                 var113 = var112.Illlllllilll();
                              } catch (Throwable var52) {
                                 var92 = var52;
                                 boolean var129 = false;
                                 break label308;
                              }

                              IilIIIililIIIi var66 = var113;
                              iIllllIlIlllllIl var114 = var24;

                              try {
                                 var115 = var114.Iilllilliill();
                              } catch (Throwable var51) {
                                 var92 = var51;
                                 boolean var130 = false;
                                 break label308;
                              }

                              IilIIIililIIIi var67 = var115;
                              iIllllIlIlllllIl var116 = var24;

                              try {
                                 var117 = var116.IIillIiliIil();
                              } catch (Throwable var50) {
                                 var92 = var50;
                                 boolean var131 = false;
                                 break label308;
                              }

                              IilIIIililIIIi var68 = var117;
                              iIllllIlIlllllIl var118 = var24;

                              try {
                                 var119 = var118.Ililllililil();
                              } catch (Throwable var49) {
                                 var92 = var49;
                                 boolean var132 = false;
                                 break label308;
                              }

                              var41 ^= ((long)var119 ^ var41) & -1L >>> 32;
                              var43 ^= ((long)((int)var41) ^ var43) & -1L >>> 32;
                              var45 ^= ((long)ilIiiIiIii.IIlllIlliIll() << 32 ^ var45) & -1L << 32;
                              float var64 = (int)(var45 >>> 32) != 0 ? ilIiiIiIii.Iilllilliill() : p.method_36454();
                              if (liiIiIIlil != var3 - 1L) {
                                 lIiIiIIlil.liiiIIllIl(IIillIiliIil(p.method_71091()));
                              }

                              var41 ^= ((long)iliilliIiiilli.Illlllllilll(p) ^ var41) & -1L >>> 32;
                              var45 ^= ((long)((int)var41 == 0 && (int)(var33 >>> 32) == 0 ? 0 : 1) ^ var45) & -1L >>> 32;
                              int[] var27 = (int)var45 == 0 && (int)(var43 >>> 32) != 0
                                 ? Iillllillillllil.IliIlllilIi(var25, var25, var64, IiiIiIIlil)
                                 : new int[]{0, 0};
                              IiiIiIIlil = var27;
                              var47 ^= (
                                    (long)((int)(var33 >>> 32) == 0 && (!p.method_24828() || !iliilliIiiilli.IIlllIlliIll(p) && (int)var41 == 0) ? 0 : 1) << 32
                                       ^ var47
                                 )
                                 & -1L << 32;
                              liIiIIiiiIiIIi var29 = new liIiIIiiiIiIIi(
                                 var27[1] > 0,
                                 var27[1] < 0,
                                 var27[0] > 0,
                                 var27[0] < 0,
                                 IIlilIliiIli(var66, (boolean)((int)(var39 >>> 32))) && (int)(var47 >>> 32) == 0,
                                 IIlilIliiIli(var67, (boolean)((int)var39)),
                                 IIlilIliiIli(var68, (boolean)((int)(var41 >>> 32))) && (int)var45 == 0
                              );
                              liIiIIiiiIiIIi var30 = iIiIiIIlil.liiiIIllIl(
                                 lIiIiIIlil,
                                 var3,
                                 var29,
                                 (boolean)((int)var43),
                                 var68 == IilIIIililIIIi.iIillIiliIlillIili,
                                 p.method_5624() && !p.method_5681(),
                                 Illlllllilll(p.method_71091()),
                                 Iilllilliill(var6.field_1690)
                              );
                              if ((int)(var47 >>> 32) != 0 && Iiilliiliiil(var30)) {
                                 var30 = IiIiliIiiiIi(var30);
                                 lIiIiIIlil.liiiIIllIl(var30);
                              }

                              if ((int)var45 != 0 && IIIilIIiiIIi(var30)) {
                                 var30 = IlIillIiilIi(var30);
                                 lIiIiIIlil.liiiIIllIl(var30);
                              }

                              in.setPlayerInput(Ililllililil(var30));
                              float[] var31 = Iillllillillllil.liiiIIllIl(var30);
                              in.setMovementVector(new class_241(var31[0], var31[1]));
                              iIIliIIlil = var30;
                              iiiIiIIlil = true;
                              IIIliIIlil = (boolean)((int)(var45 >>> 32));
                              liiIiIIlil = var3;
                              return;
                           }

                           Throwable var32 = var92;
                           throw new MatchException(var32.toString(), var32);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   static liIiIIiiiIiIIi IlIillIiilIi(liIiIIiiiIiIIi keys) {
      long var16 = 3489310229526852866L;
      long var10 = 3707304729677542611L;
      long var12 = 7620473811236085618L;
      long var14 = 7548306333024328556L;
      if (keys instanceof liIiIIiiiIiIIi) {
         liIiIIiiiIiIIi var10000 = keys;

         label65: {
            label71: {
               try {
                  var40 = var10000.IliIlllilIi();
               } catch (Throwable var24) {
                  var39 = var24;
                  boolean var10001 = false;
                  break label71;
               }

               var10 ^= ((long)var40 << 32 ^ var10) & -1L << 32;
               var10 ^= ((long)((int)(var10 >>> 32)) ^ var10) & -1L >>> 32;
               var10000 = keys;

               try {
                  var42 = var10000.liiiIIllIl();
               } catch (Throwable var23) {
                  var39 = var23;
                  boolean var53 = false;
                  break label71;
               }

               var10 ^= ((long)var42 << 32 ^ var10) & -1L << 32;
               var12 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var12) & -1L << 32;
               var10000 = keys;

               try {
                  var44 = var10000.iIlIlllllill();
               } catch (Throwable var22) {
                  var39 = var22;
                  boolean var54 = false;
                  break label71;
               }

               var10 ^= ((long)var44 << 32 ^ var10) & -1L << 32;
               var12 ^= ((long)((int)(var10 >>> 32)) ^ var12) & -1L >>> 32;
               var10000 = keys;

               try {
                  var46 = var10000.IilliliilIIi();
               } catch (Throwable var21) {
                  var39 = var21;
                  boolean var55 = false;
                  break label71;
               }

               var10 ^= ((long)var46 << 32 ^ var10) & -1L << 32;
               var14 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var14) & -1L << 32;
               var10000 = keys;

               try {
                  var48 = var10000.lIiiIiIlilli();
               } catch (Throwable var20) {
                  var39 = var20;
                  boolean var56 = false;
                  break label71;
               }

               var10 ^= ((long)var48 << 32 ^ var10) & -1L << 32;
               var14 ^= ((long)((int)(var10 >>> 32)) ^ var14) & -1L >>> 32;
               var10000 = keys;

               try {
                  var50 = var10000.iliIiiliiiii();
               } catch (Throwable var19) {
                  var39 = var19;
                  boolean var57 = false;
                  break label71;
               }

               var10 ^= ((long)var50 << 32 ^ var10) & -1L << 32;
               var16 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var16) & -1L << 32;
               var10000 = keys;

               try {
                  var52 = var10000.IIIllIIliIIl();
                  break label65;
               } catch (Throwable var18) {
                  var39 = var18;
                  boolean var58 = false;
               }
            }

            Throwable var8 = var39;
            throw new MatchException(var8.toString(), var8);
         }

         var10 ^= ((long)var52 << 32 ^ var10) & -1L << 32;
         var16 ^= ((long)((int)(var10 >>> 32)) ^ var16) & -1L >>> 32;
         return new liIiIIiiiIiIIi(false, false, false, false, (boolean)((int)var14), (boolean)((int)(var16 >>> 32)), false);
      } else {
         return liIiIIiiiIiIIi.lIiliiiliiIiliiili;
      }
   }

   public static boolean lIiiIiIlilli() {
      return IIIliIIlil;
   }

   public static void IlIlllIlilIl(Object owner) {
      IiiIlIllliiIlIll var1 = lliIiIIlil;
      if (owner != null && var1 != null && var1.IliIlllilIi() == owner) {
         lliIiIIlil = null;
      }
   }

   private static boolean Illlllllilll(class_10185 sent) {
      return sent != null && sent.comp_3159() && !sent.comp_3160();
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   static boolean IIIilIIiiIIi(liIiIIiiiIiIIi keys) {
      Throwable var39;
      label89: {
         long var16 = -5027991502196380620L;
         long var10 = -3170861735279230032L;
         long var12 = -7400206060963381533L;
         long var14 = -9028358219857170205L;
         if (keys instanceof liIiIIiiiIiIIi) {
            liIiIIiiiIiIIi var10000 = keys;

            try {
               var40 = var10000.IliIlllilIi();
            } catch (Throwable var24) {
               var39 = var24;
               boolean var10001 = false;
               break label89;
            }

            var10 ^= ((long)var40 << 32 ^ var10) & -1L << 32;
            var10 ^= ((long)((int)(var10 >>> 32)) ^ var10) & -1L >>> 32;
            liIiIIiiiIiIIi var41 = keys;

            try {
               var42 = var41.liiiIIllIl();
            } catch (Throwable var23) {
               var39 = var23;
               boolean var54 = false;
               break label89;
            }

            var10 ^= ((long)var42 << 32 ^ var10) & -1L << 32;
            var12 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var12) & -1L << 32;
            liIiIIiiiIiIIi var43 = keys;

            try {
               var44 = var43.iIlIlllllill();
            } catch (Throwable var22) {
               var39 = var22;
               boolean var55 = false;
               break label89;
            }

            var10 ^= ((long)var44 << 32 ^ var10) & -1L << 32;
            var12 ^= ((long)((int)(var10 >>> 32)) ^ var12) & -1L >>> 32;
            liIiIIiiiIiIIi var45 = keys;

            try {
               var46 = var45.IilliliilIIi();
            } catch (Throwable var21) {
               var39 = var21;
               boolean var56 = false;
               break label89;
            }

            var10 ^= ((long)var46 << 32 ^ var10) & -1L << 32;
            var14 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var14) & -1L << 32;
            liIiIIiiiIiIIi var47 = keys;

            try {
               var48 = var47.lIiiIiIlilli();
            } catch (Throwable var20) {
               var39 = var20;
               boolean var57 = false;
               break label89;
            }

            var10 ^= ((long)var48 << 32 ^ var10) & -1L << 32;
            var14 ^= ((long)((int)(var10 >>> 32)) ^ var14) & -1L >>> 32;
            liIiIIiiiIiIIi var49 = keys;

            try {
               var50 = var49.iliIiiliiiii();
            } catch (Throwable var19) {
               var39 = var19;
               boolean var58 = false;
               break label89;
            }

            var10 ^= ((long)var50 << 32 ^ var10) & -1L << 32;
            var16 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var16) & -1L << 32;
            liIiIIiiiIiIIi var51 = keys;

            try {
               var52 = var51.IIIllIIliIIl();
            } catch (Throwable var18) {
               var39 = var18;
               boolean var59 = false;
               break label89;
            }

            var10 ^= ((long)var52 << 32 ^ var10) & -1L << 32;
            var16 ^= ((long)((int)(var10 >>> 32)) ^ var16) & -1L >>> 32;
            if ((int)var10 != 0 || (int)(var12 >>> 32) != 0 || (int)var12 != 0 || (int)(var14 >>> 32) != 0 || (int)var16 != 0) {
               return true;
            }
         }

         return false;
      }

      Throwable var1 = var39;
      throw new MatchException(var1.toString(), var1);
   }

   private static class_10185 Ililllililil(liIiIIiiiIiIIi keys) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:365)
      //   at java.base/java.util.ArrayList.get(ArrayList.java:428)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchPatternMatchProcessor.processStatement(SwitchPatternMatchProcessor.java:90)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchPatternMatchProcessor.processPatternMatchingRec(SwitchPatternMatchProcessor.java:40)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchPatternMatchProcessor.processPatternMatchingRec(SwitchPatternMatchProcessor.java:35)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchPatternMatchProcessor.processPatternMatching(SwitchPatternMatchProcessor.java:21)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:318)
      //
      // Bytecode:
      // 000: ldc2_w 4405401535294595420
      // 003: lstore 16
      // 005: ldc2_w -6923461611882961362
      // 008: lstore 18
      // 00a: ldc2_w 4228933837955310196
      // 00d: lstore 20
      // 00f: ldc2_w -1518616186095572493
      // 012: lstore 12
      // 014: ldc2_w -5218167879009604981
      // 017: lstore 14
      // 019: aload 0
      // 01a: dup
      // 01b: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 01e: pop
      // 01f: astore 1
      // 020: lconst_0
      // 021: lload 12
      // 023: dup2_x2
      // 024: lxor
      // 025: lconst_1
      // 026: lneg
      // 027: bipush 32
      // 029: lshl
      // 02a: land
      // 02b: lxor
      // 02c: lstore 12
      // 02e: aload 1
      // 02f: lload 12
      // 031: bipush 32
      // 033: lushr
      // 034: l2i
      // 035: invokedynamic typeSwitch (Ljava/lang/Object;I)I bsm=java/lang/runtime/SwitchBootstraps.typeSwitch (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ gg/corz/liIiIIiiiIiIIi ]
      // 03a: lookupswitch 18 1 0 28
      // 04c: new java/lang/MatchException
      // 04f: dup
      // 050: aconst_null
      // 051: aconst_null
      // 052: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 055: athrow
      // 056: aload 1
      // 057: astore 3
      // 058: aload 3
      // 059: invokevirtual gg/corz/liIiIIiiiIiIIi.IliIlllilIi ()Z
      // 05c: i2l
      // 05d: lload 12
      // 05f: dup2_x2
      // 060: lxor
      // 061: lconst_1
      // 062: lneg
      // 063: bipush 32
      // 065: lushr
      // 066: land
      // 067: lxor
      // 068: lstore 12
      // 06a: lload 12
      // 06c: l2i
      // 06d: i2l
      // 06e: bipush 32
      // 070: lshl
      // 071: lload 14
      // 073: dup2_x2
      // 074: lxor
      // 075: lconst_1
      // 076: lneg
      // 077: bipush 32
      // 079: lshl
      // 07a: land
      // 07b: lxor
      // 07c: lstore 14
      // 07e: aload 3
      // 07f: invokevirtual gg/corz/liIiIIiiiIiIIi.liiiIIllIl ()Z
      // 082: i2l
      // 083: lload 12
      // 085: dup2_x2
      // 086: lxor
      // 087: lconst_1
      // 088: lneg
      // 089: bipush 32
      // 08b: lushr
      // 08c: land
      // 08d: lxor
      // 08e: lstore 12
      // 090: lload 12
      // 092: l2i
      // 093: i2l
      // 094: lload 14
      // 096: dup2_x2
      // 097: lxor
      // 098: lconst_1
      // 099: lneg
      // 09a: bipush 32
      // 09c: lushr
      // 09d: land
      // 09e: lxor
      // 09f: lstore 14
      // 0a1: aload 3
      // 0a2: invokevirtual gg/corz/liIiIIiiiIiIIi.iIlIlllllill ()Z
      // 0a5: i2l
      // 0a6: lload 12
      // 0a8: dup2_x2
      // 0a9: lxor
      // 0aa: lconst_1
      // 0ab: lneg
      // 0ac: bipush 32
      // 0ae: lushr
      // 0af: land
      // 0b0: lxor
      // 0b1: lstore 12
      // 0b3: lload 12
      // 0b5: l2i
      // 0b6: i2l
      // 0b7: bipush 32
      // 0b9: lshl
      // 0ba: lload 16
      // 0bc: dup2_x2
      // 0bd: lxor
      // 0be: lconst_1
      // 0bf: lneg
      // 0c0: bipush 32
      // 0c2: lshl
      // 0c3: land
      // 0c4: lxor
      // 0c5: lstore 16
      // 0c7: aload 3
      // 0c8: invokevirtual gg/corz/liIiIIiiiIiIIi.IilliliilIIi ()Z
      // 0cb: i2l
      // 0cc: lload 12
      // 0ce: dup2_x2
      // 0cf: lxor
      // 0d0: lconst_1
      // 0d1: lneg
      // 0d2: bipush 32
      // 0d4: lushr
      // 0d5: land
      // 0d6: lxor
      // 0d7: lstore 12
      // 0d9: lload 12
      // 0db: l2i
      // 0dc: i2l
      // 0dd: lload 16
      // 0df: dup2_x2
      // 0e0: lxor
      // 0e1: lconst_1
      // 0e2: lneg
      // 0e3: bipush 32
      // 0e5: lushr
      // 0e6: land
      // 0e7: lxor
      // 0e8: lstore 16
      // 0ea: aload 3
      // 0eb: invokevirtual gg/corz/liIiIIiiiIiIIi.lIiiIiIlilli ()Z
      // 0ee: i2l
      // 0ef: lload 12
      // 0f1: dup2_x2
      // 0f2: lxor
      // 0f3: lconst_1
      // 0f4: lneg
      // 0f5: bipush 32
      // 0f7: lushr
      // 0f8: land
      // 0f9: lxor
      // 0fa: lstore 12
      // 0fc: lload 12
      // 0fe: l2i
      // 0ff: i2l
      // 100: bipush 32
      // 102: lshl
      // 103: lload 18
      // 105: dup2_x2
      // 106: lxor
      // 107: lconst_1
      // 108: lneg
      // 109: bipush 32
      // 10b: lshl
      // 10c: land
      // 10d: lxor
      // 10e: lstore 18
      // 110: aload 3
      // 111: invokevirtual gg/corz/liIiIIiiiIiIIi.iliIiiliiiii ()Z
      // 114: i2l
      // 115: lload 12
      // 117: dup2_x2
      // 118: lxor
      // 119: lconst_1
      // 11a: lneg
      // 11b: bipush 32
      // 11d: lushr
      // 11e: land
      // 11f: lxor
      // 120: lstore 12
      // 122: lload 12
      // 124: l2i
      // 125: i2l
      // 126: lload 18
      // 128: dup2_x2
      // 129: lxor
      // 12a: lconst_1
      // 12b: lneg
      // 12c: bipush 32
      // 12e: lushr
      // 12f: land
      // 130: lxor
      // 131: lstore 18
      // 133: aload 3
      // 134: invokevirtual gg/corz/liIiIIiiiIiIIi.IIIllIIliIIl ()Z
      // 137: i2l
      // 138: lload 12
      // 13a: dup2_x2
      // 13b: lxor
      // 13c: lconst_1
      // 13d: lneg
      // 13e: bipush 32
      // 140: lushr
      // 141: land
      // 142: lxor
      // 143: lstore 12
      // 145: lload 12
      // 147: l2i
      // 148: i2l
      // 149: bipush 32
      // 14b: lshl
      // 14c: lload 20
      // 14e: dup2_x2
      // 14f: lxor
      // 150: lconst_1
      // 151: lneg
      // 152: bipush 32
      // 154: lshl
      // 155: land
      // 156: lxor
      // 157: lstore 20
      // 159: new net/minecraft/class_10185
      // 15c: dup
      // 15d: lload 14
      // 15f: bipush 32
      // 161: lushr
      // 162: l2i
      // 163: lload 14
      // 165: l2i
      // 166: lload 16
      // 168: bipush 32
      // 16a: lushr
      // 16b: l2i
      // 16c: lload 16
      // 16e: l2i
      // 16f: lload 18
      // 171: bipush 32
      // 173: lushr
      // 174: l2i
      // 175: lload 18
      // 177: l2i
      // 178: lload 20
      // 17a: bipush 32
      // 17c: lushr
      // 17d: l2i
      // 17e: ifeq 194
      // 181: lload 14
      // 183: bipush 32
      // 185: lushr
      // 186: l2i
      // 187: ifeq 194
      // 18a: lload 14
      // 18c: l2i
      // 18d: ifne 194
      // 190: bipush 1
      // 191: goto 195
      // 194: bipush 0
      // 195: invokespecial net/minecraft/class_10185.<init> (ZZZZZZZ)V
      // 198: areturn
      // 199: astore 1
      // 19a: new java/lang/MatchException
      // 19d: dup
      // 19e: aload 1
      // 19f: invokevirtual java/lang/Throwable.toString ()Ljava/lang/String;
      // 1a2: aload 1
      // 1a3: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1a6: athrow
   }

   public static boolean iliIiiliiiii() {
      return lIIliIIlil;
   }

   private static boolean IIlilIliiIli(IilIIIililIIIi t, boolean vanilla) {
      if (t == IilIIIililIIIi.IIillIililIillIili) {
         return true;
      } else {
         return t == IilIIIililIIIi.iIillIiliIlillIili ? false : vanilla;
      }
   }

   public static void liiiIIllIl() {
      IiiIlIllliiIlIll var0 = lliIiIIlil;
      if (var0 != null && var0.IilliliilIIi() != IIllIIlilIllIIli.IlIlllIlilIl()) {
         lliIiIIlil = null;
      }

      iiiIiIIlil = false;
      IIIliIIlil = false;
   }

   public static void IliIlllilIi(Object owner, iIllllIlIlllllIl intent, int prio) {
      if (owner != null && intent != null) {
         long var3 = IIllIIlilIllIIli.IlIlllIlilIl();
         IiiIlIllliiIlIll var5 = lliIiIIlil;
         if (var5 == null || var5.IilliliilIIi() != var3 || prio > var5.iIlIlllllill()) {
            lliIiIIlil = new IiiIlIllliiIlIll(owner, intent, prio, var3);
         }
      }
   }

   private lIIIililiIIIilil() {
   }

   public static liIiIIiiiIiIIi IIIllIIliIIl() {
      return iIIliIIlil;
   }

   public static void IiIlliIliiIl() {
      lliIiIIlil = null;
      lIiIiIIlil.IliIlllilIi(liIiIIiiiIiIIi.lIiliiiliiIiliiili);
      iIiIiIIlil.IliIlllilIi();
      IliIiIIlil.IliIlllilIi();
      iliIiIIlil = new WeakReference<>(null);
      IiiIiIIlil = illIiIIlil;
      liiIiIIlil = Long.MIN_VALUE;
      iiiIiIIlil = false;
      IIIliIIlil = false;
      lIIliIIlil = false;
      iIIliIIlil = liIiIIiiiIiIIi.lIiliiiliiIiliiili;
   }

   public static boolean IilliliilIIi() {
      return iiiIiIIlil;
   }

   private static boolean IIlllIlliIll(class_315 o) {
      return IillIIIllillIIIl.IliIlllilIi(o.field_1894)
         || IillIIIllillIIIl.IliIlllilIi(o.field_1881)
         || IillIIIllillIIIl.IliIlllilIi(o.field_1913)
         || IillIIIllillIIIl.IliIlllilIi(o.field_1849)
         || IillIIIllillIIIl.IliIlllilIi(o.field_1903)
         || IillIIIllillIIIl.IliIlllilIi(o.field_1832);
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   static boolean Iiilliiliiil(liIiIIiiiIiIIi keys) {
      Throwable var39;
      label73: {
         long var16 = -2062878000770698257L;
         long var10 = 4026311913404030811L;
         long var12 = -7529013131447186599L;
         long var14 = 2746915490072384219L;
         if (keys instanceof liIiIIiiiIiIIi) {
            liIiIIiiiIiIIi var10000 = keys;

            try {
               var40 = var10000.IliIlllilIi();
            } catch (Throwable var24) {
               var39 = var24;
               boolean var10001 = false;
               break label73;
            }

            var10 ^= ((long)var40 << 32 ^ var10) & -1L << 32;
            var10 ^= ((long)((int)(var10 >>> 32)) ^ var10) & -1L >>> 32;
            liIiIIiiiIiIIi var41 = keys;

            try {
               var42 = var41.liiiIIllIl();
            } catch (Throwable var23) {
               var39 = var23;
               boolean var54 = false;
               break label73;
            }

            var10 ^= ((long)var42 << 32 ^ var10) & -1L << 32;
            var12 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var12) & -1L << 32;
            liIiIIiiiIiIIi var43 = keys;

            try {
               var44 = var43.iIlIlllllill();
            } catch (Throwable var22) {
               var39 = var22;
               boolean var55 = false;
               break label73;
            }

            var10 ^= ((long)var44 << 32 ^ var10) & -1L << 32;
            var12 ^= ((long)((int)(var10 >>> 32)) ^ var12) & -1L >>> 32;
            liIiIIiiiIiIIi var45 = keys;

            try {
               var46 = var45.IilliliilIIi();
            } catch (Throwable var21) {
               var39 = var21;
               boolean var56 = false;
               break label73;
            }

            var10 ^= ((long)var46 << 32 ^ var10) & -1L << 32;
            var14 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var14) & -1L << 32;
            liIiIIiiiIiIIi var47 = keys;

            try {
               var48 = var47.lIiiIiIlilli();
            } catch (Throwable var20) {
               var39 = var20;
               boolean var57 = false;
               break label73;
            }

            var10 ^= ((long)var48 << 32 ^ var10) & -1L << 32;
            var14 ^= ((long)((int)(var10 >>> 32)) ^ var14) & -1L >>> 32;
            liIiIIiiiIiIIi var49 = keys;

            try {
               var50 = var49.iliIiiliiiii();
            } catch (Throwable var19) {
               var39 = var19;
               boolean var58 = false;
               break label73;
            }

            var10 ^= ((long)var50 << 32 ^ var10) & -1L << 32;
            var16 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var16) & -1L << 32;
            liIiIIiiiIiIIi var51 = keys;

            try {
               var52 = var51.IIIllIIliIIl();
            } catch (Throwable var18) {
               var39 = var18;
               boolean var59 = false;
               break label73;
            }

            var10 ^= ((long)var52 << 32 ^ var10) & -1L << 32;
            var16 ^= ((long)((int)(var10 >>> 32)) ^ var16) & -1L >>> 32;
            if ((int)var14 != 0) {
               return true;
            }
         }

         return false;
      }

      Throwable var1 = var39;
      throw new MatchException(var1.toString(), var1);
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   static liIiIIiiiIiIIi IiIiliIiiiIi(liIiIIiiiIiIIi keys) {
      long var16 = 2521534005870465462L;
      long var10 = 8854513352768055192L;
      long var12 = -7233802437519186307L;
      long var14 = 8342658463965740021L;
      if (keys instanceof liIiIIiiiIiIIi) {
         liIiIIiiiIiIIi var10000 = keys;

         label65: {
            label71: {
               try {
                  var40 = var10000.IliIlllilIi();
               } catch (Throwable var24) {
                  var39 = var24;
                  boolean var10001 = false;
                  break label71;
               }

               var10 ^= ((long)var40 << 32 ^ var10) & -1L << 32;
               var10 ^= ((long)((int)(var10 >>> 32)) ^ var10) & -1L >>> 32;
               var10000 = keys;

               try {
                  var42 = var10000.liiiIIllIl();
               } catch (Throwable var23) {
                  var39 = var23;
                  boolean var53 = false;
                  break label71;
               }

               var10 ^= ((long)var42 << 32 ^ var10) & -1L << 32;
               var12 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var12) & -1L << 32;
               var10000 = keys;

               try {
                  var44 = var10000.iIlIlllllill();
               } catch (Throwable var22) {
                  var39 = var22;
                  boolean var54 = false;
                  break label71;
               }

               var10 ^= ((long)var44 << 32 ^ var10) & -1L << 32;
               var12 ^= ((long)((int)(var10 >>> 32)) ^ var12) & -1L >>> 32;
               var10000 = keys;

               try {
                  var46 = var10000.IilliliilIIi();
               } catch (Throwable var21) {
                  var39 = var21;
                  boolean var55 = false;
                  break label71;
               }

               var10 ^= ((long)var46 << 32 ^ var10) & -1L << 32;
               var14 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var14) & -1L << 32;
               var10000 = keys;

               try {
                  var48 = var10000.lIiiIiIlilli();
               } catch (Throwable var20) {
                  var39 = var20;
                  boolean var56 = false;
                  break label71;
               }

               var10 ^= ((long)var48 << 32 ^ var10) & -1L << 32;
               var14 ^= ((long)((int)(var10 >>> 32)) ^ var14) & -1L >>> 32;
               var10000 = keys;

               try {
                  var50 = var10000.iliIiiliiiii();
               } catch (Throwable var19) {
                  var39 = var19;
                  boolean var57 = false;
                  break label71;
               }

               var10 ^= ((long)var50 << 32 ^ var10) & -1L << 32;
               var16 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var16) & -1L << 32;
               var10000 = keys;

               try {
                  var52 = var10000.IIIllIIliIIl();
                  break label65;
               } catch (Throwable var18) {
                  var39 = var18;
                  boolean var58 = false;
               }
            }

            Throwable var8 = var39;
            throw new MatchException(var8.toString(), var8);
         }

         var10 ^= ((long)var52 << 32 ^ var10) & -1L << 32;
         var16 ^= ((long)((int)(var10 >>> 32)) ^ var16) & -1L >>> 32;
         return new liIiIIiiiIiIIi(
            (boolean)((int)var10),
            (boolean)((int)(var12 >>> 32)),
            (boolean)((int)var12),
            (boolean)((int)(var14 >>> 32)),
            false,
            (boolean)((int)(var16 >>> 32)),
            (boolean)((int)var16)
         );
      } else {
         return liIiIIiiiIiIIi.lIiliiiliiIiliiili;
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static liIiIIiiiIiIIi IIillIiliIil(class_10185 sent) {
      long var16 = 1231763062115917418L;
      long var10 = 8215620162359686075L;
      long var12 = -8912537885770003314L;
      long var14 = -6235072801863487517L;
      if (sent instanceof class_10185) {
         class_10185 var10000 = sent;

         label65: {
            label71: {
               try {
                  var40 = var10000.comp_3159();
               } catch (Throwable var24) {
                  var39 = var24;
                  boolean var10001 = false;
                  break label71;
               }

               var10 ^= ((long)var40 << 32 ^ var10) & -1L << 32;
               var10 ^= ((long)((int)(var10 >>> 32)) ^ var10) & -1L >>> 32;
               var10000 = sent;

               try {
                  var42 = var10000.comp_3160();
               } catch (Throwable var23) {
                  var39 = var23;
                  boolean var53 = false;
                  break label71;
               }

               var10 ^= ((long)var42 << 32 ^ var10) & -1L << 32;
               var12 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var12) & -1L << 32;
               var10000 = sent;

               try {
                  var44 = var10000.comp_3161();
               } catch (Throwable var22) {
                  var39 = var22;
                  boolean var54 = false;
                  break label71;
               }

               var10 ^= ((long)var44 << 32 ^ var10) & -1L << 32;
               var12 ^= ((long)((int)(var10 >>> 32)) ^ var12) & -1L >>> 32;
               var10000 = sent;

               try {
                  var46 = var10000.comp_3162();
               } catch (Throwable var21) {
                  var39 = var21;
                  boolean var55 = false;
                  break label71;
               }

               var10 ^= ((long)var46 << 32 ^ var10) & -1L << 32;
               var14 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var14) & -1L << 32;
               var10000 = sent;

               try {
                  var48 = var10000.comp_3163();
               } catch (Throwable var20) {
                  var39 = var20;
                  boolean var56 = false;
                  break label71;
               }

               var10 ^= ((long)var48 << 32 ^ var10) & -1L << 32;
               var14 ^= ((long)((int)(var10 >>> 32)) ^ var14) & -1L >>> 32;
               var10000 = sent;

               try {
                  var50 = var10000.comp_3164();
               } catch (Throwable var19) {
                  var39 = var19;
                  boolean var57 = false;
                  break label71;
               }

               var10 ^= ((long)var50 << 32 ^ var10) & -1L << 32;
               var16 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var16) & -1L << 32;
               var10000 = sent;

               try {
                  var52 = var10000.comp_3165();
                  break label65;
               } catch (Throwable var18) {
                  var39 = var18;
                  boolean var58 = false;
               }
            }

            Throwable var8 = var39;
            throw new MatchException(var8.toString(), var8);
         }

         var10 ^= ((long)var52 << 32 ^ var10) & -1L << 32;
         var16 ^= ((long)((int)(var10 >>> 32)) ^ var16) & -1L >>> 32;
         return new liIiIIiiiIiIIi(
            (boolean)((int)var10),
            (boolean)((int)(var12 >>> 32)),
            (boolean)((int)var12),
            (boolean)((int)(var14 >>> 32)),
            (boolean)((int)var14),
            (boolean)((int)(var16 >>> 32)),
            (boolean)((int)var16)
         );
      } else {
         return liIiIIiiiIiIIi.lIiliiiliiIiliiili;
      }
   }

   private static int Iilllilliill(class_315 o) {
      class_7172 var1 = o.method_72709();
      Integer var2 = var1 != null ? (Integer)var1.method_41753() : null;
      return var2 != null ? Math.max(0, var2) : 7;
   }
}
