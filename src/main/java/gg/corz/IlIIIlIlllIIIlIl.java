package gg.corz;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3986;
import net.minecraft.class_3989;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class IlIIIlIlllIIIlIl extends ilIllIiIll {
   private final List<class_3989> iIIlIiilIl;
   private final iiIiiilIIliiil IliIIiilIl;
   private final iiIiiilIIliiil iIlIIiilIl;
   private int llIlIiilIl;
   private final iiIiiilIIliiil lIlIIiilIl = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","YX6aPZFW7ESrfEUGVokdgWlHIlY9R8Upaq8H1+y15r7GTA==">(),
      IliIlllilIi<"IliIlllilIi","BC2DWSZar6fIjlMLYymBmRR9Hj3L5wckyaff89QHdgxmHCcohUhJacjTrWgQEFMiMo55YAGY">(),
      true
   );
   private final iiIiiilIIliiil IiiIIiilIl;
   private final iiIiiilIIliiil iilIIiilIl;
   private final iilliIlIIiliIl IllIIiilIl;
   private final Map<Integer, Long> IIIlIiilIl;
   private final iiIiiilIIliiil lilIIiilIl;
   private final iiIiiilIIliiil lllIIiilIl;
   private final iilliIlIIiliIl lliIIiilIl;
   private final iiIiiilIIliiil IIiIIiilIl;
   private final List<class_3986> IlIlIiilIl;
   private final iiIiiilIIliiil illIIiilIl;
   private final IIIIlilllIIIlill lIiIIiilIl;
   private final Map<Integer, class_243> lIIlIiilIl;
   private final Set<Integer> liiIIiilIl;
   private final IIIIlilllIIIlill iIiIIiilIl;
   private final iilliIlIIiliIl iliIIiilIl;
   private final Map<Integer, Long> iiiIIiilIl;
   private final iiIiiilIIliiil IilIIiilIl;

   private Color Iillllilll() {
      Color var1 = new Color(IlIIilIlllIIilIl.lliiIlliIl);
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), (~(-(-499654690 - 41)) >>> 17 | ~(-(-499654690 - 41)) << 15) ^ -270896668);
   }

   @Override
   protected void Illillliilli() {
      this.iiiIlIIIll();
   }

   private void iiiIlIIIll() {
      this.liiIIiilIl.clear();
      this.iiiIIiilIl.clear();
      this.IIIlIiilIl.clear();
      this.lIIlIiilIl.clear();
      this.iIIlIiilIl.clear();
      this.IlIlIiilIl.clear();
      this.llIlIiilIl = 0;
   }

   private void IlIllllIll(class_3989 trader) {
      long var11 = -3965157257960294447L;
      long var13 = -654142929731783770L;
      long var15 = 2692623544570730307L;
      if (this.lIlIIiilIl.Iilllilliill()) {
         var11 ^= ((long)trader.method_5628() << 32 ^ var11) & -1L << 32;
         long var3 = System.currentTimeMillis();
         Long var5 = this.iiiIIiilIl.get((int)(var11 >>> 32));
         if (var5 == null || var3 - var5 >= (long)this.IllIIiilIl.Iilllilliill() * (4841672407077246560L ^ 4841672407077246344L)) {
            if (!this.liiIIiilIl.contains((int)(var11 >>> 32)) || var5 == null) {
               this.liiIIiilIl.add((int)(var11 >>> 32));
               this.iiiIIiilIl.put((int)(var11 >>> 32), var3);
               var11 ^= ((long)class_3532.method_15357(trader.method_23317()) ^ var11) & -1L >>> 32;
               var13 ^= ((long)class_3532.method_15357(trader.method_23318()) << 32 ^ var13) & -1L << 32;
               var13 ^= ((long)class_3532.method_15357(trader.method_23321()) ^ var13) & -1L >>> 32;
               var15 ^= ((long)((int)Iiiilllliiilll.field_1724.method_5739(trader)) << 32 ^ var15) & -1L << 32;
               String var10 = String.format(
                  IliIlllilIi<"IliIlllilIi","O8FB5srH8AfKCCBy3mMnk+Hm9BPtyfsA9pb1W9vGzmrSZa4uINFpB8hY685pBRe0hECWYfIWD9nAZxOJh0+Rl3FA009szg==">(),
                  (int)var11,
                  (int)(var13 >>> 32),
                  (int)var13,
                  (int)(var15 >>> 32)
               );
               Iliiiiilliiiii.IliIlllilIi()
                  .iIlIlllllill(IliIlllilIi<"IliIlllilIi","s0+VODi1Yx0bpVTZ/XKOS0IbePevAP8ws3Azo/Q1IhZbgsGW8vOKOJjpxIU=">(), var10, true);
               if (this.iIlIIiilIl.Iilllilliill()) {
                  IilIlllilIll.IliIlllilIi();
               }

               if (this.IiiIIiilIl.Iilllilliill()) {
                  this.ilIllIiIll(trader, (int)var11, (int)(var13 >>> 32), (int)var13, (int)(var15 >>> 32));
               }
            }
         }
      }
   }

   private Color iilllIIill() {
      Color var1 = new Color(IlIIilIlllIIilIl.lliiIlliIl);
      return new Color(
         (int)((float)var1.getRed() * 0.65F), (int)((float)var1.getGreen() * 0.65F), (int)((float)var1.getBlue() * 0.65F), --163708088 + -85 ^ 163708075
      );
   }

   public IlIIIlIlllIIIlIl() {
      super(IliIlllilIi<"IliIlllilIi","BdW3pKx7x/je6CA8a0kZ/A75s+ZzoCqz93n9HdCIO+OH57IXJHGSZQ==">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.iIlIIiilIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","68c9fY6s/9fqincKbpBSkOatbtVvMFaIH35yL2zXfbLftN0IQPA=">(),
         IliIlllilIi<"IliIlllilIi","LPLzNsIQoEzs9tVzyAdiK+mWFTbGQSZriigKTDWZtFszJNCiKYPzFsPiKgK37nWh9aJif7gPkY0x">(),
         true
      );
      this.IllIIiilIl = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","In4TG7IpX6nHp2Mm2ABkhkiCezln10YUr2SUv2PN/W0l1WaN41/5vAQK">(),
         IliIlllilIi<"IliIlllilIi","I8uhzqecUbYcn91l2iOvk0ATac9qrNbRDZWSku2lqoRKR1sxZLkts+NHOGGv1UHnt9oDioE/UPv5/DE97LbxWmRV1A==">(),
         60,
         10,
         300
      );
      this.lllIIiilIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","OYpv5Jh8ekTnIXa9m8OAPL90awfdkfvu0sGqPbLjyC4x7vqDDBE=">(),
         IliIlllilIi<"IliIlllilIi","SiVz3OE3FGWvfdwVem3iWVx7rZoB1Mqct0OnEy4zVkmfNjUEF21VNJ4rFTZ6gU8=">(),
         true
      );
      this.illIIiilIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","zj2YpP1lne1OXwSHoJJg2C5mvEQN7gpkr2DshAah8KsYESHtiw==">(),
         IliIlllilIi<"IliIlllilIi","Q8h6KDvSUVUf7o+CuUTOdgnaU2qcZvvtMFv75qJNxp/zMBbkys9m/x6I2Xbg0xRDYhV4RZc=">(),
         true
      );
      this.IilIIiilIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","IGmOOZecSOEcb+3zNohPxXoUVgCBpDQ9De4db/LBDX+q9w==">(),
         IliIlllilIi<"IliIlllilIi","Kvzw/LpZfsuT5idikggpIztoDZ7Fc2S0H1PQvpg4s8AX6J4ChKREzueAtMBvnYF7s9tT">(),
         true
      );
      this.lilIIiilIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","/pAMWFTXYq9P42C8FDZYdgNu4o61bvImLQtdvRr+pXJ6UfQ=">(),
         IliIlllilIi<"IliIlllilIi","iJaoUskXwKoui87LCBEZaXBQg0m8eTKeMPtUaSyeoiPmKpg51QksjsbOVMckeCeMrMIzSd6PUkCC">(),
         true
      );
      this.iilIIiilIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","SM6h3ZTI2onLfAUuV80n67u+gA96i3CpNMq+U0/ffCGC65Cd4ZBat4s=">(),
         IliIlllilIi<"IliIlllilIi","LsRNYlFelTZLUGSO9VlWxVPzq+D9CnHZsqMlrP2Gz6gJvsRu2C0baHAbOdCUuyx7fueqdp5E">(),
         true
      );
      this.IIiIIiilIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","TR1+nYe5vWuQ8LtAXJruhXB/i7+qx8+5fEeGUWzQxuFphTViu3zeV4o=">(),
         IliIlllilIi<"IliIlllilIi","8pn/x8KkoOyayLk79rFJ3w6H8hdoVrY/2PNl1RkiSrLOsQ7wJP3GP8RgolPKVIlElNUT">(),
         true
      );
      this.lIiIIiilIl = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","MO9gNCbSQzJleHtoFU+6uecWhEMn5BmBEdYOUQ/61V7P/KvtNBhL6A==">(),
         IliIlllilIi<"IliIlllilIi","RBldGTphcTTUflfUh2nHJk3BWvQ9aFmgExA7uG4cE66KfRxEdV2F5YEpDUdiVis=">(),
         0.7,
         0.1,
         1.0,
         0.05
      );
      this.iIiIIiilIl = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","Lu4ulCAWc2v5ZTW9sXjdvMP1BptU0fVorOfX432UvNtDU2oXu6CbSA==">(),
         IliIlllilIi<"IliIlllilIi","8DBlafnOygCDiCrJLQLpi6z5ZWof/5f5xhVBGUyW9tC+VMrLvb0tYjk9gANm+FnzGA==">(),
         1.5,
         0.5,
         4.0,
         0.5
      );
      this.IliIIiilIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","aLI+8hRTAvY2fdkN56zPT4Nwj/KdSbfUO2aZcBuANq2xF+k/BSB/mvvf">(),
         IliIlllilIi<"IliIlllilIi","n8JEUNFtVjMM7+GRtrlCPh+w/YzfK+5MIuyCeevn+K8KIPcQmYlh3UR/uDStimL2fPlcFM7TI7k=">(),
         true
      );
      this.lliIIiilIl = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","i6XyBTlB4ZGVDHZGPTSROd/PwK4IIJ27rN7P/2LoLjNKQtGZHeJN">(),
         IliIlllilIi<"IliIlllilIi","0xUhN4w7aQXxKzKzFH4BFozTEvm5x8DINaiYtfzIHylLJ+VuPOrsPaxZoRQSDqUEFLzS3nX2WRBdkceLGE4TYq8=">(),
         12,
         5,
         30
      );
      this.iliIIiilIl = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","D7Sm0zOmhX1tMg1izXm7ZPqxJ7RZ92O83IGtulwUankUkEy6TgGpzg==">(),
         IliIlllilIi<"IliIlllilIi","xosJlpxzupX18+y5mYKXanUj6+A254Pj5i8RT/w20VYNEWkvuSiEKD88udy9u6f30kfTRAaOyQ==">(),
         20,
         5,
         50
      );
      this.IiiIIiilIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","EH63jwvEaub2qO8zcgXL+bte4N3/mXxCJwvLqTRtkBSkcWbRcBl8FyA=">(),
         IliIlllilIi<"IliIlllilIi","Imuw11QjvkMqcFbtGBt+YKJcz2ehsTXD7nuzqwJJcHMmaNXJJ7OT9ZboBrLt1sCUHw==">(),
         true
      );
      this.liiIIiilIl = new HashSet<>();
      this.iiiIIiilIl = new HashMap<>();
      this.IIIlIiilIl = new HashMap<>();
      this.lIIlIiilIl = new HashMap<>();
      this.iIIlIiilIl = new ArrayList<>();
      this.IlIlIiilIl = new ArrayList<>();
      this.llIlIiilIl = 0;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.lIlIIiilIl,
            this.iIlIIiilIl,
            this.IllIIiilIl,
            this.lllIIiilIl,
            this.illIIiilIl,
            this.IilIIiilIl,
            this.lilIIiilIl,
            this.iilIIiilIl,
            this.IIiIIiilIl,
            this.lIiIIiilIl,
            this.iIiIIiilIl,
            this.IliIIiilIl,
            this.lliIIiilIl,
            this.iliIIiilIl,
            this.IiiIIiilIl
         }
      );
   }

   private void IIllllIlll(class_4587 color, float stack, float x1, float y2, float z2, float x2, float y1, Color z1) {
      Matrix4f var9 = color.method_23760().method_23761();
      int var10 = z1.getRGB();
      float var11 = (z2 - stack) * 0.25F;
      float var12 = (x2 - x1) * 0.25F;
      float var13 = (y1 - y2) * 0.25F;
      this.iIlllIllll(var9, stack, x1, y2, var11, var12, var13, var10);
      this.iIlllIllll(var9, z2, x1, y2, -var11, var12, var13, var10);
      this.iIlllIllll(var9, z2, x1, y1, -var11, var12, -var13, var10);
      this.iIlllIllll(var9, stack, x1, y1, var11, var12, -var13, var10);
      this.iIlllIllll(var9, stack, x2, y2, var11, -var12, var13, var10);
      this.iIlllIllll(var9, z2, x2, y2, -var11, -var12, var13, var10);
      this.iIlllIllll(var9, z2, x2, y1, -var11, -var12, -var13, var10);
      this.iIlllIllll(var9, stack, x2, y1, var11, -var12, -var13, var10);
      iIiiIIilIliiIIil.IiIiliIiiiIi();
   }

   private void liIlliiIll(class_4587 entity, class_243 stack, class_1297 td, float color, Color cam) {
      double var6 = class_3532.method_16436((double)color, td.field_6014, td.method_23317());
      double var8 = class_3532.method_16436((double)color, td.field_6036, td.method_23318());
      double var10 = class_3532.method_16436((double)color, td.field_5969, td.method_23321());
      float var12 = td.method_17681() / 2.0F;
      float var13 = td.method_17682();
      float var14 = (float)(var6 - (double)var12 - stack.field_1352);
      float var15 = (float)(var8 - stack.field_1351);
      float var16 = (float)(var10 - (double)var12 - stack.field_1350);
      float var17 = (float)(var6 + (double)var12 - stack.field_1352);
      float var18 = (float)(var8 + (double)var13 - stack.field_1351);
      float var19 = (float)(var10 + (double)var12 - stack.field_1350);
      this.IIllllIlll(entity, var14, var15, var16, var17, var18, var19, cam);
   }

   private void iIlllIllll(Matrix4f cz, float argb, float dz, float cy, float dx, float cx, float dy, int m) {
      iIiiIIilIliiIIil.Iliilliiilii(cz, argb, dz, cy, argb + dx, dz, cy, m, 2.0F);
      iIiiIIilIliiIIil.Iliilliiilii(cz, argb, dz, cy, argb, dz + cx, cy, m, 2.0F);
      iIiiIIilIliiIIil.Iliilliiilii(cz, argb, dz, cy, argb, dz, cy + dy, m, 2.0F);
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         IilIlllilIll.liiiIIllIl();
         this.llIlIiilIl++;
         if (this.llIlIiilIl % 8 == 0) {
            this.iIIlIiilIl.clear();
            this.IlIlIiilIl.clear();

            for (class_1297 var2 : Iiiilllliiilll.field_1687.method_18112()) {
               if (var2 instanceof class_3989) {
                  class_3989 var3 = (class_3989)var2;
                  if (var3.method_5805() && !var3.method_31481()) {
                     this.iIIlIiilIl.add(var3);
                  }
               }
            }

            double var8 = (double)(this.iliIIiilIl.Iilllilliill() * this.iliIIiilIl.Iilllilliill());

            for (class_3989 var4 : this.iIIlIiilIl) {
               for (class_1297 var6 : Iiiilllliiilll.field_1687.method_18112()) {
                  if (var6 instanceof class_3986) {
                     class_3986 var7 = (class_3986)var6;
                     if (var7.method_5805() && !var7.method_31481() && var7.method_5858(var4) <= var8 && !this.IlIlIiilIl.contains(var7)) {
                        this.IlIlIiilIl.add(var7);
                     }
                  }
               }

               this.IlIllllIll(var4);
               if (this.IliIIiilIl.Iilllilliill()) {
                  this.lIIlliIIll(var4);
               }
            }

            HashSet var10 = new HashSet();

            for (class_3989 var12 : this.iIIlIiilIl) {
               var10.add(var12.method_5628());
            }

            this.IIIlIiilIl.keySet().retainAll(var10);
            this.lIIlIiilIl.keySet().retainAll(var10);
         }
      }
   }

   private void ilIllIiIll(class_3989 x, int z, int dist, int y, int trader) {
      try (BufferedWriter var6 = new BufferedWriter(
            new FileWriter(IliIlllilIi<"IliIlllilIi","QiSEi+ej61SmaMFMV5B/8D0Uzmy3lrhi2PezaRM6SaW3RnzjT3YcFDZqpxSEs7an">(), true)
         )) {
         String var7 = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern(IliIlllilIi<"IliIlllilIi","O+SG/MnxSfrD6xJnhYf5V57W6PwkYvdT0DfKSzRKOE15hiWbZwFMp2WXxZ00uEA=">()));
         String var10001 = IliIlllilIi<"IliIlllilIi","aKSKy4CPFsG6lqu1j0FSNTPRMDWDb8dN5K+QywGmxNfN4leG4O3hf5lag1ZAy6tGa5rXxIdu7i/4T9qmsi2gCnupcpT/WGRfOjXq//8M4K1p3zAvURE=">();
         Object[] var10002 = new Object[((-1581440148 << 25 | -1581440148 >>> 7) * -101 << 19 | (-1581440148 << 25 | -1581440148 >>> 7) * -101 >>> 13)
            ^ 319963904];
         var10002[0] = var7;
         var10002[1] = z;
         var10002[2] = dist;
         var10002[3] = y;
         var10002[4] = trader;
         var10002[5] = x.method_5628();
         var6.write(String.format(var10001, var10002));
      } catch (IOException var11) {
      }
   }

   @Override
   protected void Iilililiiili() {
      this.iiiIlIIIll();
   }

   private void lIIlliIIll(class_3989 trader) {
      int var2 = trader.method_5628();
      class_243 var3 = trader.method_73189();
      double var4 = (double)this.lliIIiilIl.Iilllilliill();
      if (!this.IIIlIiilIl.containsKey(var2)) {
         this.IIIlIiilIl.put(var2, System.currentTimeMillis());
         this.lIIlIiilIl.put(var2, var3);
      } else {
         class_243 var6 = this.lIIlIiilIl.get(var2);
         if (var6.method_1022(var3) > var4) {
            this.IIIlIiilIl.put(var2, System.currentTimeMillis());
            this.lIIlIiilIl.put(var2, var3);
         }
      }
   }

   private void lllllillll(class_4587 entity, class_243 cam, class_1297 color, float stack, Color td) {
      double var6 = class_3532.method_16436((double)stack, color.field_6014, color.method_23317());
      double var8 = class_3532.method_16436((double)stack, color.field_6036, color.method_23318()) + (double)color.method_17682() / 2.0;
      double var10 = class_3532.method_16436((double)stack, color.field_5969, color.method_23321());
      float var12 = (float)this.lIiIIiilIl.Iilllilliill();
      int var13 = new Color((float)td.getRed() / 255.0F, (float)td.getGreen() / 255.0F, (float)td.getBlue() / 255.0F, Math.min(1.0F, Math.max(0.0F, var12)))
         .getRGB();
      int var14 = new Color(
            (float)td.getRed() / 255.0F, (float)td.getGreen() / 255.0F, (float)td.getBlue() / 255.0F, Math.min(1.0F, Math.max(0.0F, var12 * 0.4F))
         )
         .getRGB();
      Iillllilll.Illlllllilll(var6, var8, var10, var13, var14, (float)this.iIiIIiilIl.Iilllilliill());
      iIiiIIilIliiIIil.IiIiliIiiiIi();
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         class_243 var2 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         float var3 = event.liiiiIIiiiiiiIIi;
         Color var4 = this.Iillllilll();
         Color var5 = this.iilllIIill();

         for (class_3989 var7 : this.iIIlIiilIl) {
            if (var7.method_5805() && !var7.method_31481()) {
               if (this.lllIIiilIl.Iilllilliill()) {
                  this.liIlliiIll(event.IliiiIIilliiiIIi, var2, var7, var3, var4);
               }

               if (this.lilIIiilIl.Iilllilliill() && this.iilIIiilIl.Iilllilliill()) {
                  this.lllllillll(event.IliiiIIilliiiIIi, var2, var7, var3, var4);
               }
            }
         }

         for (class_3986 var10 : this.IlIlIiilIl) {
            if (var10.method_5805() && !var10.method_31481()) {
               if (this.illIIiilIl.Iilllilliill()) {
                  this.liIlliiIll(event.IliiiIIilliiiIIi, var2, var10, var3, var5);
               }

               if (this.lilIIiilIl.Iilllilliill() && this.IIiIIiilIl.Iilllilliill()) {
                  Color var8 = new Color(var5.getRed(), var5.getGreen(), var5.getBlue(), (int)(this.lIiIIiilIl.Iilllilliill() * 150.0));
                  this.lllllillll(event.IliiiIIilliiiIIi, var2, var10, var3, var8);
               }
            }
         }
      }
   }
}
