package gg.corz;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_1109;
import net.minecraft.class_1297;
import net.minecraft.class_1456;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1923;
import net.minecraft.class_1937;
import net.minecraft.class_1944;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2561;
import net.minecraft.class_2586;
import net.minecraft.class_2595;
import net.minecraft.class_2614;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_3417;
import net.minecraft.class_3481;
import net.minecraft.class_4482;
import net.minecraft.class_638;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2350.class_2351;
import org.joml.Matrix4f;

public class IlIllIIillIllIIi extends ilIllIiIll {
   private final int[] ilIlliliil;
   private static final int IIlIIiliil = 50;
   private final class_2339 IIllliliil;
   private static final int ilIIIiliil = 700;
   private static final int[] IIIIIiliil = new int[]{0, 0, 1, -1, 0, 0};
   private static final byte Iiiiilliil = 4;
   private final ByteArrayList IlIlliliil;
   private int Iillliliil;
   private static final byte iliiilliil = 3;
   private int ilIIliliil;
   private static final int liilIiliil = 6;
   private static final int lllIIiliil = 2;
   private static final byte Iliiilliil = 1;
   private final byte[] Illlliliil;
   private int iiiIliliil;
   private static final int iiiIIiliil = Iiililiili(60, 180, 100, 255);
   private static final int lIiiilliil = 48;
   private int iiIIliliil;
   private long[] lIIlliliil;
   private int illlliliil;
   private static final int iIllIiliil = 512;
   private static final int Iiliilliil = 2;
   private static final int liiIIiliil = Iiililiili(60, 0, 255, 80);
   private static final byte liiiilliil = 5;
   private static final int IiIIIiliil = 20;
   private final double[] iliIliliil;
   private final iiIiiilIIliiil IIliIiliil;
   private static final int[] iiiiilliil = new int[]{1, -1, 0, 0, 0, 0};
   private final LongArrayFIFOQueue iIiiIiliil;
   private static final int IillIiliil = 4;
   private boolean IIIIliliil;
   private static final int lIilIiliil = 0;
   private static final int iIlIIiliil = 4;
   private static final int IiilIiliil = 5;
   private static final int llliilliil = 0;
   private static final byte lliiilliil = 2;
   private final long[] IiiIliliil;
   private final Long2LongOpenHashMap lIiiIiliil;
   private static final int lIllIiliil = 256;
   private static final int iilIIiliil = 200;
   private static final int iIilIiliil = 1;
   private static final long llIIIiliil = 1500L;
   private static final int lillIiliil = 8;
   private static final int IIIlIiliil = Iiililiili(60, 255, 120, 0);
   private static final int llIlIiliil = 4;
   private final LongOpenHashSet liliIiliil;
   private int lIiIliliil;
   private final int[] illIliliil;
   private final lliliIIiililiIIi iIliIiliil;
   private static final long lliIIiliil = 300000L;
   private final iiIiiilIIliiil lIIiIiliil;
   private int llIIliliil;
   private static final int iiliilliil = 4;
   private static final int IiiIIiliil = Iiililiili(120, 255, 215, 0);
   private static final int illlIiliil = 2;
   private final LongOpenHashSet IiliIiliil;
   private static final int IilIIiliil = 21;
   private static final int IIiiilliil = -64;
   private static final int iillIiliil = 16;
   private static final int IlIlIiliil = 2;
   private static final int ililIiliil = 4;
   private final Long2ObjectOpenHashMap<IlIlIIIlllIlIIIl> iiliIiliil;
   private final Long2ObjectOpenHashMap<lIlIiliiIlIili> IIiiIiliil;
   private boolean liiiIiliil;
   private long[] IIIlliliil;
   private int liIIliliil;
   private int IllIliliil;
   private final iIIlIIIiIlIlIIIi IliiIiliil;
   private final int[] lllIliliil;
   private final IntArrayList iiIlliliil;
   private static final Reference2IntOpenHashMap<class_2248> IlllIiliil = new Reference2IntOpenHashMap();
   private boolean lIIIliliil;
   private static final int iiIlIiliil = 64;
   private static final int iIIlIiliil = 1;
   private static final class_2350[] iIIIIiliil = class_2350.values();
   private static final int IlilIiliil = 2;
   private static final int[] lIIlIiliil = new int[]{
      Iiililiili(255, 100, 100, 100), Iiililiili(255, 80, 80, 80), Iiililiili(255, 120, 0, 120), Iiililiili(255, 255, 255, 200)
   };
   private static final int liliilliil = 3;
   private final LongOpenHashSet illiIiliil;
   private final byte[] liIlliliil;
   private static final int liIlIiliil = 32;
   private static IlIllIIillIllIIi iliiIiliil;
   private final iiIiiilIIliiil lIliIiliil;
   private final int[] IilIliliil;
   private static final int iiIIIiliil = 10;
   private static final long iliIIiliil = Long.MIN_VALUE;
   private final LongOpenHashSet llliIiliil;
   private static final int ilIlIiliil = 8;
   private static final int IIllIiliil = 128;
   private boolean iiiiIiliil;
   private final double[] IliIliliil;
   private static final int IliIIiliil = 5;
   private boolean IlIIliliil;
   private static final int lIlIIiliil = 1;
   private final iIiiIiIlIliiIiIl lIllliliil;
   private static final int IIiIIiliil = 512;
   private final iiIiiilIIliiil IiIiIiliil;
   private final iiiiliiIIIIiii lliiIiliil;
   private final int[] IiIlliliil;
   private int IIiIliliil;
   private final LongArrayList iIIlliliil;
   private final iiIiiilIIliiil IIIiIiliil = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","ww8wJVtQM/qH2Xu/queq1ztVRFmAYAgd6HH2cvr6bWTlgXk1">(),
      IliIlllilIi<"IliIlllilIi","1c8SBibJOjOpSLVEYXJTeidYP8gJ/IL97cVbooV1ftKMUrRQfsttlD9/Q9JNLblRpyolKQKRMo9dXlELn2HsaFtlqAoZ9uwj71uWnxppBvyk9aMotscO2Y7PL9bw+QtAjjUX">(),
      true
   );
   private static final float iIiIIiliil = 0.3F;
   private int iIlIliliil;
   private final byte[] liiIliliil;
   private final iilliIlIIiliIl liIiIiliil;
   private final int[] llIlliliil;
   private static final int llllIiliil = 1;
   private boolean iIIIliliil;
   private final iiIiiilIIliiil IlliIiliil;
   private static final int iiilIiliil = 7;
   private static final int IIilIiliil = 6;
   private final iiIiiilIIliiil llIiIiliil;
   private final int[] lilIliliil;
   private int IiIIliliil;
   private static final int IiIlIiliil = 16;
   private final double[] lliIliliil;
   private final iiIiiilIIliiil IlIiIiliil;
   private static final int IllIIiliil = 3;
   private static final int liIIIiliil = 100;
   private boolean IiiiIiliil;
   private static final long IlIIIiliil = 60000L;
   private final iiIiiilIIliiil iIIiIiliil;
   private int[] iIllliliil;
   private static final int llilIiliil = 3;
   private static final int lIiIIiliil = 5;
   private static final int illIIiliil = 8;
   private final iiIiiilIIliiil ilIiIiliil;
   private static final int iIiiilliil = 113;
   private boolean lIlIliliil;
   private int iilIliliil;
   private static final int[] lIIIIiliil = new int[]{0, 0, 0, 0, 1, -1};
   private int iIiIliliil;
   private int llllliliil;
   private final IIIIlilllIIIlill iiIiIiliil;
   private static final int lilIIiliil = 50;
   private static final int illiilliil = 1;
   private int IIlIliliil;

   private double lIIIiiIIIi() {
      return Double.longBitsToDouble(-8023593495902440622L ^ -3405152078033996974L)
         + (double)(this.llIIliliil - 1) * Double.longBitsToDouble(5096256423277963677L ^ 8747674861119326473L);
   }

   private int iIlllIllll() {
      return Math.max(2, ((1268544386 + 3 ^ -37) * -755159085 ^ -910691466) + (5 - this.llIIliliil) * 2);
   }

   private static boolean lIiIiiIiIi(class_2248 block) {
      return block == class_2246.field_10034
         || block == class_2246.field_10380
         || block == class_2246.field_16328
         || block == class_2246.field_10443
         || block == class_2246.field_10181
         || block == class_2246.field_16333
         || block == class_2246.field_16334
         || block == class_2246.field_9980
         || block == class_2246.field_10485
         || block == class_2246.field_10535
         || block == class_2246.field_10105
         || block == class_2246.field_10414;
   }

   private static boolean liIIiiiIIi(class_2680 state) {
      return ilIIiIiIIi(state) != 0;
   }

   private static boolean lIlliiIlli(LongOpenHashSet set, class_1923 radius, int centre) {
      boolean var3 = false;
      LongIterator var4 = set.iterator();

      while (var4.hasNext()) {
         if (Illlilllli(var4.nextLong(), radius, centre)) {
            var4.remove();
            var3 = true;
         }
      }

      return var3;
   }

   public static void iilllIIill(class_2338 pos, class_2680 oldState, class_2680 newState) {
      IlIllIIillIllIIi var3 = iliiIiliil;
      if (var3 != null && oldState != newState && var3.IliIlllilIi()) {
         int var4 = pos.method_10263() >> 4;
         int var5 = pos.method_10260() >> 4;

         for (int var6 = -1; var6 <= 1; var6++) {
            for (int var7 = -1; var7 <= 1; var7++) {
               var3.IliiIiliil.iliIiiliiiii(var4 + var6, var5 + var7, 1500L);
            }
         }
      }
   }

   private static void iiiIlIIIll(int blocks, class_2248... bit) {
      for (class_2248 var5 : bit) {
         IlllIiliil.put(var5, IlllIiliil.getInt(var5) | blocks);
      }
   }

   public IlIllIIillIllIIi() {
      super(IliIlllilIi<"IliIlllilIi","fJuBvmO6QoGhzThXOjDk/Oz8IyxzLGDWXRE/R9gvwGDH0VCvKfUVYHs=">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.lIIiIiliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","62GAXXwcj8aPEavNVqMueNRtaW0PefiuJJ6hwt8beqxeJjTqb0cbayc=">(),
         IliIlllilIi<"IliIlllilIi","ry+dX8ZTlRezErpHRtROSYQ0XeuYvWthXkzDLzXQL1sIxwoArxE0bXwm01SUxNGcHZTeI2FRdVV79E7ebwk9C78RgUnha+AtFXmxWx5L0eEbIpPAtNROks2ud/EryVeWUmqsL1+27d7ZN0g3tr4PP424Axfh77LSZI/VuBkSE5Z7r3h6">(),
         true
      );
      this.iIIiIiliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","JZFEmCtEfCbaTeX2GYpqqju2DGyvxgCcWAyK9o3e5ZUivK+AH/zsmNBwN1E=">(),
         IliIlllilIi<"IliIlllilIi","htm8jhKELRa1M7zZY+XygycOGq95AcRe6BXbFTcYccw4sJepMQ2RtFa6BkF81juPlewJiRvCnklZCXfFc9oIfCSTYI0UeE2B8DnyacSPz1JCaO9385RLien/DmGoZl/Okw==">(),
         false
      );
      this.IlIiIiliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","wv7YLsq06pLPgx1jxI6H+QCgb+BStu9JjZDDOBl+2ff3pOcMMA==">(),
         IliIlllilIi<"IliIlllilIi","ikoNdvy1TuLaWzqMT714sCigK1EDUclYekCabSCRMfaB+LjcfrGsgrz7IV/U32oaF3sW8bUIzzif8uihrY5NiSjBLIttu8uI5WkvLHeaTz3GMKFx0Q==">(),
         false
      );
      this.llIiIiliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","7lqgHqABgzixn02bs+235QAEHl/5eo8fiCnzpkvk6ZT6832HjQeZ/K08j/Sq">(),
         IliIlllilIi<"IliIlllilIi","RgGDKskOXj3DK0rNY2iX7WuDXOGVmA9DH/PfiKZx67Q7lXi3aokfiEGXpPmfryecMxZKgEtVNHtcwu5hHsfoyWd7JpbKfJspYD42veNIlKF/VH3xpK/Rvz+EXVntDVil">(),
         false
      );
      this.ilIiIiliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","7FSk3HZ+99N8CCyvoOmxKxBBIz/srF0Ih0cMNxic4jF3hOOPLyT8gfazYEUf">(),
         IliIlllilIi<"IliIlllilIi","XlTd1V6PtIWqf5IIOue7PJriKPgdcMegBbG6+zb43qb8GuwSbmFgiSkvsBkp5F2CQXrritwQ/9FLj6Cm4F6tKZnLQs539sJp/+ETeYa3D3bgOlfivLSC7ieiGsb0VWmAfJfxldoTG8REYSPZzkjyyx2RFQrgViJGuiA=">(),
         false
      );
      this.IiIiIiliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","aDcZAsPaP7WUEAQP9eyRnJtg0G99IoTZvgmdFHBXxNZmQeKyGw==">(),
         IliIlllilIi<"IliIlllilIi","izxv4FxHmekmKgGwIgDjuTNEAdqxdBHEQo+tEVVXGLBosc7ZoK6LAZRy76Z6/j7FBmOajhl54oMGeHd6qNZC7RdGeUew">(),
         false
      );
      this.liIiIiliil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","wXNI7nBKAi/ouAvM99CaMSFf0v/vWR/PqVnxf3uWhHIHWV1MAk1F">(),
         IliIlllilIi<"IliIlllilIi","NiUvtuLmf+TRLUBsB63G5VMQtYQoyYqg03lg+M4WIP36HWj36k+V2oOG0Pe6lLeiq68ukozm/quSAMftGBVKkVzOUw2HBjA+VkM+u8J32qKEke7Eiw5mMgJD7jaF8C6anMffdWfd85h+uaAMSq5A35WTSVEj2ew8j707zC+SVS9KYQ==">(),
         5,
         1,
         10
      );
      this.iiIiIiliil = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","pJh8nPuAKZEHBqWrFnViIx09s1/CJzBqmh/xhLHVOHFuzPN/U6PO5E8=">(),
         IliIlllilIi<"IliIlllilIi","gj3+1Qjp4QkOzKhM0Nq0VC75dVeV8Jdw8K4CyVpvRCUPTr0nWUdlnrN+JR2CodVh5xtDGIPoC8LtTLIj1t2EV0/skadX">(),
         64.0,
         -64.0,
         320.0
      );
      this.IIliIiliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","EJlGCnfO6QRbWtTKQuBKvGc34vHWFGG87LnTDYhB+iiO3EExbQA3vKx8DnI=">(),
         IliIlllilIi<"IliIlllilIi","nCdhQhlX4MLKKyC55WZXLEyZQX9z4wnhc92x2sD5qLNLY2KpJK5ll5YRRhadS5iH/QLdHaj781+jmXbgW6oJ9QZFAv2HEr1e6BrxfXhTPuAwWHReTgleanYpcr3HL+qskE5eb+QlFxMYDvo/">(),
         true
      );
      this.lIliIiliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","cSN4KwQkwwIcIJNtB2luXGRbJw8RVeMMUEf1Xmej3+hTRCThNmuzZdc=">(),
         IliIlllilIi<"IliIlllilIi","ovNm6eYLpt4TSijh7PbjFBSe1rlNYZDavKBpxJukOWi2O/CaJWxViFHsNYnATjMY5opopnPNRhyMyHD7GEVjaSMQ5pxgZ++6jjlYq7WBtUvapOYTW+dYpx/ohYDq9PGgU0knEg==">(),
         true
      );
      this.iIliIiliil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","y7KeLrOlILK+R7k7ojUwswSHdwo68kTqgCC339PozxqDuIOmXJQQ/80=">(),
         IliIlllilIi<"IliIlllilIi","tZGyWA2tIAo2DBiDUqi/XtvZ9rZpyI3dEWHwW7ZPRSSJqKfqSMe4kHctLvJPjg4vi4l4IIL7mZuLFg==">(),
         IliIlllilIi<"IliIlllilIi","pK5knbPgdyRyj6qYtbkTy/BAXfsDs6bpuSUnCUAZk7Y=">(),
         IliIlllilIi<"IliIlllilIi","pK5knbPgdyRyj6qYtbkTy/BAXfsDs6bpuSUnCUAZk7Y=">(),
         IliIlllilIi<"IliIlllilIi","JKQHYGPgdAopBG+ml9jufnPrjGL/IvsioW7gK1cEUWU8">(),
         IliIlllilIi<"IliIlllilIi","JcytQyrlEal/7v8XLKm9/0bLHiqkGJIL6mypjyiL/Eo=">(),
         IliIlllilIi<"IliIlllilIi","/O03kRbJpUKDOrsmYUDBP1PfHJ5AGWdJ3kYOaBfEVQ==">()
      );
      this.IlliIiliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","Ws0HVH/VPfLLG/g64lR6T+tCIY4BBk+z4fJdX49MQABhhYoqh6oJww==">(),
         IliIlllilIi<"IliIlllilIi","dXgSEbT7KtXMUpKosyhAc31hQ80CanCSgaCMZ204LtiKC1KKAnEJh5GSl1qIX2k0fw5OGRfxmP4IbLvdN92h+QAtFQ==">(),
         true
      );
      this.llliIiliil = new LongOpenHashSet();
      this.illiIiliil = new LongOpenHashSet();
      this.IiliIiliil = new LongOpenHashSet();
      this.liliIiliil = new LongOpenHashSet();
      this.iiliIiliil = new Long2ObjectOpenHashMap();
      this.IIiiIiliil = new Long2ObjectOpenHashMap();
      this.lIiiIiliil = new Long2LongOpenHashMap();
      this.iIiiIiliil = new LongArrayFIFOQueue();
      this.IliiIiliil = new iIIlIIIiIlIlIIIi();
      this.lliiIiliil = new iiiiliiIIIIiii(this);
      this.llIIliliil = 5;
      this.ilIIliliil = -1;
      this.iIlIliliil = Integer.MIN_VALUE;
      this.IllIliliil = Integer.MIN_VALUE;
      this.lllIliliil = new int[100];
      this.illIliliil = new int[100];
      this.IilIliliil = new int[100];
      this.lilIliliil = new int[100];
      this.IliIliliil = new double[50];
      this.lliIliliil = new double[50];
      this.iliIliliil = new double[50];
      this.IiiIliliil = new long[200];
      this.liiIliliil = new byte[200];
      this.IIIlliliil = new long[256];
      this.lIIlliliil = new long[256];
      this.iIIlliliil = new LongArrayList();
      this.IlIlliliil = new ByteArrayList();
      this.llIlliliil = new int[256];
      this.ilIlliliil = new int[256];
      this.IiIlliliil = new int[256];
      this.liIlliliil = new byte[28928];
      this.iiIlliliil = new IntArrayList();
      this.IIllliliil = new class_2339();
      this.lIllliliil = new iIiiIiIlIliiIiIl();
      this.iIllliliil = new int[64];
      this.Illlliliil = new byte[9261];
      this.lIiiIiliil.defaultReturnValue(Long.MIN_VALUE);
      iliiIiliil = this;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.IIIiIiliil,
            this.lIIiIiliil,
            this.iIIiIiliil,
            this.IlIiIiliil,
            this.llIiIiliil,
            this.ilIiIiliil,
            this.IiIiIiliil,
            this.liIiIiliil,
            this.iiIiIiliil,
            this.IIliIiliil,
            this.lIliIiliil,
            this.iIliIiliil,
            this.IlliIiliil
         }
      );
   }

   private static boolean liiIiiiiIi(class_2680 state) {
      return state.method_27852(class_2246.field_27133) || state.method_27852(class_2246.field_33407) || state.method_27852(class_2246.field_47035);
   }

   private static boolean IliIilliIi(class_2680 state) {
      return state.method_27852(class_2246.field_28888) && state.method_28498(class_2741.field_12496)
         ? state.method_11654(class_2741.field_12496) == class_2351.field_11052
         : false;
   }

   private void ilIllIiIll() {
      this.IiiiIiliil = this.IIIiIiliil.Iilllilliill();
      this.liiiIiliil = this.lIIiIiliil.Iilllilliill();
      this.iiiiIiliil = this.iIIiIiliil.Iilllilliill();
      this.IIIIliliil = this.IlIiIiliil.Iilllilliill();
      this.lIIIliliil = this.llIiIiliil.Iilllilliill();
      this.iIIIliliil = this.ilIiIiliil.Iilllilliill();
      this.IlIIliliil = this.IiIiIiliil.Iilllilliill();
      this.llIIliliil = this.liIiIiliil.Iilllilliill();
      int var1 = this.llIIliliil
         | (this.IiiiIiliil ? 256 : 0)
         | (this.liiiIiliil ? 512 : 0)
         | (this.iiiiIiliil ? 1024 : 0)
         | (this.IIIIliliil ? 2048 : 0)
         | (this.lIIIliliil ? 4096 : 0)
         | (this.iIIIliliil ? 8192 : 0)
         | (this.IlIIliliil ? 16384 : 0);
      if (var1 != this.ilIIliliil) {
         if (this.ilIIliliil != -1) {
            this.IlIllllIll();
         }

         this.ilIIliliil = var1;
      }
   }

   static {
      iiiIlIIIll(1, class_2246.field_10124, class_2246.field_10543);
      iiiIlIIIll(2, class_2246.field_10445, class_2246.field_29031, class_2246.field_9989);
      iiiIlIIIll(4, class_2246.field_28892, class_2246.field_28900, class_2246.field_28896, class_2246.field_28904);
      iiiIlIIIll(
         8,
         class_2246.field_10440,
         class_2246.field_10596,
         class_2246.field_28901,
         class_2246.field_28893,
         class_2246.field_10563,
         class_2246.field_10569,
         class_2246.field_10616,
         class_2246.field_28889
      );
      iiiIlIIIll(16, class_2246.field_10540);
      iiiIlIIIll(32, class_2246.field_10560, class_2246.field_10615, class_2246.field_10008, class_2246.field_10379);
      iiiIlIIIll(64, class_2246.field_10034, class_2246.field_10380);
      iiiIlIIIll(
         128,
         class_2246.field_10442,
         class_2246.field_29029,
         class_2246.field_10212,
         class_2246.field_29027,
         class_2246.field_10571,
         class_2246.field_29026,
         class_2246.field_10013,
         class_2246.field_29220,
         class_2246.field_10090,
         class_2246.field_29028,
         class_2246.field_10080,
         class_2246.field_29030,
         class_2246.field_10418,
         class_2246.field_29219,
         class_2246.field_27120,
         class_2246.field_29221,
         class_2246.field_22109
      );
      iiiIlIIIll(256, class_2246.field_10442, class_2246.field_29029, class_2246.field_22109);
      iiiIlIIIll(
         512, class_2246.field_10445, class_2246.field_29031, class_2246.field_10340, class_2246.field_28888, class_2246.field_10540, class_2246.field_10515
      );
   }

   @Override
   protected void Illillliilli() {
      this.lIIlliIIll();
   }

   @Override
   protected void Iilililiiili() {
      this.lIIlliIIll();
   }

   private void lIIlliIIll() {
      this.IlIllllIll();
      this.IIiiIiliil.clear();
      this.lIiiIiliil.clear();
      this.iIiiIiliil.clear();
      this.liIIliliil = 0;
      this.iiIIliliil = 0;
      this.IIlIliliil = 0;
      this.ilIIliliil = -1;
   }

   private int IilIililIi(class_2818 x, int z, int chunk, int y) {
      return IlllIiliil.getInt(x.method_8320(this.IIllliliil.method_10103(z, chunk, y)).method_26204()) >>> ((621360125 - -49 + -85 ^ 11) - 77 ^ 621360012) & 1;
   }

   private void Ilillllill(class_2818 analysis, IlIlIIIlllIlIIIl chunk) {
      class_2826[] var3 = analysis.method_12006();
      int var4 = analysis.method_12004().method_8326();
      int var5 = analysis.method_12004().method_8328();
      int var6 = analysis.method_31607();
      boolean var7 = Iiiilllliiilll.field_1687.method_27983() == class_1937.field_25181;
      boolean var8 = this.IIIIliliil;
      boolean var9 = this.iIIIliliil;
      boolean var10 = this.lIIIliliil;
      boolean var11 = this.IlIIliliil && !var7;
      Predicate var12 = cobbled -> liiIiiiiIi(cobbled)
            || var8 && IliIilliIi(cobbled)
            || var9 && iliIiIiiIi(cobbled)
            || var10 && cobbled.method_27852(class_2246.field_29031)
            || var11 && cobbled.method_27852(class_2246.field_10471);
      boolean var13 = false;

      for (int var14 = 0; var14 < var3.length; var14++) {
         class_2826 var15 = var3[var14];
         if (var15 != null && !var15.method_38292()) {
            int var16 = var6 + var14 * 16;
            if (var16 <= 128 && var16 + 15 >= 0 && var15.method_19523(var12)) {
               if (!var13) {
                  this.lliiIiliil.IliIlllilIi(analysis);
                  var13 = true;
               }

               this.lIllliliil.iIlIlllllill(var15);
               int[] var17 = this.lIllliliil.IIlilliIll;
               int[] var18 = this.ilillIiill(this.lIllliliil.iIlilliIll);

               for (int var19 = 0; var19 < this.lIllliliil.iIlilliIll; var19++) {
                  class_2680 var20 = this.lIllliliil.lIlilliIll[var19];
                  byte var21 = 0;
                  if (!var20.method_26215()) {
                     if (liiIiiiiIi(var20)) {
                        var21 |= 1;
                     }

                     if (var8 && IliIilliIi(var20)) {
                        var21 |= 2;
                     }

                     if (var9 && iliIiIiiIi(var20)) {
                        var21 |= 4;
                     }

                     if (var10 && var20.method_27852(class_2246.field_29031)) {
                        var21 |= 8;
                     }

                     if (var11 && var20.method_27852(class_2246.field_10471)) {
                        var21 |= 16;
                     }
                  }

                  var18[var19] = var21;
               }

               for (int var24 = 0; var24 < 16; var24++) {
                  int var25 = var16 + var24;
                  if (var25 >= 0 && var25 <= 128) {
                     for (int var26 = 0; var26 < 16; var26++) {
                        for (int var22 = 0; var22 < 16; var22++) {
                           int var23 = var18[var17[iIiiIiIlIliiIiIl.IliIlllilIi(var26, var24, var22)]];
                           if (var23 != 0) {
                              this.liilliiill(var4 + var26, var25, var5 + var22, var23, chunk);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static int IIiillIiil(int z, int y, int x) {
      return (y * (~(-1757390078) ^ 1757390061) + z) * ((-768340297 << 15 | -768340297 >>> 17) * 1062196213 * -79 ^ -936161966) + x;
   }

   private int lilliiilli(LongOpenHashSet out, class_1923 set, int[] centre) {
      int var4 = out.size();
      if (var4 == 0) {
         return 0;
      } else {
         if (this.IIIlliliil.length < var4) {
            this.IIIlliliil = new long[var4 * 2];
         }

         if (this.lIIlliliil.length < var4) {
            this.lIIlliliil = new long[var4 * 2];
         }

         int var5 = 0;

         for (LongIterator var6 = out.iterator(); var6.hasNext(); var5++) {
            long var7 = var6.nextLong();
            long var9 = (long)(class_1923.method_8325(var7) - set.field_9181);
            long var11 = (long)(class_1923.method_8332(var7) - set.field_9180);
            this.lIIlliliil[var5] = var7;
            this.IIIlliliil[var5] = Math.min(var9 * var9 + var11 * var11, 2147483647L) << 32 | (long)var5;
         }

         Arrays.sort(this.IIIlliliil, 0, var4);
         int var13 = Math.min(var4, 50);

         for (int var8 = 0; var8 < var13; var8++) {
            long var14 = this.lIIlliliil[(int)this.IIIlliliil[var8]];
            centre[var8 << 1] = class_1923.method_8325(var14);
            centre[(var8 << 1) + 1] = class_1923.method_8332(var14);
         }

         return var13;
      }
   }

   private int illilIilil(class_1937 level, int x, int y, int z) {
      long var7 = 2369603836359765362L;
      var7 ^= (
            (long)(
                     ((x - this.llllliliil) * (-903868465 * -85 * -724452315 ^ -1650100756) + (y - this.illlliliil))
                           * ((-1224766259 << 13 | -1224766259 >>> 19) * -87 * -1631000239 ^ 658184818)
                        + (z - this.Iillliliil)
                  )
                  << 32
               ^ var7
         )
         & -1L << 32;
      var7 ^= ((long)this.Illlliliil[(int)(var7 >>> 32)] ^ var7) & -1L >>> 32;
      if ((int)var7 < 0) {
         var7 ^= ((long)level.method_8314(class_1944.field_9282, this.IIllliliil.method_10103(x, y, z)) ^ var7) & -1L >>> 32;
         this.Illlliliil[(int)(var7 >>> 32)] = (byte)((int)var7);
      }

      return (int)var7;
   }

   private boolean lllllillll() {
      return this.IIliIiliil.Iilllilliill() && (this.IIIIliliil || this.lIIIliliil || this.iIIIliliil || this.IlIIliliil);
   }

   private static boolean Illlilllli(long centre, class_1923 key, int radius) {
      return Math.abs(class_1923.method_8325(centre) - key.field_9181) > radius || Math.abs(class_1923.method_8332(centre) - key.field_9180) > radius;
   }

   private int IIIlilIIli(IlIlIIIlllIlIIIl tags, List<String> a) {
      int var3 = 0;
      if (tags.iIllliIlIl >= 3) {
         var3 += Math.min(tags.iIllliIlIl, 6);
         if (a != null) {
            a.add(
               IliIlllilIi<"IliIlllilIi","ny1fim+Cl5ZJy/fzmQfpVD5tR0TcyPuZOoKsUxrjAEno2nOO8EU9">()
                  + tags.iIllliIlIl
                  + IliIlllilIi<"IliIlllilIi","oBmxlWoK4xesfZifvWhH23wisqOQOc+Se9M90us=">()
            );
         }
      }

      if (tags.IlllliIlIl >= 4) {
         var3 += Math.min(tags.IlllliIlIl / 2, 5);
         if (a != null) {
            a.add(
               IliIlllilIi<"IliIlllilIi","zEujtj+YnONDk43AJgToD6sIg500Rukwz7BfDUvSyQZwG6RdCMM=">()
                  + tags.IlllliIlIl
                  + IliIlllilIi<"IliIlllilIi","oBmxlWoK4xesfZifvWhH23wisqOQOc+Se9M90us=">()
            );
         }
      }

      if (tags.llllliIlIl >= 3) {
         var3 += Math.min(tags.llllliIlIl, 6);
         if (a != null) {
            a.add(
               IliIlllilIi<"IliIlllilIi","cotNID5o6Fas/gv6UW0J4IANfZPcld0bNoklSAdatwp5rRsYcg==">()
                  + tags.llllliIlIl
                  + IliIlllilIi<"IliIlllilIi","oBmxlWoK4xesfZifvWhH23wisqOQOc+Se9M90us=">()
            );
         }
      }

      if (tags.iIilliIlIl >= 1 && tags.IlilliIlIl >= 1) {
         var3 += 4;
         if (a != null) {
            a.add(IliIlllilIi<"IliIlllilIi","bcd9bdIt6maMjE5Zg0ciXlS6e2uj2M/GbBPFLppNRPrqatA=">());
         }
      }

      if (tags.lIilliIlIl >= 2) {
         var3 += tags.lIilliIlIl;
         if (a != null) {
            a.add(
               IliIlllilIi<"IliIlllilIi","e1XqoBCRnTkznVCOJHpbVyLYbcGcjcBeTGICyYf2l7YPoMJAAQ==">()
                  + tags.lIilliIlIl
                  + IliIlllilIi<"IliIlllilIi","oBmxlWoK4xesfZifvWhH23wisqOQOc+Se9M90us=">()
            );
         }
      }

      if (tags.iillliIlIl >= 2) {
         var3 += tags.iillliIlIl * 2;
         if (a != null) {
            a.add(
               IliIlllilIi<"IliIlllilIi","/2OiiHF8umOr8nvhDU14iunasDwzboq4EcpjrQya2n5vo+0=">()
                  + tags.iillliIlIl
                  + IliIlllilIi<"IliIlllilIi","oBmxlWoK4xesfZifvWhH23wisqOQOc+Se9M90us=">()
            );
         }
      }

      if (tags.IIilliIlIl >= 2) {
         var3 += tags.IIilliIlIl;
         if (a != null) {
            a.add(
               IliIlllilIi<"IliIlllilIi","/rAJx+llXmmJTULPIikUpwE9Iuqb9xZ408VrYDPrwNOXaT+j9dM=">()
                  + tags.IIilliIlIl
                  + IliIlllilIi<"IliIlllilIi","oBmxlWoK4xesfZifvWhH23wisqOQOc+Se9M90us=">()
            );
         }
      }

      if (tags.illlliIlIl >= 3) {
         var3 += Math.min(tags.illlliIlIl, 8);
         if (a != null) {
            a.add(
               IliIlllilIi<"IliIlllilIi","SloGRmJWfw0eIrnCIhAbB8QasAdIJ6ImG89+UuEmYl7bQA0HzieXDg==">()
                  + tags.illlliIlIl
                  + IliIlllilIi<"IliIlllilIi","oBmxlWoK4xesfZifvWhH23wisqOQOc+Se9M90us=">()
            );
         }
      }

      if (tags.llilliIlIl >= 2) {
         var3 += tags.llilliIlIl;
         if (a != null) {
            a.add(
               IliIlllilIi<"IliIlllilIi","xWCRM1ypfwlfXy8J5aaAAJGm59usAKMEbGMygjltUxNmp93zWyj0">()
                  + tags.llilliIlIl * 5
                  + IliIlllilIi<"IliIlllilIi","oBmxlWoK4xesfZifvWhH23wisqOQOc+Se9M90us=">()
            );
         }
      }

      if (tags.ililliIlIl >= 2) {
         var3 += tags.ililliIlIl * 2;
         if (a != null) {
            a.add(
               IliIlllilIi<"IliIlllilIi","symzNuLHXsFnwikoWCeQTvqsoH+dmpV2Z7inUVVpaxlq1Xm9">()
                  + tags.ililliIlIl
                  + IliIlllilIi<"IliIlllilIi","oBmxlWoK4xesfZifvWhH23wisqOQOc+Se9M90us=">()
            );
         }
      }

      if (tags.lillliIlIl >= 5) {
         var3 += tags.lillliIlIl / 3;
         if (a != null) {
            a.add(
               IliIlllilIi<"IliIlllilIi","pVfO1e+MP+D0jel5Nc3sFCojw0TwZeDT2GrSDRAYAeTGAt01rrs=">()
                  + tags.lillliIlIl
                  + IliIlllilIi<"IliIlllilIi","oBmxlWoK4xesfZifvWhH23wisqOQOc+Se9M90us=">()
            );
         }
      }

      if (tags.IillliIlIl >= 5) {
         var3 += tags.IillliIlIl / 3;
         if (a != null) {
            a.add(
               IliIlllilIi<"IliIlllilIi","tarVkO5NGPYvqNavdgiAz57CYjP6KJTGteyn0RYgE9saxlU=">()
                  + tags.IillliIlIl
                  + IliIlllilIi<"IliIlllilIi","oBmxlWoK4xesfZifvWhH23wisqOQOc+Se9M90us=">()
            );
         }
      }

      if (tags.IiilliIlIl > 0) {
         var3 += tags.IiilliIlIl;
         if (a != null) {
            a.add(IliIlllilIi<"IliIlllilIi","cfog5bG5ho2RvF/bLDhEmgM5nr09DUm/IV7UkSkMqK6/GGPeAg==">());
         }
      }

      if (tags.liilliIlIl >= 10) {
         var3 += Math.min(tags.liilliIlIl, 12);
         if (a != null) {
            a.add(
               IliIlllilIi<"IliIlllilIi","rpGDVtGnyKcn//trdDkBH+rrenks2dYpq9p4siTKjKoL75gFNizKrSM=">()
                  + tags.liilliIlIl
                  + IliIlllilIi<"IliIlllilIi","oBmxlWoK4xesfZifvWhH23wisqOQOc+Se9M90us=">()
            );
         }
      }

      if (tags.IlilliIlIl >= 3) {
         var3 += tags.IlilliIlIl;
         if (a != null) {
            a.add(
               IliIlllilIi<"IliIlllilIi","64aBhUpTqu42fyjcrG8T4kyGr69PyeZ3uoRbpSJiNccGVxm4">()
                  + tags.IlilliIlIl
                  + IliIlllilIi<"IliIlllilIi","oBmxlWoK4xesfZifvWhH23wisqOQOc+Se9M90us=">()
            );
         }
      }

      return var3;
   }

   private void iIiliIlili(Matrix4f chunks, int[] count, int y, int matrix, double argb) {
      if (y != 0) {
         float var7 = (float)(matrix >>> 24 & 0xFF) / 255.0F;
         float var8 = (float)(matrix >> 16 & 0xFF) / 255.0F;
         float var9 = (float)(matrix >> 8 & 0xFF) / 255.0F;
         float var10 = (float)(matrix & 0xFF) / 255.0F;
         int var11 = 0xFF000000 | matrix & 16777215;
         float var12 = iIiiIIilIliiIIil.Iiilliiliiil(argb);
         float var13 = var12 + 0.3F;

         for (int var14 = 0; var14 < y; var14++) {
            double var15 = (double)(count[var14 << 1] << 4);
            double var17 = (double)(count[(var14 << 1) + 1] << 4);
            if (!iIiiIIilIliiIIil.IlIillIiilIi(var15 + 8.0, argb, var17 + 8.0, 12.0F)) {
               float var19 = iIiiIIilIliiIIil.Ililllililil(var15);
               float var20 = iIiiIIilIliiIIil.IIIilIIiiIIi(var17);
               iIiiIIilIliiIIil.IIlilIliiIli(chunks, var19, var12, var20, var19 + 16.0F, var13, var20 + 16.0F, var8, var9, var10, var7);
               iIiiIIilIliiIIil.iIIIlIlIIl(chunks, var19, var12, var20, var19 + 16.0F, var13, var20 + 16.0F, var11, 1.5F);
            }
         }
      }
   }

   private static int Iiililiili(int b, int g, int r, int a) {
      return (b & (((785341114 - -51) * -1047552999 >>> 19 | (785341114 - -51) * -1047552999 << 13) - 1 ^ 1772399711))
            << ((--1111443503 * -19 - 51 << 21 | --1111443503 * -19 - 51 >>> 11) ^ -1979536980)
         | (
               g
                  & (
                     (
                           (~(-222017211 << 11 | -222017211 >>> 21) >>> 13 | ~(-222017211 << 11 | -222017211 >>> 21) << 19) << 3
                              | (~(-222017211 << 11 | -222017211 >>> 21) >>> 13 | ~(-222017211 << 11 | -222017211 >>> 21) << 19) >>> 29
                        )
                        ^ 444034443
                  )
            )
            << (-(~(-2075936072 >>> 29 | -2075936072 << 3)) ^ 572380629)
         | (
               r
                  & (
                     (
                           ((1218998568 >>> 23 | 1218998568 << 9) >>> 11 | (1218998568 >>> 23 | 1218998568 << 9) << 21) * 1022611261 << 27
                              | ((1218998568 >>> 23 | 1218998568 << 9) >>> 11 | (1218998568 >>> 23 | 1218998568 << 9) << 21) * 1022611261 >>> 5
                        )
                        ^ 345584738
                  )
            )
            << ((~1274186559 ^ 111 ^ 59) - 125 ^ -1274186721)
         | a & (((-1375153733 * 27 ^ -105) << 29 | (-1375153733 * 27 ^ -105) >>> 3) ^ -727565094);
   }

   private double lliililiil() {
      return Double.longBitsToDouble(-2276287968337564219L ^ -2312677063007702147L)
         - (double)(this.llIIliliil - 1) * Double.longBitsToDouble(-8638363246032603402L ^ -5238946394245630908L);
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         if (this.iilIliliil + this.IIiIliliil + this.lIiIliliil + this.iIiIliliil + this.iiiIliliil != 0) {
            Matrix4f var2 = iIiiIIilIliiIIil.IIillIiliIil();
            double var3 = this.iiIiIiliil.Iilllilliill();
            this.iIiliIlili(var2, this.lllIliliil, this.iilIliliil, IiiIIiliil, var3);
            this.iIiliIlili(var2, this.illIliliil, this.IIiIliliil, liiIIiliil, var3);
            this.iIiliIlili(var2, this.IilIliliil, this.lIiIliliil, iiiIIiliil, var3);
            this.iIiliIlili(var2, this.lilIliliil, this.iIiIliliil, IIIlIiliil, var3);
            if (this.lIliIiliil.Iilllilliill()) {
               this.IIililIili(var2);
            }

            if (this.IIliIiliil.Iilllilliill()) {
               this.lliliilili(var2);
            }

            iIiiIIilIliiIIil.IiIiliIiiiIi();
         }
      }
   }

   private void illliIilli(class_1923 centre) {
      this.lIlIliliil = false;
      this.iIlIliliil = centre.field_9181;
      this.IllIliliil = centre.field_9180;
      this.iilIliliil = this.lilliiilli(this.llliIiliil, centre, this.lllIliliil);
      this.IIiIliliil = this.lilliiilli(this.illiIiliil, centre, this.illIliliil);
      this.lIiIliliil = this.lilliiilli(this.IiliIiliil, centre, this.IilIliliil);
      this.iIiIliliil = this.lilliiilli(this.liliIiliil, centre, this.lilIliliil);

      for (int var2 = 0; var2 < this.IIiIliliil; var2++) {
         int var3 = this.illIliliil[var2 << 1];
         int var4 = this.illIliliil[(var2 << 1) + 1];
         IlIlIIIlllIlIIIl var5 = (IlIlIIIlllIlIIIl)this.iiliIiliil.get(class_1923.method_8331(var3, var4));
         if (var5 != null && var5.iIliliIlIl > 0.0) {
            this.IliIliliil[var2] = var5.iiIiliIlIl / var5.iIliliIlIl;
            this.iliIliliil[var2] = var5.IIliliIlIl / var5.iIliliIlIl;
            this.lliIliliil[var2] = var5.lIliliIlIl / var5.iIliliIlIl;
         } else {
            this.IliIliliil[var2] = (double)(var3 << 4) + 8.0;
            this.iliIliliil[var2] = (double)(var4 << 4) + 8.0;
            this.lliIliliil[var2] = Double.NaN;
         }
      }

      this.iiiIliliil = 0;
      if (this.lllllillll()) {
         this.iIIlliliil.clear();
         this.IlIlliliil.clear();

         for (int var17 = -5; var17 <= 5; var17++) {
            for (int var19 = -5; var19 <= 5; var19++) {
               IlIlIIIlllIlIIIl var21 = (IlIlIIIlllIlIIIl)this.iiliIiliil.get(class_1923.method_8331(centre.field_9181 + var17, centre.field_9180 + var19));
               if (var21 != null && var21.illiliIlIl != null) {
                  this.iIIlliliil.addAll(var21.illiliIlIl);
                  this.IlIlliliil.addAll(var21.IililiIlIl);
               }
            }
         }

         int var18 = this.iIIlliliil.size();
         if (var18 != 0) {
            if (this.IIIlliliil.length < var18) {
               this.IIIlliliil = new long[var18 * 2];
            }

            int var20 = Iiiilllliiilll.field_1724.method_31477();
            int var22 = Iiiilllliiilll.field_1724.method_31478();
            int var23 = Iiiilllliiilll.field_1724.method_31479();

            for (int var6 = 0; var6 < var18; var6++) {
               long var7 = this.iIIlliliil.getLong(var6);
               long var9 = (long)(class_2338.method_10061(var7) - var20);
               long var11 = (long)(class_2338.method_10071(var7) - var22);
               long var13 = (long)(class_2338.method_10083(var7) - var23);
               long var15 = Math.min(var9 * var9 + var11 * var11 + var13 * var13, 2147483647L);
               this.IIIlliliil[var6] = var15 << 32 | (long)var6;
            }

            Arrays.sort(this.IIIlliliil, 0, var18);
            int var24 = Math.min(var18, 200);

            for (int var25 = 0; var25 < var24; var25++) {
               int var8 = (int)this.IIIlliliil[var25];
               this.IiiIliliil[var25] = this.iIIlliliil.getLong(var8);
               this.liiIliliil[var25] = this.IlIlliliil.getByte(var8);
            }

            this.iiiIliliil = var24;
         }
      }
   }

   private void IlIIillIIi(class_2818 analysis, IlIlIIIlllIlIIIl chunk) {
      for (class_2586 var4 : analysis.method_12214().values()) {
         class_2680 var5 = analysis.method_8320(var4.method_11016());
         if (var5.method_27852(class_2246.field_20422) || var5.method_27852(class_2246.field_20421)) {
            chunk.iiilliIlIl++;
            if (var4 instanceof class_4482 var6) {
               chunk.IIIiliIlIl = chunk.IIIiliIlIl + Math.max(0, var6.method_23903());
            }
         } else if (lIiIiiIiIi(var5.method_26204())) {
            chunk.liIiliIlIl++;
         }
      }

      class_2826[] var13 = analysis.method_12006();
      int var14 = analysis.method_31607();

      for (int var15 = 0; var15 < var13.length; var15++) {
         class_2826 var16 = var13[var15];
         if (var16 != null && !var16.method_38292() && var16.method_19523(IlIllIIillIllIIi::liIIiiiIIi)) {
            int var7 = var14 + var15 * 16;
            this.lIllliliil.iIlIlllllill(var16);
            int[] var8 = this.lIllliliil.IIlilliIll;
            int[] var9 = this.ilillIiill(this.lIllliliil.iIlilliIll);

            for (int var10 = 0; var10 < this.lIllliliil.iIlilliIll; var10++) {
               var9[var10] = ilIIiIiIIi(this.lIllliliil.lIlilliIll[var10]);
            }

            for (int var17 = 0; var17 < 4096; var17++) {
               int var11 = var9[var8[var17]];
               if (var11 != 0) {
                  int var12 = var7 + (var17 >> 8);
                  switch (var11) {
                     case 1:
                        chunk.ilIiliIlIl++;
                        break;
                     case 2:
                        chunk.ilIiliIlIl++;
                        chunk.IiIiliIlIl++;
                        break;
                     case 3:
                        chunk.iIIiliIlIl++;
                        break;
                     case 4:
                        if (var12 >= 0 && var12 <= 20) {
                           chunk.lIIiliIlIl++;
                        }
                        break;
                     case 5:
                        if (var12 <= 70) {
                           chunk.IlIiliIlIl++;
                        }
                        break;
                     case 6:
                        if (var12 <= 70) {
                           chunk.llIiliIlIl++;
                        }
                        break;
                     case 7:
                        chunk.liIiliIlIl++;
                  }
               }
            }
         }
      }
   }

   private void liilliiill(int z, int mask, int x, int y, IlIlIIIlllIlIIIl analysis) {
      if ((y & 1) != 0) {
         analysis.lIllliIlIl++;
      }

      if ((y & -2) != 0) {
         if (!this.IIIillIIil(z, mask, x)) {
            byte var6 = -1;
            if ((y & 2) != 0 && !this.iIIilIlIil(z, mask, x)) {
               analysis.IiIlliIlIl++;
               var6 = 0;
            }

            if ((y & 4) != 0) {
               analysis.iiIlliIlIl++;
               var6 = 2;
            }

            if ((y & 8) != 0) {
               analysis.liIlliIlIl++;
               var6 = 1;
            }

            if ((y & 16) != 0) {
               analysis.IIllliIlIl++;
               var6 = 3;
            }

            if (var6 >= 0) {
               analysis.IliIlllilIi(class_2338.method_10064(z, mask, x), var6);
            }
         }
      }
   }

   private int[] ilillIiill(int size) {
      if (this.iIllliliil.length < size) {
         this.iIllliliil = new int[Math.max(size, this.iIllliliil.length * 2)];
      }

      return this.iIllliliil;
   }

   private int IIlIilIlIi(IlIlIIIlllIlIIIl a) {
      int var2 = 0;
      var2 += Math.min(90, a.iiilliIlIl * 22 + a.IIIiliIlIl * 10);
      var2 += Math.min(65, a.lIIiliIlIl / 2);
      var2 += Math.min(55, a.iIIiliIlIl / 4);
      var2 += Math.min(70, a.IlIiliIlIl);
      var2 += Math.min(75, a.llIiliIlIl * 12);
      var2 += Math.min(90, a.ilIiliIlIl * 16 + a.IiIiliIlIl * 28);
      return var2 + Math.min(100, a.liIiliIlIl * 18);
   }

   private static boolean iilIiIIiIi(class_2680 state) {
      return state.method_27852(class_2246.field_27161)
         || state.method_27852(class_2246.field_27162)
         || state.method_27852(class_2246.field_27163)
         || state.method_27852(class_2246.field_27164)
         || state.method_27852(class_2246.field_27159);
   }

   private boolean IIIillIIil(int x, int y, int z) {
      int var4 = Iiiilllliiilll.field_1687.method_31607();
      int var5 = Iiiilllliiilll.field_1687.method_31605();

      for (int var6 = 0; var6 < 6; var6++) {
         int var7 = y + IIIIIiliil[var6];
         if (var7 >= var4 && var7 < var5) {
            class_2680 var8 = this.lliiIiliil.liiiIIllIl(x + iiiiilliil[var6], var7, z + lIIIIiliil[var6]);
            if (var8.method_26215()) {
               return true;
            }

            if (!var8.method_26227().method_15769()) {
               return true;
            }
         }
      }

      return false;
   }

   private void IlIllllIll() {
      this.llliIiliil.clear();
      this.illiIiliil.clear();
      this.IiliIiliil.clear();
      this.liliIiliil.clear();
      this.iiliIiliil.clear();
      this.IliiIiliil.liiiIIllIl();
      this.iilIliliil = this.IIiIliliil = this.lIiIliliil = this.iIiIliliil = this.iiiIliliil = 0;
      this.lIlIliliil = true;
   }

   private double iiiilIIIIi() {
      return Double.longBitsToDouble(8375242297817419678L ^ 5444478801433451493L)
         + (double)(this.llIIliliil - 1) * Double.longBitsToDouble(-8573932196055790804L ^ -5289227093186935307L);
   }

   private void IiIliliIli(class_1923 key, long pos, String details) {
      long var5 = System.currentTimeMillis();
      if (this.iIiiIiliil.size() < 5) {
         long var7 = this.lIiiIiliil.get(pos);
         if (var7 == Long.MIN_VALUE || var5 - var7 >= 300000L) {
            String var9 = this.iIliIiliil.Iilllilliill();
            boolean var10 = this.IlliIiliil.Iilllilliill();
            if (!var9.equals(IliIlllilIi<"IliIlllilIi","/O03kRbJpUKDOrsmYUDBP1PfHJ5AGWdJ3kYOaBfEVQ==">()) || var10) {
               String var11 = String.format(
                  IliIlllilIi<"IliIlllilIi","VF1PdzStW02V96acWtiN+xYl4BXlI9UuFw0glrfnN8PCg/BXHgurox2a4ydypRhkCCGWjd1s+eei">(),
                  key.method_8326() + 8,
                  key.method_8328() + 8,
                  details
               );
               if ((
                     var9.equals(IliIlllilIi<"IliIlllilIi","JcytQyrlEal/7v8XLKm9/0bLHiqkGJIL6mypjyiL/Eo=">())
                        || var9.equals(IliIlllilIi<"IliIlllilIi","pK5knbPgdyRyj6qYtbkTy/BAXfsDs6bpuSUnCUAZk7Y=">())
                  )
                  && Iiiilllliiilll.field_1724 != null) {
                  Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(var11), false);
               }

               if (var9.equals(IliIlllilIi<"IliIlllilIi","JKQHYGPgdAopBG+ml9jufnPrjGL/IvsioW7gK1cEUWU8">())
                  || var9.equals(IliIlllilIi<"IliIlllilIi","pK5knbPgdyRyj6qYtbkTy/BAXfsDs6bpuSUnCUAZk7Y=">())) {
                  Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<"IliIlllilIi","pK/4rn/0LzGWv0YNj3CF9wfYGUH9JVboRJIOEzqrKojE9Pdv3ieo">(), var11, true);
               }

               if (var10) {
                  Iiiilllliiilll.method_1483().method_4873(class_1109.method_4757(class_3417.field_14627, 1.5F, 1.0F));
               }

               this.iIiiIiliil.enqueue(var5);
               this.lIiiIiliil.put(pos, var5);
            }
         }
      }
   }

   private static int ilIIiIiIIi(class_2680 state) {
      if (state.method_26215()) {
         return 0;
      } else if (!state.method_27852(class_2246.field_10450)) {
         if (state.method_27852(class_2246.field_10597)) {
            return 3;
         } else if (state.method_27852(class_2246.field_29031)) {
            return 4;
         } else if (state.method_27852(class_2246.field_10376) || state.method_27852(class_2246.field_10238)) {
            return 5;
         } else if (state.method_26164(class_3481.field_20339)) {
            return ((-2058154961 + 99) * 121 >>> 31 | (-2058154961 + 99) * 121 << 1) * -1062196213 ^ 321742378;
         } else {
            return lIiIiiIiIi(state.method_26204()) ? (-1683516513 * 41 ^ 21) - -17 ^ -304700300 : 0;
         }
      } else {
         return state.method_28498(class_2741.field_12484) && state.method_11654(class_2741.field_12484) ? 2 : 1;
      }
   }

   private int Iiiilliiil() {
      return (int)(
         Double.longBitsToDouble(-4926118955384859527L ^ -320625386445106055L)
            - (double)(this.llIIliliil - 1) * Double.longBitsToDouble(5977634004441646089L ^ 7854707803554779484L)
      );
   }

   private int llIililIil(int limit, int x, int z, int dx, int dz, int dy, int y) {
      int var8 = Iiiilllliiilll.field_1687.method_31607();
      int var9 = Iiiilllliiilll.field_1687.method_31605();
      int var10 = 1;

      for (byte var11 = 1; var11 >= -1; var11 -= 2) {
         for (int var12 = 1; var12 < y; var12++) {
            int var13 = x + dz * var12 * var11;
            if (var13 < var8 || var13 >= var9 || !IliIilliIi(this.lliiIiliil.liiiIIllIl(limit + dx * var12 * var11, var13, z + dy * var12 * var11))) {
               break;
            }

            var10++;
         }
      }

      return var10;
   }

   private IliIiIlllliIiIll lililiilil(class_2818 chunk) {
      class_2826[] var2 = chunk.method_12006();
      int var3 = chunk.method_31607();
      boolean var4 = false;

      for (int var5 = 0; var5 < var2.length && !var4; var5++) {
         class_2826 var6 = var2[var5];
         if (var6 != null && !var6.method_38292()) {
            int var7 = var3 + var5 * 16;
            if (var7 <= 48 && var7 + 15 >= -64) {
               var4 = var6.method_19523(state -> iilIiIIiIi(state) || state.method_27852(class_2246.field_27160));
            }
         }
      }

      if (!var4) {
         return IliIiIlllliIiIll.IliIlllilIi();
      } else {
         byte[] var38 = this.liIlliliil;
         Arrays.fill(var38, (byte)0);
         IntArrayList var39 = this.iiIlliliil;
         var39.clear();
         int var40 = 0;
         long var8 = 0L;
         long var10 = 0L;
         long var12 = 0L;

         for (int var14 = 0; var14 < var2.length; var14++) {
            class_2826 var15 = var2[var14];
            if (var15 != null && !var15.method_38292()) {
               int var16 = var3 + var14 * 16;
               if (var16 <= 48 && var16 + 15 >= -64) {
                  this.lIllliliil.iIlIlllllill(var15);
                  int[] var17 = this.lIllliliil.IIlilliIll;
                  int[] var18 = this.ilillIiill(this.lIllliliil.iIlilliIll);

                  for (int var19 = 0; var19 < this.lIllliliil.iIlilliIll; var19++) {
                     class_2680 var20 = this.lIllliliil.lIlilliIll[var19];
                     byte var21;
                     if (var20.method_27852(class_2246.field_27160)) {
                        var21 = 6;
                     } else if (iilIiIIiIi(var20)) {
                        var21 = 1;
                     } else if (var20.method_27852(class_2246.field_27114)) {
                        var21 = 2;
                     } else if (var20.method_27852(class_2246.field_29032)) {
                        var21 = 3;
                     } else if (var20.method_26215()) {
                        var21 = 4;
                     } else {
                        var21 = 5;
                     }

                     var18[var19] = var21;
                  }

                  for (int var47 = 0; var47 < 16; var47++) {
                     int var49 = var16 + var47;
                     if (var49 >= -64 && var49 <= 48) {
                        int var50 = var49 - -64;

                        for (int var22 = 0; var22 < 16; var22++) {
                           for (int var23 = 0; var23 < 16; var23++) {
                              int var24 = var18[var17[iIiiIiIlIliiIiIl.IliIlllilIi(var22, var47, var23)]];
                              if (var24 == 6) {
                                 return IliIiIlllliIiIll.liiiIIllIl();
                              }

                              if (var24 == 1) {
                                 var39.add(var22);
                                 var39.add(var49);
                                 var39.add(var23);
                                 var8 += (long)var22;
                                 var10 += (long)var49;
                                 var12 += (long)var23;
                              } else if (var24 == 2 || var24 == 3) {
                                 var40++;
                              }

                              var38[IIiillIiil(var22, var50, var23)] = (byte)var24;
                           }
                        }
                     }
                  }
               }
            }
         }

         int var41 = var39.size() / 3;
         if (var41 == 0) {
            return IliIiIlllliIiIll.IliIlllilIi();
         } else {
            int var42 = Integer.MAX_VALUE;
            int var43 = Integer.MIN_VALUE;

            for (int var44 = 0; var44 < var41; var44++) {
               int var46 = var39.getInt(var44 * 3 + 1);
               var42 = Math.min(var42, var46);
               var43 = Math.max(var43, var46);
            }

            double var45 = (double)var41 / (256.0 * (double)Math.max(1, var43 - var42 + 1));
            double var48 = (double)var8 / (double)var41;
            double var51 = (double)var10 / (double)var41;
            double var52 = (double)var12 / (double)var41;
            double var25 = 0.0;

            for (int var27 = 0; var27 < var41; var27++) {
               double var28 = (double)var39.getInt(var27 * 3) - var48;
               double var30 = (double)var39.getInt(var27 * 3 + 1) - var51;
               double var32 = (double)var39.getInt(var27 * 3 + 2) - var52;
               var25 += Math.sqrt(var28 * var28 + var30 * var30 + var32 * var32);
            }

            var25 /= (double)var41;
            int var54 = 0;
            int var55 = 0;

            for (int var29 = 0; var29 < var41; var29++) {
               int var57 = var39.getInt(var29 * 3);
               int var31 = var39.getInt(var29 * 3 + 1) - -64;
               int var59 = var39.getInt(var29 * 3 + 2);

               for (int var33 = 0; var33 < 6; var33++) {
                  int var34 = var57 + iiiiilliil[var33];
                  int var35 = var31 + IIIIIiliil[var33];
                  int var36 = var59 + lIIIIiliil[var33];
                  if (var34 >= 0 && var34 <= 15 && var36 >= 0 && var36 <= 15 && var35 >= 0 && var35 < 113) {
                     byte var37 = var38[IIiillIiil(var34, var35, var36)];
                     if (var37 == 4) {
                        var54++;
                     } else if (var37 >= 2) {
                        var55++;
                     }
                  }
               }
            }

            int var56 = var54 + var55;
            double var58 = var56 > 0 ? (double)var54 / (double)var56 : 0.0;
            boolean var60 = var41 >= this.iIiilIliil()
               && var45 >= this.lliililiil()
               && var40 >= this.Iiiilliiil()
               && var25 <= this.lIIIiiIIIi()
               && var58 <= this.iiiilIIIIi();
            return new IliIiIlllliIiIll(var60, var41);
         }
      }
   }

   private void llIliilIli(long key) {
      long var4 = 6004885282859081282L;
      var4 ^= ((long)this.llliIiliil.remove(key) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) | this.illiIiliil.remove(key)) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) | this.IiliIiliil.remove(key)) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) | this.liliIiliil.remove(key)) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) != 0) {
         this.lIlIliliil = true;
      }
   }

   private static void iiIilIIlil(IlIlIIIlllIlIIIl z, int y, int w, int a, double x) {
      z.iiIiliIlIl = z.iiIiliIlIl + ((double)y + Double.longBitsToDouble(7203304336249409967L ^ 6635850783200727471L)) * x;
      z.IIliliIlIl = z.IIliliIlIl + ((double)a + Double.longBitsToDouble(-8601323363634346216L ^ -5241638041615956200L)) * x;
      z.lIliliIlIl = z.lIliliIlIl + ((double)w + Double.longBitsToDouble(6168847488696553279L ^ 7673049764238298943L)) * x;
      z.iIliliIlIl += x;
   }

   private void lliliilili(Matrix4f matrix) {
      for (int var2 = 0; var2 < this.iiiIliliil; var2++) {
         long var3 = this.IiiIliliil[var2];
         int var5 = class_2338.method_10061(var3);
         int var6 = class_2338.method_10071(var3);
         int var7 = class_2338.method_10083(var3);
         if (!iIiiIIilIliiIIil.IlIillIiilIi((double)var5 + 0.5, (double)var6 + 0.5, (double)var7 + 0.5, 1.0F)) {
            float var8 = iIiiIIilIliiIIil.Ililllililil((double)var5);
            float var9 = iIiiIIilIliiIIil.Iiilliiliiil((double)var6);
            float var10 = iIiiIIilIliiIIil.IIIilIIiiIIi((double)var7);
            iIiiIIilIliiIIil.iIIIlIlIIl(matrix, var8, var9, var10, var8 + 1.0F, var9 + 1.0F, var10 + 1.0F, lIIlIiliil[this.liiIliliil[var2]], 1.5F);
         }
      }
   }

   private static boolean iliIiIiiIi(class_2680 state) {
      return state.method_27852(class_2246.field_28888) && state.method_28498(class_2741.field_12496)
         ? state.method_11654(class_2741.field_12496) != class_2351.field_11052
         : false;
   }

   private void IIililIili(Matrix4f matrix) {
      int var2 = 0xFF000000 | liiIIiliil & 16777215;
      double var3 = Iiiilllliiilll.field_1724.method_23318();

      for (int var5 = 0; var5 < this.IIiIliliil; var5++) {
         double var6 = Double.isNaN(this.lliIliliil[var5]) ? var3 - 16.0 : this.lliIliliil[var5];
         double var8 = var6;
         double var10 = var3 + 3.0;
         if (var10 < var6) {
            double var12 = var10;
            var10 = var6;
            var8 = var12;
         }

         if (!iIiiIIilIliiIIil.IlIillIiilIi(this.IliIliliil[var5], (var8 + var10) * 0.5, this.iliIliliil[var5], (float)(var10 - var8) * 0.5F + 1.0F)) {
            float var16 = iIiiIIilIliiIIil.Ililllililil(this.IliIliliil[var5]);
            float var13 = iIiiIIilIliiIIil.IIIilIIiiIIi(this.iliIliliil[var5]);
            float var14 = iIiiIIilIliiIIil.Iiilliiliiil(var8);
            float var15 = iIiiIIilIliiIIil.Iiilliiliiil(var10);
            iIiiIIilIliiIIil.Iliilliiilii(matrix, var16, var14, var13, var16, var15, var13, var2, 3.0F);
            iIiiIIilIliiIIil.Iliilliiilii(matrix, var16 - 0.9F, var14, var13, var16 + 0.9F, var14, var13, var2, 2.0F);
            iIiiIIilIliiIIil.Iliilliiilii(matrix, var16, var14, var13 - 0.9F, var16, var14, var13 + 0.9F, var2, 2.0F);
         }
      }
   }

   private int iIiilIliil() {
      return (int)(
         Double.longBitsToDouble(5126254222632089426L ^ 531456702807340882L)
            - (double)(this.llIIliliil - 1) * Double.longBitsToDouble(-1607774893641223969L ^ -6215960861412362301L)
      );
   }

   private boolean lllIiillIi(class_2818 worldZ, int[] ids, int[] chunk, int lx, int lz, int y, int ly, int flagsById, int worldX) {
      int var10 = 0;
      var10 += lz > 0 ? chunk[ids[iIiiIiIlIliiIiIl.IliIlllilIi(lx, lz - 1, y)]] >>> 9 & 1 : this.IilIililIi(worldZ, ly, flagsById - 1, worldX);
      var10 += lz < 15 ? chunk[ids[iIiiIiIlIliiIiIl.IliIlllilIi(lx, lz + 1, y)]] >>> 9 & 1 : this.IilIililIi(worldZ, ly, flagsById + 1, worldX);
      if (y > 0) {
         var10 += chunk[ids[iIiiIiIlIliiIiIl.IliIlllilIi(lx, lz, y - 1)]] >>> 9 & 1;
      }

      if (y < 15) {
         var10 += chunk[ids[iIiiIiIlIliiIiIl.IliIlllilIi(lx, lz, y + 1)]] >>> 9 & 1;
      }

      if (lx > 0) {
         var10 += chunk[ids[iIiiIiIlIliiIiIl.IliIlllilIi(lx - 1, lz, y)]] >>> 9 & 1;
      }

      if (lx < 15) {
         var10 += chunk[ids[iIiiIiIlIliiIiIl.IliIlllilIi(lx + 1, lz, y)]] >>> 9 & 1;
      }

      return var10 >= 5;
   }

   private void iiIliIIlli(class_1923 centre) {
      int var2 = (Integer)Iiiilllliiilll.field_1690.method_42503().method_41753() + 5;
      boolean var3 = lIlliiIlli(this.llliIiliil, centre, var2);
      var3 |= lIlliiIlli(this.illiIiliil, centre, var2);
      var3 |= lIlliiIlli(this.IiliIiliil, centre, var2);
      var3 |= lIlliiIlli(this.liliIiliil, centre, var2);
      if (var3) {
         this.lIlIliliil = true;
      }

      ObjectIterator var4 = this.iiliIiliil.long2ObjectEntrySet().fastIterator();

      while (var4.hasNext()) {
         if (Illlilllli(((Entry)var4.next()).getLongKey(), centre, var2)) {
            var4.remove();
         }
      }

      LongIterator var5 = this.lIiiIiliil.keySet().iterator();
      long var6 = System.currentTimeMillis();

      while (var5.hasNext()) {
         long var8 = var5.nextLong();
         if (Illlilllli(var8, centre, var2) && var6 - this.lIiiIiliil.get(var8) >= 300000L) {
            var5.remove();
         }
      }

      this.IliiIiliil.IiIlliIliiIl(centre.field_9181, centre.field_9180, var2);
   }

   private void Iillllilll() {
      this.IIiiIiliil.clear();

      for (class_1297 var2 : Iiiilllliiilll.field_1687.method_18112()) {
         long var3 = class_1923.method_8331(var2.method_31477() >> 4, var2.method_31479() >> 4);
         lIlIiliiIlIili var5 = (lIlIiliiIlIili)this.IIiiIiliil.get(var3);
         if (var5 == null) {
            var5 = new lIlIiliiIlIili();
            this.IIiiIiliil.put(var3, var5);
         }

         if (var2 instanceof class_1542 && var2.method_23318() < 0.0) {
            var5.iIIliiIIIl++;
         }

         if (var2 instanceof class_1456) {
            var5.IlIliiIIIl += 3;
         }

         if (!(var2 instanceof class_1657)) {
            var5.llIliiIIIl++;
         }
      }

      ObjectIterator var10 = this.iiliIiliil.long2ObjectEntrySet().fastIterator();

      while (var10.hasNext()) {
         Entry var11 = (Entry)var10.next();
         long var12 = var11.getLongKey();
         IlIlIIIlllIlIIIl var13 = (IlIlIIIlllIlIIIl)var11.getValue();
         lIlIiliiIlIili var6 = (lIlIiliiIlIili)this.IIiiIiliil.get(var12);
         int var7 = var6 == null ? 0 : var6.iIIliiIIIl;
         int var8 = var6 == null ? 0 : var6.IlIliiIIIl;
         int var9 = var6 != null && var6.llIliiIIIl > 20 ? var6.llIliiIIIl / 5 : 0;
         if (var7 != var13.ililliIlIl || var8 != var13.IiilliIlIl || var9 != var13.llilliIlIl) {
            var13.ililliIlIl = var7;
            var13.IiilliIlIl = var8;
            var13.llilliIlIl = var9;
            this.iIIliIlIli(new class_1923(var12), var12, var13);
         }
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         long var1 = System.currentTimeMillis();

         while (!this.iIiiIiliil.isEmpty() && var1 - this.iIiiIiliil.firstLong() > 60000L) {
            this.iIiiIiliil.dequeueLong();
         }

         int var3 = System.identityHashCode(Iiiilllliiilll.field_1687);
         if (var3 != this.IiIIliliil) {
            this.IiIIliliil = var3;
            this.IlIllllIll();
            this.IIiiIiliil.clear();
         }

         this.ilIllIiIll();
         if (this.liiiIiliil && ++this.liIIliliil >= 20) {
            this.liIIliliil = 0;
            this.Iillllilll();
         }

         class_1923 var4 = Iiiilllliiilll.field_1724.method_31476();
         int var5 = Math.min((Integer)Iiiilllliiilll.field_1690.method_42503().method_41753() + 1, 32);
         if (this.IiiiIiliil || this.liiiIiliil || this.iiiiIiliil || this.IIIIliliil || this.lIIIliliil || this.iIIIliliil || this.IlIIliliil) {
            this.IliiIiliil
               .IIlllIlliIll(Iiiilllliiilll.field_1687, var4.field_9181, var4.field_9180, var5, 60000L, iIIlIIIiIlIlIIIi.IliIlllilIi(700), this::lIilliIill);
         }

         if (++this.iiIIliliil >= 100) {
            this.iiIIliliil = 0;
            this.iiIliIIlli(var4);
         }

         if (++this.IIlIliliil >= 10 || var4.field_9181 != this.iIlIliliil || var4.field_9180 != this.IllIliliil) {
            if (this.lIlIliliil || var4.field_9181 != this.iIlIliliil || var4.field_9180 != this.IllIliliil || this.iiiIliliil > 0 || this.lllllillll()) {
               this.illliIilli(var4);
            }

            this.IIlIliliil = 0;
         }
      }
   }

   private boolean iIIilIlIil(int z, int x, int y) {
      int var4 = x > -8 ? 50 : 20;
      if (this.llIililIil(z, x, y, 1, 0, 0, var4) >= var4) {
         return true;
      } else {
         return this.llIililIil(z, x, y, 0, 0, 1, var4) >= var4 ? true : x > 0 && this.llIililIil(z, x, y, 0, 1, 0, var4) >= var4;
      }
   }

   private static boolean lIliliIlil(class_2680 state) {
      return state.method_27852(class_2246.field_27159) || state.method_27852(class_2246.field_27160);
   }

   private void iIIliIlIli(class_1923 pos, long key, IlIlIIIlllIlIIIl analysis) {
      if (analysis.lIllliIlIl >= 50) {
         this.llIliilIli(key);
      } else {
         StringBuilder var5 = null;
         if (this.IIIIliliil && analysis.IiIlliIlIl >= 1) {
            var5 = new StringBuilder()
               .append(IliIlllilIi<"IliIlllilIi","kLq6OlYllujJDirT7g3KTPSQ5LNxqMSVhhi7B3mTp6Qi5H74UJY=">())
               .append(analysis.IiIlliIlIl)
               .append(IliIlllilIi<"IliIlllilIi","LMUid2jCnF/TsV5fAwzJJXeaPfxECelAmIOyiaNf">());
         }

         if (this.lIIIliliil && analysis.liIlliIlIl >= 4) {
            if (var5 == null) {
               var5 = new StringBuilder();
            }

            var5.append(IliIlllilIi<"IliIlllilIi","nMbcU1NEtyEuYoXRFFcJQHtmiWihK522GX/V6NtNcuKQRoFGNrjD07NGYS4I">())
               .append(analysis.liIlliIlIl)
               .append(IliIlllilIi<"IliIlllilIi","LMUid2jCnF/TsV5fAwzJJXeaPfxECelAmIOyiaNf">());
         }

         if (this.iIIIliliil && analysis.iiIlliIlIl >= 3) {
            if (var5 == null) {
               var5 = new StringBuilder();
            }

            var5.append(IliIlllilIi<"IliIlllilIi","Fnh+mBz1eHePru8pf23tZ4BBmxR1GX8pn4H30cOMRT5oTfURXO9ce1LITP+i">())
               .append(analysis.iiIlliIlIl)
               .append(IliIlllilIi<"IliIlllilIi","LMUid2jCnF/TsV5fAwzJJXeaPfxECelAmIOyiaNf">());
         }

         if (this.IlIIliliil && analysis.IIllliIlIl >= 2) {
            if (var5 == null) {
               var5 = new StringBuilder();
            }

            var5.append(IliIlllilIi<"IliIlllilIi","6O4liRHR7HXBeMy9knKYWBR1n8y70YtgZdaz/tJVZMZ26S1agQ==">())
               .append(analysis.IIllliIlIl)
               .append(IliIlllilIi<"IliIlllilIi","LMUid2jCnF/TsV5fAwzJJXeaPfxECelAmIOyiaNf">());
         }

         if (var5 != null) {
            if (this.llliIiliil.add(key)) {
               this.lIlIliliil = true;
               this.IiIliliIli(pos, key, var5.toString().trim());
            }
         } else if (this.llliIiliil.remove(key)) {
            this.lIlIliliil = true;
         }

         if (this.liiiIiliil) {
            int var6 = this.IIIlilIIli(analysis, null);
            if (var6 >= this.liIlliiIll()) {
               if (this.illiIiliil.add(key)) {
                  this.lIlIliliil = true;
                  ArrayList var7 = new ArrayList();
                  this.IIIlilIIli(analysis, var7);
                  this.IiIliliIli(
                     pos,
                     key,
                     IliIlllilIi<"IliIlllilIi","cAXhoDApXnrgELy2UlqAW+ny7YNTBT4g7cN8R5nNDO9Lg7qG4Zp0iB6mCg==">()
                        + var6
                        + IliIlllilIi<"IliIlllilIi","s+pM12dlVKbSOlL5C3ZnL3ml3TMbjYSs7+EG6jOX">()
                        + String.join(IliIlllilIi<"IliIlllilIi","HXso+VZpvIzjNzaKQUcc1IL4T7fHukfM285jaAP3">(), var7)
                        + IliIlllilIi<"IliIlllilIi","/EZHBSJr1CKPR/mjTvGSKiq6mCZ6RPI3mC+d2Tc=">()
                  );
               }
            } else if (this.illiIiliil.remove(key)) {
               this.lIlIliliil = true;
            }
         } else if (this.illiIiliil.remove(key)) {
            this.lIlIliliil = true;
         }

         boolean var11 = this.IiiiIiliil && analysis.IlliliIlIl.iIlIlllllill();
         boolean var12 = this.IiiiIiliil && analysis.llliliIlIl >= this.iIlllIllll();
         if (!var11 && !var12) {
            if (this.IiliIiliil.remove(key)) {
               this.lIlIliliil = true;
            }
         } else if (this.IiliIiliil.add(key)) {
            this.lIlIliliil = true;
            String var8 = var11
               ? IliIlllilIi<"IliIlllilIi","iprLiGqos4SWroDy/UykpBsgT5EueGocQ3A7LudPyuTA91yGDH+D5rKv">()
                  + analysis.IlliliIlIl.IilliliilIIi()
                  + IliIlllilIi<"IliIlllilIi","/EZHBSJr1CKPR/mjTvGSKiq6mCZ6RPI3mC+d2Tc=">()
               : "";
            if (var12) {
               var8 = (var8.isEmpty() ? "" : var8 + IliIlllilIi<"IliIlllilIi","pHz2JUnXKicE1YQMXF72Y43SFAK5kHpxzCFvcHw=">())
                  + IliIlllilIi<"IliIlllilIi","kq0dj3SFiFI0SDm7PdYmfTvqzsKJ7sz2XazD/GalLjTclQH5A7q+6hNS">()
                  + analysis.llliliIlIl
                  + IliIlllilIi<"IliIlllilIi","/EZHBSJr1CKPR/mjTvGSKiq6mCZ6RPI3mC+d2Tc=">();
            }

            this.IiIliliIli(pos, key, var8);
         }

         if (this.iiiiIiliil) {
            int var13 = this.IIlIilIlIi(analysis);
            int var9 = iIlIiIllIi(var13);
            if (var9 >= this.IIllllIlll() && var13 > 0) {
               if (this.liliIiliil.add(key)) {
                  this.lIlIliliil = true;
                  String var10 = analysis.IiIiliIlIl >= 3
                     ? IliIlllilIi<"IliIlllilIi","CIt09wsViFcqUhnLTMNmoExgaMiUrELCDpEvYJhXyPjH0e+bfX/EqoIx">()
                     : IliIlllilIi<"IliIlllilIi","BKkZ2Wwub4bvULQLKhkTAuCiBrRL3PiEc5Duyxlk1fi/jizwawqFkA==">()
                        + var9
                        + IliIlllilIi<"IliIlllilIi","HSwy11yFMNB57PM5IeARaqIylxTDvq0OvoFelDI=">();
                  this.IiIliliIli(
                     pos,
                     key,
                     var10
                        + IliIlllilIi<"IliIlllilIi","KyyfdyTmFbV/+nLqPgD/oHyM62/XZ2eontV2ajlJomUgiB+m">()
                        + var13
                        + IliIlllilIi<"IliIlllilIi","oBmxlWoK4xesfZifvWhH23wisqOQOc+Se9M90us=">()
                  );
               }
            } else if (this.liliIiliil.remove(key)) {
               this.lIlIliliil = true;
            }
         } else if (this.liliIiliil.remove(key)) {
            this.lIlIliliil = true;
         }
      }
   }

   private int IIllllIlll() {
      return Math.max(
         -1348582968 - -5 + -67 - 33 ^ -1348583056, Math.min(-(-870942596) ^ 870942686, (1541786890 + 89 + -41 ^ 1541786903) + (5 - this.llIIliliil) * 5)
      );
   }

   private int Illillllil(class_2818 chunk) {
      class_638 var2 = Iiiilllliiilll.field_1687;
      if (var2 == null) {
         return 0;
      } else {
         class_1923 var3 = chunk.method_12004();
         int var4 = var3.method_8326();
         int var5 = var3.method_8328();
         int var6 = chunk.method_31607();
         int var7 = Math.max(-64, var6);
         int var8 = Math.min(48, var6 + chunk.method_31605() - 1);
         class_2826[] var9 = chunk.method_12006();
         long var10 = 0L;
         long var12 = 0L;
         long var14 = 0L;
         int var16 = 0;

         for (int var17 = 0; var17 < var9.length; var17++) {
            class_2826 var18 = var9[var17];
            if (var18 != null && !var18.method_38292()) {
               int var19 = var6 + (var17 << 4);
               if (var19 <= var8 && var19 + 15 >= var7 && var18.method_19523(IlIllIIillIllIIi::lIliliIlil)) {
                  for (int var20 = 0; var20 < 16; var20++) {
                     int var21 = var19 + var20;
                     if (var21 >= var7 && var21 <= var8) {
                        for (int var22 = 0; var22 < 16; var22++) {
                           for (int var23 = 0; var23 < 16; var23++) {
                              if (lIliliIlil(var18.method_12254(var22, var20, var23))) {
                                 var10 += (long)(var4 + var22);
                                 var12 += (long)var21;
                                 var14 += (long)(var5 + var23);
                                 var16++;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (var16 == 0) {
            return 0;
         } else {
            int var40 = (int)(var10 / (long)var16);
            int var41 = (int)(var12 / (long)var16);
            int var42 = (int)(var14 / (long)var16);
            byte var43 = 8;
            int var44 = 0;
            this.lliiIiliil.IliIlllilIi(chunk);
            this.llllliliil = var40 - var43 - 2;
            this.illlliliil = var41 - var43 - 2;
            this.Iillliliil = var42 - var43 - 2;
            Arrays.fill(this.Illlliliil, (byte)-1);

            for (int var45 = -var43; var45 <= var43; var45++) {
               for (int var46 = -var43; var46 <= var43; var46++) {
                  for (int var24 = -var43; var24 <= var43; var24++) {
                     int var25 = var40 + var45;
                     int var26 = var41 + var46;
                     int var27 = var42 + var24;
                     class_2680 var28 = this.lliiIiliil.liiiIIllIl(var25, var26, var27);
                     if ((var28.method_27852(class_2246.field_10124) || var28.method_27852(class_2246.field_27161))
                        && this.illilIilil(var2, var25, var26, var27) == 0) {
                        boolean var29 = false;
                        int var30 = 0;
                        int var31 = 0;
                        int var32 = 0;
                        boolean var33 = false;

                        for (int var34 = 0; var34 < 6; var34++) {
                           class_2350 var35 = iIIIIiliil[var34];
                           int var36 = var25 + var35.method_10148();
                           int var37 = var26 + var35.method_10164();
                           int var38 = var27 + var35.method_10165();
                           int var39 = this.illilIilil(var2, var36, var37, var38);
                           if (var39 > 4) {
                              var33 = true;
                              break;
                           }

                           if (!var29 && var39 == 0 && this.lliiIiliil.liiiIIllIl(var36, var37, var38).method_27852(class_2246.field_10124)) {
                              var29 = true;
                              var30 = var36;
                              var31 = var37;
                              var32 = var38;
                           }
                        }

                        if (!var33 && var29) {
                           for (int var47 = 0; var47 < 6; var47++) {
                              class_2350 var48 = iIIIIiliil[var47];
                              if (this.illilIilil(var2, var30 + var48.method_10148(), var31 + var48.method_10164(), var32 + var48.method_10165()) > 4) {
                                 var33 = true;
                                 break;
                              }
                           }

                           if (!var33) {
                              var44++;
                           }
                        }
                     }
                  }
               }
            }

            return var44;
         }
      }
   }

   private static int iIlIiIllIi(int score) {
      return Math.max(
         ~(353019266 - 93 + -113 + 51) ^ -353019124,
         Math.min((-322348349 << 21 | -322348349 >>> 11) * -43 * 483939977 ^ 52244764, (~(-383358620 * -109) * -75 ^ -1369407498) + score / 2)
      );
   }

   private void IiIilliIil(class_2818 key, IlIlIIIlllIlIIIl analysis, long chunk) {
      class_1923 var5 = key.method_12004();
      int var6 = var5.method_8326();
      int var7 = var5.method_8328();
      int var8 = key.method_31607();
      int var9 = Math.min(key.method_31607() + key.method_31605() - 1, 60);
      class_2826[] var10 = key.method_12006();
      int[] var11 = this.llIlliliil;
      int[] var12 = this.ilIlliliil;
      int[] var13 = this.IiIlliliil;
      Arrays.fill(var11, 0);
      Arrays.fill(var12, 0);
      Arrays.fill(var13, 0);

      for (int var14 = 0; var14 < var10.length; var14++) {
         int var15 = var8 + (var14 << 4);
         if (var15 > var9) {
            break;
         }

         int var16 = Math.min(16, var9 - var15 + 1);
         class_2826 var17 = var10[var14];
         if (var17 != null && !var17.method_38292()) {
            this.lIllliliil.iIlIlllllill(var17);
            int[] var38 = this.lIllliliil.IIlilliIll;
            class_2680[] var39 = this.lIllliliil.lIlilliIll;
            int[] var20 = this.ilillIiill(this.lIllliliil.iIlilliIll);

            for (int var21 = 0; var21 < this.lIllliliil.iIlilliIll; var21++) {
               var20[var21] = IlllIiliil.getInt(var39[var21].method_26204());
            }

            for (int var40 = 0; var40 < var16; var40++) {
               int var22 = var15 + var40;
               int var23 = var40 << 8;
               boolean var24 = var22 < 0;

               for (int var25 = 0; var25 < 256; var25++) {
                  int var26 = var38[var23 | var25];
                  int var27 = var20[var26];
                  if ((var27 & 1) != 0) {
                     var11[var25]++;
                     if (var24) {
                        var12[var25]++;
                     }

                     var13[var25] = 0;
                  } else {
                     if (var11[var25] >= 12 && var22 < 20) {
                        analysis.lillliIlIl = analysis.lillliIlIl + var11[var25] / 4;
                     }

                     var11[var25] = 0;
                     if (var24) {
                        var12[var25] = 0;
                     }

                     if ((var27 & -513) == 0) {
                        var13[var25] = 0;
                     } else {
                        int var28 = var25 & 15;
                        int var29 = var25 >> 4;
                        int var30 = var6 + var28;
                        int var31 = var7 + var29;
                        if (var22 < 0) {
                           if ((var27 & 2) != 0 && var28 < 15 && var39[var38[var23 | var25 + 1]].method_26204() == var39[var26].method_26204()) {
                              analysis.iIllliIlIl++;
                           }

                           if ((var27 & 4) != 0) {
                              analysis.IlllliIlIl++;
                              iiIilIIlil(analysis, var30, var22, var31, 1.0);
                           }

                           if ((var27 & 8) != 0) {
                              analysis.IillliIlIl++;
                           }
                        }

                        if (var22 < 20) {
                           if ((var27 & 16) != 0) {
                              analysis.llllliIlIl++;
                              iiIilIIlil(analysis, var30, var22, var31, 1.0);
                           }

                           if ((var27 & 32) != 0) {
                              analysis.illlliIlIl++;
                           }
                        }

                        if (var22 < 0 && (var27 & 64) != 0) {
                           analysis.liilliIlIl++;
                           iiIilIIlil(analysis, var30, var22, var31, 4.0);
                        }

                        if ((var27 & 128) != 0) {
                           int var32 = ++var13[var25];
                           boolean var33 = (var27 & 256) != 0;
                           if (var33) {
                              analysis.iIilliIlIl++;
                           }

                           iiIilIIlil(analysis, var30, var22, var31, var33 ? 6.0 : 1.0);
                           if (this.lllIiillIi(key, var38, var20, var28, var40, var29, var30, var22, var31)) {
                              analysis.IIilliIlIl += 2;
                           }

                           if (var32 == 4) {
                              analysis.lIilliIlIl++;
                           }
                        } else {
                           var13[var25] = 0;
                        }
                     }
                  }
               }
            }
         } else {
            int var18 = Math.max(0, Math.min(var16, -var15));

            for (int var19 = 0; var19 < 256; var19++) {
               var11[var19] += var16;
               var12[var19] += var18;
               var13[var19] = 0;
            }
         }
      }

      for (int var34 = 0; var34 < 256; var34++) {
         if (var12[var34] >= 10) {
            analysis.iillliIlIl++;
         }
      }

      for (class_2586 var37 : key.method_12214().values()) {
         if (var37 instanceof class_2595 || var37 instanceof class_2614) {
            analysis.IlilliIlIl++;
         }
      }

      lIlIiliiIlIili var36 = (lIlIiliiIlIili)this.IIiiIiliil.get(chunk);
      if (var36 != null) {
         analysis.ililliIlIl = var36.iIIliiIIIl;
         analysis.IiilliIlIl = var36.IlIliiIIIl;
         if (var36.llIliiIIIl > 20) {
            analysis.llilliIlIl = var36.llIliiIIIl / 5;
         }
      }
   }

   private void lIilliIill(class_2818 chunk, long key) {
      IlIlIIIlllIlIIIl var4 = new IlIlIIIlllIlIIIl();

      try {
         this.Ilillllill(chunk, var4);
         if (this.liiiIiliil) {
            this.IiIilliIil(chunk, var4, key);
         }

         if (this.IiiiIiliil) {
            var4.IlliliIlIl = this.lililiilil(chunk);
            var4.llliliIlIl = this.Illillllil(chunk);
         }

         if (this.iiiiIiliil) {
            this.IlIIillIIi(chunk, var4);
         }
      } catch (Throwable var6) {
         this.llIliilIli(key);
         if (this.iiliIiliil.remove(key) != null) {
            this.lIlIliliil = true;
         }

         return;
      }

      IlIlIIIlllIlIIIl var5 = (IlIlIIIlllIlIIIl)this.iiliIiliil.put(key, var4);
      if (var4.illiliIlIl != null || var5 != null && var5.illiliIlIl != null) {
         this.lIlIliliil = true;
      }

      this.iIIliIlIli(chunk.method_12004(), key, var4);
   }

   private int liIlliiIll() {
      return Math.max(2, ((-903430177 >>> 7 | -903430177 << 25) * 1556147571 ^ 513630983) - this.llIIliliil);
   }
}
