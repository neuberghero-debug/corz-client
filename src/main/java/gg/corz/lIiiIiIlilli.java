package gg.corz;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D.Double;
import java.io.PrintStream;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

final class lIiiIiIlilli extends JComponent {
   private double lIiIiiIiIi;
   private static final int llIililIil = 28;
   static final int lIilliIill = 0;
   private static final int IIIillIIil = 150;
   private static final int iIIilIlIil = 360;
   private static final int IiIilliIil = 32;
   private static final int liilliiill = 300;
   private static final iIlIlllllill lIIIiiIIIi = new iIlIlllllill(2, 10.5F, 0.1F);
   static final int ilillIiill = 2;
   private final IIIllIIliIIl Illlilllli;
   int IIlIilIlIi;
   Runnable iIlIiIllIi;
   private final Object illliIilli;
   private long iIiliIlili;
   private int IliIilliIi;
   private static final double illilIilil = 13.0;
   final Illlllllilll IlIIillIIi;
   private final IIIllIIliIIl iiIliIIlli;
   private static final iIlIlllllill iiiilIIIIi = new iIlIlllllill(1, 9.5F, 0.0F);
   static final int Ilillllill = 1;
   private static final int iiIilIIlil = 10;
   volatile boolean liIIiiiIIi;
   private static final iIlIlllllill lliililiil = new iIlIlllllill(1, 11.5F, 0.0F);
   private final IIIllIIliIIl lIlliiIlli;
   private double iilIiIIiIi;
   private static final double lililiilil = 0.25;
   private volatile long lilliiilli;
   private int iliIiIiiIi;
   private static final int IIiillIiil = 600;
   private static final iIlIlllllill Iiiilliiil = new iIlIlllllill(0, 10.0F, 0.0F);
   private Point IIIlilIIli;
   private List<String> lllIiillIi;
   private Thread IIililIili;
   private static final iIlIlllllill iIiilIliil = new iIlIlllllill(0, 11.0F, 0.0F);
   private static final double Illillllil = 80.0;
   final long ilIIiIiIIi;
   private boolean liiIiiiiIi;
   private static final double lIliliIlil = 15.0;
   private final IIIllIIliIIl IiIliliIli;
   private List<String> IilIililIi;
   private String iIIliIlIli;
   private String llIliilIli;

   private void Iiilliiliiil(Graphics2D var1, int var2) {
      long var3 = System.nanoTime();
      if (this.iIiliIlili == 0L) {
         this.iIiliIlili = var3;
         this.iliIiiliiiii(var3 + 520000000L);
      }

      double var5 = (double)(var3 - this.iIiliIlili) / 1.0E9;
      double var7 = IilliliilIIi.Iiiiliiiiiii(var5 / 0.25);
      double var9 = (double)var2 / 2.0;
      IilliliilIIi.Iiilliiliiil(var1, var9, 38.0, 14.0);
      double var11 = var5 < 0.42 ? Math.sin(var5 / 0.42 * Math.PI * 7.0) * 4.0 * (1.0 - var5 / 0.42) : 0.0;
      double var13 = (double)(var2 - 56);
      double var15 = 5.0;
      double var17 = 68.0;
      var1.setColor(IilliliilIIi.Iliilliiilii(IilliliilIIi.Iiilliiliiil, IilliliilIIi.Illillliilli, var7));
      var1.fill(new Double(28.0 + var11, var17, var13, var15, var15, var15));
      var1.setColor(IilliliilIIi.Iliilliiilii(IilliliilIIi.Illlllllilll, IilliliilIIi.IIlilIliiIli, var7));
      var1.fill(new Double(28.0 + var11, var17, Math.max(var15, var13 * this.IlIIillIIi.lIiiiiIiii), var15, var15, var15));
      Composite var19 = var1.getComposite();
      if (var7 < 1.0) {
         var1.setComposite(AlphaComposite.getInstance(3, (float)var7));
      }

      lliililiil.lIiiIiIlilli(
         var1, IilliliilIIi.IIlilIliiIli, IIIilIIiiIIi<"IIIilIIiiIIi","ooNxx1HCcG3clwComBbhjepZ4o7ONcKjsALHOXEVLKG3PZ5xXs7uz08+AX0cne8=">(), var9, 92.0, 0.5
      );
      double var20 = this.iilIiIIiIi;

      for (String var23 : this.lllIiillIi) {
         Iiiilliiil.lIiiIiIlilli(var1, IilliliilIIi.IIiilIiiiIii, var23, var9, var20, 0.5);
         var20 += 15.0;
      }

      var20 += 6.0;

      for (String var31 : this.IilIililIi) {
         Iiiilliiil.lIiiIiIlilli(var1, IilliliilIIi.Iliilliiilii, var31, var9, var20, 0.5);
         var20 += 15.0;
      }

      double var30 = this.IiIliliIli.IliIlllilIi(var3);
      double var24 = this.iiIliIIlli.IliIlllilIi(var3);
      Rectangle2D var26 = this.Illlllllilll(1);
      var1.setColor(
         IilliliilIIi.Iliilliiilii(
            IilliliilIIi.Iliilliiilii(IilliliilIIi.IIIilIIiiIIi, IilliliilIIi.IlIillIiilIi, var30),
            IilliliilIIi.IiIiliIiiiIi,
            this.lIlliiIlli.IliIlllilIi(var3)
         )
      );
      var1.fill(new Double(var26.getX(), var26.getY(), var26.getWidth(), var26.getHeight(), 10.0, 10.0));
      iiiilIIIIi.lIiiIiIlilli(
         var1,
         IilliliilIIi.Iliilliiilii(IilliliilIIi.Iiiiliiiiiii, IilliliilIIi.IIIIllIIIl, var30 * 0.6),
         this.liiIiiiiIi
            ? IIIilIIiiIIi<"IIIilIIiiIIi","+yqGmjxHE0lGAmOrIpKFn9KTlTCYTXUo2l6QiQUsQECBnw==">()
            : IIIilIIiiIIi<"IIIilIIiiIIi","AkmyxXt22i/ZQsUGCuJZMvL7FFj497hVgQkeZxNND+ka9ktqVPADcA==">(),
         var26.getCenterX(),
         var26.getCenterY(),
         0.5
      );
      Rectangle2D var27 = this.Illlllllilll(2);
      var1.setColor(
         IilliliilIIi.Iliilliiilii(
            IilliliilIIi.Iliilliiilii(IilliliilIIi.Illlllllilll, IilliliilIIi.Iilllilliill, var24),
            IilliliilIIi.IIillIiliIil,
            this.Illlilllli.IliIlllilIi(var3)
         )
      );
      var1.fill(new Double(var27.getX(), var27.getY(), var27.getWidth(), var27.getHeight(), 12.0, 12.0));
      lIIIiiIIIi.lIiiIiIlilli(
         var1,
         IilliliilIIi.iIIIlIlIIl,
         IIIilIIiiIIi<"IIIilIIiiIIi","+G0ly53Uf2Chs7lDKuRnoWoDka084SCkqfk6XgXBbypb">(),
         var27.getCenterX(),
         var27.getCenterY(),
         0.5
      );
      var1.setComposite(var19);
   }

   private void IIIllIIliIIl() {
      try {
         while (this.liIIiiiIIi) {
            if (System.nanoTime() < this.lilliiilli) {
               this.repaint();
               Thread.sleep(16L);
            } else {
               synchronized (this.illliIilli) {
                  if (this.liIIiiiIIi && System.nanoTime() >= this.lilliiilli) {
                     this.illliIilli.wait();
                  }
               }
            }
         }
      } catch (InterruptedException var4) {
      }
   }

   private void iliIiiliiiii(long var1) {
      if (var1 > this.lilliiilli) {
         this.lilliiilli = var1;
      }

      synchronized (this.illliIilli) {
         this.illliIilli.notifyAll();
      }
   }

   void iIlIlllllill() {
      this.repaint(134, 64, 32, 32);
   }

   private Rectangle2D Illlllllilll(int var1) {
      double var2 = (double)(this.getWidth() - 56 - 10) / 2.0;
      double var4 = var1 == 1 ? 28.0 : (double)(this.getWidth() - 28) - var2;
      return new java.awt.geom.Rectangle2D.Double(var4, this.lIiIiiIiIi, var2, 32.0);
   }

   private void IliIlllilIi() {
      MouseAdapter var1 = new MouseAdapter() {
         @Override
         public void mouseMoved(MouseEvent var1) {
            lIiiIiIlilli.this.IiIlliIliiIl(lIiiIiIlilli.this.Iilllilliill(var1.getX(), var1.getY()));
         }

         @Override
         public void mouseReleased(MouseEvent var1) {
            long var3 = -8153997691453836283L;
            var3 ^= ((long)lIiiIiIlilli.this.iliIiIiiIi << 32 ^ var3) & -1L << 32;
            lIiiIiIlilli.this.iliIiIiiIi = 0;
            lIiiIiIlilli.this.IIIlilIIli = null;
            lIiiIiIlilli.this.IlIlllIlilIl();
            if ((int)(var3 >>> 32) != 0 && (int)(var3 >>> 32) == lIiiIiIlilli.this.Iilllilliill(var1.getX(), var1.getY())) {
               lIiiIiIlilli.this.IIlllIlliIll((int)(var3 >>> 32));
            }
         }

         @Override
         public void mouseExited(MouseEvent var1) {
            if (lIiiIiIlilli.this.iliIiIiiIi == 0) {
               lIiiIiIlilli.this.IiIlliIliiIl(0);
            }
         }

         @Override
         public void mouseDragged(MouseEvent var1) {
            if (lIiiIiIlilli.this.IIIlilIIli != null) {
               Window var2 = SwingUtilities.getWindowAncestor(lIiiIiIlilli.this);
               Point var3 = var1.getLocationOnScreen();
               if (var2 != null) {
                  var2.setLocation(var2.getX() + var3.x - lIiiIiIlilli.this.IIIlilIIli.x, var2.getY() + var3.y - lIiiIiIlilli.this.IIIlilIIli.y);
               }

               lIiiIiIlilli.this.IIIlilIIli = var3;
            } else {
               lIiiIiIlilli.this.IiIlliIliiIl(lIiiIiIlilli.this.Iilllilliill(var1.getX(), var1.getY()));
            }
         }

         @Override
         public void mousePressed(MouseEvent var1) {
            if (SwingUtilities.isLeftMouseButton(var1)) {
               lIiiIiIlilli.this.iliIiIiiIi = lIiiIiIlilli.this.Iilllilliill(var1.getX(), var1.getY());
               lIiiIiIlilli.this.IIIlilIIli = lIiiIiIlilli.this.iliIiIiiIi == 0 ? var1.getLocationOnScreen() : null;
               lIiiIiIlilli.this.IlIlllIlilIl();
            }
         }
      };
      this.addMouseListener(var1);
      this.addMouseMotionListener(var1);
      this.liiiIIllIl(KeyStroke.getKeyStroke(27, 0), 2);
      this.liiiIIllIl(KeyStroke.getKeyStroke(10, 0), 2);
      this.liiiIIllIl(KeyStroke.getKeyStroke(67, 128), 1);
      this.liiiIIllIl(KeyStroke.getKeyStroke(67, 256), 1);
   }

   lIiiIiIlilli(Illlllllilll var1) {
      long var9 = 1647787555739011971L;
      super();
      this.ilIIiIiIIi = System.nanoTime();
      this.liIIiiiIIi = true;
      this.IIlIilIlIi = 0;
      this.lllIiillIi = List.of();
      this.IilIililIi = List.of();
      this.IiIliliIli = new IIIllIIliIIl(0.12);
      this.iiIliIIlli = new IIIllIIliIIl(0.12);
      this.lIlliiIlli = new IIIllIIliIIl(0.08);
      this.Illlilllli = new IIIllIIliIIl(0.08);
      this.illliIilli = new Object();
      this.IlIIillIIi = var1;
      this.setOpaque(false);
      this.setFocusable(var1 != null);
      var9 ^= (644245094400L ^ var9) & -1L << 32;
      var9 ^= (300L ^ var9) & -1L >>> 32;
      if (var1 != null) {
         var9 ^= (360L ^ var9) & -1L >>> 32;
         double var4 = (double)((int)var9 - 56);
         String var6 = var1.Iiliililii.length() > 600 ? var1.Iiliililii.substring(0, 600) : var1.Iiliililii;
         this.lllIiillIi = IilliliilIIi.IIiilIiiiIii(var6, Iiiilliiil, var4, 6);
         this.IilIililIi = IilliliilIIi.IIiilIiiiIii(
            IIIilIIiiIIi<"IIIilIIiiIIi","x08iDHVFVeZPNitkt7a0Av6mfvH8o+63kYELeRz0Ov3AqdZrhPzNNQtdoTWRIpkID2mGSQQ9OnggIrjh1FMUUJsJ3gKhsm2qFwsXN9kbBv9ieYgi">(),
            Iiiilliiil,
            var4,
            3
         );
         this.iilIiIIiIi = 110.0;
         double var7 = this.iilIiIIiIi + (double)(this.lllIiillIi.size() + this.IilIililIi.size() - 1) * 15.0 + 6.0;
         this.lIiIiiIiIi = (double)Math.round(var7 + 21.0);
         var9 ^= ((long)((int)Math.round(this.lIiIiiIiIi + 32.0 + 30.0)) << 32 ^ var9) & -1L << 32;
         this.IliIlllilIi();
      }

      this.setPreferredSize(new Dimension((int)var9, (int)(var9 >>> 32)));
   }

   private void Ililllililil(Graphics2D var1, int var2) {
      double var3 = (double)var2 / 2.0;
      Rectangle var5 = var1.getClipBounds();
      if (var5 == null || var5.intersects(0.0, 24.0, (double)var2, 26.0)) {
         IilliliilIIi.Iiilliiliiil(var1, var3, 37.0, 14.0);
      }

      double var6 = (double)(System.nanoTime() - this.ilIIiIiIIi) / 1.0E9;
      double var8 = var6 * 1.1 * 360.0;
      double var10 = 85.0 + 25.0 * Math.sin(var6 * 2.0 * Math.PI * 0.55);
      double var12 = 13.0;
      double var14 = 80.0;
      var1.setStroke(new BasicStroke(2.0F, 0, 1));
      var1.setColor(IilliliilIIi.Ililllililil);
      var1.draw(new java.awt.geom.Ellipse2D.Double(var3 - var12, var14 - var12, var12 * 2.0, var12 * 2.0));
      var1.setColor(IilliliilIIi.Illlllllilll);
      var1.draw(new java.awt.geom.Arc2D.Double(var3 - var12, var14 - var12, var12 * 2.0, var12 * 2.0, -(var8 + var10 / 2.0), var10, 0));
      if (var5 == null || var5.intersects(0.0, 104.0, (double)var2, 28.0)) {
         String var16 = IilliliilIIi.liIlliiIll;
         if (var16 == null) {
            var16 = "";
         }

         if (!var16.equals(this.iIIliIlIli)) {
            this.iIIliIlIli = var16;
            this.llIliilIli = IilliliilIIi.Illillliilli(var16, iIiilIliil, (double)(var2 - 56));
         }

         iIiilIliil.lIiiIiIlilli(var1, IilliliilIIi.IIiilIiiiIii, this.llIliilIli, var3, 117.0, 0.5);
      }
   }

   private void IiIlliIliiIl(int var1) {
      if (var1 != this.IliIilliIi) {
         this.IliIilliIi = var1;
         this.setCursor(Cursor.getPredefinedCursor(var1 != 0 ? 12 : 0));
         this.IlIlllIlilIl();
      }
   }

   private void IIlllIlliIll(int var1) {
      if (var1 == 1) {
         try {
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(this.IlIIillIIi.iiliiIIiii), null);
            this.liiIiiiiIi = true;
         } catch (RuntimeException var4) {
            PrintStream var10000 = System.err;
            String var3 = String.valueOf(var4);
            var10000.println(IIIilIIiiIIi<"IIIilIIiiIIi","1jnULmIu3xLsNAggOw3AjkT9bs45jmnLSmhbQjq9MJ+ErnDEkQ/K7w8sMDAOJOit7+7ht7g=">() + var3);
         }

         this.repaint();
      } else if (var1 == 2 && this.iIlIiIllIi != null) {
         this.iIlIiIllIi.run();
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      Graphics2D var2 = (Graphics2D)var1.create();

      try {
         this.IIillIiliIil(var2);
      } catch (RuntimeException var8) {
         PrintStream var10000 = System.err;
         String var5 = String.valueOf(var8);
         var10000.println(IIIilIIiiIIi<"IIIilIIiiIIi","1jnULmIu3xLsNAggOw3AjkT9bs45jmnLSmhbQjq9MJ+ErnDEkQ/K7w8sMDAOJOit7+7ht7g=">() + var5);
      } finally {
         var2.dispose();
      }
   }

   void IilliliilIIi() {
      this.lilliiilli = System.nanoTime() + 500000000L;
      Thread var1 = new Thread(this::IIIllIIliIIl, IIIilIIiiIIi<"IIIilIIiiIIi","v4l3emVkQE1Bcjm7YQD1HapsIpR9nMcIkyXrr07eGNRdK/EPZNqGiA6Qfuo8cq4U9g==">());
      var1.setDaemon(true);
      this.IIililIili = var1;
      var1.start();
   }

   private void IlIlllIlilIl() {
      long var4 = 4923644392108187551L;
      long var1 = System.nanoTime();
      var4 ^= ((long)this.IiIliliIli.liiiIIllIl(this.IliIilliIi == 1 ? 1.0 : 0.0, var1) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) | this.iiIliIIlli.liiiIIllIl(this.IliIilliIi == 2 ? 1.0 : 0.0, var1)) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) | this.lIlliiIlli.liiiIIllIl(this.iliIiIiiIi == 1 && this.IliIilliIi == 1 ? 1.0 : 0.0, var1)) << 32 ^ var4)
         & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) | this.Illlilllli.liiiIIllIl(this.iliIiIiiIi == 2 && this.IliIilliIi == 2 ? 1.0 : 0.0, var1)) << 32 ^ var4)
         & -1L << 32;
      if ((int)(var4 >>> 32) != 0) {
         this.iliIiiliiiii(var1 + 200000000L);
      }

      this.repaint();
   }

   private void liiiIIllIl(KeyStroke var1, final int var2) {
      String var4 = String.valueOf(var1);
      String var3 = IIIilIIiiIIi<"IIIilIIiiIIi","9QAFsgRgtCp+z6JBFQcRX1iGWMJwxug9qsqKNQ3AoU6d">() + var4;
      this.getInputMap(2).put(var1, var3);
      this.getActionMap().put(var3, new AbstractAction() {
         @Override
         public void actionPerformed(ActionEvent var1) {
            lIiiIiIlilli.this.IIlllIlliIll(var2);
         }
      });
   }

   void lIiiIiIlilli() {
      this.liIIiiiIIi = false;
      Thread var1 = this.IIililIili;
      this.IIililIili = null;
      if (var1 != null) {
         var1.interrupt();
      }
   }

   private int Iilllilliill(int var1, int var2) {
      if (this.IlIIillIIi == null) {
         return 0;
      } else if (this.Illlllllilll(1).contains((double)var1, (double)var2)) {
         return 1;
      } else {
         return this.Illlllllilll(2).contains((double)var1, (double)var2) ? 2 : 0;
      }
   }

   private void IIillIiliIil(Graphics2D var1) {
      long var10 = 8079568631166102342L;
      var1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      var1.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      var1.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
      var1.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
      var1.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
      var10 ^= ((long)this.getWidth() << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)this.getHeight() ^ var10) & -1L >>> 32;
      double var4 = Math.max(1.0, Math.abs(var1.getTransform().getScaleX()));
      double var6 = Math.max(1.0, Math.floor(var4)) / var4;
      var1.setComposite(AlphaComposite.Src);
      if (this.IIlIilIlIi == 2) {
         var1.setColor(new Color(0, 0, 0, 0));
         var1.fillRect(0, 0, (int)(var10 >>> 32), (int)var10);
         var1.setColor(IilliliilIIi.IiIlliIliiIl);
         var1.fill(new Double(0.0, 0.0, (double)((int)(var10 >>> 32)), (double)((int)var10), 20.0, 20.0));
      } else {
         var1.setColor(IilliliilIIi.IiIlliIliiIl);
         var1.fillRect(0, 0, (int)(var10 >>> 32), (int)var10);
      }

      var1.setComposite(AlphaComposite.SrcOver);
      var1.setStroke(new BasicStroke((float)var6));
      var1.setColor(IilliliilIIi.IIlllIlliIll);
      double var8 = var6 / 2.0;
      if (this.IIlIilIlIi == 0) {
         var1.draw(new java.awt.geom.Rectangle2D.Double(var8, var8, (double)((int)(var10 >>> 32)) - var6, (double)((int)var10) - var6));
      } else {
         var1.draw(new Double(var8, var8, (double)((int)(var10 >>> 32)) - var6, (double)((int)var10) - var6, 20.0 - var6, 20.0 - var6));
      }

      if (this.IlIIillIIi == null) {
         this.Ililllililil(var1, (int)(var10 >>> 32));
      } else {
         this.Iiilliiliiil(var1, (int)(var10 >>> 32));
      }
   }
}
